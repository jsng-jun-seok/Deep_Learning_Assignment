package ch03;

public class Star3 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {           // 총 5개의 줄을 만들기 위한 바깥쪽 반복문
            
            // 1. [추가된 부분] 공백을 출력하는 반복문
            for (int j = 0; j < 4 - i; j++) {   // i가 커질수록 공백의 개수가 점점 줄어듭니다 (4개 -> 0개).
                System.out.print("0");       // 빈칸을 출력하여 별을 오른쪽으로 밀어내고 0을 넣어주면 공백을 채워준다.
            }
            
            // 2. [기존 부분] 별을 출력하는 반복문
            for (int j = 0; j <= i; j++) {       // i의 크기만큼 별(*)을 출력합니다 (1개 -> 5개).
                System.out.print("*");           // 줄바꿈 없이 옆으로 별을 이어서 출력합니다.
            }
            
            System.out.println();                // 별과 공백 출력이 끝난 후 다음 줄로 내립니다 (줄바꿈).
        }

    }
}