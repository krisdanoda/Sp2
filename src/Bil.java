abstract public class Bil {
     int regNr,year ,noDoors;
    String make, model;

    abstract double calculateGreenOwnershipTax();


    public int getRegNr() {
        return regNr;
    }

    public int getYear() {
        return year;
    }

    public int getNoDoors() {
        return noDoors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String s = "regNr=" + regNr +
                ", model=" + model +
        ", year=" + year +
                ", noDoors=" + noDoors +
                ", make=" + make ;
        return s;
    }
}
