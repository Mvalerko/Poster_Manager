package org.example;

public class PosterManager {
    private Poster[] items = new Poster[0];

    public static void main(String[] args) {
        //SQRService service = new SQRService();
        System.out.println();
    }

    /*public void save (Poster item) {
            Poster[] tmp = new Poster[items.length + 1];
            for (int i = 0; i < items.length; i++) {
                tmp[i] = items[i];
            }
            tmp[tmp.length - 1] = item;
            items = tmp;
    }

     */

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



    public void arrFilmName (Poster item) {
        Poster[] tmp = new Poster[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

        for (int i = 0; i < items.length; i++) {
            System.out.println("Значение ячейки String типа " + items[i]);
        }
    }
    public Poster[] getItems() {
        return items;
    }


}
