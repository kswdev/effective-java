package effective.study.chapter06.item37;

public class Plant {
    public enum LifeCycle {ANNUAL, PERENNIAL, BIENNIAL}

    final String name;
    public final LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", lifeCycle=" + lifeCycle +
                '}';
    }
}
