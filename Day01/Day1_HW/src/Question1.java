

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 347;
int count = 0;
int temp = num;
while(temp > 0) {
	
	int digit = temp % 10;
	temp = temp/10;
	count++;
	
}
System.out.println(count);
	}

}
