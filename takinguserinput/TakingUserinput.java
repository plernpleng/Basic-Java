package takinguserinput;
import java.util.Scanner;
public class TakingUserinput {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int num = s1.nextInt();
        String str = s2.nextLine();
        System.out.println("ตัวเลขที่พิมพ์ คือ : " + num);
        System.out.println("ตัวหนังสือที่พิมพ์ คือ : " + str);
    }
}