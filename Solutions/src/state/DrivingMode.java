package state;

public class DrivingMode implements TravelMode {
    @Override
    public Byte getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Byte getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
