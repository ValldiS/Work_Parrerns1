package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");

        int size = sc.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");

        int max = sc.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i <= size; i++) {
            list.add(random.nextInt(max));
        }
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.print("Введите порог для фильтра ");
        int min = sc.nextInt();

        Filter filter = new Filter(min);
        list = filter.filterOut(list);

        logger.log("Прошло фильтр " + list.size() + " из " + size);

        logger.log("Выводим результат на экран");

        System.out.println("Отфильтрованный спирсок " + list);

        logger.log("Завершаем программу");


    }
}