package assignment6;

public class Main {
    public static void main(String[] args) {
        Product headphonesProduct = new Product();
        headphonesProduct.setPrice(369.45);
        headphonesProduct.setDescription("The Bose QC35 headphones offer awesome booming sound");
        InvoiceRow headphonesRow = new InvoiceRow();
        headphonesRow.setInvoiceRow(25,headphonesProduct);
        System.out.println(headphonesRow.getInvoiceRow());
    }
}
