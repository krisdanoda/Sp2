public class Main {

    public static void main(String[] args) {
	// write your code here

        Bil teslaS = new ElBil(1,"Tesla", "Model s", 2020, 4, 100, 600, 1000 );
        Bil mercedesS = new Benzinbil(2, "Mercedes", "S class", 2019, 4, 97, 20);
        Bil cadellacS = new Diesel(420, "Cadellac", "Its actually a saab", 2012, 4,  false, 10);

        Garage myGarage = new Garage();
        myGarage.addCar(teslaS);
        myGarage.addCar(mercedesS);
        myGarage.addCar(cadellacS);
        System.out.println(myGarage);


        System.out.println(myGarage.calculateGreenOwnershipTax());
    }

}
