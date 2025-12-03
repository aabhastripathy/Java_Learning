class DemoWhileLoop{
public static void main(String[] args){
int num = 66;
int i = 2;
boolean isPrime = true;
while(i<num/2){
if(num % i == 0){
isPrime = true;
break;}
else
{
isPrime = false;
} 
i++;
}
if(isPrime){
System.out.println("NOT PRIME");}
else{
System.out.println(" PRIME");}}}