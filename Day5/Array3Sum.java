//three arrays sum

import java.util.*;
class Array3Sum
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int i;
int val1[]={13,-22,82,17};
int val2[]={-12,-24,-79,-13};
int sum[]=new int[4];
for(i=0;i<val1.length;i++)
{
sum[i]=val1[i]+val2[i];
}
for(int x:sum)
{
System.out.println(x);
}
}
}
