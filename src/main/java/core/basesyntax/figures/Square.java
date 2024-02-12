package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square has " + color + "color and side lenght "
                + side + ". Area is " + getArea());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}