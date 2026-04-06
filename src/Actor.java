import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return getHeight() == actor.getHeight() &&
                getName().equals(actor.getName()) &&
                getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }
}