# jitpackio-demo

A simple demo project that shows how to use [jitpack.io](https://jitpack.io) as an open maven repository for a java project built with gradle.

## How to force jitpack.io using a specified JDK version for compiling?

By default jitpack.io builds with JDK 8. Specifying an other JDK version for compiling can be done easily by creating the `jitpack.yml` configuration file and applying *jdk: openjdk9*. See [documentation here](https://jitpack.io/docs/BUILDING/#java-version). However, current JDK versions are not always supported. See [this issue](https://github.com/jitpack/jitpack.io/issues/3845) indicating that. Regardless of built in JDKs, jitpack can be forced using a specified JDK version by taking advantage of the `toolchain` feature, that gradle introduced in version 6.7. This feature enables for automatically downloading the specified JDK from [adoptOpenJDK](https://adoptopenjdk.net), installing it in the gradle configuration directory and finally using it for compiling. By doing so, you get completely independent of JDKs provided by jitpack.io.

1. Add `gradle wrapper` version 6.7 or higher to your project

        $ gradle wrapper
        $ ./gradlew wrapper --gradle-version 6.7
        $ ./gradlew wrapper

2. Push the gradle wrapper to the github repo

2. Use the `toolchain` declaration in *build.gradle* (new since v6.7) in order to specify the excact version of the JDK to compile

