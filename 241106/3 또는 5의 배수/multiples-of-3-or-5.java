import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0){
            System.out.print("YES");
            System.out.println();
            
        }else{
            System.out.print("NO");
        }
        if(a%5==0){
                System.out.print("YES");
                System.out.println();
            }else{
                System.out.print("NO");
            }

    }
}