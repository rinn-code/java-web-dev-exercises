package studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
public class Menu {

    private final ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;
    private String name;

    public void addMenuItem(MenuItem item) {this.menuItems.add(item);}
    public ArrayList<MenuItem> getMenuItems() {return menuItems;}
    public LocalDate getLastUpdated() {return lastUpdated; }
    public void setLastUpdated() {this.lastUpdated = LocalDate.now();}
    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }
    public void printMenuItem (MenuItem item) {
        System.out.println(item.getName());
        System.out.println(item.getMealCategories());
        System.out.println(item.getDescription());
        System.out.println(item.getPrice());
    }
    
}
