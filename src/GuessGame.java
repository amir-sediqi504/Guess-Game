public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

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
            p1.guess();
            System.out.println("Player one guessed" + guessPlayer1);
            guessPlayer2 = p2.number;
            p2.guess();
            System.out.println("Player two guessed" + guessPlayer2);
            guessPlayer3 = p3.number;
            p3.guess();
            System.out.println("Player three guessed" + guessPlayer3);




            if (guessPlayer1 == secretNumber){
                p1isRight = true;
            }
            if (guessPlayer2 == secretNumber){
                p2isRight = true;
            }
            if (guessPlayer3 == secretNumber){
                p3isRight = true;
            }

            if (p1isRight|| p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over");
                break;
            } else {
                System.out.println("No one guessed correctly, try again");
            }
        }
    }
}
