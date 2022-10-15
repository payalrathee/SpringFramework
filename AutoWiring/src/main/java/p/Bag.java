package p;

public class Bag {
    private String color;
    private String book1;

    public Bag(String color, String book) {
        this.color = color;
        this.book1 = book;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "color=" + color +
                ", book=" + book1 +
                '}';
    }
}
