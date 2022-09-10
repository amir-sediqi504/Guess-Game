public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int secretNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true){
            System.out.println("number to guess is " + secretNumber);
            guessPlayer1 = p1.number;
            guessPlayer2 = p2.number;
            guessPlayer3 = p3.number;
            p1.guess();
            System.out.println("Player one guessed" + guessPlayer1);
            p2.guess();
            System.out.println("Player two guessed" + guessPlayer2);
            p3.guess();
            System.out.println("Player three guessed" + guessPlayer3);




        }
    }
}
