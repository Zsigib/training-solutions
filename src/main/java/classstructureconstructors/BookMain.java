package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Doulas Addams", "Galaxis Útikalauz Stopposoknak" );
        book.register("01");

        System.out.println("Író neve: " + book.getAuthor());
        System.out.println("A mű címe: " + book.getAuthor());
        System.out.println("Regisztrációs szám: " + book.getRegNumber());
    }


}
