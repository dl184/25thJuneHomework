abstract class Stall {

    public String name;
    private String ownername;
    private Integer parkingspot;


    public Stall(String name, String ownername, int parkingspot) {
        this.name = name;
        this.ownername = ownername;
        this.parkingspot = parkingspot;
    }

    public String getName() {
        return name;
    }

    public String getOwnername() {
        return ownername;
    }

    public Integer getParkingspot() {
        return parkingspot;
    }
}
