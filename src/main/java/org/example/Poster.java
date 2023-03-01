package org.example;

public class Poster {
    private String filmName;

    public Poster (String filmNameOption) {
        this.filmName = filmNameOption;
    }

    public String getFilmName() {
        return filmName;
    }

    public String setFilmName(String filmNameOption) {
        this.filmName = filmNameOption;
        return this.filmName;
    }
}


