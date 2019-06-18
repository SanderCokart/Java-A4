package assignment6;

public class Product {
    private double tax = 21;
    private double price;
    private String description;

    public void setTax(double tax) {
        if (tax > 0 && tax <= 100) {
            this.tax = tax;
        } else {
            this.tax = 0;
        }
    }

    public double getTax() {
        return tax;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price =  price;
        } else {
            this.price = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public double getPricePlusTax() {
        if (price != 0 && tax != 0) {
            double pricePlusTax = price * (tax/100 +1);
            return pricePlusTax;
        } else {
            return 0;
        }
    }

    public void setDescription(String description) {
        if (description.length() > 0) {
            this.description = description;
        } else {
            this.description = "0";
        }
    }

    public String getDescription() {
        return description;
    }
}
