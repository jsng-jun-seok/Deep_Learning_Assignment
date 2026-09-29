package ch03;

import java.util.Random;

public class HorseRace {
    public static void main(String[] args) {
        String[] horses = {"1번 말", "2번 말", "3번 말", "4번 말", "5번 말"};
        Random random = new Random();

        System.out.println("=== 🐎 랜덤 경마 게임 시작! (총 3라운드) 🐎 ===\n");

        // 총 3번의 에포크(라운드) 반복
        for (int round = 1; round <= 3; round++) {
            System.out.println("--- [ " + round + " 라운드 경기 ] ---");

            // 일반 for문으로 말들의 달리는 모션 출력 (랜덤 거리)
            for (int i = 0; i < horses.length; i++) {
                int randomStep = random.nextInt(5) + 1; // 1~5칸 무작위 전진
                
                System.out.print(horses[i] + " : ");
                for (int j = 0; j < randomStep; j++) {
                    System.out.print("-");
                }
                System.out.println(" 🐎");
            }

            // 이번 라운드에서 우승할 말을 랜덤으로 선택 (0 ~ 4 인덱스)
            int winnerIndex = random.nextInt(horses.length);
            System.out.println("🎉 " + round + "라운드 승리자: " + horses[winnerIndex] + "!\n");
        }

        System.out.println("=== 🏁 전체 경기 종료 🏁 ===");
        
        // 향상된 for문을 활용한 참가 말 목록 출력
        System.out.println("[참가한 말 목록]");
        for (String name : horses) {
            System.out.println("- " + name);
        }
    }
}