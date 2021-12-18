package town.person.positions;

public class Treasurer extends Position {
    public Treasurer(){name="казначей";}
    public void jobDescription(){
        System.out.println("Обязанность должности "+name+" - хранить вырученные от продажи деньги");
    }

}
