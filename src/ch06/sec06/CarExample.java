package ch06.sec06;

public class CarExample {
    public static void main(String[] args) {

        //설계도를 바탕으로 자동차를 생산한다.

        //첫 번째 자동차 생산
        Car mycar = new Car();
                      //객체 = 인스턴스

        //필드 값 가져오기
        System.out.println("모델명: " + mycar.model);
        System.out.println("시동여부: " + mycar.start);
        System.out.println("현재속도: " + mycar.speed);
        System.out.println("회사: " + mycar.company);
        System.out.println("최대속도: " + mycar.maxSpeed);

        //필드 값 변경
        mycar.speed = 60;
        mycar.start = false;

        System.out.println("현재속도: " + mycar.speed);
        System.out.println("시동여부: " + mycar.start);

        //메소드 실행
        mycar.run();
        mycar.stop();
    }
}
