package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (second >= first){
            System.out.println(
                    third >= second ? third : second);
        } else {
            System.out.println(
                    third >= first ? third : first);
        }
    }
}
