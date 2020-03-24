import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner scn= new Scanner (System.in);
        char ch=scn.next().charAt(0);
        if(ch=='a'|| ch=='e'||ch=='i' ||ch=='o'|| ch=='u'){
            System.out.println("vowel");
        }
        else 
            System.out.println("consonant");
    }
}
