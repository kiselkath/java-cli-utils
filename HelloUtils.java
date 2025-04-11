//branch main
package utils;

public class HelloUtils {
    public static Stringx sayHello(String name) {
        return "Hello, " + name + "!";
    }

//branch feature/add-greet-utils
public static String greetTimeOfDay(String name, String time) {
    return "Good " + time + ", " + name + "!";
}

