package lsp1.view;

import lsp1.shape.QuadriLateral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final QuadriLateral quadriLateral;

    public ShapeView(QuadriLateral quadriLateral) {
        this.quadriLateral = quadriLateral;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(quadriLateral.getArea());
    }
}
