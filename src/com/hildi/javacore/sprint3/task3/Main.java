package com.hildi.javacore.sprint3.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(TaskPriority.HIGH, "Оплатить интернет."));
        tasks.add(new Task(TaskPriority.LOW, "Сходить в парикмахерскую."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Выбрать подарок подруге на ДР."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Купить билеты в театр."));
        tasks.add(new Task(TaskPriority.HIGH, "Посетить вебинар по английскому языку."));
        tasks.add(new Task(TaskPriority.LOW, "Купить пылесос."));

        print("Задачи с наивысшим приоритетом на сегодня:");
        for (Task task : tasks) {
            if (task.getPriority() == TaskPriority.HIGH) {
                print(task.getDescription());
            }
        }
    }

    private static void print(String s) {
        System.out.println(s);
    }

}
