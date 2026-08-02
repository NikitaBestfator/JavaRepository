public class Person_nine {
    // внутренние классы (inner class) преследуют две цели могут быть скрыты от других классов в том же пакете,
    // методам внутреннего класса доступны данные в том числе и приватные из внешнего класса
    private String name;
    Account account;

    Person_nine(String name, String password){
        this.name = name;
        account = new Account(password);
    }
    void print(){
        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
    }

    public class Account{
        private String password;
        Account(String pass){this.password = pass;}

        void print(){
            System.out.printf("Person \t Name: %s \t Password: %s \n", Person_nine.this.name, password);
        }
    }
}
