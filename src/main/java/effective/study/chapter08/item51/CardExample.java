package effective.study.chapter08.item51;

public class CardExample {

    public static void main(String[] args) {

        Card card = new Card(1, "spade");
        CardGame cardGame = new CardGame();

        cardGame.check(card);
    }
}
