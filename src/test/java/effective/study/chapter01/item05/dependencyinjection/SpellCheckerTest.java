package effective.study.chapter01.item05.dependencyinjection;

import effective.study.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
        SpellChecker spellChecker2 = new SpellChecker(DictionaryFactory::get);
    }
}