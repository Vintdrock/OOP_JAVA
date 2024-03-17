package notebook.util;

public class UserValidator {
    public String checkLine (String str){
        if (!str.isEmpty()) {
            return str;
        } else {
            System.out.println("Значение не может быть пустым\n Введите корректные данные ");
            return checkLine(str);

        }
    }
}
