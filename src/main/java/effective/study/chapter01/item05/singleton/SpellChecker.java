package effective.study.chapter01.item05.singleton;

import effective.study.chapter01.item05.DefaultDictionary;
import effective.study.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    //자원을 직접 명시
    private final Dictionary dictionary = new DefaultDictionary();
    private SpellChecker() {}
    public static final SpellChecker INSTANCE = new SpellChecker();
    public boolean isValid(String word) {
        /*
         *  SpellCheck 코드 생략
         */
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        /*
         *  SpellCheck 코드 생략
         */
        return dictionary.closeWordsTo(typo);
    }
}
