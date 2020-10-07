package assignment_5;

public class question14 {

	public static void main(String[] args) {

		int row=7;
		for(int i=row;i>0;i--) {
			String space="";
			for(int j=0;j<row-i;j++) {
				space+=" ";
				//System.out.println();
				
			}
			System.out.println("#"+space+"#");
			
		}

	}

}
