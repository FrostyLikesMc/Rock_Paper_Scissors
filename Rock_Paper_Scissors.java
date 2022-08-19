import java.util.*;
public class Rock_Paper_Scissors 
{
	public static void main(String args[])
	{
	    Scanner in = new Scanner (System.in);
		String rock= "rock", paper= "paper", scissors="scissors",choice;
		System.out.println("how mant times do you want to play");
		int n=0,i, max=3,min=1,cs=0,ms=0,range=max-min+1;
		n=in.nextInt();
		for (i=1;i<=n;i++)
		{
        System.out.println("Enter Choice");
		choice= in.next();
		int a=0;
		if (choice.compareTo(rock)==0)
	    a=1;
	    else if (choice.compareTo(paper)==0)
	    a=2;
	    else if(choice.compareTo(scissors)==0)
	    a=3;
	    else if(choice!=rock && choice!=paper && choice!=scissors)
	    System.out.println("bruh");
		int rand = (int)(Math.random()*range)+min;
		if(a==1)
		System.out.println("Player's choice= Rock");
		else if(a==2)
			System.out.println("Player's choice= paper");
		if(a==3)
			System.out.println("Player's choice= Scissors");
		if(rand==1)
			System.out.println("Computer's choice= Rock");
			else if(rand==2)
				System.out.println("Computer's choice= paper");
			if(rand==3)
				System.out.println("Computer's choice= Scissors");
        if (a==1 && rand==2)
		{
			cs=cs+1;
		}
		else if(a==1 && rand==3)
		{
			ms=ms+1;
		}
		else if(a==2 && rand==1)
		{
			ms=ms+1;
		}
		else if(a==2 && rand==3)
		{
			cs=cs+1;
		}
		else if(a==3 && rand==1)
		{
			cs=cs+1;
		}
		else if(a==3 && rand==2)
		{
			ms=ms+1;
		}  
		System.out.println("Computer Score="+cs);
		System.out.println("Player Score="+ms);
	}
		if (ms>cs)
			System.out.println("gg");
		else
			System.out.println("you lost");
}
}
