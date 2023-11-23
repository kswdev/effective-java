package effective.study.chapter02.item05.dependencyinjection;

import effective.study.chapter02.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
        SpellChecker spellChecker2 = new SpellChecker(DictionaryFactory::get);
    }
}