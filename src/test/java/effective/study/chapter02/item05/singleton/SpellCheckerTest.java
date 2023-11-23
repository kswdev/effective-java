package effective.study.chapter02.item05.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        assertTrue(SpellChecker.INSTANCE.isValid("test"));
    }

}