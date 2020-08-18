import java.util.Random;

public class PizzaTester
{

    static Random random = new Random();

    public static void main(final String[] args)
    {
        createPizza(determinePizzaSize(), chooseCheeseType(), chooseToppings(), isCrustGarlicky());
    }

    public static int determinePizzaSize()
    {
        // Choose a random value from a range of typical pizza sizes
        final int pizzaSize = random.nextInt(11) + 8;
        return pizzaSize;
    }

    public static String chooseCheeseType()
    {
        // Pick a cheese type from a list and return it
        final String[] pizzaCheeses = {"Mozzarella", "Cheddar", "Provolone", "Aged Havarti"};
        final String cheeseType = pizzaCheeses[random.nextInt(pizzaCheeses.length)];
        return cheeseType;
    }

    public static String[] chooseToppings()
    {
        // Create a list of toppings and intialize a list for the actual toppings that end up on the pizza
        final String[] toppings = {"Sausage", "Pepperoni", "Mushrooms", "Onions", "Black Olives", "Red Pepper", "Green Pepper"};
        final String finalToppings[] = new String[3];

        
        // Loop through the actual toppings array and add some random ones from our list of toppings
        for (int i = 0; i < finalToppings.length; i++)
        {
            final int randomIndex = random.nextInt(toppings.length);
            finalToppings[i] = toppings[randomIndex];
        }

        return finalToppings;
    }

    public static boolean isCrustGarlicky()
    {
        // Decide through 50-50 chance if it has garlic crust or not
        boolean isGarlicCrust;
        if (random.nextInt(2) == 0)
        {
            isGarlicCrust = true;
        }
        else
        {
            isGarlicCrust = false;
        }
        return isGarlicCrust;
    }

    public static void createPizza(final int pizzaSize, final String cheeseType, final String[] toppings, final boolean isGarlicCrust)
    {
        final Pizza myPizza = new Pizza( pizzaSize, cheeseType, toppings, isGarlicCrust  );

        System.out.println(myPizza.toString());
    }
}