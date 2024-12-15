import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int arraySize = scanner.nextInt();

        // Создаем массив
        int[] array = new int[arraySize];

        // Заполняем массив элементами, введенными пользователем
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите элемент %d: ", i + 1);
            array[i] = scanner.nextInt();
        }

        // Сортируем массив по возрастанию
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if(array[i]<array[j]){
                    int num1 = array[i];
                    array[i]=array[j];
                    array[j] = num1;
                }
            }
        }
        System.out.println("max");
        System.out.println(array[arraySize-1]);

        System.out.println("min");
        System.out.println(array[0]);
    }
}