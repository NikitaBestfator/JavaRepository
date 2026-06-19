public class Account <T>{ // Наследование и обобщения
    private T _id; // Класс-наследник может быть вообще не обобщенным
    T getId(){return _id;}
    Account(T id){
        _id = id;
    }

}
class DepositAccount<T, S> extends Account<T>{
    private S _name; // причем класс-наследник может выполнять свои функции
    S getName(){return _name;}
    DepositAccount(T id, S name){
        super(id);
        this._name = name;
    }
}
// Примеры использования классов в классе Main
// DepositAccount dAccount1 = new DepositAccount(20);
// System.out.println(dAccount1.getId());
// DepositAccount dAccount2 = new DepositAccount("12345");
// System.out.println(dAccount2.getId());

// Примеры использования классов в классе Main, но со своей логикой в классе-наследнике
// DepositAccount<Integer, String> dAccount1 = new DepositAccount(20, "Tom");
// System.out.println(dAccount1.getId() + " : " + dAccount1.getName());
// DepositAccount<String, Integer> dAccount2 = new DepositAccount("12345", 23456);
// System.out.println(dAccount2.getId() + " : " + dAccount2.getName());
class DepositAccount1 extends Account<Integer>{
    DepositAccount1(){
        super(5);
    }
}
// Пример использования классов
// DepositAccount1 dAccount1 = new DepositAccount1();
// System.out.println(dAccount1.getId());

class Account1
{
    private String _name;
    String getName(){return _name;}
    Account1(String name)
    {
        _name=name;
    }
}
// Базовый класс является обычным необобщенным классом
class DepositAccount2<T> extends Account1{

    private T _id;
    T getId(){return _id;}
    DepositAccount2(String name, T id){
        super(name);
        _id = id;
    }
}

class Account2<T>
{
    private T _id;
    T getId(){return _id;}
    Account2(T id)
    {
        _id = id;
    }
}

class DepositAccount3<T> extends Account<T>{

    DepositAccount3(T id){
        super(id);
    }
}
// Здесь мы можем преобразовать типы в одинаковые
// Интересный пример
// DepositAccount3<Integer> depAccount = new DepositAccount3(10);
//Account2<Integer> account = (Account2<Integer>)depAccount;
//System.out.println(account.getId());
// Но с разными типами мы этого сделать не сможем