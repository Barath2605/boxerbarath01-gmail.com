import java.util.*;
class ReverseStringWithoutMovingSplCharacter{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
char[] a=sc.next().toCharArray();
int l=0;
int r=a.length-1;
while(l<r) {
if(!Character.isAlphabetic(a[l]))
l++;
else if(!Character.isAlphabetic(a[r]))
r--;
else {
char temp=a[l];
a[l]=a[r];
a[r]=temp;
l++;
r--;
}



}
String aa=new String(a);
System.out.println(aa);
}
}