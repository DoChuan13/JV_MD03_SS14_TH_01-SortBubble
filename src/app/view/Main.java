package app.view;

import static app.model.BubbleSort.bubbleSort;
import static app.model.BubbleSort.list;

public class Main {
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}
