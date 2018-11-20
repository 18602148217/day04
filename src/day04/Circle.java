package day04;

public class Circle extends Shape {
    private int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public boolean contains(int x, int y){
        int a = this.x - x ;
        int b = this.y - y ;
        double c = Math.sqrt(a*a+b*b);
        return c<=r;

    }
}
