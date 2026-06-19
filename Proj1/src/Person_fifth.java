public class Person_fifth<T> { // Type erasure (стирание типов)
    private T id;
    private String name;

    T getId(){return id;}
    String getName(){return name;}

    Person_fifth(T id, String name){
        this.id = id;
        this.name = name;
    } // Тут для типа T нет ограничений значит он автоматически заменяется на Object
    // нет разницы int или String все равно тип будет Object
}
// есть такой код
// var tom = new Person<Integer>(456, "Tom");
// int tomId = tom.getId();
// System.out.println(tomId);
// Программа трактует этот код так
// var tom = new Person(456, "Tom");
// int tomId = (int) tom.getId();
// System.out.println(tomId);
