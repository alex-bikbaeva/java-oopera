import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть в спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в спектакль.");
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Актёр на замену уже участвует в спектакле. Актерский состав остался без изменений.");
                return;
            } else {
                if (actor.getSurname().equals(surnameToReplace)) {
                    listOfActors.remove(actor);
                    listOfActors.add(newActor);
                    System.out.println("Заменили " + surnameToReplace + " на " + newActor.getSurname() + ".");
                    return;
                }
            }
        }
        System.out.println("Актёр с такой фамилией не найден.");
    }
}
