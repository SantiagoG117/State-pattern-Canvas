/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see state.canvas.Brush
 * @see state.canvas.Canvas
 * @see state.canvas.Selector
 * @see state.canvas.Tool
 * Concrete state
 */

package state.canvas;

public class Eraser implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase something");
    }
}
