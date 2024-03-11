package interFace;
@FunctionalInterface //Интерфейс называется функциональным, если в нем только 1 нереализованный метод
public interface Swimable {
    //public static final double pi = 3.14; //в интерфейсах можно создавать поля но её нильзя нигде поменять
    public double swim(); // в интерфейсе все методы public и его не пишут
    default void sound(){ //В интерфейсе можно написать реализованный метод (default)
        System.out.println("Я дефолтный метод");
    }
}

