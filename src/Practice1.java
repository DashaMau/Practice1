import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void practice1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }


        int sumDoWhile = 0;
        int indexDoWhile = 0;
        do {
            sumDoWhile += array[indexDoWhile];
            indexDoWhile++;
        } while (indexDoWhile < size);


        int sumWhile = 0;
        int indexWhile = 0;
        while (indexWhile < size) {
            sumWhile += array[indexWhile];
            indexWhile++;
        }


        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Сумма элементов массива (do while): " + sumDoWhile);
        System.out.println("Сумма элементов массива (while): " + sumWhile);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }

}

