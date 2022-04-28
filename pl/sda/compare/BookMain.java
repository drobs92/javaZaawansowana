package pl.sda.compare;

public class BookMain {

    public static void main(String[] args) {

        Book b1 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 12345);
        Book b2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 54321);
        Book b3 = new Book("Balladyna", "Juliusz Słowacki", 54311);

        System.out.println(b1.equals(b1)); //true

        System.out.println(b1.equals(b2)); //false
        System.out.println(b2.equals(b1)); //false

        System.out.println(b1.equals(b2)); //false
        System.out.println(b1.equals(b3)); //false
        System.out.println(b2.equals(b3)); //false

        System.out.println(b1.equals(null)); //false

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());

        System.out.println(b1.compareTo(b2)); //liczba ujemna - b1 mniejsze od b2

        System.out.println(b2.compareTo(b3)); //liczba dodatnia - b2 większe od b3

        BookComparator bookComparator = new BookComparator();

        System.out.println(bookComparator.compare(b1, b3));

    }

}
