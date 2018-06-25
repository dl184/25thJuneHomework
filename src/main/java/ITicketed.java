public interface ITicketed {

        double defaultPrice();
        double priceForVisitor(Visitor visitor);

}
