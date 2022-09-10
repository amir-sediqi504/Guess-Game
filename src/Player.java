public class Player {
    int number = 0;

    public void guess(){
        number = (int) (Math.random() * 10); // Originally of type Double, cast to int
        System.out.println("I'm guessing number "+ number);
    }
}
