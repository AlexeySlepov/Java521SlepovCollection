package Collection;

import java.util.Arrays;

public class StackFix {

    private Integer[] numbers;

    private int count;

    private int index = 0;

    public StackFix(int count) {
        this.count = count;
        this.numbers = new Integer[count];
    }

    // помещение целого значения в стек
    public void put(Integer number) {
        if (index < count) {
            numbers[index] = number;
            index++;
        }
    }

    // выталкивание целого значения из стека
    public void push(Integer number) {
        for (int i = count - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = number;
    }

    // подсчет количества целых в стеке
    public int getSize() {
        return index;
    }

    //проверка пустой ли стек
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    // проверка полный ли стек
    public boolean isFul() {
        if (index == count) {
            return true;
        }
        return false;
    }

    // очистка стека
    public void delete() {
        for (int i = 0; i < index; i++) {
            numbers[i] = null;
        }
        index = 0;
    }

    // К строке
    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
