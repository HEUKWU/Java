public class Java {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액이 부족하여 " + product + "을/를 살수 없습니다.");
            return;
        }
        money -= product.price;
        add(product);
    }

    void add(Product product) {
        if (i >= cart.length) {
            Product[] cart2 = new Product[cart.length * 2];
            System.arraycopy(cart, 0, cart2, 0, cart.length);
            cart = cart2;
        }
        cart[i] = product;
        i++;
    }

    void summary() {
        int sum = 0;
        String list = "";
        for (int j = 0; j < cart.length; j++) {
            list += cart[j] + ", ";
            sum += cart[j].price;
        }
        System.out.println("구입한 물건: " + list);
        System.out.println("사용한 금액: " + sum);
        System.out.println("남은 금액: " + money);
    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}
