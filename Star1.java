package ch03;

public class Star1 {

    public static void main(String[] args) {
        
        // 1. [기존 코드] 별이 점점 늘어나는 부분 (1개 -> 5개)
        for (int i = 0; i < 5; i++) {           // 총 5개의 줄을 만들기 위한 바깥쪽 반복문
            for (int j = 0; j <= i; j++) {       // i의 크기만큼 별(*)을 출력합니다.
                System.out.print("*");           // 줄바꿈 없이 옆으로 별을 이어서 출력합니다.
            }
            System.out.println();                // 별 출력이 끝난 후 다음 줄로 내립니다 (줄바꿈).
        }

        // 2. [추가된 코드] 별이 점점 줄어드는 부분 (4개 -> 1개)
        for (int i = 3; i >= 0; i--) {           // 이미 5개가 끝났으므로 3부터 0까지 줄어드는 바깥쪽 반복문
            for (int j = 0; j <= i; j++) {       // 줄어드는 i 크기만큼 별(*)을 다시 출력합니다.
                System.out.print("*");           // 줄바꿈 없이 옆으로 별을 이어서 출력합니다.
            }
            System.out.println();                // 별 출력이 끝난 후 다음 줄로 내립니다 (줄바꿈).
        }

    }
}
