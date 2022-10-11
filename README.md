# Build Tools

## Materials
+ [Gradle installation](https://gradle.org/install/)
+ [Multi-project with Gradle](https://docs.gradle.org/current/userguide/multi_project_builds.html)
## Practice

In this task you are going to create the same application as in Maven module, but with Gradle build tool.

### Task 1
1. After Gradle installation make sure that you have 'gradle' package with wrapper inside;
2. Open root settings.gradle file and add two modules: utils, demo.

## Task 2
Custom jar `utils-1.3.5.jar` will be created with the following instructions:
- The jar should contain class `StringUtils` with method `boolean isPositiveNumber(String str)`.
- `Apache Commons Lang 3.10` library is used to implement this method.

1. Open build.gradle in 'utils' and fill it with proper group, version and delete comments with proper implementation
```gradle
plugins {
    // id for library
    // id for maven to publish jar to local repository
}

java {
// provide sourceCompatibility
}

repositories {
// provide repository, where required dependencies are located
}

publishing {
    publications {
        maven(MavenPublication) {
// provide groupId
// provide artifactId
// provide version

            from components.java
        }
    }
}

//add Apache Apache Commons Lang 3.10 (or higher) dependency

jar {
    manifest {
        //provide manifest with such attributes as 'Implementation-Title', 'Implementation-Version'
    }
}
```

2. Implement method in StringUtils.class:
```java
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //here magic will happen
    }
}
```

### Task 3

Now we will use the created util class:
1. Open build.gradle in 'demo' and fill in group, version, repositories and required dependency;

2. Provide required implementation:
```java
public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
    }
}
```

### Task 4

Make sure that application passes all test suits.