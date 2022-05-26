package Package;

import java.time.LocalDate;

public class Products {


    private static String names; //наименоввание
    private final int quantity;  //количество
    private double Price;        //цена
    private String Manufacturer; //Производитель
    private LocalDate SaleDate;  //Дата выуска


    public Products(String names, int quantity, double Price, String Manufacturer, LocalDate SaleDate) {
        Products.names = names;
        this.quantity = quantity;
        this.Price = Price;
        this.Manufacturer = Manufacturer;
        this.SaleDate = SaleDate;
    }

    public static String getNames() {
        return names;
    }

    public String setNames() {
        names = names;
        return null;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        quantity = quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public LocalDate getSaleDate() {
        return SaleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        SaleDate = saleDate;
    }

    @Override
    public String toString() {
        return names + quantity;
    }
}
