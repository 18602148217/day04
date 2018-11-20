package day04;
import java.util.Timer;//定时器
import java.util.TimerTask;//定时器任务

/**
 * 定时器应用
 * 定时器可以进行定时执行一段代码（方法）
 */
public class Demo09 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTask(),0,1000/10);

    }
}

class MyTask extends TimerTask{
    private char[] chs = {'-','\\','|','/'};
    //private char[] chs1 = {'.','o','O','o'};
    private int i = 0;
    public void run() {
        System.out.println(chs[i++%chs.length]);

    }
}