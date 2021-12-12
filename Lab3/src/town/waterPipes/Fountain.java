package town.waterPipes;

import town.Objects;
import town.house.House;

public class Fountain {
    String fountainName;
    private int i = 0;

    public Fountain(String nam) {
        fountainName = nam;
    }

    public void is(House house) {
        System.out.println(fountainName + " был перед " + house.toString());
    }

    public void water(Objects obj) {
        System.out.println("К " + fountainName + " подведена " + obj.GetValue());
        i = 1;
    }

    public void irrigate(House.Yard.Garden garden) {
        if (i == 1) {
            System.out.println(fountainName + " орошает " + garden.toString());
        } else {
            System.out.println("К " + fountainName + " не подведена " + Objects.WATER);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Fountain fountain = (Fountain) obj;
        return this.fountainName == fountain.fountainName;
    }

    public int hashCode() {
        return this.fountainName.hashCode();
    }

    public String toString() {
        return this.fountainName;
    }
}
