import person.Actor;
import person.Director;
import person.Gender;
import person.Person;
import show.Ballet;
import show.MusicalShow;
import show.Opera;
import show.Show;

import java.util.HashSet;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Иван", "Охлобыстин", Gender.MALE, 182);
        Actor actor2 = new Actor("Дмитрий", "Нагиев", Gender.MALE, 181);
        Actor actor3 = new Actor("Настасья", "Самбурская", Gender.FEMALE, 173);

        Director director1 = new Director("Федор", "Бандарчук", Gender.MALE, 180);
        Director director2 = new Director("Никита", "Михалков", Gender.MALE, 179);

        Person choreographer = new Person("Супер", "Танцор", Gender.FEMALE);
        Person musician = new Person("Супер", "Певец", Gender.MALE);

        Show commonShow = new Show("Спектакль", 60, director1, new HashSet<>());
        MusicalShow opera = new Opera("Опера", 60, director2, new HashSet<>(),
                musician, "librettoOpera", 2);
        MusicalShow ballet = new Ballet("Спектакль", 60, director1, new HashSet<>(),
                musician, "librettoBallet", choreographer);

        commonShow.addActors(actor1, actor2);
        opera.addActors(actor3);
        ballet.addActors(actor1, actor2, actor3);

        commonShow.printActors();
        opera.printActors();
        ballet.printActors();

        commonShow.replaceActor(actor3, actor1.getSurname());
        commonShow.printActors();

        opera.replaceActor(actor2, actor1.getSurname());

        opera.printLibretto();
        ballet.printLibretto();
    }
}