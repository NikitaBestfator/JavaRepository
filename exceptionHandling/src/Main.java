import java.util.Scanner;

class Program{
    public static void main(String[] args) throws Throwable{
//        createPerson("Tom", -10);
//        createPerson("m", 20);
        int f1 = factorial(4);
        System.out.println("f1: " + f1);

        int f2 = factorial(-4);
        System.out.println("f2: " + f2);
    }
    static int factorial(int n){
        assert n > 0: n;

        int result = 1;
        while(n > 1) result *= n--;
        return result;
    }
//    static void createPerson(String name, int age){
//        try{
//            var person = new Person(name, age);
//            person.print();
//        }
//        catch(PersonNameException ex){
//            System.out.println("Ошибка в имени: ");
//            System.out.println(ex.getMessage());
//        }
//        catch(PersonAgeException ex){
//            System.out.println("Ошибка в возрасте: ");
//            System.out.println(ex.getMessage());
//        }
//    }
}
//class Person{
//    private String name;
//    private int age;
//    private static int nameMinLength = 2;
//    private static int minAge = 1;
//    private static int maxAge = 110;
//
//    Person(String name, int age) throws PersonNameException, PersonAgeException{
//        if(name.length() < 2) throw new PersonNameException(name, nameMinLength);
//        if(age < 1 || age > 110) throw new PersonAgeException(age, minAge, maxAge);
//        this.name = name;
//        this.age = age;
//    }
//    void print(){System.out.printf("Name: %s; Age: %d\n", name, age);}
//}
// Assertion (утверждение) паттерн защитного механизма (guard)
// во время тестирований проверяет соблюдение некоторых условий
// assert используется для проверки ошибок при которых нет смысла продолжать программу
// assert n > 0; - здесь оператор проверяет условие n > 0 если нет сгенерирует ошибку
// assert n > 0: n - здесь все то же самое,
// но только значение переменной n передается в конструктор класса AssertionError
// для пакетов и классов надо включать поддержку assert
// java -enableassertions Program - включить поддержку
// java -ea:SomeClass -ea:com.mycompany.somelib... Program включить поддержку для класса SomeClass для пакета
// com.mycompany.somelib
// -ea:... - включает в том месте где у пакета нет имени
// java -ea:... -da: SomeClass Program выключить поддержку assert
