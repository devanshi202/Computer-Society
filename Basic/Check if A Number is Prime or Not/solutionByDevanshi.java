import java.util.*;
class solutionByDevanshi{
public static void main(String[] args){
    Scanner scn= new Scanner (System.in);
    int n= scn.nextInt();
    int ans=0;
    for(int i=2; i<n; i++){
        //int cn=n;
        if(n%i==0){
            ans=1;
            break;
        }
    }
    if(ans==1){
        System.out.println("not prime");
    }else
        System.out.println(" prime");

}
}
















































































    
    
