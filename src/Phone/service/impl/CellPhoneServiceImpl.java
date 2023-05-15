package Phone.service.impl;

import Phone.model.CellPhone;
import Phone.service.CellPhoneService;
import Phone.util.ReadFileUtil;
import Phone.util.Validate;
import Phone.util.WriteFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CellPhoneServiceImpl implements CellPhoneService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() throws IOException {
        List<CellPhone> cellPhoneList = ReadFileUtil.readFileCellPhone();

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
        System.out.println("Enter importedFrom : ");
        String importedFrom = scanner.nextLine();
        System.out.println("Enter status : ");
        String status = scanner.nextLine();
        cellPhoneList.add(new CellPhone(id, name, price, quantity, manufacturer, importedFrom, status));
        WriteFileUtil.writeFileCellPhone(cellPhoneList);
    }

    @Override
    public void delete() throws IOException {
        List<CellPhone> cellPhoneList = ReadFileUtil.readFileCellPhone();
        System.out.println("Enter id of the cell phone you want to delete: ");
        String idToDelete = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < cellPhoneList.size(); i++) {
            if (cellPhoneList.get(i).getId().equalsIgnoreCase(idToDelete)) {
                cellPhoneList.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Cell phone removed successfully.");
            WriteFileUtil.writeFileCellPhone(cellPhoneList);
        } else {
            System.out.println("Cell phone not found");
        }
        WriteFileUtil.writeFileCellPhone(cellPhoneList);
    }

    @Override
    public void edit() throws IOException {
        List<CellPhone> cellPhoneList = ReadFileUtil.readFileCellPhone();
        System.out.println("Enter id of the cell phone you want to edit: ");
        String idToEdit = scanner.nextLine();

        boolean foundId = false;
        for (CellPhone cellPhone : cellPhoneList) {
            if (cellPhone.getId().equals(idToEdit)) {
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
                System.out.println("Enter importedFrom : ");
                String importedFrom = scanner.nextLine();
                System.out.println("Enter status : ");
                String status = scanner.nextLine();
                cellPhone.setId(id);
                cellPhone.setName(name);
                cellPhone.setPrice(price);
                cellPhone.setQuantity(quantity);
                cellPhone.setManufacturer(manufacturer);
                cellPhone.setImportedFrom(importedFrom);
                cellPhone.setStatus(status);
                break;
            }
        }
        if (!foundId) {
            System.out.println("Id not found in cell phone list.");
        } else {
            WriteFileUtil.writeFileCellPhone(cellPhoneList);
        }
    }

    @Override
    public void display() throws IOException {
        List<CellPhone> cellPhoneList = ReadFileUtil.readFileCellPhone();
        for (CellPhone cellPhone : cellPhoneList) {
            System.out.println(cellPhone);
        }
    }
}
