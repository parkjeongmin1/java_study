package ch04.sec04;

public class SumFrom1To100 {
    public static void main(String[] args) {
        //1부터 100까지의 합 구하기
        int sum = 0;
        
        for (int i=1; i<=100; i++){
            sum += i;
        }
        System.out.println("1부터 100까지의 합: " + sum);
    }
}
