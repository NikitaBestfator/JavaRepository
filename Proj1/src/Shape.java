abstract class Shape {

    int x;
    int y;

    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    //абстрактный метод для вычисления периметра
    abstract  double getPerimeter();
    // абстрактный метод для вычисления площади
    abstract double getArea();

    abstract void print();// его можно сделать абстрактным,
    // так как он не выполняет полезной нагрузки и методы в производных классах его переопределяют
}
//производный класс прямоугольника
class Rectangle extends Shape{
    int width;
    int height;

    Rectangle(int x, int y, int width, int height){
        super(x, y);

        this.height = height;
        this.width = width;
    }
    @Override
    double getPerimeter(){return this.width * 2 + this.height * 2;}

    @Override
    double getArea(){return this.width * this.height;}
    @Override
    void print(){
        System.out.println("Прямоугольник");
    }
}
//производный класс круга
class Circle extends Shape{
    int radius;

    Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }
    @Override
    double getPerimeter(){return this.radius * 3.14 * 2;}

    @Override
    double getArea(){return this.radius * 3.14;}
    @Override
    void print(){
        System.out.println("Круг");
    }
}