package Lab;

import java.util.ArrayList;

public class OnlineshopF {
    public static void main(String[] args) {
        double sum = 0;
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book.Cartoon(2)); // why ???
        list.add(new Book.Cartoon(3));
        list.add(new Book.Cartoon(5));
        list.add(new Book.Cartoon(7));
        list.add(new Book.Cartoon(1));
        for(Book i : list){
            sum = sum + i.Price();

        }
        System.out.println("Total books price => " + sum);

    }
}
interface Product{
    public abstract double Price();
}
class Book implements Product{
    private double price;

    public Book() {}

    public Book(double price) {
        this.price = price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double Price() {
        return price;
    }

   static class Cartoon extends Book{
      public Cartoon() {}

      public Cartoon(double price) {
          super(price);
      }
  }
}

