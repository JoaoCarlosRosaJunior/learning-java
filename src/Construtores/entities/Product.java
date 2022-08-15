package Construtores.entities;

public class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void ShowData() {
        System.out.printf("O produto %s custa %f reais", name, price);
    }
}
