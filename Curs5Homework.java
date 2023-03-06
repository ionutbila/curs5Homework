public class Curs5Homework{
	public static void main(String[] args){
		int[] numbers={1, 21, 3, 12, 11, 19};
		int sum=0;
		int num=5;
		

	}

	public static int sumOfIntegers(int[] numbers, int sum){
		for(int a=0; a<numbers.length; a++){
			sum=sum+numbers[a];
		}
		return sum;
	}

	public static int printOddNumbers(int[] numbers, int sum){
		for(int a=0; a<numbers.length; a++){
			if(numbers[a]%2!=0){
				sum++;	
			}
		}
		return sum;
	}

	
}