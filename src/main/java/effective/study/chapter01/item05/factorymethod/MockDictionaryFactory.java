package effective.study.chapter01.item05.factorymethod;


import effective.study.chapter01.item05.Dictionary;
import effective.study.chapter01.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory{
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
