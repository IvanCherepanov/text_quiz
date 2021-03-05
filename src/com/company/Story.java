package com.company;

public class Story {
    private Situation start_story;
    public Situation current_situation;

    Story() {
        /*карьерное положение (K), активы (A), репутация Р.
 готовность к сесии, свободное время, репутация*/
        start_story = new Situation(
                "Первое сентября",
                "Вы только начали учиться в вузе и тут же предстоит выбор! Как учиться:\n "
                        + "(1)Целыми днями ничего не делать.\n"
                        + "(2)Учить только вузовскую программу\n"
                        + "(3)Целыми днями учиться: вуз и самообразование \n",
                3, 0, 0, 0);
        start_story.direction[0] = new Situation(
                "Первая контро" +
                        "льная неделя",
                "Вы споткнулись на! "
                        + "первой контрольной неделе",
                0, -10, -5, -10);
        start_story.direction[1] = new Situation(
                "Вторяа контрольная",
                "Вы проавалились на этом этапе"
                        ,
                0, 50, -10, 20);
        start_story.direction[2] = new Situation(
                "Сессия",
                "Вы сдали, но какой ценой? "
                        , 0, 60,
                -40, 35);
        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
