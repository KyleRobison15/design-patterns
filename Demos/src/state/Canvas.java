package state;

public class Canvas {

    private Tool currentTool;

    public Canvas() {
        this.currentTool = new SelectionTool(); // Default to selection tool
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
