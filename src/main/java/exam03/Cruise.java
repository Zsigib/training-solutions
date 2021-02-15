package exam03;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Cruise {
    
    private Boat boat;
    
    private LocalDate sailing;
    
    private double basicPrice;
    
    private List<Passenger> Passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice, List<Passenger> passengers) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
        Passengers = passengers;
    }

    public Cruise(Boat boat, LocalDate of, int basicPrice) {
    }

    public void bookPassenger(Passenger john_doe) {
    }

    public int getBasicPrice() {
    }

    public double getPriceForPassenger(Passenger john_doe) {
    }

    public Passenger findPassengerByName(String jack_doe) {
    }

    public List<String> getPassengerNamesOrdered() {
    }

    public double sumAllBookingsCharged() {
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public List<Passenger> getPassengers() {
        return Passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        Passengers = passengers;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public void setSailing(LocalDate sailing) {
        this.sailing = sailing;
    }
}
