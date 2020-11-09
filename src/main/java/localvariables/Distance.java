package localvariables;

public class Distance {
    private double distancelnKm;
    private boolean exact;

    public double getDistancelnKm() {
        return distancelnKm;
    }

    public void setDistancelnKm(double distancelnKm) {
        this.distancelnKm = distancelnKm;
    }


    public void setExact(boolean exact) {
        this.exact = exact;
    }

    public boolean isExact(double distancelnKm) {
        return exact;
    }
}
