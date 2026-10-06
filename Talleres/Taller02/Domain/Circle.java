public class Circle extends Shapes {
    private float radius1 = 0;

        public Circle(int newId, float newX, float newY, float newRadius) {
        super(newX, newY, newId);
        setRadius1(newRadius);
    }

    public float getRadius1() {
        return radius1;
    }

    public void setRadius1(float newRadius) {
        if (newRadius <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0");
        }
        radius1 = newRadius;
    }
    
    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * getRadius1());
    }

    @Override 
    public float getArea(){
        return (float) (Math.PI * Math.pow(getRadius1(), 2));
    }
    
}
