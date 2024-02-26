package ch08.sec02;

public interface RemoteControl {
    //상수 선언 (반드시 대문자 사용)
    int MAX_VOLUME = 10; //public static final 생략됨
    int MIN_VOLUME = 0;
    
    //추상메소드
    public void turnOn(); //abstract가 생략됨


}
