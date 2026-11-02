package io.github.srinivaskarre.hello;

/** Dummy class so the library has something to ship. */
public final class Hello {
    private Hello() {}

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
