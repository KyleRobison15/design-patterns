package state;

public class Demo {
    public static void show(){
        System.out.println("============== STATE PATTERN DEMO =================");
        var canvas = new Canvas();
        var brush = new BrushTool();
        var eraser = new EraserTool();

        canvas.mouseDown(); // Selection Icon
        canvas.mouseUp(); // Draw Rectangle

        canvas.setCurrentTool(brush);
        canvas.mouseDown(); // Brush Icon
        canvas.mouseUp(); // Draw line

        canvas.setCurrentTool(eraser);
        canvas.mouseDown(); // Eraser Icon
        canvas.mouseUp(); // Erase something
    }
}
