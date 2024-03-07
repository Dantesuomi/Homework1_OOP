package org.example;



public class Invoice {

    // +An Invoice should include four attributes—a part number (type string), a part description (type string), a quantity of the item being purchased (type int) and a price per
    // +item (type int). Your class should have a constructor that initializes the four attributes.
    // +Provide a set and a get method for each attribute.
    // In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
    // then returns the amount as an int value. If the quantity is not positive, it should be set to 0.
    // If the price per item is not positive, it should be set to 0. Write a test program that demonstrates class Invoice’s capabilities.

    private String partNumber;
    private String partDescription;
    private int quantity;
    private int pricePerItem;

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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
}

