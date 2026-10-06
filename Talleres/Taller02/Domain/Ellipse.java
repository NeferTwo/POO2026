public class Ellipse extends Circle {
        private float radius2 = 0;

        public Ellipse(int newId, float newX, float newY, float newRadius, float newRadius2) {
        super(newId, newX, newY, newRadius);
        setRadius2(newRadius2);
    }

    public float getRadius2() {
        return radius2;
    }

    public void setRadius2(float newRadius) {
        if (newRadius <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0");
        }
        radius2 = newRadius;
    }

    @Override 
    public float getPerimeter() {
        return (float) (2 * Math.PI * Math.sqrt((Math.pow(getRadius1(), 2) + Math.pow(getRadius2(), 2)) / 2));
    }

    @Override 
    public float getArea() {
        return (float) (Math.PI * getRadius1() * getRadius2());
    }
}
