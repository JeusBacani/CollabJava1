public class HelloWorld {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println(greeting.sayHello());
    }
}

//added method for greeting
class Greeting {
    public String sayHello() {
        return "Hello, world!";
    }
}
