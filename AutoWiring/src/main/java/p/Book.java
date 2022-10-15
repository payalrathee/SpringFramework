package p;

public class Book {
    private int no;
    private String subject;

    public Book(int no, String subject) {
        this.no = no;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", subject='" + subject + '\'' +
                '}';
    }
}
