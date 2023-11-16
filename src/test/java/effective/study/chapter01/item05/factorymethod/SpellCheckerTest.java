package effective.study.chapter01.item05.factorymethod;

import effective.study.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void FactoryMethod() {
        DefaultDictionaryFactory defaultDictionaryFactory = new DefaultDictionaryFactory();
        MockDictionaryFactory mockDictionaryFactory = new MockDictionaryFactory();

        SpellChecker spellChecker = new SpellChecker(defaultDictionaryFactory);
        SpellChecker spellChecker2 = new SpellChecker(mockDictionaryFactory);
    }
}