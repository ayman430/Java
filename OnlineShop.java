package Lab;

import java.util.ArrayList;

public class OnlineShop {

    public static void main(String[] args) {
        double sum = 0;
        ArrayList<product> list = new ArrayList<>();
        list.add(new childrenBook(3));
        list.add(new childrenBook(4));
        list.add(new childrenBook(5));
        list.add(new childrenBook(6));
        list.add(new childrenBook(7));
        list.add(new childrenBook(8));
        for(product i : list){
            sum = sum + i.Price();

        }
        System.out.println("Total books price => " + sum);

    }

}
abstract class product{
    public abstract double Price();


}

class book extends product{
    private double price;

    public book() {}

    public book(double price) {
        this.price = price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double Price() {
        return price;
    }
}

class childrenBook extends book{
    public childrenBook() {
    }

    public childrenBook(double price) {
        super(price);
    }
}