package zh.codegym.task.task17.task1707;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //在此编写你的代码
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
