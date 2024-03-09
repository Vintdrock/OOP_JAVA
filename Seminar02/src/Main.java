import impl.Dog;
import clients.Animal;
import clients.Owner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Vasya", 7, LocalDate.now(), new Owner());
        System.out.println(dog);
//        Animal dog = new Animal() {
//           @Override
//           public void eat() {
//
//           }
//       };
    }
}
