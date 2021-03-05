package com.company;

import java.util.Scanner;

public class Main {
    private int age;
    public static Student manager;
    public static Story story;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input your age");
        //int age = in.nextInt();
        System.out.println("Вы поступили в ВУЗ. \n "
                + "Осталось представиться (Введите ваше имя):");
        manager = new Student(in.next());
        story = new Story();
        try{
        while (true) {
            manager.A += story.current_situation.dA;
            manager.K += story.current_situation.dK;
            manager.R += story.current_situation.dR;
            System.out.println("=====\nГотовность к сессии:" + manager.K + "\tСвободное время:"
                    + manager.A + "\tРепутация:" + manager.R + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }}catch (Exception e){

        }
        finally{
            System.out.println("That's All");
        }

    }
}
