package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        System.out.println(result);
        for (Integer num : source) {
            if (treshold > num) {
                logger.log("Число " + num + " не подходит!");
            } else {
                logger.log("Число " + num + " подходит!");
                result.add(num);
            }
        }
        return result;
    }
}
