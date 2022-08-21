package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {



    // bubble sort java arraylist


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(8);

        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {

                if (list.get(i) > list.get(i + 1)) {
                    Collections.swap(list, i, i + 1);
                    System.out.println(list);
                }
                if (list.get(i) > list.get(i + 1)) {
                    break;
                }

            }
        }

        System.out.println();
        System.out.println(list);

    }


}
