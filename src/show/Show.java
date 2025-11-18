package show;

import person.Actor;
import person.Director;

import java.util.Set;
import java.util.Arrays;

public class Show {
    private String title;
    private Integer durationInMinutes;
    private Director director;
    private Set<Actor> listOfActors;

    public Show(String title, Integer durationInMinutes, Director director, Set<Actor> listOfActors) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println(this.director);
    }

    public void printActors() {
        System.out.printf("В представлении %s учавствуют: ", this.title);
        System.out.println(Arrays.deepToString(listOfActors.toArray()));
    }

    private void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.printf("Актер %s уже добавлен!", actor);
            return;
        }

        listOfActors.add(actor);
    }

    public void addActors(Actor... actors) {
        for (Actor actor : actors) {
            addActor(actor);
        }
    }

    public void replaceActor(Actor newActor, String actorToReplaceSurname) {
        boolean isInActorsList = listOfActors.stream()
                .anyMatch(actor -> {
                    return actor.getSurname().equals(actorToReplaceSurname);
                });

        if (!isInActorsList) {
            System.out.printf("Актер %s не учавствует в представлении %s\n", actorToReplaceSurname, this.title);
        } else {
            listOfActors.removeIf(actor -> actor.getSurname().equals(actorToReplaceSurname));
            listOfActors.add(newActor);
        }
    }
}
