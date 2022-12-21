public class Java {
    public static void main(String[] args) {
        SutdatDeck deck = new SutdatDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
    }
}

class SutdatDeck {
    final int card_num = 20;
    SutdatCard[] cards = new SutdatCard[card_num];

    SutdatDeck() {
        for (int i = 0; i < card_num; i++) {
            int num = i + 1;
            boolean isKwang = num == 1 || num == 3 || num == 8;

            if (num > 10) {
                num -= 10;
            }

            cards[i] = new SutdatCard(num, isKwang);
        }
    }
}

class SutdatCard {
    int num;
    boolean isKwang;

    SutdatCard() {
        this(1, true);
    }

    public SutdatCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
