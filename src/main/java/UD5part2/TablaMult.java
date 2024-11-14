package UD5part2;

import java.text.MessageFormat;
import java.util.Scanner;

public class TablaMult {
    public static void main(String[] args) {
        System.out.println("-----------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i * j) % 2 != 0) {
                    System.out.println(MessageFormat.format("|\t{0} * {1} = {2}\t|", i, j, (i * j)));
                }
            }
            System.out.println("-----------------");
        }
    }
}
