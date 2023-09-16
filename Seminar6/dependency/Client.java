package Seminar6.dependency;

// Класс использующий экземпляр другого класса через интерфейс

public class Client {
    Dao dataAccess = new DataAccess();
    public void doJob() {
        dataAccess.execute();
    }
}
