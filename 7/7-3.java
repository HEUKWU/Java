public class Java {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++) {
            System.out.print(deck.cards[i]+",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

class SutdaDeck {
    final int card_num = 20;
    SutdatCard[] cards = new SutdatCard[card_num];

    SutdaDeck() {
        for (int i = 0; i < card_num; i++) {
            int num = i + 1;
            boolean isKwang = num == 1 || num == 3 || num == 8;

            if (num > 10) {
                num -= 10;
            }

            cards[i] = new SutdatCard(num, isKwang);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int a = (int) (Math.random() * cards.length);

            SutdatCard card = cards[i];
            cards[i] = cards[a];
            cards[a] = card;
        }
    }

    SutdatCard pick(int index) {
      // 유효성 검사 주의
        if (index < 0 || index >= card_num) {
            return null;
        }
        return cards[index];
    }

    SutdatCard pick() {
        int a = (int) (Math.random() * cards.length);
        return cards[a];
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
