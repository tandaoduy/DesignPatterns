package behavioral.observer.ca2;

public class Activity implements ButtonListener{
    int count = 0;
    MyButton button;

    public Activity( MyButton button) {
        this.button = button;
        this.button.attach(this);
    }



    @Override
    public void onClick() {
        System.out.println("Bạn đã click lần thứ: " + (++count));

    }
}
