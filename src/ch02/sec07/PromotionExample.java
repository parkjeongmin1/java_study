package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        //자동타입 변환
        byte byteValue = 10;
        int intValue = byteValue; //자동타입 변환 => 10은 int 타입으로 저장된다.

        System.out.println("intValue: " + intValue);

        intValue = 50; //int타입
        long longValue = intValue; //자동타입 변환 => 50은 long타입으로 저장된다

        short shortValue = 10;
        int intValue2 = shortValue; //자동타입 변환

        int longValue2 = 100;
        float floatValue = longValue2;
        double doubleValue = longValue2;

        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        //실수끼리의 자동타입 변환
        float floatValue2 = 100.5F;
        double doubleValue2 = floatValue2;
        System.out.println("doubleValue2: " + doubleValue2);

        //char => int타입 변환
        char charValue = '가';
        int intValue3 = charValue;
        System.out.println("intValue3: " + intValue3);

    }
}
