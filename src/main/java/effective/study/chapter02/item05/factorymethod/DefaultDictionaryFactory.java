package effective.study.chapter02.item05.factorymethod;

import effective.study.chapter02.item05.DefaultDictionary;
import effective.study.chapter02.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory{
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
