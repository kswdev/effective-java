package effective.study.chapter02.item03.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void perform() {
        Concert concert = new Concert(Elvis.INSTANCE);
        //Concert concert = new Concert(new MockElvis());
        concert.perform();

        assertTrue(concert.isLightsOn());
        assertTrue(concert.isMainStateOpen());
    }
}