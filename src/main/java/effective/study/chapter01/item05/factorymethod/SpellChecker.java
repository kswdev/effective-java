package effective.study.chapter01.item05.factorymethod;

import effective.study.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {
    private final Dictionary dictionary;
    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
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
