public class Person_fourth {// обобщенный конструктор
    private String id;
    private int sum;

    <T>Person_fourth(T id, int sum){
        this.id = id.toString();
        this.sum = sum;
    }
    public String getId(){
        return id;
    }
    public int getSum(){
        return sum;
    }
    public void setSum(int sum){
        this.sum = sum;
    }
}
