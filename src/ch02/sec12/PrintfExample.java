package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
//        System.out.println("안녕하세요");
//        System.out.println("자바입니다.");

//        System.out.printf("이름: %1$s, 나이: %2$d , 일자 : %3$d일", "이지은", 27, 10);

        /*
        "이름: %1$s, 1순서 여기로  // 나이: %2$d  2번째 값 여기로 //  일자 : %3$d일 3번쨰 값을 여기로
         */

        int value =123;
        System.out.printf("상품의 가격 : %d원\n", value);   // 상품의 가격 : 123원
        System.out.printf("상품의 가격 : %6d원\n", value);  // 상품의 가격 :    123원  - 6자리 공백 왼쪽 만들어라
        System.out.printf("상품의 가격 : %-6d원\n", value);  // 상품의 가격 : 123   원 - 6자리 공백 오른쪽
        System.out.printf("상품의 가격 : %06d원\n", value);  // 상품의 가격 : 000123원 - 원쪽 빈자리 0으로 채움

        double area = 3.14149 * 10 * 10;
        // 정수7자리 + 소수점 + 소수2자리 = 총 10자리, 왼쪽 공백
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10 , area);  // 반지름이 10인 원의 넓이:    314.15
                                    // .2의미 = 소수점 2자리 까지 // 10의 의미 = 10자리(소수2+ . + 정수)를 표현하겠다

        // 정수7자리 + 소수점 + 소수2자리 = 총 10자리, 오른쪽 공백
        System.out.printf("반지름이 %d인 원의 넓이:%-10.2f\n", 10 , area); // 반지름이 10인 원의 넓이:314.15
    
        // 정수7자리 + 소수점 + 소수2자리 = 총 10자리, 왼쪽 공백 0으로 채움
        System.out.printf("반지름이 %d인 원의 넓이:%010.2f\n", 10 , area); // 반지름이 10인 원의 넓이:0000314.15


        String name = "이지은";
        String job = "가수";
        //문자열은 %로 표현한다
        System.out.printf("%s|%s\n", name , job); //이지은|가수
        System.out.printf("%6s|%-6s", name , job); //   이지은|가수



    }
}
