import java.util.*;

import javax.security.auth.x500.X500Principal;
public class practice1 {
    public static void main(String[] args) {

        TreeSet<Integer> tSet = new TreeSet<>();
        int random = 0;
        System.out.println("電腦從 1-100 的整數中，亂數選出 10 個不重複的號碼....");

        int i=1;
        while(tSet.size()<10){
            random = (int)(Math.random()*(100));
            //System.out.println(random);
            System.out.println("第"+i+"個號碼是:"+random);
            tSet.add(random);
        }
        System.out.println("物件內的元素個數為:"+tSet.size());
        System.out.println("物件內的元素內容為:"+tSet);
        System.out.println("first number: "+tSet.first());
        System.out.println("last number: "+tSet.last());
        
        Iterator<Integer> iSet = tSet.iterator();
        

        try{
            while(iSet.hasNext()){
                int x=iSet.next();
                if(x<30 || 70<x){
                    //System.out.println(x);
                    iSet.remove();
                }
            }
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("內容介於30-70者:"+tSet);

    }
}