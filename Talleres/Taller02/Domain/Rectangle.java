public class Rectangle extends Square {
    private float side2 = 0;
    
    public Rectangle(int newId, float newX, float newY, float newSide1, float newSide2) {
        super(newId, newX, newY, newSide1);
        setSide2(newSide2);
    }

    public float getSide2() {
        return side2;
    }

        private float getSide4() {
        return getSide2();
    }

    private void setSide4(float newSide) {
        setSide2(newSide);
    }

    @Override 
    public void setSide2(float newSide2) {
        if (newSide2 <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0");
        }
        side2 = newSide2;
    }

    public float getPerimeter() {
        return getSide1() + getSide2() + getSide3() + getSide4();
    }

    public float getArea() {
        return getSide1() * getSide2();
}
}
