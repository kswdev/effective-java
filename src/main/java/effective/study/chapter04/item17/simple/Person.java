package effective.study.chapter04.item17.simple;

public final class Person {
    private final Address address;

    public Person(Address adress) {
        this.address = adress;
    }
/*
    있으면 안됨 있어도 방어적인 복사를 함
    public Address getAddress() {
        return address;
    }
*/

    public static void main(String[] args) {
        Address korea = new Address();
        korea.setCity("seoul");

        Person person = new Person(korea);
/*        Address address1 = person.getAddress();
        address1.setCity("modifiedCity");*/
    }
}
