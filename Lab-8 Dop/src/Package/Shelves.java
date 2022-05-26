package Package;

import java.time.LocalDate;

public class Shelves {

    private String names;        //наименоввание
    private double Price;        //цена
    private LocalDate SaleDate;  //Дата выуска
    private int shelfLife;       //Срок годности;  Cтолко-то дней может храниться;
    private int quantity;        //количество
    private String manufacturer; //Производитель

    public Shelves(String names, double Price, LocalDate SaleDate, int shelfLife, int quantity, String manufacturer) {
        this.names = names;
        this.Price = Price;
        this.SaleDate = SaleDate;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public LocalDate getSaleDate() {
        return SaleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        SaleDate = saleDate;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
