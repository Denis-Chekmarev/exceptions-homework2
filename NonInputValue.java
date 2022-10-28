public class NonInputValue extends Exception {
    
    public NonInputValue(String message) {
        super(message);
    }

    public NonInputValue() {
        super("Нет значения");
    }
}
