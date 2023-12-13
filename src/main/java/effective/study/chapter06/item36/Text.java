package effective.study.chapter06.item36;

import java.util.EnumSet;
import java.util.Set;

public class Text {

    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    public static final int STYLE_BOLD = 1;
    public static final int STYLE_ITALIC = 1 << 1;
    public static final int UNDERLINE = 1 << 2;

    public void applyStyles(int styles) {
        System.out.println(styles);
    }

    public void applyStyles(Set<Style> styles) {

    }
    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(STYLE_BOLD | STYLE_ITALIC);
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
