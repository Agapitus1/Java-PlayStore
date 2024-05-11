# JavaPlayStore

# Part A – Customer and Game Classes

This week we are starting a new project that simulates a software program for an online game store.  The program has to keep track of customer information, game information and purchases.  Two of the classes are: Customer and Game.

Create a NEW PROJECT called week5 on your network drive.
 
Create a new class for Customer.
1.	Include the following:
-	Customer attributes: must have name, credit (so they can buy games), what else?
-	Customer constructor (with parameters): must have parameters to initialise attributes, how many?

2.	Now add some accessor and mutator methods so that the class can share and change their attribute values:
-	Customer accessors e.g. public String getName()
-	Customer mutators e.g. public void setName(String theName)

Now create a new class for Game. 
3.	Include the following:
-	Game attributes: must have price, isAvailable (use boolean), what else?
-	Game constructor (with parameters): must have parameters to initialise attributes, how many?

4.	Now add some accessor and mutator methods so that the class can share and change their attribute values:
-	Game accessors e.g. public boolean getIsAvailable()
-	Game mutators e.g. public void setIsAvailable(boolean theIsAv)


 
# Part B – Create a Test Class Called PlayzStore 

1. Add a class to the week5 project for PlayzStore. This class will have 1 customer attribute and 2 game attributes. It will also have an attribute that is a constant that you must initialise. See below:

public class PlayzStore
{
	private Customer customerOne;
	private Game gameOne;
	private Game gameTwo;
	private final String STORE_NAME = “Enter a name here”

	public PlayzStore()
	{
		// What should the body of the constructor do?
		customerOne = new Customer(enter arguments here);
	}
}

2. Add code to the constructor body – what should it do?

3. Run the PlayzStore by right-clicking and calling the Constructor
 
4. Now inspect the PlayzStore class by right clicking on the red object box, and selecting Inspect:

 
You should see the attributes initialised (your constructor must do this !!!) – arrows indicate that the objects are created for the Customer and two Games:

 

# Part C – Enable Purchasing of Games

1. Add a method to the Customer class that enables a customer to purchase a game. Use this header:

public void purchase(Game theGame)
{
}

2. Create some PSEUDOCODE as a comment in the purchase method to do the following:
-	A customer can only buy a game if they have enough money
-	The game must be available to purchase
-	If the game is purchased, it becomes ‘unavailable’ and the price of the game is deducted from the amount of credit a customer has. 
-	Display a message informing the user if the purchase was successful or not.

3. Now translate your PSEUDOCODE for purchase() into Java code. Remember:
- Use if statements when checking something in the code
- Order the code so that it executes things in the right sequence

 
4. In the PlayzStore constructor:
- Display a message that contains the store name.
- Call purchase() for the customer e.g. for a customer object called jo, use
jo.purchase(??);  // What needs to go in the brackets?


5. Test your program by creating a new PlayzStore (right click on the class and select the constructor).  While the program is still running right click on the object (red box) and select Inspect.  Make sure the customer now has less credit that when the program started. 


6. Re-test your program by reducing the amount of money your customer has so they cannot afford to buy a game (credit should be the same in the Inspect window).
