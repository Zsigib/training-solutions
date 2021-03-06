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
    return ;}

    public double getPriceForPassenger(Passenger john_doe) {
    return ;}

    public Passenger findPassengerByName(String jack_doe) {
    return ;}

    public List<String> getPassengerNamesOrdered() {
    return ;}

    public double sumAllBookingsCharged() {
    return ;}

    public Map<CruiseClass, Integer> countPassengerByClass() {
    return ;}

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
