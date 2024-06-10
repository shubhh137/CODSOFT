import java.util.*;


public class GradeCalculator {
	
   public static void main(String[] args) {
	  
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the total number of subjects ");
	int totalsub=sc.nextInt();
	int totalmarks=0;
	
	for(int i=0;i<totalsub;i++) {
		System.out.println("Enter the marks for sub: "+(i+1));
		int marks=sc.nextInt();
		totalmarks=totalmarks+marks;
	}
	double avg=(totalmarks/totalsub);
//	System.out.println(avg);
	String grade = null;
	
	if(avg>90) {
		grade="A+";
		System.out.println("Your total marks is: " +totalmarks);
		System.out.println("The avrage is: " + avg);
		System.out.println("You have secure "+grade +" Grade");
		
	}
	else if(avg>80 && avg<=90) {
		grade="A";
		System.out.println("Your total marks is: " +totalmarks);
		System.out.println("The avrage is: " + avg);
		System.out.println("You have secure "+grade +" Grade");
		
	}
	else if(avg>70 && avg<=80 ) {
		grade="B+";
		System.out.println("Your total marks is: " +totalmarks);
		System.out.println("The avrage is: " + avg);
		System.out.println("You have secure "+grade +" Grade");
		
	}
	else if(avg>60 && avg<=70) {
		grade="B";
		System.out.println("Your total marks is: " +totalmarks);
		System.out.println("The avrage is: " + avg);
		System.out.println("You have secure "+grade +" Grade");
		
	}
	else if(avg>50 && avg<=60) {
		grade="C+";
		System.out.println("Your total marks is: " +totalmarks);
		System.out.println("The avrage is: " + avg);
		System.out.println("You have secure "+grade +" Grade");
		
	}
	else if(avg>40 && avg<=50) {
		grade="C";
		System.out.println("Your total marks is: " +totalmarks);
		System.out.println("The avrage is: " + avg);
		System.out.println("You have secure "+grade +" Grade");
		
	}
	else if(avg>35 && avg<=40) {
		grade="D";
		System.out.println("Your total marks is: " +totalmarks);
		System.out.println("The avrage is: " + avg);
		System.out.println("You have secure "+grade +" Grade");
		
	}
	else {
		System.out.println("Your total marks is: " +totalmarks);
		System.out.println("Fail");
		
	}
	
}
   
   
}
