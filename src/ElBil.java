public class ElBil extends Bil {

    private double batteryCapacityKWh, maxKm, whPrKm;

    public ElBil(int regNr, String make, String model, int year, int noDoors, double batteryCapacityKWh, double maxKm, double whPrKm) {
        this.regNr = regNr;
        this.model = model;
        this.year = year;
        this.make = make;
        this.noDoors = noDoors;
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    double calculateGreenOwnershipTax() {
        return (100 / (whPrKm / 91.25));

    }

    public double getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(double batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    @Override
    public String toString() {
        String s = super.toString() + "batteryCapacityKWh=" + batteryCapacityKWh + ", maxKm=" + maxKm + ", whPrKm=" + whPrKm;
        return s;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }
}
