package ch03.sec04;

public class Accuracy2 {
    public static void main(String[] args) {
//사과 1개를 1(1.0)로 보고 7조각(0.7)을 뺀 3조각(0.3)을 구하는 코드입니다.
int apple = 1;
int totalpieces = apple * 10;
int number = 7;

double result = totalpieces - number;
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}
