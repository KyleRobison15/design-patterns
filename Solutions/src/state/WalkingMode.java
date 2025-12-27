package state;

public class WalkingMode implements TravelMode{
    @Override
    public Byte getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Byte getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
