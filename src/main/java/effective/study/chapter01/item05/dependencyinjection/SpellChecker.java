package effective.study.chapter01.item05.dependencyinjection;

import effective.study.chapter01.item05.DefaultDictionary;
import effective.study.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Supplier<Dictionary> dictionaryFactory) {
        this.dictionary = dictionaryFactory.get();
    }

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
