import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean petla = true;
        while (petla == true) {
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Generowanie tablicy o podanym rozmiarze");
            System.out.println("2. Podanie liczb ręcznie po kolei do tablicy o podanym rozmiarze");
            System.out.println("0. Wyjscie z programu");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Podaj ilosc liczb zawartych w tablicy: ");
                    int SIZE = scanner.nextInt();
                    System.out.println("Podaj wartosc minimalna");
                    int min = scanner.nextInt();
                    System.out.println("Podaj wartosc maksymalna");
                    int max = scanner.nextInt();
                    double[] array = fillArray(SIZE,min,max);
                    System.out.println(" ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(sort(array)[i] + ", ");
                    }
                    break;
                case 2:
                    System.out.println("Podaj ilosc liczb zawartych w tablicy: ");
                    SIZE = scanner.nextInt();
                    double tablica[] = new double[SIZE];
                    for (int i =0; i<SIZE;i++) {
                        System.out.println("Podaj kolejna liczbe");
                        tablica[i]=scanner.nextDouble();

                    }
                    System.out.println(" ");
                    for (int i = 0; i < tablica.length; i++) {
                        System.out.print(sort(tablica)[i] + ", ");
                    }
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Wyjscie z programu");
                    petla = false;
                    break;
            }

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
    public static double[] fillArray(int SIZE,int min,int max) {
        double array[] = new double[SIZE];
        System.out.println("Generowanie tablicy...");
        for (int i = 0; i < SIZE; i++) {
            array[i] = randDouble(min, max);
            System.out.print(array[i] + ", ");
        }
        return array;
    }}

