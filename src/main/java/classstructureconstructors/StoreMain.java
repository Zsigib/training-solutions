package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store italbolt = new Store("Sör");
        italbolt.store(20);
        System.out.println(italbolt.getProduct() + "=" + italbolt.getStock());

        Store perecbolt = new Store("Perec");
        perecbolt.store(123);
        System.out.println(perecbolt.getProduct() + "=" + perecbolt.getStock());

        italbolt.store(24);
        italbolt.dispatch(23);
        perecbolt.store(456);
        perecbolt.dispatch(243);

        System.out.println(italbolt.getProduct() + "=" + italbolt.getStock());

        System.out.println(perecbolt.getProduct() + "=" + perecbolt.getStock());
            }
}
