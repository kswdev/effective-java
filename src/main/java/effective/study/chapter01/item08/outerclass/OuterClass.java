package effective.study.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class OuterClass {

    private void hi() {


    }
    class InnerClass {
        public void hello() {

        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);

        outerClass.printConstrouctor();
    }

    private void printConstrouctor() {
        Field[] declaredFields = InnerClass.class.getDeclaredFields();
        for(Field field : declaredFields) {
            System.out.println("field type : " + field.getType());
            System.out.println("field name : " + field.getName());
        }
    }
}
