package com.company;

import java.util.ArrayList;
import java.util.LinkedList;


public class Collections {
    public long startTime;
    public long finishTime;
    public long resultTime;
    /** Переменная quantity показывает, сколько раз мы будем вызывать основные методы коллекций. */
    public int quantity = 1000;

    /**
     * Функция добавления элемента в каждый из контейнеров.
     * С помощью System.nanoTime() засекаем выполнение добавления quantity элементов в каждый из контейнеров.
     * @param array контейнер типа ArrayList<Integer>
     * @param list контейнер типа LinkedList<Integer>
     */
    public void add(ArrayList<Integer> array, LinkedList<Integer> list)
    {
        //System.out.println("Добавление в: ");
        startTime = System.nanoTime();
        for (int i = 0; i<quantity; i++)
        {
            array.add(i);
        }
        finishTime = System.nanoTime();
        resultTime = (finishTime - startTime);
        System.out.print("Добавление    "+resultTime+"\t");

        startTime = System.nanoTime();
        for (int i = 0; i<quantity; i++)
        {
            list.add(i);
        }
        finishTime = System.nanoTime();
        resultTime = (finishTime - startTime);
        System.out.println( resultTime);
    }

    /**
     * Функция извлечения элементов.
     * С помощью System.nanoTime() засекаем выполнение извлечения quantity элементов из каждого из контейнеров.
     * @param array контейнер типа ArrayList<Integer>
     * @param list контейнер типа LinkedList<Integer>
     */
    public void get(ArrayList<Integer> array, LinkedList<Integer> list)
    {
        //System.out.println("Извлечение из: ");
        startTime = System.nanoTime();
        for (int i = 0; i<quantity; i++)
        {
            array.get(i);
        }
        finishTime = System.nanoTime();
        resultTime = (finishTime - startTime);
        System.out.print("Извлечение    "+ resultTime +"\t");

        startTime = System.nanoTime();
        for (int i = 0; i<quantity; i++)
        {
            list.get(i);
        }
        finishTime = System.nanoTime();
        resultTime = (finishTime - startTime);
        System.out.println(resultTime);
    }


    /**
     * Функция удаления элементов.
     * С помощью System.nanoTime() засекаем выполнение удаления quantity элементов из каждого из контейнеров.
     * @param array контейнер типа ArrayList<Integer>
     * @param list контейнер типа LinkedList<Integer>
     */
    public void delete(ArrayList<Integer> array, LinkedList<Integer> list)
    {
        //System.out.println("Удаление из: ");
        startTime = System.nanoTime();
        for (int i = 0; i<quantity; i++)
        {
            array.remove(0);
        }
        finishTime = System.nanoTime();
        resultTime = (finishTime - startTime);
        System.out.print("Удаление      "+ resultTime+"\t");

        startTime = System.nanoTime();
        for (int i = 0; i<quantity; i++)
        {
            list.remove(0);
        }
        finishTime = System.nanoTime();
        resultTime = (finishTime - startTime);
        System.out.println(resultTime);
    }

    /**
     * Функция выполнения всех методов и, как следствие, вывода на экран.
     * @param array контейнер типа ArrayList<Integer>
     * @param list контейнер типа LinkedList<Integer>
     */
    public void displayInfo(ArrayList<Integer> array, LinkedList<Integer> list)
    {
        System.out.println("            ArrayList   LinkedList");
        add(array, list);
        get(array, list);
        delete(array, list);
    }
}