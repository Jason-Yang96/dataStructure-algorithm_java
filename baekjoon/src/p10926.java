import java.util.Scanner;
public class p10926 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine(); /*라인 전체를 받는다. nest()는 문자열이 아닌 문자 하나만을 받기에 별일이 없으면 현 상태로*/

        System.out.printf("%s%s", name, "??!");

        in.close();
    }
}
