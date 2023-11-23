package effective.study.chapter02.item05.dependencyinjection;

import effective.study.chapter02.item05.DefaultDictionary;

public class DictionaryFactory {
    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }
}
