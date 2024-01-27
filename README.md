# FlutteringLayout

[![Download](https://img.shields.io/badge/download-App-blue.svg)](https://raw.githubusercontent.com/jenly1314/FlutteringLayout/master/app/release/app-release.apk)
[![JitPack](https://jitpack.io/v/jenly1314/FlutteringLayout.svg)](https://jitpack.io/#jenly1314/FlutteringLayout)
[![CI](https://travis-ci.org/jenly1314/FlutteringLayout.svg?branch=master)](https://travis-ci.org/jenly1314/FlutteringLayout)
[![CircleCI](https://circleci.com/gh/jenly1314/FlutteringLayout.svg?style=svg)](https://circleci.com/gh/jenly1314/FlutteringLayout)
[![API](https://img.shields.io/badge/API-15%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=15)
[![License](https://img.shields.io/badge/license-Apche%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

FlutteringLayout for Android 一个直播间点赞桃心飘动效果的控件。

## Gif 展示
![Image](GIF.gif)

> 你也可以直接下载 [演示App](https://raw.githubusercontent.com/jenly1314/FlutteringLayout/master/app/release/app-release.apk) 体验效果

## 引入

### Gradle:

1. 在Project的 **build.gradle** 或 **setting.gradle** 中添加远程仓库

    ```gradle
    repositories {
        //...
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
    ```

2. 在Module的 **build.gradle** 里面添加引入依赖项

    ```gradle
    implementation 'com.github.jenly1314:FlutteringLayout:1.1.1'
    ```

## 使用

布局示例
```Xml
    <com.king.view.flutteringlayout.FlutteringLayout
        android:id="@+id/flutteringLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginBottom="10dp"
        app:duration="3000"
        app:enter_duration="300"
        app:scale="1.0"/>
```

添加桃心代码
```Java
flutteringlayout.addHeart();
```

更多使用详情，请查看[app](app)中的源码使用示例或直接查看 [API帮助文档](https://jitpack.io/com/github/jenly1314/FlutteringLayout/latest/javadoc/)

## 相关推荐

#### [GiftSurfaceView](https://github.com/jenly1314/GiftSurfaceView) 一个用于直播间送礼物拼图案动画控件

## 版本记录

#### v1.1.1：2019-10-25
*  移除support依赖
*  升级至Gradle至v5.4.1

#### v1.1.0：2017-4-11
*  优化Heart起点位置

#### v1.0：2017-4-10
*  FlutteringLayout初始版本

## 赞赏
如果您喜欢FlutteringLayout，或感觉FlutteringLayout帮助到了您，可以点右上角“Star”支持一下，您的支持就是我的动力，谢谢 :smiley:
<p>您也可以扫描下面的二维码，请作者喝杯咖啡 :coffee:

<div>
   <img src="https://jenly1314.github.io/image/page/rewardcode.png">
</div>

## 关于我

| 我的博客                                                                                | GitHub                                                                                  | Gitee                                                                                  | CSDN                                                                                 | 博客园                                                                            |
|:------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------|
| <a title="我的博客" href="https://jenly1314.github.io" target="_blank">Jenly's Blog</a> | <a title="GitHub开源项目" href="https://github.com/jenly1314" target="_blank">jenly1314</a> | <a title="Gitee开源项目" href="https://gitee.com/jenly1314" target="_blank">jenly1314</a>  | <a title="CSDN博客" href="http://blog.csdn.net/jenly121" target="_blank">jenly121</a>  | <a title="博客园" href="https://www.cnblogs.com/jenly" target="_blank">jenly</a>  |

## 联系我

| 微信公众号        | Gmail邮箱                                                                          | QQ邮箱                                                                              | QQ群                                                                                                                       | QQ群                                                                                                                       |
|:-------------|:---------------------------------------------------------------------------------|:----------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------|
| [Jenly666](http://weixin.qq.com/r/wzpWTuPEQL4-ract92-R) | <a title="给我发邮件" href="mailto:jenly1314@gmail.com" target="_blank">jenly1314</a> | <a title="给我发邮件" href="mailto:jenly1314@vip.qq.com" target="_blank">jenly1314</a> | <a title="点击加入QQ群" href="https://qm.qq.com/cgi-bin/qm/qr?k=6_RukjAhwjAdDHEk2G7nph-o8fBFFzZz" target="_blank">20867961</a> | <a title="点击加入QQ群" href="https://qm.qq.com/cgi-bin/qm/qr?k=Z9pobM8bzAW7tM_8xC31W8IcbIl0A-zT" target="_blank">64020761</a> |

<div>
   <img src="https://jenly1314.github.io/image/page/footer.png">
</div>
