public class PersonTen {
    // локальные внутренние классы - область действия ограничена блоком, в котором они объявлены
    private String name;

    PersonTen(String name){ this.name = name; }

    void setTempAccount (String password){
        class TempAcccount{
            private void print(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        TempAcccount account = new TempAcccount();
        account.print();
    }
}
