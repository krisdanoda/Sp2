public class Benzinbil extends Bil {
    private int octaneNo;
    private double kmPrL;

    public Benzinbil(int regNr,String make, String model, int year,  int noDoors, int octaneNo, double kmPrL) {
        this.regNr = regNr;
        this.model = model;
        this.year = year;
        this.make = make;
        this.noDoors = noDoors;
        this.octaneNo = octaneNo;
        this.kmPrL = kmPrL;

    }

    @Override
    double calculateGreenOwnershipTax() {
        if( kmPrL >20 && kmPrL<= 50){
            return 330;
        }else if ( kmPrL <= 20 && kmPrL > 15)
            return 1050;
        else if (kmPrL <= 15 && kmPrL > 10)
            return 2340;
        else if (kmPrL <= 10 && kmPrL > 5)
            return 5500;
        else if (kmPrL<= 5)
            return 10470;
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "octaneNo=" + octaneNo + ", kmPrL=" + kmPrL;
    }

    public int getOctaneNo() {
        return octaneNo;
    }

    public void setOctaneNo(int octaneNo) {
        this.octaneNo = octaneNo;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }
}
