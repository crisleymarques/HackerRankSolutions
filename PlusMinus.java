import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        ArrayList<Integer> teste = new ArrayList<>();
        teste.add(-1);
        teste.add(-1);
        teste.add(0);
        teste.add(1);
        teste.add(1);
        plusMinus(teste);
    }

    public static void plusMinus(List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        for (Integer i : arr) {
            if (i == 0) {
                zeros++;
            } else if (i > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.printf("%.6f%n", positive / arr.size());
        System.out.printf("%.6f%n", negative / arr.size());
        System.out.printf("%.6f%n", zeros / arr.size());
    }
}