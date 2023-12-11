package effective.study.chapter06.item35;

public enum Ensemble {
    SOLO, DUET, TRIO, QUARTER, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
