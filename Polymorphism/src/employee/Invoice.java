package employee;

public class Invoice implements payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int count) {
        quantity = (count < 0) ? 0 : count;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double price) {
        pricePerItem = (price < 0.0) ? 0.0 : price;
    }

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setPricePerItem(pricePerItem);
        setQuantity(quantity);
    }

    @Override
    public String toString() {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),"quantity",
                getQuantity(), "price per item", getPricePerItem());
    }


    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();//calculate total cost
    }
}
