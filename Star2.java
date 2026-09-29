package ch03;

public class Star2 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {           // 총 5개의 줄을 만들기 위한 바깥쪽 반복문
            
            // 1. 공백 출력 (가운데 정렬을 위해 위쪽으로 갈수록 빈칸이 많아짐)
            for (int j = 0; j < 4 - i; j++) {   
                System.out.print(" ");           // 빈칸을 출력하여 별을 가운데로 모아줍니다.
            }
            
            // 2. 별 출력 (홀수 개씩 늘어남: 1개, 3개, 5개, 7개, 9개)
            for (int j = 0; j < (2 * i + 1); j++) {       
                System.out.print("*");           // 계산된 홀수 개수만큼 별을 이어 붙여서 출력합니다.
            }
            
            System.out.println();                // 공백과 별 출력이 끝난 후 다음 줄로 내립니다 (줄바꿈).
        }

    }
}