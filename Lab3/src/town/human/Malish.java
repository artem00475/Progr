package town.human;

import town.Objects;
import town.Phrases;
import town.house.House;

public class Malish extends Human{
    public Malish (String nam){
        name = nam;
    }
    @Override
    public void see(Objects obj, Phrases scene) {
        System.out.println(name + " увидели " + obj.GetValue()+" "+scene.GetValue());
    }
    public void remove(House.Yard.Garden garden){
        System.out.println(name+" убирали "+garden.toString());
    }
    public void dig(Objects obj){
        System.out.println(name+" обкопали "+obj.GetValue());
    }
    public void tie(Objects obj){
        System.out.println(name+" привязали "+obj.GetValue());
    }
    public void grab(Objects obj){
        System.out.println(name+" схватили "+obj.GetValue());
    }
    public void pull(Objects obj,int value){
        if (value==1){
        System.out.println(name+" дергали изо всех сил "+obj.GetValue());
        }else {
            System.out.println(name+" дергали "+obj.GetValue());
        }
    }
    public void drag(Objects obj,Phrases scene){
        System.out.println(name+" тащили "+scene.GetValue()+" "+obj.GetValue());
    }
    public void laugh(){System.out.println(name+" смеялись");}
}
