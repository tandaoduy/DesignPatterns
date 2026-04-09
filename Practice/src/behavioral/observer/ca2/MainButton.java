package behavioral.observer.ca2;

public class MainButton {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        Activity activity = new Activity(button);
        button.click();
        button.click();
        button.click();
        button.click();

    }
}
