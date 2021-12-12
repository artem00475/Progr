package town.waterPipes;

import town.Objects;
import town.house.House;

public class ReedPipe implements PipeBaseOptions {
    String name;

    public ReedPipe(String nam) {
        name = nam;
    }

    public void connect(House house) {
        System.out.println(name + " подключена к " + house.toString());
        house.water(Objects.WATER);
    }

    public void flow(Objects obj) {
        System.out.println("По " + name + " течет " + obj.GetValue());
    }

    public void connect(Fountain fountain) {
        System.out.println(name + " подключена к " + fountain.fountainName);
        fountain.water(Objects.WATER);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        ReedPipe pipe = (ReedPipe) obj;
        return this.name == pipe.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}
