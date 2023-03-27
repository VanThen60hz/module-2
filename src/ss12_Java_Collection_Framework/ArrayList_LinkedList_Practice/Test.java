package ss12_Java_Collection_Framework.ArrayList_LinkedList_Practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager pm = new ProductManager();
        while (true) {
            System.out.println("\nProduct Management System");
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Delete product");
            System.out.println("4. Display products");
            System.out.println("5. Search product by name ");
            System.out.println("6. Sort products ascending by price");
            System.out.println("7. Sort products descending by price");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Thêm sản phẩm:");
                    pm.addProduct();
                    break;
                case 2:
                    System.out.println("Chỉnh sửa sản phẩm: ");
                    pm.editProduct();
                    break;
                case 3:
                    System.out.println("Xóa sản phẩm: ");
                    pm.deleteProduct();
                    break;
                case 4:
                    System.out.println("Hiển thị thông tin sản phẩm: ");
                    pm.displayProduct();
                    break;
                case 5:
                    System.out.println("Tìm kiếm thông tin: ");
                    pm.searchProduct();
                    break;
                case 6:
                    System.out.println("Sắp xếp tăng dần theo giá: ");
                    pm.sortProductAscending();
                    break;
                case 7:
                    System.out.println("Sắp xếp giảm dần theo giá: ");
                    pm.sortProductDescending();
                    break;
                case 0:
                    System.out.println("Exiting........");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
