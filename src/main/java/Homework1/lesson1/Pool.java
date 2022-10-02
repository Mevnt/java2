package Homework1.lesson1;

public class Pool {
    private double length;

    public Pool(double length) {
        this.length = length;
    }

    public double gerTimeToOvercome(CanSwim cat){
        return  cat.swim(this);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "length=" + length +
                '}';
    }
}
