package com.company;

import java.util.Random;

public class Main {

    static Tree<Integer> tree = new Tree<>((int) (Math.random() * 1000), null);
    public static void main(String[] args) {
        testAdd(1_000_000);
        testSum();
        testSearch(1_000_000);
        testRemuve(1_000_000);
    }

        public static void testAdd(int number){
            long start  = System.nanoTime();
            for (int i = 0; i < number; i++) {
                tree.add((int) (Math.random()*1000));
            }
            long et = (System.nanoTime() - start)/1000;
            System.out.printf("Добавление %d элементов в дерево заняло: %d микросекунд\n",number,et);
        }
        public static void testSum(){
            long start  = System.nanoTime();
            int sum = tree.sum();
            long et = (System.nanoTime() - start)/1000;
            System.out.printf("Cума элементов в дереве: %d заняло: %d микросекунд\n",sum,et);
        }

        public static void testSearch(int number){

            long start  = System.nanoTime();
            for (int i = 0; i < number; i++) {
               tree.search((int) (Math.random()*1000));
            }
            long et = (System.nanoTime() - start)/1000;
            System.out.printf("Час на пошул елеементів: %d микросекунд\n",et);
        }
        public static void testRemuve(int number){
            long start  = System.nanoTime();
            for (int i = 0; i < number; i++) {
                tree.remove((int) (Math.random()*100));
            }
            long et = (System.nanoTime() - start)/1000;
            System.out.printf("Час на видалення елементів: %d микросекунд\n",et);
        }

}
