import org.example.Poster;
import org.example.PosterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    Poster item1 = new Poster("Терминатор");
    Poster item2 = new Poster("Джентельмены");
    Poster item3 = new Poster("Человек невидимка");


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
    public void testFilmName () {
        PosterManager repo = new PosterManager();
        repo.arrFilmName(item1);
        repo.arrFilmName(item2);
        repo.arrFilmName(item3);
        //repo.removeById(item2.getId());

        Poster[] arrTest = repo.getItems();
        for (int i = 0; i < arrTest.length; i++) {
            System.out.println(arrTest[i]);
        }
    }
}