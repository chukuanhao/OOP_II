import java.util.Scanner;
import java.util.HashMap;
public class practice2{
    public static void main(String[] args) {

        HashMap<Integer, String> hMap = new HashMap<Integer, String>();

        String [] month ={"January","febuary","March","April","May","June","July","August","September"
                        ,"Octorbor","November","December"};      
        int i=1;
        for(String n:month){
            hMap.put(i, n);
            i+=1;
        }
        //System.out.println(hMap);

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入 1-12 ?");
        int input = sc.nextInt();

        while(input<1 || input>12){
            System.out.println("輸入錯誤!");
            System.out.println("請輸入 1-12 ?");
            input = sc.nextInt();
        }
        System.out.println("第"+input+"月的英文單字是"+hMap.get(input));
    }
}