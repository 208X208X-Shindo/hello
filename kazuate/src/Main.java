// 2桁の整数を入力し、
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int i = (int)(Math.random() * 90) + 10;
        // System.out.println(i);
        int j = 0;
        while(j<5){
            int input;
            while(true){
                System.out.println("2桁の整数を入力");
                Scanner scan = new Scanner(System.in);
                String str = scan.next();
                if(str.matches("[1-9][0-9]")) {
                    System.out.println("OK");
                    input = Integer.parseInt(str);
                    break;
                }
                else {
                    System.out.println("不正な入力：二桁の整数です。");
                }
            }
            if(input == i){
                System.out.println("当たり");
                break;
            }
            if(input < i){
                System.out.println("小さい");
            }
            if(input > i){
                System.out.println("大きい");
            }
            if(Math.abs(input - i) >= 20){
                System.out.println("20以上差がある");
            }
            j++;
            if(j==5) System.out.println("ゲームオーバー");
        }
    }
}