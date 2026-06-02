
public class Message {// три каких-то класса отправки сообщений для ограничений обобщений
    private String text;

    String getText(){
        return text;
    }

    Message(String text){
        this.text =text;
    }
}
class EmailMessage extends Message{
    private String address;
    String getAddress(){
        return address;
    }

    EmailMessage(String text, String address){
        super(text);
        this.address = address;
    }
}
class SmsMessage extends Message{
    private String number;
    String getNumber(){
        return number;
    }
    SmsMessage(String text, String number){
        super(text);
        this.number = number;
    }
}
// класс функционала
class Messenger<T extends Message> {// теперь сделаем ограничения
    private T message;
    T getMessage(){
        return this.message;
    }
    Messenger(T message){
        this.message = message;
    }
    void send(){
        System.out.println("Message send: "+ message.getText());// ошибка метод getText() не может работать с обобщенниями
    }
}
// несколько универсальных параметров
class Messenger_2<T extends Message, P extends Person_1>{
    void sendMessage(P sender, P receiver, T message){
        System.out.println("Sender" + sender.getName());
        System.out.println("Receiver" + receiver.getName());
        System.out.println("Message" + message.getText());
    }
}
class Person_1{
    private String name;
    String getName(){
        return name;
    }
    Person_1(String name){
        this.name = name;
    }
}
// множественные ограничения
class Messenger_1<T extends Message & Printable_1>{
    void sendMessage(T message){
        message.print();
    }
}
interface Printable_1{
    void print();
}
class PrintedMessage extends Message implements Printable_1{
    PrintedMessage(String text){
        super(text);
    }
    public void print(){
        System.out.println("Text message: " + getText());
    }
}
// Ограничения методов
class EmailMessage_1 extends Message{
    EmailMessage_1(String text){
        super(text);
    }
}
class SmsMessage_1 extends Message{
    SmsMessage_1(String text){
        super(text);
    }
}