package org.example;

public class PosterManager {
    private Poster[] items = new Poster[0];

    private int roll;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int newNumberOfRolls) {
        if (newNumberOfRolls < 0) {
            return;
        }
        if (newNumberOfRolls >= 0) {
            roll = newNumberOfRolls;
        }
    }

    public PosterManager() {

        setRoll(10);

    }

    public PosterManager(int timesRoll) {

        setRoll(timesRoll);

    }
//Это не мусор. Я оставляю пример рабочего метода исключения ячейки из массива на будущее
/*
    public void removeByName(String filmNameOption) {
        Poster[] tmp = new Poster[items.length - 1];
        int copyToIndex = 0;
        for (Poster item : items) {
            if (item.getFilmName() != filmNameOption) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

 */

    public void add(Poster item) {

        Poster[] tmp = new Poster[items.length + 1];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Poster[] findAll() {

        //System.out.println("Значение roll было равно " + roll);
        //System.out.println("Длинна массива была равна " + items.length);
        return items;
    }

    public Poster[] findLast() {
        Poster[] ret;

        if (roll > items.length) {
            ret = new Poster[items.length];
            for (int i = 0; i < items.length; i++) {
                ret[i] = items[items.length - 1 - i];
            }

        } else {
            ret = new Poster[roll];
            for (int i = 0; i < roll; i++) {
                ret[i] = items[items.length - 1 - i];
            }
        }

        //for (int i = 0; i < items.length; i++) {
        //   items[i] = ret[i];
        //}
        //System.out.println("Значение roll было равно " + roll);
        //System.out.println("Длинна массива была равна " + items.length);
        return ret;
    }
}
