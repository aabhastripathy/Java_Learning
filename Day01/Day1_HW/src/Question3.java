
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100231;
		//int count = 0;
		int temp = num;
		int place = 1;
		int result = 0;
		while(temp > 0) {
			
			int digit = temp % 10;
			temp = temp/10;
			if(digit != 0) {
				
				result = result + digit * place;
				 place = place *10;
			}
			
		}
		System.out.println(result);
	}

}
