package assignmentjava1;

import java.util.Scanner;

public class TotalandAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1,p2,p3,A1=0,B1=0,C1=0,A2=0,B2=0,C2=0,A3=0,B3=0,C3=0,T1,T2,T3,RST1,RST2,RST3;
		double avg1,avg2,avg3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of P1");
		A1=sc.nextInt();
		B1=sc.nextInt();
		C1=sc.nextInt();
		T1=A1+B1+C1;
		System.out.println("Total marks of P1:"+T1);
		avg1=T1/3;
		System.out.println("Avg of P1:"+avg1);
		System.out.println("Enter the marks of P2");
		A2=sc.nextInt();
		B2=sc.nextInt();
		C2=sc.nextInt();
		T2=A2+B2+C2;
		System.out.println("Total marks of P2:"+T2);
		avg2=T2/3;
		System.out.println("Avg of P2:"+avg2);
		System.out.println("Enter the marks of P3");
		A3=sc.nextInt();
		B3=sc.nextInt();
		C3=sc.nextInt();
		T3=A3+B3+C3;
		System.out.println("Total marks of P3:"+T3);
		avg3=T3/3;
		System.out.println("Avg of P3:"+avg3);
		System.out.println(" marks of Sub A w.r.t to P1,P2,P3");

		RST1=A1+A2+A3;
		System.out.println("Total:"+RST1);
		double avga=RST1/3;
		System.out.println("Avg:"+avga);
		System.out.println("marks of Sub B w.r.t to P1,P2,P3");

		RST2=B1+B2+B3;
		System.out.println("Total:"+RST2);
		double avgb=RST2/3;
		System.out.println("Avg:"+avgb);

		System.out.println(" marks of Sub C w.r.t to P1,P2,P3");

		RST3=C1+C2+C3;
		System.out.println("Total:"+RST3);
		double avgC=RST3/3;
		System.out.println("Avg:"+avgC);


	}

}
