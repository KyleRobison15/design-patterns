package state.abuse;

public class Stopwatch {
    private StopwatchState currentState = new StoppedState(this);

    public void click(){
        currentState.click();
    }

    public StopwatchState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(StopwatchState currentState) {
        this.currentState = currentState;
    }
}

// This is an abuse of the state pattern because we could easily just have a simple conditional statement for isRunning
// In the demo.Tool example, it made sense to use the State pattern because we had conditional logic in multiple places, for multiple tools