package state;

public class TransitMode implements TravelMode{
    @Override
    public Byte getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Byte getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
