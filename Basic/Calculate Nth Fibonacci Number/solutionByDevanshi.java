import java.util.*;
class solution {
    static int  fibo(int n){
        int [] arr= new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<=n; i++){
        arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
public static void main(String[] args){
Scanner scn= new Scanner (System.in);
int n= scn.nextInt();
System.out.print(fibo( n));

}
