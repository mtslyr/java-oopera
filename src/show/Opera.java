package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.Set;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title,
                 Integer durationInMinutes,
                 Director director,
                 Set<Actor> listOfActors,
                 Person musicAuthor,
                 String librettoText,
                 int choirSize) {
        super(title, durationInMinutes, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
