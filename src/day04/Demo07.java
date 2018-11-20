package day04;

public class Demo07 {
    public static void main(String[] args) {
        //Shape s1 = new Shape();
        Shape s1;
        s1 = new Circle(3,4,5);
        System.out.println(s1.contains(1,1));
        System.out.println(s1.contains(10,10));
    }
}




