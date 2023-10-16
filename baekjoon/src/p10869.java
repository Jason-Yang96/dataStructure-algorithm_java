import java.util.Scanner;
public class p10869 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); /*int로 자료형을 지정하게 되면 나눗셈 연산을 하더라도 정수형이 나오구나. 그래서 몫 연산 기호가 따로 없어 */
        System.out.println(a%b);
    }
}
