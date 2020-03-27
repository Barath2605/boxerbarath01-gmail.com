import java.util.*;
import java.lang.*;
class RotationWithSplCharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String a=sc.next();
        int n=sc.nextInt();
        if(a.length()<n)
           n=n%a.length();
        String b="";
        for(int i=0;i<n;i++) {
            String[] c=a.split("",2);
            if(Character.isAlphabetic(c[0].charAt(0))){
                b=c[1].concat(c[0]);
		}
            else{
		String d=c[0].concat(c[1]);
		for(int j=0;j<d.length();j++) {
		if(Character.isAlphabetic(d.charAt(j))){
//System.out.print("c------"+d.charAt(j));
                	b=d.substring(0,j)+d.substring(j+1,d.length())+d.charAt(j);
			break;
		}
		}
				

		}
            a=b;
        }
        System.out.println(a); 
    }
}
