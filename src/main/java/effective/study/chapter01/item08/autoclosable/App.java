package effective.study.chapter01.item08.autoclosable;

public class App {

    public static void main(String[] args) throws Exception {
        try(AutoClosablesGood good = new AutoClosablesGood()) {
            //TODO 자원 반남 처리 됨
        }
    }
}
