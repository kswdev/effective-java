package effective.study.chapter06.item34.enum_type.has_field_method;

public class EnumHasFeildAndMethodExample {

    public static void main(String[] args) {
        double earthWeight = 56.0;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("%s에서의 무게는 %f이다.%n", p, p.surfaceWeight(mass));
    }
}
