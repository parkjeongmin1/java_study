package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        //long타입을 쓸때 int타입 허용범위에 있는 숫자는 사용가능
        long var1 = 10; //int 타입으로 인식 => int 타입 범위안에 있으면 L 생략 가능.
        long var2 = 20L; //long 타입으로 인식
//        long var3 = 10000000000000000; //int 타입으로 인식 => 허용범위를 벗어남 L을 붙여야 됨.
        long var4 = 10000000000000000L; //long타입으로 인식

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);

    }
}
