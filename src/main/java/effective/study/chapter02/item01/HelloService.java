package effective.study.chapter02.item01;

public interface HelloService {
    String hello();

    static HelloService of(String lang) {
        if(lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
