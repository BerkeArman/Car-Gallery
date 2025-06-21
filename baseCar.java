package gallery;
import java.text.NumberFormat;
import java.util.Locale;

public class baseCar {
    protected String fuel_type,brand,model;
    protected double price;
    protected NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);

    public baseCar(String brand, String model, String fuel_type, double price)
    {
        this.brand = brand;
        this.model = model;
        this.fuel_type = fuel_type;
        this.price = price;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setFuel_type(String fuel_type)
    {
        this.fuel_type = fuel_type;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public String getFuelType()
    {
        return fuel_type;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        return ("Brand: " + brand + "\t" + " Model: " + model + "\t" + "Fuel Type: " + fuel_type + "\t"+ "Price: " + fmt.format(price));
    }
}
