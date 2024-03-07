package org.example;

public class CreateInvoice {

    //  An Invoice should include four attributes—a part number (type string), a part description (type string),
    //  a quantity of the item being purchased (type int) and a price per\
    //  item (type int). Your class should have a constructor that initializes the four attributes.
    //  Provide a set and a get method for each attribute.
    //
    //  +In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
    //  +then returns the amount as an int value. If the quantity is not positive, it should be set to 0.
    //  +If the price per item is not positive, it should be set to 0. Write a test program that demonstrates class Invoice’s capabilities.
    public static int calculateInvoiceAmount(Invoice invoice) {
        int quantity = invoice.getQuantity();
        if (quantity <= 0){
            invoice.setQuantity(0);
        }
        int pricePerItem = invoice.getPricePerItem();
        return quantity * pricePerItem;
    }

    public static void displayInvoice(Invoice invoice) {
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + calculateInvoiceAmount(invoice));
    }

    public static void getFinalInvoice(){
        Invoice invoice = new Invoice("001", "Screen", 4, 58);
        CreateInvoice.calculateInvoiceAmount(invoice);
        CreateInvoice.displayInvoice(invoice);
    }


}
