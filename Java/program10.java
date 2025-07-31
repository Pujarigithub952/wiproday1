package assignment;

public class program10 {
	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Please enter the number of eggs as a command line argument.");
	            return;
	        }

	        int eggs = Integer.parseInt(args[0]);

	        int gross = eggs / 144;
	        int remainingAfterGross = eggs % 144;

	        int dozen = remainingAfterGross / 12;
	        int leftover = remainingAfterGross % 12;
	        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftover);
	    }
	}



