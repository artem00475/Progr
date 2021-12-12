package town.human;

import town.Objects;
import town.Phrases;
import town.house.House;

public interface Actionable {
    public void see(Objects obj, Phrases scene);//увидеть
    public void remove(House.Yard.Garden garden);//убирать
    public void dig(Objects obj);//обкопать
    public void tie(Objects obj);//привязать
    public void grab(Objects obj);//хватать
    public void pull(Objects obj, int value);//дергать
    public void drag(Objects obj, Phrases scene);//тащить
    public void laugh();//смеялись
}
