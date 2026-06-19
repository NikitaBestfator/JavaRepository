public class Person_sixth<T> {// одстановочные знаки wildcards в обобщениях
    private T id;
    private String name;

    T getId(){return id;}
    void setId(T id){this.id = id;}
    String getName(){return name;}

    Person_sixth(T id, String name){
        this.id = id;
        this.name = name;
    } // wildcards позволяют решить проблему с тем,
    // что тип Object не охватывает все типы и
    // такие как Integer или String
}// Person_sixth<?> person так записывается "любой тип"
// когда нам не важно какой тип будет подставлен или
// он неизвестен
// Person_sixth<? extends Number> так записывается
// "любой тип который представляет данный базовый класс
// или его производный класс"
// ? extends Type тут тип представляет
// производный от Type тип или сам Type
// wildcard ограниченный снизу
// Person_sixth<? super Integer> person,
// ? super Type - "любой тип который представляет данный тип
// или его базовый тип" - То есть тип должен представлять сам Type
// или его базовый тип (супертип)
// Принцип PECS (Producer Extends, Consumer Super):
// Он помогает узнать когда какой wildcard использовать:
// Producer extends: объект поставляет данные
// (операции чтения, getId()). В этом случае используется
// ? extends Type
// Consumer super: объект потребляет данные
// (операция записи, setId()). В этом случае используется
// ? super Type