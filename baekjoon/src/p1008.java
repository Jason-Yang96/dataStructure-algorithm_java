import java.util.Scanner;
public class p1008 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();

        System.out.println(a/b); /*오차범위 10^(-9) 정수로 받아서 소수로 바꿀 것이냐, 소수로 받아서 소수를 출력할 것이냐*/
        in.close();
    }
}