import java.util.*;
class solution{
    static int facto(int n){
        if(n==0){
            return 1;
        }
        int myans=facto(n-1);
       int  ans=n*myans;
        return ans;
    }
public static void main(String[] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    
    System.out.print(facto(n));
}

}
