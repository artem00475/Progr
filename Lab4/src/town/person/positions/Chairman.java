package town.person.positions;

public class Chairman extends Position{
    public Chairman(){name="председатель";}
    public void jobDescription(){
        System.out.println("Обязанность должности "+name+" - назначать заседания акционерного общества для решения неотложных вопросов");
    }
}
