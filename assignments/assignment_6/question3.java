package assignment_6;

public class question3 {

	public static void main(String[] args) {
		int exp=0,nar=2;
		while(nar>0) {
			if(exp==0){
				for(int i=1,k=7;i<=7;i++,k--) {
					
					for (int j = 1; j <= i; j++){
		                System.out.print(" ");
		            }
				
					for(int j=1;j<=k;j++){
						System.out.print((j-1+i)+" ");
					}
					System.out.println();
				}
				
				exp++;
			}else{				
				for (int i = 6; i >= 1; i--) {
		             
		            for (int j = 1; j <= i; j++) {
		                System.out.print(" ");
		            }          
		 
		            for (int j = i; j <= 7; j++) {
		                System.out.print(j+" ");
		            }
		            System.out.println();			            
		           
		        }
			}
			nar--;
		}
	}

}
