package homework;

public class Main{
    public static void main(String[] args){
        Entity user = new User("Bob");
        Persister save = new Persister();
        save.save(user);
        Reporter rep = new Reporter();
        rep.report(user);
    }
}