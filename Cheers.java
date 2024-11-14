// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        
        String word = args[0];
        int times = Integer.parseInt(args[1]);
        word = word.toUpperCase();
        String letters = "AEFHILMNORSX";
        String aan;


        for (int i = 0; i < word.length(); i ++){
                if (letters.indexOf(word.charAt(i)) != -1){
                        aan = "an";
                }
                else {
                       aan = "a    "; 
                }
                System.out.println((String)"Give me " + aan + " " + word.charAt(i) + ": " + word.charAt(i) + "!");

        }
        System.out.println((String)"What does that spell?");
        if (times == 0){
                System.out.println(word + "!!!");
        }
        for (int i = 0; i < times; i ++){
                System.out.println(word + "!!!");
        }
                // {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R','S', 'X'}
                // java Cheers.java RUNI 5

        }
}
