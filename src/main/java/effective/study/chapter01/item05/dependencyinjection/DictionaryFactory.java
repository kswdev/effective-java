package effective.study.chapter01.item05.dependencyinjection;

import effective.study.chapter01.item05.DefaultDictionary;
import effective.study.chapter01.item05.Dictionary;

public class DictionaryFactory {
    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }
}
