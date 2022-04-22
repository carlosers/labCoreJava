package Core.Funtamental.Comments;

/**
 * that class present one message of the greetings of the user
 * @version 1.01 2022-04-22
 * @author Carlos Santiago
 */
public class Welcome {
    // Create constant
    private static final String GREETINGS = "Bem vindo ao Adverso!";
    /* Method main
        necessary for run program
     */
    public static void main(String[] args) {
        System.out.println(GREETINGS);
        char syb = '='; //create symbol for underline message, is used single quote
        int  szG = GREETINGS.length(); // get size message
        for (int i = 0; i<szG; i++){
            System.out.print(syb); // print symbol under messge widthout line form
        }
    }
}
