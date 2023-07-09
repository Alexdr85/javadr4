package javadr4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.ListIterator;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.
@@ -11,22 +10,24 @@ public class zd1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = createLL();
        System.out.println(ll);
        LinkedList<Integer> ll_rev = revertLL(ll);
        LinkedList<Integer> ll_rev = listRevers(ll);
        System.out.println(ll_rev);
    }

    public static LinkedList<Integer> createLL() {
        LinkedList<Integer> ll = new LinkedList<>();
        int size = new Random().nextInt(30) + 10;
        for (int i = 0; i < size; i++) {
            int el = new Random().nextInt((50) + 1);
            ll.add(el);
        for (int i = 0; i < 10; i++) {
            ll.add(i + 1);
        }
        return ll;
    }

    public static LinkedList<Integer> revertLL(LinkedList<Integer> lst) {
        Collections.reverse(lst);
        return lst;
    static LinkedList<Integer> listRevers(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            newList.add(iterator.previous());
        }
        return newList;
    }
}