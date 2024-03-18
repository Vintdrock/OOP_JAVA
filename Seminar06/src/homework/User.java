package homework;

public class User implements Entity{
    private final String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


//    public void save(){
//        Persister persister = new Persister(this);
//        persister.save();
//    }

//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
}
