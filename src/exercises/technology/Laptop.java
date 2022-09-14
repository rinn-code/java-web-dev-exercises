package exercises.technology;

public class Laptop  extends Computer{
    private boolean hasFullSizeKeyboard;

    public boolean isHasFullSizeKeyboard() {
        return hasFullSizeKeyboard;
    }

    public Laptop(int storage, int ram, String brand, boolean hasFullSizeKeyboard) {
        super(storage,ram, brand);
        this.hasFullSizeKeyboard = hasFullSizeKeyboard;

    }


}
