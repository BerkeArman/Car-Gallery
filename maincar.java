package gallery;

public class maincar {
    public static void main(String [] args)
    {
       SportsCar gallery = new SportsCar();

        gallery.addHyperCar("Ferrari", "sf90", "Petrol", 679098, true, true, 986);
        gallery.addHyperCar("Mclaren", "P1", "Hybrid", 1110099, true, true, 903);

        gallery.addSportsCar("Bmw", "M3", "Petrol", 304000, true, true, 560, "Medium", 32);
        gallery.addSportsCar("Mclaren", "720s", "Petrol", 450200, false, true, 563, "Soft", 14);

       gallery.listSportCars();
       gallery.getTotalCost();
    }
}
