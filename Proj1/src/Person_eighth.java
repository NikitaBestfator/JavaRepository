import java.util.Objects;

public class Person_eighth { // классы Records
    private final String name;
    private final int age;

    Person_eighth(String name, int age){
        this.name = name;
        this.age = age;
    }

    String name() {return name;}// эти одноименные методы даны для получения name и age
    int age() {return age;} // эти значения мы больше не можем нигде установить
    // кроме как в конструкторе

    public boolean equals(Object o){
        if(!(o instanceof Person_eighth)) return false;
        Person_eighth other = (Person_eighth) o;
        return other.name == name && other.age == age;
    }
    public int hashCode(){
        return Objects.hash(name, age);
    }
    public String toString() {
        return String.format
                ("Person[name=%s, age=%d", name, age);
    }
}
// Теперь определим класс record
record Person2(String name, int age){
    // десь будет конструктор, который называется канонический
    Person2(String name, int age){
        if (age<1 || age>110){
            age = 18;
        }
        this.name = name;
        this.age = age;
    }
    // еще один конструктор,
    // который длолжен обязательно выполнять канонический
    Person2(String firstName, String lastName, int age){
        this(firstName + " " + lastName, age);
    }// этот конструктор вызывает кйанонический,
    // передавая ему значения полей name и age
}
// Переопределение методов
record Person3(String name, int age){
    public String name() {return "Mister " + name;}

    public String toString(){
        return String.format("Person %s, Age: %d", name, age);
    }
}
// Ограничения классов records
record Person4(String name, int age){
    static int minAge;
    static{
        minAge = 18;
        System.out.println("Static initializer");
    }
} // классы records не могут быть абстрактными,
// нельзя наследовать их,
// нельзя им наследоваться от других классов,
// могут реализовывать интерфейсы,
// нельзя явным образом определять нестатические поля и
// инициализаторы,
// но можно определять
// статические переменные и инициализаторы,
// также как методы