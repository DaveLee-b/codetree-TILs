import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 사람의 나이와 성별 입력
        int age1 = sc.nextInt();
        String gender1 = sc.next();
        
        // 두 번째 사람의 나이와 성별 입력
        int age2 = sc.nextInt();
        String gender2 = sc.next();
        
        // 조건에 따라 출력 결정
        if ((age1 >= 19 && gender1.equals("M")) || (age2 >= 19 && gender2.equals("M"))) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        sc.close(); // Scanner 닫기
    }
}