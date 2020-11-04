package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kedvenc Eladó?");
        song.band = scanner.nextLine();
        System.out.println("Kedvenc Dal?");
        song.title = scanner.nextLine();
        System.out.println("Hossza percben?");
        song.length = scanner.nextInt();
        System.out.println(song.band + "-" + song.title + " (" + song.length + "perc)");
    }
}
