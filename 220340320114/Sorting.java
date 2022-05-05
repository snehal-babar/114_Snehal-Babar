import java.util.*;
class Sorting{
	void insertionSort(int a1[],int n){
		for(int i=1;i<n;i++){
			int k=a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>k){
				a1[j+1]=a1[j];
				j=j-1;
			}
			a1[j+1]=k;
		}
		
	}
	void display(int a1[],int n){
		for(int i=0;i<n;i++){
			System.out.print(a1[i]+" ");
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Sorting s=new Sorting();
		int a1[]=new int[n];
		for(int i=0;i<n;i++){
			//int element=sc.nextInt();
			a1[i]=sc.nextInt();
		}
		//int n=a1.length;
		s.insertionSort(a1,n);
		s.display(a1,n);
	}
}