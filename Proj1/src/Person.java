class Person<T>{// обобщенный класс <T> - универсальный параметрб вместо буквы T может быть что угодно
    private T id;
    String name;

    T getId(){
        return id;
    }
    String getName(){
        return name;
    }

    Person(T id, String name){
        this.id = id;
        this.name = name;
    }
//    int tomId = (int)tom.getId();
//    String bobId = (String) bob.getId();
}