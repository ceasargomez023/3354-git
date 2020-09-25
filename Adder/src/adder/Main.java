package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide at least two integers");
        }
    }

    private static int addArguments(String[] args) {
	int sum = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
	for(int i = 2; i < args.length; i++)	//Create for loop to loop for at least two arguments
		sum += Integer.valueOf(args[0]);
		return sum;

    }
}
