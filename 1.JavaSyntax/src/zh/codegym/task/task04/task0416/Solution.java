package zh.codegym.task.task04.task0416;

/* 
蒙眼过马路
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();
        t = t % 60;
        t = t % 5;
        if ((0 <= t) && (t < 3)){
            System.out.println("绿色");
        }else if ((3 <= t) && (t <= 4)){
            System.out.println("黄色");
        }else {
            System.out.println("红色");
        }
    }
}