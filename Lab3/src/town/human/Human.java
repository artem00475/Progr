package town.human;

public abstract class Human implements Actionable {
    String name;

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Human human = (Human) obj;
        return this.name == human.name;
    }
        public int hashCode() {
        return this.name.hashCode();
    }
    public String toString() {
        return this.name;
    }
}
