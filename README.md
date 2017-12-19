# afterburn-java-parser
> Java based afterburn parser for OpenFass

* This is a simple version of afterburn parser that reads the incoming requests(from watchdog) over `System.in` and
writes the response into `System.out`.
* The parser handles the computation to `function(String body, String httpMethod)` method in `function.Handler` class.

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