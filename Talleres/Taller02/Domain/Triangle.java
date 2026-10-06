public class Triangle extends Rectangle {
    private float side3 = 0;

    public Triangle(int newId, float newX, float newY, float newSide1, float newSide2, float newSide3) {
        super(newId, newX, newY, newSide1, newSide2);
        setSide3(newSide3);
    }

    public float getSide3() {
        return side3;
    }
    

    @Override 
    public void setSide3(float newSide3) {
        if (newSide3 <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0");
        }
        side3 = newSide3;
    }

    @Override
    public float getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public float getArea() {
        float s = getPerimeter() / 2;
        return (float) Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
    }
}
