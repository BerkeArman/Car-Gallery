package gallery;

public class RaceCar extends HyperCar {
    private String tire;
    private int laps;

    public RaceCar (String brand, String model, String fuel_type, double price,boolean spoiler, boolean turbo, int horsePower, String tire, int laps)
    {
        super(brand,model,fuel_type,price,spoiler,turbo,horsePower);
        this.tire = tire;
        this.laps = laps;
    }
    
      public String toString()
    {
        return super.toString()+("\t"+ "Tire: " + tire + "\t" + "Laps: " + laps);
    }    
}
