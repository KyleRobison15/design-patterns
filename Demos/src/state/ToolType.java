package state;

/*
* We replaced the use of the ToolType enum by implementing the state pattern
* Before, this ToolType enum was used in the Canvas class for the conditional logic that determined the behavior based on the ToolType
* After the State pattern was implemented, the behavior was dynamically determined at runtime based on the concrete tool implementation
*
* */
public enum ToolType {
  SELECTION,
  BRUSH,
  ERASER
}
