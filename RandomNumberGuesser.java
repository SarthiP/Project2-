import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
	
Scanner keyboard = new Scanner(System.in);
int randNum, nextGuess, highGuess, lowGuess,p=0;
System.out.println("Welcome To Random Number Guesser!");
do
{
RNG.resetCount();

randNum= RNG.rand();

highGuess=100;

lowGuess=1;

System.out.println("We have generated a random number between 1 and 100 and you have to guess it!");
do
{
    System.out.println("Enter your guess: ");
    
    nextGuess=keyboard.nextInt();
    
    if(RNG.inputValidation(nextGuess, lowGuess, highGuess))
    {
        if(nextGuess<=randNum && (randNum-nextGuess)<(randNum-lowGuess))
        {
            lowGuess=nextGuess;
        }
        if(nextGuess>=randNum && (nextGuess-randNum)<(highGuess-randNum))
        {
            highGuess=nextGuess;
        }
    }
}while(nextGuess!=randNum);

System.out.println("You guessed the correct number in "+RNG.getCount()+" tries!");
System.out.println("Press 1 to try again, 2 to exit...");

p=nextGuess=keyboard.nextInt();

}while(p==1);

}



	}


