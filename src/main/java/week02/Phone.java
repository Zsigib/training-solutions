package week02;

import java.util.Scanner;

public class Phone {

    String type;
    int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a telefon típusát:");
        String type = scanner.nextLine();
        System.out.println("Kérem a telefon memóriáját:");
        int mem = scanner.nextInt();
        scanner.nextLine();

        Phone phone1 = new Phone(type, mem);

        System.out.println("Kérem a telefon típusát:");
        String type2 = scanner.nextLine();
        System.out.println("Kérem a telefon memóriáját:");
        int mem2 = scanner.nextInt();
        scanner.nextLine();

        Phone phone2 = new Phone(type2, mem2);
        System.out.println("Teleon típusa: " + phone1.type + "Memória mérete:" + phone1.mem);
        System.out.println("Teleon típusa: " + phone2.type + "Memória mérete:" + phone2.mem));
    }
}
