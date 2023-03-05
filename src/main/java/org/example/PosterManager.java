package org.example;

public class PosterManager {
    private Poster[] items = new Poster[0];

    int roll;
    //Я не нашел других способов куда то записать обратный массив. Локальная переменная не стала работать.
    Poster[] ret;

    public PosterManager() {

        this.roll = 10;

    }

    public PosterManager(int timesRoll) {

        this.roll = timesRoll;

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

        //System.out.println("Значение roll было равно " + roll);
        //System.out.println("Длинна массива была равна " + items.length);

        this.ret = new Poster[roll];

        for (int i = 0; i < roll; i++) {
            ret[i] = items[items.length - 1 - i];
        }

        //for (int i = 0; i < items.length; i++) {
        //   items[i] = ret[i];
        //}
        return this.ret;
    }
}
