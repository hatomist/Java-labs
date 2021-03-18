public class ItemNotFoundException extends RuntimeException {
    ItemNotFoundException() {
        super("Нет таких поездов!");
    }

    ItemNotFoundException(String message) {
        super(message);
    }
}
