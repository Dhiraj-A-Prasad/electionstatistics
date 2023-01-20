import java.util.Scanner;

public class Main
{
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        final int SIZE = 2;
        int[] votes = new int[SIZE];
        String[] names = new String[SIZE];

        for (int i = 0; i < names.length && i < votes.length; i++){
            System.out.print("Enter candidate's name: ");
            names[i] = userInput.next( );
            System.out.print("Enter number of votes: ");
            votes[i] = userInput.nextInt( );
        }

        System.out.println("And the Winner is: " + highest(votes,names));
    }


    public static String highest(int[] votes,String names[]){
    int high = votes[1];
    String s= names[0];
    for (int i = 1; i < votes.length; i++){
        if (votes[i] > high){
            high = votes[i];
            s=names[i];
        }
    }
    s=s+""+high;
    return s;
}
}
