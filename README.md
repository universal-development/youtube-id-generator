# youtube-id-generator

[![Build Status](https://travis-ci.org/universal-development/youtube-id-generator.svg?branch=master)](https://travis-ci.org/universal-development/youtube-id-generator)

Easy generation of 'Youtube' like id from Java.


 [ ![Download](https://api.bintray.com/packages/universal-development/unidev-libs/youtube-id-generator/images/download.svg) ](https://bintray.com/universal-development/unidev-libs/youtube-id-generator/_latestVersion)


Gradle:
```
repositories {
    maven {
        url "https://mvn.universal-development.com/public" 
    }
}
...
implementation 'com.unidev.idgenerator:youtube-id-generator:0.0.12'
```
Example :
```
import com.unidev.idgenerator.YoutubeIdGenerator;

YoutubeIdGenerator youtubeIdGenerator = new YoutubeIdGenerator();

String id = youtubeIdGenerator.generate("potato");
// pueXRwy1qs5MBK

```

Each time, for same input string, will be same generated id.

# Built artifacts

https://mvn.universal-development.com/

