/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see state.canvas.Brush
 * @see state.canvas.Canvas
 * @see state.canvas.Selector
 * @see state.canvas.Tool
 * State class
 */

package state.canvas;

public interface Tool {
    /*
    We use the Tool interface to provide common behavior among different classes
     */
    void mouseUp();
    void mouseDown();
}
