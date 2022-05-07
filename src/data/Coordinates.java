package data;

import java.util.Objects;

public class Coordinates {
    private float x; //Максимальное значение поля: 994
    private Integer y; //Максимальное значение поля: 276, Поле не может быть null

    public Coordinates(float x, Integer y){
        this.x = x;
        this.y = y;
    }
    /**
     * @return Координата X
     */
    public float getX(){return x;}
    /**
     * @return Координата Y
     */
    public Integer getY(){return y;}


    @Override
    public String toString() {
        return "X:" + x + " Y:" + y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Coordinates) {
            Coordinates coordinatesObj = (Coordinates) obj;
            return (x == coordinatesObj.getX()) && y.equals(coordinatesObj.getY());
        }
        return false;
    }
}
