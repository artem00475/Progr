package town.person.positions;

public class Cashier extends Position{
    public Cashier(){name="кассир";}
    public void jobDescription(){
        System.out.println("Обязанность должности  "+name+" - сидеть в конторе и продавать акции");
    }
}
