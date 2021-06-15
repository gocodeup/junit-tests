public class HelloWorld {
    public static String hello(String name){
        if (name == null){
            throw new IllegalArgumentException("People cant not have a name");
        }
        return "Hello, World!";
    }
}
