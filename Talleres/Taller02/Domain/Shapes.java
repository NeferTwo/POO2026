public abstract class Shapes {
    private int Id;
    private float X;
    private float Y;

    public Shapes(float newX, float newY, int newId) {
        setX(newX);
        setY(newY);
        setId(newId);
    }

    public abstract float getArea();
    public abstract float getPerimeter();

    public float getX() {
        return X;
    }
    public void setX(float x) {
        this.X = x;
    }
    public float getY() {
        return Y;
    }
    public void setY(float y) {
        this.Y = y;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
                if (Id <= 0) {
        throw new IllegalArgumentException("ID must be greater than 0");
        }
        this.Id = id;
        
        
    }

    
}