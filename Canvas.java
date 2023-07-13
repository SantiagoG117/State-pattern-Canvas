/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see state.canvas.Brush
 * @see state.canvas.Eraser
 * @see state.canvas.Selector
 * @see state.canvas.Tool
 * Context class
 */

package state.canvas;

public class Canvas {
    //Attributes
    /*
    Programming to an interface: The currentTool attribute is an interface object of the Tool interface. So we can pass
    to setCurrentTool() any class that implements this interface.
     */
    private Tool currentTool;

    //Public methods:
    /*
    Canvas is simply delegating to the specific tool (the classes that implement the Tool interface) the responsibility
     of determine what should happen when the user presses or releases the mouse.
     */
    public void mouseUp(){
        currentTool.mouseUp();
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    //Setters and getters

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
