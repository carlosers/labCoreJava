package Core.Funtamental.SimpleProgram;

public class Welcome {
    private static final String GREETINGS = "Bem vindo ao Adverso!";
    public static void main(String[] args) {
        System.out.println(GREETINGS);
        char syb = '=';
        int  szG = GREETINGS.length();
        for (int i = 0; i<szG; i++){
            System.out.print(syb);
        }
    }
}
