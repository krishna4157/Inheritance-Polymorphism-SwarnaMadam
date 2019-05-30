package MyCalculator;
interface AdvancedArithmetic{
	public static void divisor_sum(int n) {
		int count =0;
		int sum=0;
		for(int i=1;i<100;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}