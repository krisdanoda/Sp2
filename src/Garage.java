import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> garage = new ArrayList<>();

    double calculateGreenOwnershipTax(){
        double sum = 0;
        for(Bil car: garage)
            sum += car.calculateGreenOwnershipTax();
        return sum;
    }

    void addCar(Bil car){
        garage.add(car);
    }

    @Override
    public String toString() {
        String s = null;

        for (Bil car: garage)
            s += car.toString() + "\n";
        return s;
    }
}
