package ch03;

public class GugudanLine {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            System.out.println("\n" + i + "단:");

            for (int j = 1; j <= 9; j++) {
                System.out.println(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

    }
}
