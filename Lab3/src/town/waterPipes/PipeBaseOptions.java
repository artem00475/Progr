package town.waterPipes;
import town.Objects;
import town.house.House;

public interface PipeBaseOptions {
    public void connect(House house);//соединять
    public void flow(Objects obj);//протекать
}


