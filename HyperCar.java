package gallery;

public class HyperCar extends baseCar {
    private boolean spoiler,turbo;
    private int horsePower;
    
    public HyperCar(String brand, String model, String fuel_type, double price,boolean spoiler, boolean turbo, int horsePower )
    {
        super(brand,model,fuel_type,price);
        this.spoiler = spoiler;
        this.turbo = turbo;
        this.horsePower = horsePower;
    }

    public String toString()
    {
        return super.toString() + ("\n" + "Spoiler: " + spoiler + "\t" + "Turbo: " + turbo + "\t" + "Horse Power: " + horsePower);
    }
    

    
}
