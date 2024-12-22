
import java.util.ArrayList;
import java.util.Collections;

class StringArray {
    private ArrayList<String> strings;

    public StringArray() {
        strings = new ArrayList<>();
    }

    public void add(String str) {
        strings.add(str);
        Collections.sort(strings, (a, b) -> Integer.compare(a.length(), b.length()));
    }

    public String getLongest() {
        if (strings.isEmpty()) {
            return null; // или можно выбросить исключение
        }
        return strings.get(strings.size() - 1);
    }

    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0.0;
        }
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return (double) totalLength / strings.size();
    }
}

public class stroki {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();

        // Добавление строк
        stringArray.add("Hello");
        stringArray.add("Javavavavavvavavavavavavvavavavavav");
        stringArray.add("World");
        stringArray.add("Programming");
        stringArray.add("qwerwerwqrwerwe");

        // Получение максимального по длине элемента
        String longest = stringArray.getLongest();
        System.out.println("Самая длинная строка: " + longest);

        // Вычисление средней длины элементов
        double averageLength = stringArray.getAverageLength();
        System.out.println("Средняя длина строк: " + averageLength);
    }
}

