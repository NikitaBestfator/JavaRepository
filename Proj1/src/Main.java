// Первое задание 27.04.2026
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*// перевод евро в рубли 1 евро = 88 рублей
        Scanner in = new Scanner(System.in);
        // статическая константа out
        System.out.print("Input a number: ");
        int euro = in.nextInt();

        System.out.printf("Your number: %d \n", euro);
        in.close();

        int rub = euro * 88;
        System.out.println(rub);*/
        // вызываем конструктор
        // Person tom = new Person();
        // Person bob = new Person("Bob");
        // Person sam = new Person("Sam", 25);
        // Person tom = new Person("Tom");
        // tom.print();

//        Employee bob = new Employee("Bob", "Google");
//        bob.print();

        //Person sam = new Employee("Sam", "Oracle");
//        Person sam = new Employee("Sam", "Oracle");
//        printPerson(sam);
//
//        Person tom = new Person("Tom");
//        printPerson(tom);
//
//        static void printPerson(Person person){
//            person.print();
        //}
        // 10 задание Полиморфизм
        /*Person[] people = new Person[3];

        people[0] = new Person("Aleksey");
        people[1] = new Student("Ivan", 12345);
        people[2] = new Person("Maria");

        for (int i = 0; i < people.length; i++){
            people[i].sayHello();
        }
*/
//        for (Person p : people) {
//            p.sayHello();
//        } еще один вариант решить это задание при помощи цикла enhanced for (for-each)
        // Shape shape1 = new Rectangle(10, 15, 200, 150);
        // Shape shape2 = new Circle(50, 60, 200);
        //а так можно
        // Printer.Printable printable = new Book();
        // printable.print();
        // использование вложенных интерфейсов
        // EBook book = new EBook();
        // book.print();
//        DayTime current = DayTime.AFTERNOON;
//        String message = getMessage(current);
//        System.out.println(message);
//
//        message = getMessage(DayTime.EVENING);
//        System.out.println(message);

    //}
//    static String getMessage(DayTime dt){
//        return switch(dt) {
//            case MORNING -> "Good morning";
//            case AFTERNOON -> "Good afternoon";
//            case EVENING -> "Good evening";
//            case NIGHT -> "Good night";
//        };
//        Operation sum = new Operation(OpType.ADD, 5, 4);
//        System.out.println(sum.execute());
//
//        Operation sub = new Operation(OpType.SUBSTRACT, 5, 4);
//        System.out.println(sub.execute());
//        Operation mul = new Operation(OpType.MULTIPLY, 5, 4);
//        System.out.println(mul.execute());
//        DayTime[] dts = DayTime.values();
//        for(DayTime dt: dts){// возвращает массив всех констант из перечисления
//            System.out.println(dt);
//        }
//        var current = DayTime.MORNING;
//        System.out.println(current.ordinal());
//
//        System.out.println(DayTime.AFTERNOON.ordinal());
        // метод ordinal() возвращает порядковый номер определенной константы (с 0)
        // карты сопоставления
//        var current = DayTime.EVENING;
//        System.out.println(messages[current.ordinal()]);
//        var current = DayTime.EVENING;
//        System.out.println(current.getMessage());
//        Operation op = Operation.SUM;
//        System.out.println(op.action(10, 4));
//        op = Operation.MULTIPLY;
//        System.out.println(op.action(6, 4));
//        var tom = new Person(546, "Tom");
//        tom.print; // ID: 546, Name: Tom
//        // разные типы данных, объединенные в объект
//        var bob = new Person("zpio9", "Bob");
//        bob.print(); // Id: zpio9; Name: Bob
//        Person<Integer> tom = new Person<Integer>(546, "Tom");
//        Person<String> bob = new Person<String>("ajlfq90", "Bob");
//
//        Integer tomId = tom.getId();
//        String bobId = bob.getId();// преобразование типов не нужно
//
//        System.out.println(tomId);
//        System.out.println(bobId);
//
//        Person<Integer> john = new Person<Integer>(546, "John");
//        Company<Person<Integer>> melkosoft = new Company <Person<Integer>>(john);
//
//        var ceo = melkosoft.getCEO();
//        System.out.println(ceo.getId());
//        System.out.println(ceo.getName());
        Person_Third<Integer, String> tom = new Person_Third<Integer, String>(546, "Tom", "Qwerty38");
        System.out.println(tom.getId());
        System.out.println(tom.getPassword());
    }
    // static String[] messages = {"Good morning", "Good afternoon", "Good evening", "Good night"};

}
// Интерфейсы
/*
// Вложенный интерфейс
class Printer{
    interface Printable{
        void print();
    }
}
class Book implements Printer.Printable{
    public void print(){
        System.out.println("Copy book");
    }
}
// Конфликт интерфейсов
interface Printable{
    default void print(){
        System.out.println("Copy on printer");
    }
}
interface Console{
    default void print(){
        System.out.println("Write data on Console");
    }
}
// Ошибка
class EBook implements Printable, Console{
    // 1. вариант решения
    //public void print(){
        //System.out.println("Copy book");
    //}
    // 2. вариант решения
    public void print(){
        Printable.super.print();
    }
}
// наследование интерфейсов
// у нас уже есть интерфейс Printable
interface File extends Printable{
    String read(); // вернет имя файла с методом getName()
}
class TextFile implements File{
    private String name;
    private String text;

    TextFile(String name, String text){
        this.name = name;
        this.text = text;
    }
    public String read(){
        return this.name;
    }
    public void print(){
        System.out.println(text);
    }
}
// Интерфейсы в механизме действие запускает другие действия
class ButtonClickHandler implements EventHandler{
    public void execute(){
        System.out.println("Button is turn off");
    }
}
interface EventHandler{
    void execute();
}
class Button{
    EventHandler handler;
    Button(EventHandler action){
        this.handler = action;
    }
    public void click(){
        handler.execute();
    }
}// В классе кнопки в методе клик принимает объект интерфейса, здесь имитация нажатия вызывает метод execute()
*/
// Перечисления enum
//enum DayTime{
//    MORNING,
//    AFTERNOON,
//    EVENING,
//    NIGHT
//}
//enum OpType{
//    ADD,
//    SUBSTRACT,
//    MULTIPLY
//}
//class Operation{
//    private OpType type;
//    private int op1;
//    private int op2;
//
//    Operation(OpType type, int op1, int op2){
//        this.type=type;
//        this.op1 = op1;
//        this.op2 = op2;
//    }
//    int execute(){
//        return switch(type){
//            case ADD -> op1 + op2;
//            case SUBSTRACT -> op1 - op2;
//            case MULTIPLY -> op1 * op2;
//        };
//    }
//}
//enum DayTime{
//    MORNING ("Good morning"), AFTERNOON("Good afternoon"), EVENING("Good evening"), NIGHT("Good night");
//
//    private String message;
//    DayTime(String message){// конструктор перечисления
//        this.message = message;
//    }
//    public String getMessage(){// поля и методы в конструкторе
//        return message;
//    }
//}
//enum Operation{
//    SUM{ // методы для отдельных констант
//        int action(int x, int y){
//            return x + y;
//        }
//    },
//    SUBTRACT{
//        int action(int x, int y){
//            return x - y;
//        }
//    },
//    MULTIPLY{
//        int action(int x, int y){
//            return x * y;
//        }
//    };
//    abstract int action(int x, int y);
//}
class Company<P>{// класс, который хранит президента компании
    private P ceo;
    P getCEO(){
        return ceo;
    }
    Company(P ceo){
        this.ceo = ceo;
    }
}