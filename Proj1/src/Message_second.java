public class Message_second {// Функциональные интерфейсы и ссылки на методы
    // функциональный интерфейс - это интерфейс, в котором определен только один абстрактный метод
}// пример
interface Message1{
    void print(); // - этот интерфейс можно назвать функциональным
}// также мы можем определить переменную
// этого интерфейса Message1 mes;
// ссылка на метод
// функциональный метод может представлять ссылки
// на методы этим и отличается от обычного интерфейса
// пример mes = Program::hello
// переменной mes передаем ссылку на метод hello(),
// который определен в главном файле
// Это все если методы статические,
// если они нестатические,
// то в ссылке указываем не имя класса,
// а имя объекта
// Program prog = new Program();
// Message mes = prog::hello;
// метод с параметрами
interface Operation{
    int execute(int x, int y);
}
class Operations{
    static int add(int a, int b){return a + b;}
    static int sub(int a, int b){return a - b;}
    static int mul(int a, int b){return a * b;}
}
// тогда в главном файле будет
// Operation op = Operations::add;
// op = Operations::sub;
// op = Operations::mul;
// Ссылки на метод как параметры методов
// doOperation(10, 4, Operations::add);
// doOperation(10, 4, Operations::sub);
// doOperation(10, 4, Operations::mul);
// также с нестатическими применяется объект
// Ссылки на метод как результаты методов
// в главном файле:
// Operation action = select(1);
// action = select(2);
// action = select(3);
// static Operation select(int choice){
// switch(choice)
// {
//      case 2:
//             return Program::sub
//      также с case 3 и default.
//}}
// Здесь метод select() в зависимости от параметра
// возвращает ссылку на один из методов
// то есть здесь переменная action
// хранит в себе ссылку Program::sum
// Ссылки на конструкторы
class User{
    private String name;
    String getName(){
        return name;
    }
    User(String n){
        this.name = n;
    }
}
interface  UserBuilder{
    User create(String name);
}
// и то что будет в главной странице
// UserBuilder userBuilder = User::new;
// User user = userBuilder.create("Tom");
// методы функциональных интерфейсов
// должны принимать тот же список параметров,
// что и конструкторы класса,
// и должны возвращать объект класса
// аналогично Person[]::new представляет
// создание массива объектов

// Введение в лямбда-выражения

interface Operationable{
    int execute(int x, int y);
}
//  главном файле Main будет Operationable op;
// op = (x, y) -> x+y
// использование лямбда-выражения
// в виде вызова метода интерфейса
// int result = operation.execute(10, 20)
// при этом можно использовать множество лямбда-выражений
// Operationable sum = (int x, int y)-> x + y;
// Operationable sub = (int x, int y)-> x - y;
// Operationable mul = (int x, int y)-> x * y;
// если параметр один то скобки можно не использовать
// а если в методе функционального интерфейса
// есть параметр,
// но в лямбда-выражении он не используется,
// то ставится прочерк
// Printable printer = _ -> System.out.println();
// если вообще метод интерфейса не принимает
// никаких параметров, то ставятся пустые скобки
// Отложенное выполнение
// Отложенное выполнение лямбд-выражений
// может потребоваться если:
// Выполнение кода в отдельном потоке
// Выполнение одного и того же кода несколько раз
// Выполнение кода в результате какого-то события
// Выполнение кода только в том случае,
// когда он необходим и если он необходим
// Лямбды и локальные переменные ;%:
