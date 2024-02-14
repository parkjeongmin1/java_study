package ch05.sec07;

public class MutiDimesion2 {
    public static void main(String[] args) {
        int [][] mathScores = new int[2][3];

        //2차원 배열에 값을 할당하지 않을 경우 디폴트 값 출력
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores[" + i + "][" + i + "]:" + mathScores[i][j]);
            }
        }
    }
}
