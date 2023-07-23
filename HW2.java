package JavaCore.HW2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(
                "Доделать сортировку подсчетом с урока (если нет, реализовать) классическим способом через промежуточный массив");
        int[] my_arr = { 1, 2, 3, 4, 3, 3, 2, 1, 4, 3 };
        System.out.println("Начальный массив" + Arrays.toString(my_arr));
        System.out.print("Отсоритованный массив по методом голубиной сортировки: ");
        int[] array = PigeonholeSort.pigeonhole_sorting(my_arr, my_arr.length);
        for (int j : array)
            System.out.print(j + " ");

        System.out.println(
                "\nНаписать метод Шифр Цезаря, с булевым параметром зашифрования и расшифрования и числовым ключом;");
                System.out.println("Начальная фраза: 'CaesarCipher'");
        String cipheredMessage = CaesarCipher.cipher("CaesarCipher", 3, true);
        System.out.println("Зашифрованная фраза: ");
        System.out.println(cipheredMessage);

        System.out.println(
                "\nНаписать метод, принимающий на вход массив чисел и параметр n. Метод должен осуществить циклический \n(последний элемент при сдвиге становится первым) сдвиг всех элементов массива на n позиций;");
        int[] newArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Начальный массив" + Arrays.toString(newArray));
        Scanner in = new Scanner(System.in);
        while (true) {
            try {

                System.out.print("Введите размерность смещения (целое число): ");
                int shift = in.nextInt();

                int[] arrayResult = ArrayShift.shift(newArray, shift);
                System.out.println(Arrays.toString(arrayResult));
                break;
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Введите размерность смещения (целое число), повторите ввод: ");
            }
        }
    }
}
