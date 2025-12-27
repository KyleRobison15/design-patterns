package state;

public class BikingMode implements TravelMode{
    @Override
    public Byte getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Byte getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
