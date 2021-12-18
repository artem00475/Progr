package town.vegetables;
import town.Objects;
import town.house.House;

public class Turnip extends Vegetable{
    public Turnip (String nam){
        name = nam;
    }
    @Override
    public void grow(House.Yard.Garden garden){
        System.out.println(name+" росла в "+garden.toString());
    }
    public void jumpOut(Objects obj){
        System.out.println(name+" выскочила "+obj.GetValue());
    }
}
