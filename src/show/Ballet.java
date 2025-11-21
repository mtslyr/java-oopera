package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.Set;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title,
                  Integer durationInMinutes,
                  Director director,
                  Set<Actor> listOfActors,
                  Person musicAuthor,
                  String librettoText,
                  Person choreographer) {
        super(title, durationInMinutes, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
