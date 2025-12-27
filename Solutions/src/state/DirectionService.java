package state;

public class DirectionService {
    private TravelMode currentTravelMode;

    public DirectionService() {
        this.currentTravelMode = new DrivingMode();
    }

    public DirectionService(TravelMode currentTravelMode) {
        this.currentTravelMode = currentTravelMode;
    }

    public Byte getEta() {
        return currentTravelMode.getEta();
    }

    public Byte getDirection() {
        return currentTravelMode.getDirection();
    }

    public TravelMode getTravelMode() {
        return currentTravelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.currentTravelMode = travelMode;
    }
}
