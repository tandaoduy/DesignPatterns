package behavioral.observer.ca2;

public class MyButton{
    ButtonListener activity;
    public  void attach(ButtonListener activity){
        this.activity = activity;
    }
    public void click(){
        if (activity != null){
            activity.onClick();
        }
    }
}
