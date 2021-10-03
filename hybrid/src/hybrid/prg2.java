package hybrid;
import java.util.*;
class evenodd{
	void func() {
		int m,n,i,j;
		System.out.println("enter the no of rows and columns");
		Scanner obj=new Scanner(System.in);
		m=obj.nextInt();
		n=obj.nextInt();
		int [][]a=new int[m][n];
		int [][]b=new int[m][n];
		System.out.println("enter the elements of MATRIX a:");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Transpose of matrix a:");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				b[j][i]=a[i][j];
			}
		}
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
			System.out.print(b[i][j]+"\t");	
			}
			System.out.println();
		}
	}
}
class transpose extends evenodd{
	void func() {
		int m,i,k=0,l=0;
		System.out.println("enter the size of array");
		Scanner obj=new Scanner(System.in);
		m=obj.nextInt();
	    int []a=new int[m];
	    int []even=new int[m];
	    int []odd=new int[m];
	    System.out.println("enter the array elemnets:");
	    for(i=0;i<m;i++) {
	    	a[i]=obj.nextInt();
	    }
	    for(i=0;i<m;i++) {
	    	if(a[i]%2==0) {
	    		even[k]=a[i];
	    		k++;
	    	}
	    	else {
	    		odd[l]=a[i];
	    		l++;
	    	}
	    }
	    System.out.println("even array elements:");
	    for(i=0;i<k;i++) {
	    	System.out.print(even[i]+"\t");
	    }
	    System.out.println();
	    System.out.println("odd array elements:");
	    for(i=0;i<l;i++) {
	    	System.out.println(odd[i]+"\t");
	    } 
	}
}

public class prg2{
	     public static void main(String[] args) {
	    evenodd a=new evenodd();
	    evenodd b=new transpose();
	    a.func();
	    b.func();
	     }
}
