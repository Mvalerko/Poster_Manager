package org.example;

public class PosterManager {
    private Poster[] items = new Poster[0];

    int roll;
    Poster[] ret;

    public PosterManager() {

        this.roll = 10;

    }

    public PosterManager(int timesRoll) {

        this.roll = timesRoll;

    }

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

        if (items.length < roll) {

            for (int i = 0; i < items.length; i++) {
                tmp[i] = items[i];
            }
            tmp[tmp.length - 1] = item;
            items = tmp;

        }
    }

    public Poster[] findAll() {

        //System.out.println("Значение roll было равно " + roll);
        //System.out.println("Длинна массива была равна " + items.length);
        return items;
    }

    public Poster[] findLast() {

        //System.out.println("Значение roll было равно " + roll);
        //System.out.println("Длинна массива была равна " + items.length);

        this.ret = new Poster[items.length];


        for (int i = 0; i < items.length; i++) {
            ret[items.length - 1 - i] = items[i];
        }

        //for (int i = 0; i < items.length; i++) {
        //   items[i] = ret[i];
        //}

        return this.ret;
    }

}
