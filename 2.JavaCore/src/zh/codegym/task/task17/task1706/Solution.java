package zh.codegym.task.task17.task1706;

/* 
同步的总统
*/

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident );
    }
}
