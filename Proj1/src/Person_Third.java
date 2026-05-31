public class Person_Third<T, K> {// несколько универсальных параметров
    private T id;
    private K password;
    private String name;

    T getId(){
        return id;
    }
    K getPassword(){
        return password;
    }
    String getName(){
        return name;
    }

    Person_Third(T id, String name, K pass){
        this.id = id;
        this.name = name;
        this.password = pass;
    }
}
