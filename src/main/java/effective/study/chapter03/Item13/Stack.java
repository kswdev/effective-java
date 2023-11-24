package effective.study.chapter03.Item13;

import effective.study.chapter02.item07.stack.EmptyStackException;

import java.util.Arrays;

// Stack의 복제 가능 버전 (80-81쪽)
public class Stack implements Cloneable {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    public boolean isEmpty() {
        return size ==0;
    }

    // 코드 13-2 가변 상태를 참조하는 클래스용 clone 메서드
    //TODO Stack -> elementsS[0, 1]
    //TODO Copy  -> elementsC[0, 1]
    //TODO elementsS[0] == elementsC[1] => 얕은 복사이기 때문에 같음
    @Override public Stack clone() {
        //TODO 배열을 clone하지 않으면 원본과 복사본이 동일한 배열을 참조하게 된다.
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

/*    @Override public Stack clone() {
        //TODO 배열을 clone하지 않으면 원본과 복사본이 동일한 배열을 참조하게 된다.
        try {
            Stack result = (Stack) super.clone();
            result.elements = new Object[this.elements.length];
            for (int i = 0; i < this.elements.length; i++) {
                if(elements[i] != null) {
                    PhoneNumber phoneNumber = (PhoneNumber) this.elements[i];
                    result.elements[i] = phoneNumber.deepCopy();
                }
            }
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }*/


    // 원소를 위한 공간을 적어도 하나 이상 확보한다.
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    // clone이 동작하는 모습을 보려면 명령줄 인수를 몇 개 덧붙여서 호출해야 한다.
    public static void main(String[] args) {
        Object[] values = new Object[2];
        values[0] = new PhoneNumber(123, 456, 7890);
        values[1] = new PhoneNumber(321, 764, 2341);

        Stack stack = new Stack();
        for (Object arg : values)
            stack.push(arg);

        Stack copy = stack.clone();

        PhoneNumber phoneNumber = (PhoneNumber) stack.elements[0];
        phoneNumber.setPrefix(12354);
        System.out.println("pop from stack");

/*        while (!stack.isEmpty())
            System.out.println(stack.pop() + " ");

        System.out.println("pop from copy");
        while (!copy.isEmpty())
            System.out.println(copy.pop() + " ");*/

        System.out.println(stack.elements[0] == copy.elements[0]);
        System.out.println(stack.elements[0].toString());
        System.out.println(copy.elements[0].toString());
    }
}