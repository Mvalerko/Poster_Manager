import org.example.Poster;
import org.example.PosterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    Poster item1 = new Poster("Терминатор");
    Poster item2 = new Poster("Джентельмены");
    Poster item3 = new Poster("Человек невидимка");
    Poster item4 = new Poster("Инсомния");
    Poster item5 = new Poster("Вперед");
    Poster item6 = new Poster("Тролли");
    Poster item7 = new Poster("Старикам тут не место");
    Poster item8 = new Poster("Аватар");
    Poster item9 = new Poster("Тайна Коко");
    Poster item10 = new Poster("Интерстеллар");
    Poster item11 = new Poster("Бойцовский клуб");
    Poster item12 = new Poster("Зеленая книга");


    /*
    @Test
    public void test() {
        PosterManager repo = new PosterManager();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        //repo.removeById(item2.getId());

        Poster[] expected = {item1, item2, item3};
        Poster[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
        //System.out.println(expected);
        //System.out.println(actual);

    }

     */


    @Test
    public void findAllDefault() {

        PosterManager manager = new PosterManager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOption() {

        PosterManager manager = new PosterManager(7);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {item12, item11, item10, item9, item8, item7, item6};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefault() {

        PosterManager manager = new PosterManager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastOptionAll() {

        PosterManager manager = new PosterManager(12);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastOptionOverItemL() {

        PosterManager manager = new PosterManager(13);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastOptionPreAll() {

        PosterManager manager = new PosterManager(11);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOptionOne() {

        PosterManager manager = new PosterManager(1);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {item12};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastOptionZero() {

        PosterManager manager = new PosterManager(0);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void findLastOptionNegative() {

        PosterManager manager = new PosterManager(-1);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);


        Poster[] expected = {};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }




}