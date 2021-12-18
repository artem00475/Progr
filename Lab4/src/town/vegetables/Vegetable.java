package town.vegetables;
import town.Objects;
import town.house.House;

public abstract class Vegetable {
    String name;
    public abstract void grow(House.Yard.Garden garden);//расти
    public abstract void jumpOut(Objects obj);//выскакивать
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return name.equals(vegetable.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
    @Override
    public String toString() {
        return this.name;
    }
}
