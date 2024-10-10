package model;

public class Product {
    private String productName;
    private String companyName;
    private int quantitySoid;
    private double price;
    private double totalPrice;

    protected Product(String productName, String companyName, int quantitySoid, double price, double totalPrice) {
        this.productName = productName;
        this.companyName = companyName;
        this.quantitySoid = quantitySoid;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getQuantitySoid() {
        return quantitySoid;
    }

    public void setQuantitySoid(int quantitySoid) {
        this.quantitySoid = quantitySoid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void display() {
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Tên: " + this.productName);
        System.out.println("Giá: " + this.price);
        System.out.println("Nhà sản xuất: " + this.companyName);
        System.out.println("Số lượng đã bán: " + this.quantitySoid);
    }

    public void sellMoreUpdate(int n) {
        System.out.println("Sau khi bán thêm " + n + " sản phẩm");
        this.quantitySoid += n;
        display();
    }

    public void setNewPrice(double n) {
        System.out.println("Giá hiện tại: " + this.price);
        System.out.println("Sau khi thay đổi, giá mới là: " + n);
        this.price = n;
        display();
    }

    public void displayTotalPrice() {
        System.out.println("Tổng giá: " + (this.price * this.quantitySoid));
    }
}
