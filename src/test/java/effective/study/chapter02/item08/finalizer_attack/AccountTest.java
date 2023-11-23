package effective.study.chapter02.item08.finalizer_attack;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class AccountTest {

    @Test
    void 일반_계정() {
        Account account = new Account("son");
        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

    @Test
    void 푸티_계정() {
        Account account = new Account("푸티");
        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

    @Test
    void 푸티_공격_계정() throws InterruptedException {
        Account account = null;
        try {
            account = new BrokenAccount("푸티");
        } catch (Exception e) {
            System.out.println("이러면???");
        }
        System.gc();

        Thread.sleep(3000L);
        //account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

}