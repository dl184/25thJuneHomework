public class CandyflossStall extends Stall implements IReviewed, ITicketed {

    private String name;
    private String ownerName;
    private String parkingSpot;


    public CandyflossStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public double defaultPrice() {
        return 4.20;


    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }
}
