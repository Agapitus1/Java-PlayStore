public class PlayzStore
{
    private Customer customerOne;
    private Game gameOne;
    private Game gameTwo;
    private final String STORE_NAME = "Punten Store";

    public PlayzStore()
    {
        customerOne = new Customer("Lontong", "Homeless", "Homeless.Lontong@gmail.com", "21-12-2012", 100.00, "");
        gameOne = new Game(19.99, true, "Pri Payer", "KNTG", "FPS", "LOW");
        gameTwo = new Game(99.99, false, "Cabcay", "MKNN", "RPG", "HIGH");

        customerOne.purchase(gameOne);
        customerOne.purchase(gameTwo);
    }
}