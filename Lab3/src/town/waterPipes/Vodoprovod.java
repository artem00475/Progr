package town.waterPipes;

import town.Phrases;

public class Vodoprovod {
    String name;
    public Vodoprovod(String nam){
        name = nam;
    }
    public void connect(ReedPipe reedPipe){System.out.println(name+" состоял из "+reedPipe.toString());}
    public void is(Phrases scene){System.out.println(scene.GetValue()+" был  "+name);}
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Vodoprovod vodoprovod = (Vodoprovod) obj;
        return this.name == vodoprovod.name;
    }
    public int hashCode() {
        return this.name.hashCode();
    }
    public String toString() {
        return this.name;
    }
}
