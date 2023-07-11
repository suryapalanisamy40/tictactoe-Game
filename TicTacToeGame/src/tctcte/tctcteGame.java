package tctcte;

import java.util.Scanner;

public class tctcteGame {
	private char arr[][];
	 private int user=0,row=-1,colum=-1;
	 Scanner scanf=new Scanner(System.in);
	 //variable declaration
	 
	 tctcteGame(char a[][]){
		 arr=a;
	 }
	 //Constructor declaration
	 
	 void tictoctoe()
	 {
		
		while(user != 7)
		{
		display();
		if(user%2==0)
		{	
			user('O');
			
		}
		//-------------O user --------------------------------
		else 
		{
			user('X');
		}
		//-------------X user --------------------------------
		 user++;
		 if('O' == check()) { System.out.println("CONGRATULATION  O -> WINNER");break;}
			if('X' == check()) { System.out.println("CONGRATULATION  X -> WINNER"); break;}	
		}//while close
		if(user == 7)
			System.out.println("MATCH DRAW");
	}//titatoGame method close
	 
	 
	 
	 void display()
	 {
		 
		 for(int i=0;i<arr.length;i++)
			{
			 System.out.print("\t");
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+"  ");
				}
				System.out.println();
			}
		 System.out.println();
	 }
	 
	 
	 void user(char ch)
	 {
		 System.out.print(ch+" -> Enter position: ");
			String val=scanf.nextLine();
			val=val.replaceAll("\\s", "");
			if(val.length()==2)
			{
			row=Integer.parseInt(Character.toString(val.charAt(0)));	
			colum=Integer.parseInt(Character.toString(val.charAt(1)));	
			if(row < arr.length && colum < arr.length)
			{
				if(arr[row][colum]=='_')
				{
					arr[row][colum]=ch;
					
				
				}
				
				else{ user--; System.out.println("Already Stored "+arr[row][colum]+" User ");}
			}
			else { 
				System.out.println("User "+ch+" -> please give a valid position \nrow,column -> 0 to 2"); --user;
				}
			}
			else
			{
				System.out.println("User "+ch+" -> please give a valid position"); --user;
			}	
	 }// user method close
	 char check()
	 {
		 char ch;
		 boolean val=false;
		 for(int i=0;i<arr.length;i++)
		 {
			  ch=arr[i][0];
			 for(int j=1;j<arr[i].length;j++)
			 {
				 if(ch == arr[i][j] && ch != '_')
					 val=true;
				 else
				 {val=false; break;}
			 }
			 if(true==val)
				 return ch;
		 }
		 // ->
		for(int i=0;i<arr.length;i++)
		 {
			  ch=arr[0][i];
			 for(int j=1;j<arr[i].length;j++)
			 {
				 if(ch == arr[j][i] && ch != '_')
					 val=true;
				 else
				 {val=false; break;}
			 }
			 if(true==val)
				 return ch;
		 }
		// ^
		// |
		ch=arr[0][0];
		for(int i=1;i<arr.length;i++)
		{
			if(ch==arr[i][i])
				val=true;
			else
			{val=false;break;}
		}
		if(val==true)
			return ch;
		//  \
		int i=0,j=2;
		ch=arr[i][j];
		while(i!=2)
		{
			++i;
			--j;
		   if(ch==arr[i][j])
			val=true;
		   else
	     	{val=false;break;}
		}
		if(val==true)
			return ch;
		// /
		return 'N';
		
	 }
}


