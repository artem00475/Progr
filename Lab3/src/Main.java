import town.*;
import town.house.House;
import town.human.*;
import town.vegetables.*;
import town.waterPipes.*;
public class Main {
    public static void main(String[] args) {
	Neznaika neznaika = new Neznaika("Незнайка");
    Malish malish = new Malish("Малышки");
    Carrot carrot = new Carrot("Морковка");
    Radish radish = new Radish("Редис");
    Beet beet = new Beet("Свекла");
    ReedPipe reedPipe = new ReedPipe("Тростниковая труба");
    Turnip turnip = new Turnip("Репа");
    Vodoprovod vodoprovod = new Vodoprovod("Водопровод");
    House house = new House("Дом");
    House.Yard yard = new House.Yard("Двор");
    Fountain fountain = new Fountain("Фонтан");
    House.Yard.Garden garden = new House.Yard.Garden("Огород");
    vodoprovod.is(Phrases.TOWN);
    vodoprovod.connect(reedPipe);
    reedPipe.flow(Objects.WATER);
    reedPipe.connect(house);
    yard.is(house);
    garden.is(yard);
    fountain.is(house);
    reedPipe.connect(fountain);
    fountain.irrigate(garden);
    carrot.grow(garden);
    radish.grow(garden);
    beet.grow(garden);
    turnip.grow(garden);
    neznaika.see(Objects.MALISHI,Phrases.DVOR);
    malish.remove(garden);
    malish.dig(Objects.CARROT);
    malish.tie(Objects.ROPE);
    malish.grab(Objects.ROPE);
    malish.pull(Objects.CARROT, 1);
    carrot.jumpOut(Objects.ROOT);
    malish.laugh();
    malish.drag(Objects.CARROT,Phrases.HOME);
    }
}
