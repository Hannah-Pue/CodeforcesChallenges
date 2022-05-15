import java.util.*;

public class SoftDrinking
{
	public static void main(String[] args){
        calculateNumberOfToasts(getInput());
	}
    public static int[] getInput(){
        Scanner scan = new Scanner(System.in);
		int i = 8;
		int inputList[]=new int[1000];
		String input[]= scan.nextLine().split(" ");

		for(i =0 ;i < input.length;i++){
		 inputList[i]= Integer.parseInt(input[i]);
		}

        return inputList;
    }
    public static void calculateNumberOfToasts(int[] inputList){
        int n = inputList[0]; // n friends
        int k = inputList[1]; // k bottles
        int l = inputList[2]; // l ml of drink in one bottle
        int c = inputList[3]; // c limes
        int d = inputList[4]; // d slices for each lime
        int p = inputList[5]; // p grams of salt
        int nl = inputList[6]; // nl ml of drink needed
        int np = inputList[7]; // np grams of salt needed
        // one slice needed always
        
        int mlOfDrink = k * l;
        int drinkSplit = (mlOfDrink / nl) / n;
        int limesProvided = (c * d) / n;
        int saltSplit = (p / np)/n;

        int[] toast = {drinkSplit, limesProvided, saltSplit};
        Arrays.sort(toast);

        System.out.println(toast[0]);
    }
}