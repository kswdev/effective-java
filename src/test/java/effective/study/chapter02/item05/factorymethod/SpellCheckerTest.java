package effective.study.chapter02.item05.factorymethod;

import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void FactoryMethod() {
        DefaultDictionaryFactory defaultDictionaryFactory = new DefaultDictionaryFactory();
        MockDictionaryFactory mockDictionaryFactory = new MockDictionaryFactory();

        SpellChecker spellChecker = new SpellChecker(defaultDictionaryFactory);
        SpellChecker spellChecker2 = new SpellChecker(mockDictionaryFactory);
    }
}