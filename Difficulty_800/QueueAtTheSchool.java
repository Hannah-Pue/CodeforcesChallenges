import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class QueueAtTheSchool {
    public static void main(String[] args){
        queue();
    }
    public static void queue(){
        //Input 1
        Scanner scan = new Scanner(System.in);
        int i = 2;
        int inputListOne[]=new int[i];
        String inputOne[]= scan.nextLine().split(" ");

        for(i=0 ;i < inputOne.length;i++){
         inputListOne[i]= Integer.parseInt(inputOne[i]);
        }
        int n = inputListOne[0];
        int time = inputListOne[1];
        
        //Input 2
        while(true){
            String queueBG = scan.nextLine();
            if(queueBG.length() != n){
                System.out.println("Bitte gib " + n + " Buchstaben ein");
            }
            else{
                List<Character> charList = queueBG.chars().mapToObj(e->(char)e).collect(Collectors.toList());

                for(int j=0; j<time; j++){
                    for(int x=0; x<n; x++){
                        if(x != n-1 && charList.get(x) == 'B' && charList.get(x+1) != 'B'){
                            char temp = charList.get(x);
                            charList.set(x, charList.get(x+1));
                            charList.set(x+1, temp);
                            x++;
                        }
                    }
                }
                String string = charList.stream().map(String::valueOf).collect(Collectors.joining());
                System.out.println(string);
                break; 
            }
        }
    }
}
