package town.vegetables;
import town.Objects;
import town.house.House;

public class Radish extends Vegetable {
    public Radish (String nam){
        name = nam;
    }
    @Override
    public void grow(House.Yard.Garden garden){
        System.out.println(name+" рос в "+garden.toString());
    }
    public void jumpOut(Objects obj){
        System.out.println(name+" выскочил "+obj.GetValue());
    }
}
