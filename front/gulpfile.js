var gulp = require('gulp');
var options = {
    paths:{
        less:['./source/less/**/*.less'],
        cssmin:['./dist/css/*.css'],
        del:['./dist/css','./dist/fonts','./dist/image','./dist/js'],
        imagemin:['./source/image/*.{jpg,png}'],
        baseDir:['./dist/']
    }
};
var plugins = {
    less:require('gulp-less'),
    cssmin:require('gulp-cssmin'),
    imagemin:require('gulp-imagemin'),
    sourcemaps:require('gulp-sourcemaps'),
    rename:require('gulp-rename'),
    del:require('del'),
    autoprofixer:require('less-plugin-autoprefix'),
    browserSync:require('browser-sync').create()
};
var requireDir = require('require-dir');
requireDir('./tasks');
//compless
const browserOptions = [
    'last 3 version'
];
const LessAutoprefix = plugins.autoprofixer;
const autoprefixer = new LessAutoprefix({
    browsers: browserOptions
});
const baseDir = options.paths.baseDir[0];
    gulp.task('compless',function () {
        return gulp.src(['./source/less/**/*.less','!source/less/bootstrap/**/*.less','!source/less/font-awesome/**/*.less'])
            .pipe(plugins.sourcemaps.init())
            .pipe(plugins.less({
                plugins:[autoprefixer]
            }))
            .pipe(plugins.cssmin())
            .pipe(plugins.rename({suffix:'.min'}))
            .pipe(plugins.sourcemaps.write('./',{addComment:false}))
            .pipe(gulp.dest(baseDir + 'css'));
    });

//copyres
gulp.task('copyres',function () {
    return gulp.src(['./source/**/*.{html,css,map,otf,eot,svg,ttf,woff,jpg,png,js}']).pipe(gulp.dest('dist/'));
});
//imagemin
gulp.task('imagemin', function () {
    return gulp.src(options.paths.imagemin)
        .pipe(plugins.imagemin())
        .pipe(gulp.dest('dist/image/'));
});
//server
const browserSync = plugins.browserSync;
const reload = browserSync.reload;
const baseDirs = options.paths.baseDir;
const lessDir = options.paths.less;

gulp.task('server', ['compless'], function () {
    browserSync.init({
        //文件模式
        server: {
            baseDir: baseDir
        }
        //本地web服务器
        // proxy: 'localhost:7888'
    });
    gulp.watch( lessDir , ['compless']);
    gulp.watch(baseDirs + 'css/**/*.css').on('change', reload);
    gulp.watch( baseDirs + '/*.html').on('change', reload);
});
//main
gulp.task('dist', ['copyres','compless','imagemin']);
gulp.task('prod', ['copyres','server']);