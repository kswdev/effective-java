package effective.study.chapter04.item18.callback;

public class Service {

    public void run(FunctionToCall functionToCall) {
        System.out.println("서비스 클래스의 run()!");
        functionToCall.call();
    }

    public static void main(String[] args) {
        Service service = new Service();
        BobFunction bobFunction = new BobFunction(service);
        BobFunctionWrapper bobFunctionWrapper = new BobFunctionWrapper(bobFunction);
        bobFunctionWrapper.run();
        //bobFunction.run();
    }
}
