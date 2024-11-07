import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =  new Scanner(System.in);
        int a_1 = sc.nextInt();
        String s_1 = sc.next();
        int a_2 = sc.nextInt();
        String s_2 = sc.next();
        if(a_1>19||a_2>19){
            if(a_1>19&&s_1.equals("M")){
                System.out.print("1");
                
            }else if(a_2>19&&s_2.equals("M")){
                System.out.print("1");
                
            }else{
                System.out.print("0");
            }
        }
    }
}