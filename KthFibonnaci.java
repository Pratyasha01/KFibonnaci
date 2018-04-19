import java.util.*;
class KthFibonnaci{
	public static void main(String args[]){
		//Input through keybord 
		Scanner scan=new Scanner(System.in);
			//Create variables 
			int fibonaccNumbers=0,numbersOfElements=0,kthElement=0;
			while(scan.hasNext()){
				fibonaccNumbers++;
				//Initial generate the kth term for similar series
				if(fibonaccNumbers==1){
					numbersOfElements=scan.nextInt();
				}
				if(fibonaccNumbers==2){
					kthElement=scan.nextInt();
					break;
				}
			}	
			long temporaryNumber[]=new long[numbersOfElements+1];
			if(numbersOfElements<kthElement){
				System.out.println(1);
			}
			else{
				for(int index_i=1;index_i<=numbersOfElements;index_i++){
					if(index_i<=kthElement){
						temporaryNumber[index_i]=1;
					}
					if(index_i>kthElement){
						temporaryNumber[index_i]=0;
						//T(n, k) is 1 if n <= k and T(n, k) = T(n-1, k) + T(n-2, k) + T(n-3, k) … + T(n-k, k) if n > k 
						for(int index_j=index_i-kthElement;index_j<index_i;index_j++){
							temporaryNumber[index_i]=(temporaryNumber[index_i]+temporaryNumber[index_j])%1000000007;
						}
					}
				}
				System.out.println(temporaryNumber[numbersOfElements]);		
			}	
	}
}
