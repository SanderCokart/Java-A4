package assignment6;

import java.text.DecimalFormat;

public class InvoiceRow {
    private String invoiceRow;

    private DecimalFormat df2 = new DecimalFormat("0.00");

    public void setInvoiceRow(int quantity, Product product) {
        invoiceRow = "Quantity: " + quantity + " | " + product.getDescription() +
                "\nPer item: €" + product.getPrice() + " Excl. Tax (" + product.getTax() + ")" +
                "\nTotal: €" + df2.format(product.getPrice() * quantity * (product.getTax() / 100 + 1)) +
                " Incl. Tax (" + product.getTax() + ")";
    }

    public String getInvoiceRow() {
        return invoiceRow;
    }
}