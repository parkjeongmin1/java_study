package ch02.sec09;

public class OperatorExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;

        int result2 = v1 + v2;
        byte result3 = (byte) (v1+v2); //두개의 식이 같지만 강제타입 변환 같은 경우 데이터가 잘릴수 있다.
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result4 = v3+v4+v5;
        System.out.println("result4: " +result4);

        float f1 = 1.2F;
        double d1 = 3.4;
        double result5 = f1 +d1; //double 타입으로 변환 후 연산됨 => 실수끼리 연산도 허용범위가 큰 타입으로 변환

        System.out.println("result5: "+result5);

        //실수, 정수
        int v9 = 10;
        //java 실수 리터럴은 double 타입 이므로 4.0은 double 타입.
        double result6 = v9 / 4.0;
        float result7 = v9 / 4.0f;
        System.out.println("result6: "+result6);

        //char와 int 연산

        char v6 = 'A';
        char v7 = 1;
        int result8 = v6+v7;
        System.out.println("result8: " + result8);
        System.out.println("result8: " + (char)result8);

        int x = 1;
        int y = 2;
        double result = x/y; //정수 연산의 결과는 항상 정수
        System.out.println("result: "+result);

        //1. 올바른 값을 얻기위한 방법
        double result9 = (double) x/y;

        //2. 방법
        double result10 = (x/(double)y);

        //3. 방법
        double result11 = (double) x / (double) y;

        System.out.println("result9: "+result9);
    }
}
