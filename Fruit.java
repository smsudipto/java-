class Fruit {
    public void show() {
        System.out.println("I am a Fruit");
    }
}

class Apple extends Fruit {
    public void show() {
        System.out.println("I am an Apple");
    }
}

class Basket<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class sudiipto {
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.setItem(new Apple());

        Basket<? extends Fruit> b4 = appleBasket;  // ✅ সঠিক

        Fruit fruit = b4.getItem();
        fruit.show();               // Output: I am an Apple

        // b4.setItem(new Apple()); // ❌ ভুল: set করা যাবে না
    }
}
