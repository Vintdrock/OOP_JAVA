package homework;

public class Persister{//сохраняльщик
    //private final User user;

//    public Persister(User user){
//        this.user = user;
//    }

    public void save(Entity entity){
        System.out.println("Save entity: " + entity.getName());
    }


}
