
public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");
        MenuItem item2 = new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a side of pizza sauce", 6.89, "appetizer");
        MenuItem item3 = new MenuItem("Gooey Butter Cake", "The ooiest, gooiest dessert this side of the Mississippi", 6.99, "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo", 6.39, "main course");
        MenuItem item5 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");

//        System.out.println(item1.isNew());

        System.out.println(item1);

        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        menu.removeItem(item4);

        System.out.println(menu);

        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");;

        System.out.println(item5.equals(item6));

        menu.addItem(item6);
        System.out.println(menu);

        menu.addItem(item1);
        System.out.println(menu);

    }
}
