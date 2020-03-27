import java.util.*;
class RotationWithSplCharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String a=sc.next();
        //char[] b=a.toCharArray();
        int n=sc.nextInt();
        if(a.length()<n)
           n=n%a.length();
        String b="";
        for(int i=0;i<n;i++) {
            String[] c=a.split("",2);
            if(Character.isLetter(c[0].charAt(0)))
                b=c[1].concat(c[0]);
            else
                b=c[0].concat(c[1]);
            a=b;
        }
        System.out.println(a); 
    }
}