public class GuessinGame {
    public static void main(String[] args) {

                int secretNumber = 10;
                int usersGuess = 16;

                if (usersGuess == secretNumber) {
                    System.out.println("guess is correct");
                } else {
                    if (usersGuess > secretNumber){
                        System.out.println("guess is too high");
                    } else {
                        if (usersGuess < secretNumber){
                            System.out.println("guess is too low");
                        }
                    }
                }


            }
        }



