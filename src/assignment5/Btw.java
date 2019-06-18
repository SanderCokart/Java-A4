package assignment5;

public class Btw {
    private double btw = 21;
    private double prijs;

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getBtw() {
        return btw;
    }

    public void setBtw(int btw) {
        this.btw = btw;
    }

    public double getPrijsInclusiefBtw() {
        return prijs + prijs * (btw / 100);

    }

//    public static void main(String[] args) {
//        Btw btw = new Btw();
//        btw.setPrijs(25);
//        System.out.println(btw.getPrijsInclusiefBtw());
//    }

}