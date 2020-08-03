package zh.codegym.task.task03.task0307;

/* 
你好，《星际争霸》！
*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码

        String hero1 = "hero1";
        String hero2 = "hero2";
        String hero3 = "hero3";
        String hero4 = "hero4";
        String hero5 = "hero5";
        String hero6 = "hero6";
        String hero7 = "hero7";
        String hero8 = "hero8";
        String hero9 = "hero9";
        String hero10 = "hero10";
        String hero11 = "hero11";
        String hero12 = "hero12";

        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();

        zerg1.name = hero1;
        zerg2.name = hero2;
        zerg3.name = hero3;
        zerg4.name = hero4;
        zerg5.name = hero5;

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();

        protoss1.name = hero6;
        protoss2.name = hero7;
        protoss3.name = hero8;

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();

        terran1.name = hero9;
        terran2.name = hero10;
        terran3.name = hero11;
        terran4.name = hero12;
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
