package Phone.model;

public class GenuinePhone extends Phone{
    private String warrantyPeriod;//thời gian bảo hành
    private String warrantyScope;//phạm vi bảo hành

    public GenuinePhone(String id, String name, double price, int quantity, String manufacturer, String warrantyPeriod, String warrantyScope) {
        super(id, name, price, quantity, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

    @Override
    public String getInfo() {
        return this.getId() + "," + this.getName() + "," + this.getPrice() + "," + this.getQuantity() + "," + this.getManufacturer() + "," + this.getWarrantyPeriod() + "," + this.getWarrantyScope() + "\n" ;
    }

    @Override
    public String toString() {
        return "GenuinePhone{" + super.toString() +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyScope='" + warrantyScope + '\'' +
                '}';
    }
}
