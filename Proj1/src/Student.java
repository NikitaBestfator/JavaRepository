public class Student extends Person{
    private int studentId;

    public Student(String name, int studentId){
        super(name);
        setStudentId(studentId);
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    @Override
    public void sayHello(){
        System.out.println("Привет, я студент! Меня зовут " + getName() + ", мой ID: " + studentId);
    }
}
