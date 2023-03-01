package org.example;

public class PosterManager {
    private Poster[] items = new Poster[0];
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
        return items;
    }

}
