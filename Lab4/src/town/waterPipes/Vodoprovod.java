package town.waterPipes;

import town.Phrases;

import java.util.Objects;

public class Vodoprovod {
    String name;
    public Vodoprovod(String nam){
        name = nam;
    }
    public void connect(ReedPipe reedPipe){System.out.println(name+" состоял из "+reedPipe.toString());}
    public void is(Phrases scene){System.out.println(scene.GetValue()+" был  "+name);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vodoprovod that = (Vodoprovod) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return this.name;
    }
}
