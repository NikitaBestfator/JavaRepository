public class Person_seventh implements Cloneable{ // Ссылочные типы и копирование объектов
    String name; // мы пытаемся исправить ошибку когда на один и тот же класс два разных имени

    Person_seventh(String name){this.name = name;}

    void print(){
        System.out.println("Person " + name);
    }
    public Person clone() throws CloneNotSupportedException{
        return (Person) super.clone();
    }
}// метод clone()
class Company implements Cloneable{ // глубокое копирование
    String name;

    Company(String name){this.name = name;}

    public Company clone() throws CloneNotSupportedException{
        return (Company) super.clone();
    }
}
class Person1 implements Cloneable{
    String name;
    Company company;

    Person1(String name, Company company){
        this.name = name;
        this.company = company;
    }
    void print(){
        System.out.printf("Person %s works in %s\n", name, company.name);
    }
    public Person1 clone() throws CloneNotSupportedException{
        Person1 person = (Person1) super.clone();
        person.company = (Company) company.clone();
        return person;
    } // тот же метод clone(),
    // но это глубокое (полное) копирование,
    // для этого определим метод клонирования
    // у класса Company
    // все мы выполнили глубокое копирование
}
