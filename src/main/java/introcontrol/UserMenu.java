package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        System.out.println( "1. Felhasználók listázása'\n'" +
                            "2. Felhasználó felvétele'\n'" +
                            "Többi: Kilépés'\n'");

        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        scanner.nextLine();

        if (select == 1) {
            System.out.println("Felhasználók listázása");
        }
        if (select == 2) {
            System.out.println("Felhasználó felvétele");
        }
        else System.out.println("Kilépés");
    }

}
