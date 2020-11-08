package localvariables;

import java.util.Scanner;

public class DistanceMain {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Distance distance = new Distance(
                this.distancelnKm
        );

        System.out.println("Kérem a távolságot!");
        double dist = scanner.nextDouble();
        distance.setDistancelnKm(dist);
        System.out.println(distance.getDistancelnKm());
        distance.isExact(distance.getDistancelnKm());
        System.out.println(distance.isExact());

     }
}
