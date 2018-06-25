public class iceCreamStall extends Stall implements IReviewed, ITicketed {


    public iceCreamStall(String name) {
        super(name);
    }

    public double defaultPrice() {
        return 2.80;


    }
}

