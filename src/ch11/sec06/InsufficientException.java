package ch11.sec06;

public class InsufficientException extends Exception{
    //생성자 2개 작성
    public InsufficientException(){}

    public InsufficientException(String message){
        super(message); //예외 메세지로 만들어 주기 위해 ->
    }
}
