import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb zawartych w tablicy: ");
        int SIZE = scanner.nextInt();
        double[] array = fillArray(SIZE);
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(sort(array)[i] + ", ");
        }
    }
    public static double[] sort(double tab[]) {
        int arraysize = tab.length;
        for (int i = 0; i < arraysize - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arraysize; j++) {
                if (tab[j] < tab[min]) {
                    min = j;
                }
            }
            double x = tab[min];
            tab[min] = tab[i];
            tab[i] = x;
        }
        return tab;
    }




    public static double randDouble(double min, double max) {


        Random rand = new Random();

        double randomNum = rand.nextDouble((max - min) + 1) + min;
        return (double) Math.round(randomNum * 100) / 100;


    }
    public static double[] fillArray(int SIZE) {
        double array[] = new double[SIZE];
        System.out.println("Generowanie tablicy...");
        for (int i = 0; i < SIZE; i++) {
            array[i] = randDouble(30, 70);
            System.out.print(array[i] + ", ");
        }
        return array;
    }}

