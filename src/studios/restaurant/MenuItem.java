package studios.restaurant;

public class MenuItem {

       private String mealCategories;
       private String description;
       private Double price;
       private Boolean isNew;
       private String name;


    public MenuItem(String mealCategories, String description, Double price, Boolean isNew, String name) {
            this.mealCategories = mealCategories;
            this.description = description;
            this.price = price;
            this.isNew = true;
            this.name = name;
        }
    public String getName() {
        return name;
        }
    public String getDescription() {
        return description;
    }
    public Double getPrice() {
        return price;
    }
    public Boolean getIsNew() {
        return isNew;
    }
    public String getMealCategories() {
        return mealCategories;
    }

}
