package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println( second >= first ?
                             third >= second ? third : second :
                        third >= first ? third : first);
    }
}
