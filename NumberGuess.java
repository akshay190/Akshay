import java.util.*;

public class NumberGuess{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	int random=(int)(Math.random()*1000+1);
	System.out.println("You Guess a NUMBER between 1 to 1000 ");
	Boolean x=false;
	for(int i=10;i>0;i--){
		System.out.println("You Have Total "+i+" Guess Remaing");
		System.out.println("Enter a guess NUMBER   ???");
		int guess=sc.nextInt();
		if(guess>random){
		System.out.println("Number is lesser then "+guess);
		}
		else if(guess<random)
		{
			System.out.println("Number is Greater then "+guess);
		}
		else {
			x=true;
			break;
		}
	}
	if(x)
	{
		System.out.println(" Congrulations!!!, You Win Number Guess Game");
	}
	else{
		System.out.println(" OOH, You Will Win Next Time \n You Loose Game \n  number  is  "+random);
	}

	
}
}