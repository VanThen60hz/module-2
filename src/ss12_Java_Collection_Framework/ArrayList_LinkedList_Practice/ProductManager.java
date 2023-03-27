package ss12_Java_Collection_Framework.ArrayList_LinkedList_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class ProductManager{
    ArrayList<Product> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();
        sc.nextLine();
        Product product = new Product(id, name, price);
        productList.add(product);
    }

    public void displayProduct(){
        int count = 1;
        for(Product product : productList){
            System.out.println("Thông tin sản phẩm thứ "+ count++ + ":");
            System.out.println(product.toString());
        }
    }

    public void editProduct(){
        System.out.println("Nhập id sản phẩm cần sửa: ");
        int editId = Integer.parseInt(sc.nextLine());
        for(Product product : productList){
            if(product.getId() == editId){
                System.out.println("Nhập tên sản phẩm mới: ");
                product.setName(sc.nextLine());
                System.out.println("Nhập giá sản phẩm mới: ");
                product.setPrice(sc.nextDouble());
                return;
            }
        }
        System.out.println("Không tìn thấy sản phẩm.");
    }

    public void deleteProduct(){
        System.out.println("Nhập id sản phẩm cần xóa: ");
        int delId = Integer.parseInt(sc.nextLine());
        for(Product product : productList){
            if(product.getId() == delId){
                productList.remove(product);
                return;
            }
        }
        System.out.println("Không tìn thấy sản phẩm.");
    }

    public void searchProduct(){
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String productName = sc.nextLine();
        for(Product product : productList){
            if(product.getName().equals(productName)){
                System.out.println(product.toString());
                return;
            }
        }
        System.out.println("Không tìn thấy sản phẩm.");
    }

    public void sortProductAscending(){
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductDescending(){
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice).reversed());
    }

}
