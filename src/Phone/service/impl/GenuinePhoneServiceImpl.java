package Phone.service.impl;

import Phone.model.GenuinePhone;
import Phone.service.GenuinePhoneSevice;
import Phone.util.ReadFileUtil;
import Phone.util.Validate;
import Phone.util.WriteFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class GenuinePhoneServiceImpl implements GenuinePhoneSevice {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() throws IOException {
        List<GenuinePhone> genuinePhoneList = ReadFileUtil.readFileGenuine();

        System.out.println("Enter id : ");
        String id = scanner.nextLine();
        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        System.out.println("Enter price : ");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter quantity : ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter manufacturer : ");
        String manufacturer = scanner.nextLine();
        String warrantyPeriod = Validate.inputDate("Enter warrantyPeriod :");
        System.out.println("Enter warrantyScope : ");
        String warrantyScope = scanner.nextLine();
        genuinePhoneList.add(new GenuinePhone(id, name, price, quantity, manufacturer, warrantyPeriod, warrantyScope));
        WriteFileUtil.writeFileGenuinePhone(genuinePhoneList);
    }

    @Override
    public void delete() throws IOException {
        List<GenuinePhone> genuinePhoneList = ReadFileUtil.readFileGenuine();
        System.out.println("Enter id of the genuine phone you want to delete: ");
        String idToDelete = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < genuinePhoneList.size(); i++) {
            if (genuinePhoneList.get(i).getId().equalsIgnoreCase(idToDelete)) {
                genuinePhoneList.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Cell phone removed successfully.");
            WriteFileUtil.writeFileGenuinePhone(genuinePhoneList);
        } else {
            System.out.println("Cell phone not found");
        }
        WriteFileUtil.writeFileGenuinePhone(genuinePhoneList);
    }

    @Override
    public void edit() throws IOException {
        List<GenuinePhone> genuinePhoneList = ReadFileUtil.readFileGenuine();
        System.out.println("Enter id of the cell phone you want to edit: ");
        String idToEdit = scanner.nextLine();

        boolean foundId = false;
        for (GenuinePhone genuinePhone : genuinePhoneList) {
            if (genuinePhone.getId().equals(idToEdit)) {
                foundId = true;
                System.out.println("Enter id : ");
                String id = scanner.nextLine();
                System.out.println("Enter name : ");
                String name = scanner.nextLine();
                System.out.println("Enter price : ");
                Double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter quantity : ");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter manufacturer : ");
                String manufacturer = scanner.nextLine();
                System.out.println("Enter warrantyPeriod : ");
                String warrantyPeriod = scanner.nextLine();
                System.out.println("Enter warrantyScope : ");
                String warrantyScope = scanner.nextLine();
                genuinePhone.setId(id);
                genuinePhone.setName(name);
                genuinePhone.setPrice(price);
                genuinePhone.setQuantity(quantity);
                genuinePhone.setManufacturer(manufacturer);
                genuinePhone.setWarrantyPeriod(warrantyPeriod);
                genuinePhone.setWarrantyScope(warrantyScope);
                break;
            }
        }
        if (!foundId) {
            System.out.println("Id not found in cell phone list.");
        } else {
            WriteFileUtil.writeFileGenuinePhone(genuinePhoneList);
        }
    }

    @Override
    public void display() throws IOException {
        List<GenuinePhone> genuinePhoneList = ReadFileUtil.readFileGenuine();
        for (GenuinePhone genuinePhone : genuinePhoneList) {
            System.out.println(genuinePhone);
        }
    }
}
