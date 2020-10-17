package assignment_8;

public class question_7 {

	public static void main(String[] args) {

		isPalindrome(1001001);	
	}

	public static void isPalindrome(int n) {

		int r,sum=0,temp;    
		 		  
		temp=n;  //assign number to temp to manipulate  
		while(temp>0){    
		r=temp%10;  //getting remainder  
		sum=(sum*10)+r;  // each iteration sum add one digit with remaining 
		temp=temp/10;    
		}    
		if(n==sum) {   
		System.out.println(true);    
		}else {   
		System.out.println(false);   
		}
	}

}
