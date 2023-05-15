package Phone.model;

public class CellPhone extends Phone{
    private String importedFrom;
    private String status;

    public CellPhone(String id, String name, double price, int quantity, String manufacturer, String importedFrom, String status) {
        super(id, name, price, quantity, manufacturer);
        this.importedFrom = importedFrom;
        this.status = status;
    }

    public String getImportedFrom() {
        return importedFrom;
    }

    public void setImportedFrom(String importedFrom) {
        this.importedFrom = importedFrom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getInfo() {
        return this.getId() + "," + this.getName() + "," + this.getPrice() + "," + this.getQuantity() + "," + this.getManufacturer() + this.getImportedFrom() + "," + this.getStatus() + "\n";
    }

    @Override
    public String toString() {
        return "CellPhone{" + super.toString() +
                "importedFrom='" + importedFrom + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
