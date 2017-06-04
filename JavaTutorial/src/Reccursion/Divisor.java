package Reccursion;

public class Divisor {
	 int divisor_sum(int n){
		 int ans=0;
		 int j=0;
		 int divisor[]=new int[5];
		 for(int i=n;i>0;i--){
			 if(n%i==0){
				 divisor[j]=i;
				 j++;
			 }
		 }
		 for(int i=j-2;i>0;i--)
		 {
			 ans=ans+divisor[i];
		 }
		 return(ans);
	}
}
