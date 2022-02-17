import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args)
	{
		String YesOrNo;
		do { 
		Scanner newInput= new Scanner(System.in);
		System.out.println("Enter the name of a movie");
		System.out.println( "Enter the rating of the movie");
		System.out.println("Enter the number of tickets sold for this movie");
		Movie newMovie = new Movie(newInput.nextLine(),newInput.nextLine(),newInput.nextInt());
		
			 {
				
			
			newMovie.getTitle();
			newMovie.getRating();
			newMovie.getSoldTickets();
			System.out.println(newMovie.toString());
			 }
			 Scanner YorN= new Scanner(System.in);
			System.out.println("Do you want to input another movie?(y or n)");
			 YesOrNo=YorN.nextLine();
		}while(YesOrNo.equals ("y"));

	}	
}
		/*Movie newMovie = new Movie(setTitle.nextLine(),setRating.nextLine(),setSoldTickets.nextLin());
		Scanner setTitle = new Scanner(System.in);
		Scanner setRating = new Scanner(System.in);
		Scanner setSoldTickets = new Scanner(System.in);
		Scanner YesOrNo = new Scanner(System.in);
		
		System.out.println("Enter the name of a movie");	
		String getTitle = setTitle.nextLine();
		
		System.out.println( "Enter the rating of the movie");
		String getRating = setRating.nextLine();
		
		System.out.println("\n Enter the number of tickets sold for this movie \n ");
		int getSoldTickets=setSoldTickets.nextInt();
		System.out.newMovie.toString();
		
		System.out.println("Do you want to enter another movie?");
		char yesorno;
		yesorno = YesOrNo.nextChar();
		} while(yesorno == 'y');*/
	  
		
	
	


