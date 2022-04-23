package Core.Funtamental.DataTypes;

import java.util.Scanner;

public class BooleanType {
    public static void main(String[] args) {
        boolean isCorrect;
        isCorrect = true;
        System.out.println("Pergunta: O botafogo é preto e branco?");
        Scanner sc = new Scanner(System.in);
        isCorrect = sc.nextBoolean();
        if (isCorrect){
            System.out.println("Correto! Você é fooogooooo!!!!");
        } else {
            System.out.println("Errou!! Tente novamente!");
        }

    }
}
