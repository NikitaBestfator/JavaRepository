public class Person {
    //String name;
    //int age;

    /*{// инизиализатор
        name = "Неизвестно";
        age = 18;
    }*/
    // конструктор класса
    /*Person(){
        // инициализация объекта и его переменных
        name = "Неизвестно";
        age = 18;
    }*/
    // необязательные параметры в конструкторах
    /*Person(String username){
        name = username;
        age = 18;
    }*/
    /*Person(String username, int userage){
        name = username;
        age = userage;
    }*/

    /*void print(){
        System.out.printf("Имя: %s; Возраст: %d\n", name, age);
    }*/
    // Ключевое слово this
    /*Person(String name){
        this(name, 18);
    }*/
    /*Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    int age;
    static int retirementAge = 65;

    Person(int age){
        this.age = age;
        System.out.println("Constructor");
    }
    static{
        retirementAge = 65;
        System.out.println("Static initializer");
    }
    static void checkStatus(Person person){
        if (person.age >= retirementAge)
            System.out.println("Уже на пенсии");
        else
            System.out.printf("До пенсии осталось:", retirementAge - person.age);
    }
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            return;
        }
        this.name = name;
    }

    public void setAge(int age){
        if (age < 0 || age >= 110){
            System.out.println("Предупреждение: возраст " + age + " выглядит нереалистично, но сохраняем.");
            return;
        }
        this.age = age;
    }
    private String name;

    public Person(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            System.out.println("Error");
            return;
        }
        this.name = name;
    }
    void print(){
        System.out.println("Name: " + name);
    }
    public void sayHello(){
        System.out.println("Привет, я обычный человек! Меня зовут " + name);
    }*/

//    private String name;
//
//    Person(String name){
//        this.name = name;
//    }
//    @Override // метод equals сравнивает два объекта на равенство
//    public boolean equals(Object otherObject){
//        if (this == otherObject) return true;
//        if (otherObject == null) return false;
//        if (getClass() != otherObject.getClass()) return false;
//
//        Person p = (Person)otherObject;
//        return this.name == p.name;
//    }
// Обобщение или generics
    private int id;
    private String name;

    int getId(){
        return id;
    }
    String getNames(){
        return name;
    }
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

}
