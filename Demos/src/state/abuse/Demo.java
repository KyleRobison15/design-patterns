package state.abuse;

public class Demo {
    public static void show(){
        System.out.println("============== ABUSING THE STATE PATTERN =================");
        var stopwatch = new Stopwatch();
        stopwatch.click(); // Started
        stopwatch.click(); // Stopped
        stopwatch.click(); // Started
    }
}
