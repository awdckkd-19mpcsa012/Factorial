import java.util.*;
class factorial
{
public static void main(String[]args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n value:");
n=sc.nextInt();
long fact=1;
for(int i=1;i<=n;i++)
{
fact*=i;
}
System.out.printf("fact of %d=%d",n,fact);
}}