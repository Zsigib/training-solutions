package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();

        client.setName("Gipsz Jakab");
        client.setYear(1969);
        client.setAddress("Timbuktu köz 123.");

        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Cím: " + client.getAddress());

        client.migrate("Hamis utca 123.");
        System.out.println("Új cím:" + client.getAddress());
    }
}
