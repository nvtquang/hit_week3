import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chuoi = 0;
        String str;
        str = sc.nextLine();
        int dodai = str.length();
        for(int i = 0; i<= dodai /2; i++){
            char str1, str2;
            str1 = str.charAt(i);
            str2 = str.charAt(dodai - 1);
            if(str1 == str2){
                chuoi++;
            }
            else {
                System.out.println(str.toLowerCase());
                chuoi = 0;
                break;
            }
            dodai--;
        }
        if(chuoi != 0){
            System.out.println(str.toUpperCase());
        }
    }
}
