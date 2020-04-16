import java.util.*;
public class MinHeapsort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		for(int i=1;i<=n;i++)
			a[i]=sc.nextInt();
		for(int i=2;i<=n;i++)
			minheap(a,i);
		System.out.println("After insertion");
		for(int i=1;i<=n;i++)
			System.out.println(a[i]);
		for(int i=n;i>=1;i--)
			delete(a,i);
		System.out.println("After deletion");
		for(int i=1;i<=n;i++)
			System.out.println(a[i]);
	}
	public static void minheap(int a[],int n){
		int i=n;
		int temp=a[n];
		while(i>1&&temp<a[i/2]){
			a[i]=a[i/2];
			i=i/2;
		}
		a[i]=temp;
	}
	public static void delete(int a[],int n){
		int i=1,j=2*i;
		int temp=a[1];
		a[1]=a[n];
		while(j<n-1){
			if(a[j]>a[j+1])
				j=j+1;
			if(a[i]>a[j]){
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
				i=j;
				j=2*j;
			}else break;
		}
		a[n]=temp;
	}
}