import java.util.ArrayList;

public class TobbacoStall extends Stall implements ISecurity, IReviewed, ITicketed {


    public TobbacoStall() {
        super(name);

    }

    public double defaultPrice() {
        return 6.60;

    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18) {
            return false;
        }
        return true;
    }
}