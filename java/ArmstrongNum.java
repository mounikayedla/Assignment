package assignmentjava1;

public class ArmstrongNum {
	static boolean isArmstrong(int n) {
		int temp,digits=0,last=0,sum=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
	temp=n;
	while(temp>0) {
		last=temp%10;
		sum+=(Math.pow(last, digits));
		temp=temp/10;
	}
	if(n==sum)
		return true;
	else return false;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 999;
		for(int i=100;i<=num;i++)
			if(isArmstrong(i))
				System.out.println(i+",");

		
	}

}
