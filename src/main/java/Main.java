import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int count=0, guess, previousguess=-1, number = random.nextInt(0,10);
        while (true){
            System.out.println("Enter a guess (from 0 to 10):");
            guess = scan.nextInt();
            if (guess == previousguess) {
                System.out.println("Try a different number!");
                continue;
            }
            else if (guess == number){
                count++;
                System.out.println("Congratulation! You guessed the number in " + count +" tries.");
                scan.close();
                break;
            }
            else if (guess < number){
                System.out.println("Your guess is too small.");
            }
            else if (guess > number) {
                System.out.println("Your guess is too large.");
            }
            count++;
            previousguess=guess;
        }
    }
}
