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

        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр на замену уже участвует в спектакле. Актерский состав остался без изменений.");
            return;
        }

        int countActor = 0;
        int indexToReplace = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                countActor++;
                indexToReplace = i;
            }
        }

        if (countActor > 1) {
            System.out.println("В спектакле несколько актёров с фамилией " + surnameToReplace + ". Замена невозможна.");
        } else if (countActor == 0) {
            System.out.println("Актёр с такой фамилией не найден.");
        } else {
                listOfActors.set(indexToReplace, newActor);
                System.out.println("Заменили " + surnameToReplace + " на " + newActor.getSurname() + ".");
        }
    }
}
