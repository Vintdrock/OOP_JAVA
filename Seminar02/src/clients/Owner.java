package clients;
import java.time.LocalDate;

public class Owner {
    public String name;

    public Owner(String name) {
        this.name = name;
    }
    public Owner() {
        this("Тест");
    }

    public String toString(){
        return name;
    }
}
