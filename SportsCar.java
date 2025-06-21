package gallery;
import java.text.NumberFormat;
import java.util.Locale;

public class SportsCar {
    HyperCar[] hyperCarCollection;
    RaceCar[] raceCarCollection;
    private double totalPriceH,totalPriceR;
    private int HyperCarCount, RaceCarCount;
    private NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);

    public SportsCar ()
    {
        hyperCarCollection = new HyperCar[10];
        raceCarCollection = new RaceCar[10];
        HyperCarCount = 0;
        RaceCarCount = 0;
        totalPriceH = 0.0;
        totalPriceR = 0.0;
    } 

    public void addHyperCar(String brand, String model, String fuel_type, double price,boolean spoiler, boolean turbo, int horsePower)
    {
        if(HyperCarCount < hyperCarCollection.length)
        {
            hyperCarCollection[HyperCarCount] = new HyperCar(brand, model, fuel_type, price, spoiler, turbo, horsePower);
            totalPriceH += price; 
            HyperCarCount ++;
        }
        else
        {
            System.out.println("Hypercar colletion is full");
        }
    }

    public void addSportsCar(String brand, String model, String fuel_type, double price,boolean spoiler, boolean turbo, int horsePower,String tire, int laps)
    {
        if(RaceCarCount < hyperCarCollection.length)
        {
            raceCarCollection[RaceCarCount] = new RaceCar(brand, model, fuel_type, price, spoiler, turbo, horsePower, tire, laps);
            totalPriceR += price; 
            RaceCarCount++;
        }
        else
        {
             System.out.println("Race Car colletion is full");

        }
    }

    public void listSportCars()
    {
        System.out.println("Hypercars");
        for(int i=0;i<HyperCarCount;i++)
        {
           System.out.println(hyperCarCollection[i]); 
           System.out.println("-----");
        }
        
        System.out.println("Hypercars");
        
        for(int i = 0;i<RaceCarCount;i++)
        {
            System.out.println(raceCarCollection[i]);
            System.out.println("-----");
        }
    }

    public void getTotalCost()
    {
        System.out.println("Hypercar total = "  + fmt.format(totalPriceH));
        System.out.println("Race Car total = "  + fmt.format(totalPriceR));
        System.out.println("All cars total = "  + fmt.format(totalPriceR+totalPriceH));
    }
    
}
