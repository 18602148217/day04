package day04;

public interface Runner {
    /*public static final*/int SPEED = 100;
    /*public abstract*/void run();
}
interface Hunter extends Runner{
    void hunt(); 
}
