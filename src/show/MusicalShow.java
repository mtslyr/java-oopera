package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.Set;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;
    public MusicalShow(String title,
                       Integer durationInMinutes,
                       Director director,
                       Set<Actor> listOfActors,
                       Person musicAuthor,
                       String librettoText) {
        super(title, durationInMinutes, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(this.librettoText);
    }
}
