package ch02.sec13;


import java.util.Scanner; //이게 있어야 스캐너 가능

public class ScannerExample {
    public static void main(String[] args) {
        // 1. Scanner 객체 생성
        // 자바에서 객체 생성시에는 new 라는 키워드를 사용해 객체 생성
        // 참조타입 변수명 = new 객체
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력:");
        // 2. scanner 에서 값 입력받기
        String strX = scanner.nextLine();

        System.out.println("y값 입력 : ");
        String strY = scanner.nextLine();

        int result = Integer.parseInt(strX)+Integer.parseInt(strY);
        System.out.println("x + y =" + result);

        // 계속 입력을 받을 수 있게 만들고 q를 입력했을때 프로그램이 끝나도록

        while (true){
            System.out.println("입력 문자열 : ");
            String data = scanner.nextLine();

            // 데이터의 입력된 값이 q 인가?
            if(data.equals("q")) {
                break; // while 문 중단
            }
            System.out.println("출력 문자열 : " + data);
        }
        // while문 탈출 후 찍는 문자
        System.out.println("프로그램 종료");
        /*
         System.out.println("내가 입력한 x값 : " + strX);
         x값 입력: gd
        내가 입력한 x값 :  gd  이렇게 출력됨 */
    }
}
