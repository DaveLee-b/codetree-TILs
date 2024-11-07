import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력을 받는 부분
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};

        // 배열을 오름차순으로 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 가운데 값 출력
        System.out.print(arr[1]);
    }
}