public class Square extends Shapes {
    private float side1 = 0;

    public Square(int newId, float newX, float newY, float newSide) {
        super(newX, newY, newId);
        setSide1(newSide);
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float newSide) {
        if (newSide <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0");
        }
        side1 = newSide;
    }

    public float getSide2() {
        return getSide1();
    }

    public void setSide2(float newSide) {
        setSide1(newSide);
    }

    public float getSide3() {
        return getSide1();
    }

    public void setSide3(float newSide) {
        setSide1(newSide);
    }

    private float getSide4() {
        return getSide2();
    }

    private void setSide4(float newSide) {
        setSide2(newSide);
    }

    @Override
    public float getPerimeter() {
        return getSide1() + getSide2() + getSide3() + getSide4();
    }

    @Override
    public float getArea() {
        return getSide1() * getSide2();
    }
}
