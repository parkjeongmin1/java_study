package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        //필드를 이용하여 자동타입변환이 일어난다
        myCar.tire = new HanKookTire(); //Tire tire = new HonkookTire()
        myCar.run(); //tire.roll(); -> 오버라이드 된 메소드가 있으면 자식클래스에 있는 메소드 사용

        myCar.tire = new KumhoTire(); //Tire tire = new KumhoTire()
        myCar.run(); //tire.roll(); -> 오버라이드 된 메소드가 있으면 자식클래스에 있는 메소드 사용

        myCar.tire = new Tire(); // Tire 클래스를 가져온다.
        myCar.run(); //Tire 클래스에 있는 roll 을 가져온다
    }
}
