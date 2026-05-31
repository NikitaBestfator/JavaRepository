public class Employee extends Person{
    /*private String company;

    //если было бы final class Person унаследовать этот класс нельзя было
    // также можно сделать с методами, с помощью ключевого слова final
    Employee(String name, String company){// вызываем базовый конструктор из Person через super(аргументы: имя, возраст)
        super(name);
        this.company = company;
    }

    // @Override - это аннотация, которая ставится перед переопределяемым методом, в принципе необязательна
    @Override
    void print(){
        super.print();
        System.out.println("Company: " + company);
    }*/
    private String company;

    Employee(String name, String company){
        super(name);
        this.company = company;
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;// super - так как базовый класс Person
        // super.equals проверяет, что this и otherObject представляют один и тот же класс
        Employee empl = (Employee)otherObject;
        //и проверяем равенство их координат
        return this.company.equals(empl.company);
    }

}
