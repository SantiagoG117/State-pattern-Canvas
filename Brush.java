/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 * @see state.canvas.Canvas
 * @see state.canvas.Eraser
 * @see state.canvas.Selector
 * @see state.canvas.Tool
 * Concrete state
 */

package state.canvas;

public class Brush implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
