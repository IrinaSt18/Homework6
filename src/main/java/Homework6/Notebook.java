package Homework6;

public class Notebook {
    private String model;
    private String brand;
    private double price;
    private int ram;
    private String color;

    public Notebook(String model, String brand, double price, int ram, String color) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                '}';
    }
}
