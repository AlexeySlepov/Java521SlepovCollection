package Collection;

import java.util.ArrayList;
import java.util.List;

public class StackNotFix {

    private List<Integer> items = new ArrayList<>();

    private int index = 0;

    // помещение целого значения в стек
    public void push(Integer number) {
        items.add(number);
        index++;
    }

    // выталкивание целого значения из стека
    public void pop() {
        items.remove(items.get(index - 1));
        index--;
    }

    // подсчет количества целых в стеке
    public int getSize() {
        return index;
    }

    //проверка пустой ли стек
    public boolean isEmpty() {
        return index == 0;
    }

    // проверка полный ли стек
    public boolean isFul() {
        return index != 0;
    }

    // очистка стека
    public void delete() {
        items.clear();
        index = 0;
    }

    @Override
    public String toString() {
        return "StackNotFix = " + items;
    }
}
