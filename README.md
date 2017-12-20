# afterburn-java-parser
> Java based afterburn parser for OpenFass

This is a simple version of afterburn parser that reads the incoming requests(from watchdog) over `System.in`
and writes the response into `System.out`.
The parser handles the computation to `function(String body, String httpMethod)` method in `function.Handler` class.

## Usage
This package is to create afterburn based OpenFaaS template for any JVM languages.

You can download it from [Bintray](https://bintray.com/ganesshkumar/openfaas/afterburn-java-parser)

**Gradle**

```
repositories {
  maven {
    url "https://dl.bintray.com/ganesshkumar/openfaas"
  }
}

compile 'com.ganesshkumar:afterburn-java-parser:1.0.0-rc1'
```

For more information on how to create a jvm afterburn template, refer [here](https://github.com/ganesshkumar/jvm-demo-template)

## Current limitation

* The template looks for function.Handler class which has a method called function

```
package function;

public class Handler {
    public String function(String input, String method) {
        return "You said: " + input;
    }
}
```

Note: These will be addressed in a better way
