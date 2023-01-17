package ru.sbrf.gitcommit.week1;
import java.util.Scanner;

public class amountNumbers {
    public static void main(String[] args) {
        int i, j, k;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите 1-ое число: ");
        i = input.nextInt();
        System.out.print("Введите 2-ое число: ");
        j = input.nextInt();
        k = i + j;
        System.out.println ("Сумма чисел " + i + " и " + j + " равна " + k);
    }
}
