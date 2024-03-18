package lsp1.shape;

public class Square extends QuadriLateral {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) Math.pow(side, 2);
    }
}
