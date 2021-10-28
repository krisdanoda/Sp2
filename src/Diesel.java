public class Diesel extends Bil{

    boolean hasParticleFilter;
     double kmPrL;

    public Diesel(int regNr,String make, String model, int year,  int noDoors, boolean hasParticleFilter, double kmPrL) {
        this.regNr = regNr;
        this.model = model;
        this.year = year;
        this.make = make;
        this.noDoors = noDoors;
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    double calculateGreenOwnershipTax() {
        double tax =0;
        if( kmPrL >20 && kmPrL<= 50){
            tax= 330+130;
        }else if ( kmPrL <= 20 && kmPrL > 15)
            tax= 1050+1390;
        else if (kmPrL <= 15 && kmPrL > 10)
            tax= 2340+1850;
        else if (kmPrL <= 10 && kmPrL > 5)
            tax= 5500+2270;
        else if (kmPrL<= 5)
            tax= 10470+15260;
        if (!hasParticleFilter)
            tax+= 1000;

        return tax;
    }

    @Override
    public String toString() {
        return super.toString() + "hasParticleFilter=" + hasParticleFilter + ", kmPrL=" + kmPrL;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }
}
