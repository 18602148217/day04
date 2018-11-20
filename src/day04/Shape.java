package day04;

public abstract class Shape {


    protected int x;
    protected int y;
    public Shape(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public void up(){
        this.y--;
    }

    public abstract boolean contains(int x,int y) ;
}
