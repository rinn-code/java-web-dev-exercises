package studios.restaurant;


public class Restaurant {
    public static void main(String[] args) {
        MenuItem wings = new MenuItem("Appetizer", "chicken parts", 3.99, false, "wings");
        MenuItem bread = new MenuItem("Appetizer", "hot dough", 5.99, false, "bread");
        MenuItem pasta = new MenuItem("Entree", "wet dough", 6.99, false, "pasta");
        MenuItem steak = new MenuItem("Entree", "cow parts", 700.99, true, "steak");
        MenuItem tiramisu = new MenuItem("Dessert", "cake with coffee", 6.79, false, "tiramisu");
        MenuItem gelato = new MenuItem("Dessert", "basically ice cream", 5.99, false, "gelato");


        Menu menu = new Menu();
          menu.addMenuItem(wings);
          menu.addMenuItem(bread);
          menu.addMenuItem(pasta);
          menu.addMenuItem(steak);
          menu.addMenuItem(tiramisu);
          menu.addMenuItem(gelato);

        for (MenuItem item: menu.getMenuItems()) {
            System.out.println(item.getName());
        }
        menu.setLastUpdated();
        System.out.println(menu.getLastUpdated());

        menu.printMenuItem(steak);
        //menu.printMenu(menu.getMenuItems());

       // menu.removeMenuItem(steak);

    }

}
