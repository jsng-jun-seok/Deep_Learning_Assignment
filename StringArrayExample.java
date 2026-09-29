package ch03;

public class StringArrayExample {
    public static void main(String[] args) {
        String[] donutBox = {"기본", "크림", "초코"};
        
        // 일반 for문 출력
        for (int i = 0; i < donutBox.length; i++) {
            System.out.println(donutBox[i]);
        }
        
        // 향상된 for문 출력
        for (String name : donutBox) {
            System.out.println(name);
        }
    }
}