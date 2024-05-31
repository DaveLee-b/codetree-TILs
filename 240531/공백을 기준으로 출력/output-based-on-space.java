import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String str;
        String str2;
        String str3;
        str = sc.nextLine();
        str2 = sc.nextLine(); 
        str3 = str+str2;
        str3 = str3.replace(" ","");
        System.out.print(str3);
    }
}