package town.vegetables;
import town.Objects;
import town.house.House;

public abstract class Vegetable {
    String name;
    public abstract void grow(House.Yard.Garden garden);//расти
    public abstract void jumpOut(Objects obj);//выскакивать
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Vegetable vegetables = (Vegetable) obj;
        return this.name == vegetables.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}
