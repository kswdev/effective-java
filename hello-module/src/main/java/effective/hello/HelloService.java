package effective.hello;


import effective.name.NameService;

public class HelloService {
    public static void main(String[] args) {
        NameService service = new NameService();
        System.out.println("Hello " + service.getName() + " module!");
    }
}