package week02;

import java.util.Scanner;

public class Controller {

    private  Office office = new Office();

    public void readOffice() {
        System.out.println("Kérem a tárgyalók számát!");
        Scanner scanner = new Scanner(System.in);
        int numberOfMeetingRooms = scanner.nextInt();
        scanner.nextLine();

    }

    public void printMenu() {
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");
    }

    public void runMenu() {
        System.out.println("Melyik menüpontot választod?");
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        if (menuItem == 1) {
            office.printNames();
        }

        if (menuItem == 7) {
            System.out.println("Mekkoránál nagyobbat keresel?");
            int area = scanner.nextInt();
            scanner.nextLine();

            office.printAreasLargerThan(area);
        }
    }
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();

    }

}
