import java.util.Scanner;
public class p1000 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a+b);

        in.close(); /*대체 왜 close() 메소드를 쓰는 것일까? 안써도 오류가 안나던데*/
    }
}
