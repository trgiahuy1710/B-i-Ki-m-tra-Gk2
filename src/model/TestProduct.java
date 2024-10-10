package model;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        subProduct1 product1 = null;
		try {
			System.out.println("Nhập thông tin cho sản phẩm subProduct1:");
			System.out.print("Tên sản phẩm: ");
			String productName1 = scanner.nextLine();
			System.out.print("Tên công ty: ");
			String companyName1 = scanner.nextLine();
			System.out.print("Số lượng đã bán: ");
			int quantitySold1 = scanner.nextInt();
			System.out.print("Giá: ");
			double price1 = scanner.nextDouble();
			double totalPrice1 = quantitySold1 * price1;
			product1 = new subProduct1(productName1, companyName1, quantitySold1, price1, totalPrice1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        product1.displayTotalPrice(); 
        scanner.nextLine(); 
        subProduct2 product2 = null;
		try {
			System.out.println("\nNhập thông tin cho sản phẩm subProduct2:");
			System.out.print("Tên sản phẩm: ");
			String productName2 = scanner.nextLine();
			System.out.print("Tên công ty: ");
			String companyName2 = scanner.nextLine();
			System.out.print("Số lượng đã bán: ");
			int quantitySold2 = scanner.nextInt();
			System.out.print("Giá: ");
			double price2 = scanner.nextDouble();
			double totalPrice2 = quantitySold2 * price2;
			product2 = new subProduct2(productName2, companyName2, quantitySold2, price2, totalPrice2);
		} catch (Exception e) {
			e.printStackTrace();
		}
        product2.displayTotalPrice(); 
        System.out.print("\nNhập số lượng bán thêm cho subProduct1: ");
        int additionalQuantity1 = scanner.nextInt();
        product1.sellMoreUpdate(additionalQuantity1); 
        System.out.print("\nNhập giá mới cho subProduct2: ");
        double newPrice2 = scanner.nextDouble();
        product2.setNewPrice(newPrice2); 
        scanner.close();
    }
}
