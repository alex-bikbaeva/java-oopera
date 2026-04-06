import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Гоша", "Куценко", Gender.MALE, 185);
        Actor actress1 = new Actor("Светлана", "Ходченкова", Gender.FEMALE, 180);
        Actor actress2 = new Actor("Мария", "Аронова", Gender.FEMALE, 165);

        Director director1 = new Director("Алексей", "Смирнов", Gender.MALE, 12);
        Director director2 = new Director("Елена", "Васильева", Gender.FEMALE, 8);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Юрий Григорович";

        ArrayList<Actor> dramaActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();


        Show drama = new Show("Гамлет", 140, director1, dramaActors);
        Opera opera = new Opera("Евгений Онегин", 180, director2, operaActors, musicAuthor, "Либретто оперы «Евгений Онегин».", 40);
        Ballet ballet = new Ballet("Щелкунчик", 120, director1, balletActors, musicAuthor,"Либретто балета «Щелкунчик».", choreographer);

        drama.addActor(actor1);
        drama.addActor(actress1);
        System.out.println();

        System.out.println("Актёры спектакля «Гамлет»:");
        drama.printActors();
        System.out.println();

        opera.addActor(actor1);
        opera.addActor(actress2);
        System.out.println();

        System.out.println("Актёры оперы «Евгений Онегин»:");
        opera.printActors();
        System.out.println();

        ballet.addActor(actress1);
        ballet.addActor(actress2);
        System.out.println();

        System.out.println("Актёры балета «Щелкунчик»:");
        ballet.printActors();
        System.out.println();

        System.out.println("Заменяем актёра Аронову в опере на Светлану Ходченкову:");
        opera.replaceActor(actress1, "Аронова");
        System.out.println("Новый актёрский состав:");
        opera.printActors();
        System.out.println();

        System.out.println("Пробуем заменить несуществующего актёра в драме");
        drama.replaceActor(actress2, "Кузнецов");
        System.out.println();

        System.out.println("Либретто оперы:");
        System.out.println(opera.getLibrettoText());
        System.out.println();

        System.out.println("Либретто балета:");
        System.out.println(ballet.getLibrettoText());
    }
}
