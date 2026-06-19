public class Message_First { // Параметры типа с ограничениями
    private String text;
    String getText(){return text;}

    Message_First(String text){
        this.text = text;
    }
}
class Messager<T extends Message_First>{
    private T message; // Заменяется T на Messsage
    T getMessage(){return this.message;} // Заменяется T на Messsage

    Messager(T message){this.message = message;} // Заменяется T на Messsage

    void send(){
        System.out.println("Message send: " + message.getText());
    }// Есть ограничения для типа T ограничение в виде типа Message
}
// class Messenger<T extends Message & Printable> {

    // void sendMessage(T message){

        // message.print();
    // }
// } Тут класс Messager должен представлять
// одновременно класс Message и интерфейс Printable
// и выглядит следующим образом
        // class Messenger {

            // void sendMessage(Message message){

                // ((Printable)message).print();
            // }
        // }
// Ограничение используется из первого класса,
// а если надо интерфейс то ограничение преобразовывается