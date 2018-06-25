import java.util.ArrayList;

public class Dodgems extends Attraction implements IReviewed, ITicketed {



    public Dodgems(String name, int rating) {
        super(name, rating);

        }

    public double defaultPrice() {
        return 4.50;
    }

    public double priceForVisitor(Visitor visitor){
        if (visitor.getAge() < 12 ) {
            return defaultPrice()/2;
        }
        return defaultPrice();
    }




}

