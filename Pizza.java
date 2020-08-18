import java.util.Arrays;

public class Pizza
{
    // Attributes
    private int pizzaSize;
    private String cheeseType;
    private String[] toppings;
    private boolean isGarlicCrust;

    // Constructor
    public Pizza( int actualPizzaSize, String actualCheeseType, String[] actualToppings, boolean actualIsGarlicCrust )
    {
        pizzaSize = actualPizzaSize;
        cheeseType = actualCheeseType;
        toppings = actualToppings;
        isGarlicCrust = actualIsGarlicCrust;
    }

    // toString method. Prints out the pizza and its attributes
    public String toString()
    {
        if (isGarlicCrust)
        {
            return "The size of the pizza is " + pizzaSize + " inches\nThe cheese type is " + cheeseType + "\nThe toppings are " + Arrays.asList(toppings) + "\nThis pizza does have garlic crust";
        }
        else
        {
            return "The size of the pizza is " + pizzaSize + " inches\nThe cheese type is " + cheeseType + "\nThe toppings are " + Arrays.asList(toppings) + "\nThis pizza does not have garlic crust";
        }

    }
}