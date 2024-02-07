package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65; //유니코드 값
        char c3 = '가';
        char c4 = 44032; //유니코드 값

//        char c5 = ''; 빈 문자를 표현하고 싶을때
        char c6 = ' ';
//공백도 char 타입 유니코드가 있다. 공백을 표현할때는 ' ' 한칸 띄워쓰기 사용.
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println(c6);
    }
}
