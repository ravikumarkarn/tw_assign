public class diamond_name{
public static void main(String[] arg){
int n = Integer.parseInt(arg[0]);
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
System.out.print(" ");
if(i==n-1){
System.out.println("RAVI");
break;
}
for(int j=0;j<2*i+1;j++)
System.out.print("*");
System.out.println("");
}

for(int i=n-2;i>=0;i--)
{
for(int j=1;j<=n-i-1;j++)
System.out.print(" ");
for(int j=0;j<2*i+1;j++)
System.out.print("*");
System.out.println("");
}
}
}

