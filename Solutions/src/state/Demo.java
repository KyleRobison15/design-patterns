package state;

public class Demo {
    public static void show(){
        System.out.println("============== STATE PATTERN SOLUTION =================");
        var service = new DirectionService();
        var eta = service.getEta(); // Driving ETA
        System.out.println("ETA: " + eta); // 1
        var direction = service.getDirection(); // Driving Direction
        System.out.println("Direction: " + direction); // 1

        service.setTravelMode(new BikingMode());
        eta = service.getEta(); // Biking ETA
        System.out.println("ETA: " + eta); // 2
        direction = service.getDirection(); // Biking Direction
        System.out.println("Direction: " + direction); // 2

        service.setTravelMode(new TransitMode());
        eta = service.getEta(); // Transit ETA
        System.out.println("ETA: " + eta); // 3
        direction = service.getDirection(); // Transit Direction
        System.out.println("Direction: " + direction); // 3

        service.setTravelMode(new WalkingMode());
        eta = service.getEta(); // Walking ETA
        System.out.println("ETA: " + eta); // 4
        direction = service.getDirection(); // Walking Direction
        System.out.println("Direction: " + direction); // 4
    }
}
