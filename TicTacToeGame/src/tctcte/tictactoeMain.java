package tctcte;

public class tictactoeMain {

	public static void main(String[] args) {

		char arr[][]={ {'_','_','_'},
				       {'_','_','_'},
			           {'_','_','_'} };
		tctcteGame obj=new tctcteGame(arr);
	   obj.tictoctoe();
	   obj.display();
	   System.out.println("----------GAME END-----------");
	   
	}

}
