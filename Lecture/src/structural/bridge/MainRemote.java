package structural.bridge;

public class MainRemote {
    public static void main(String[] args) {
        AdvancedRemote ar = new AdvancedRemote(new TV());
        ar.togglePower();
        for (int i = 0; i < 10; i++){
            ar.volumeUp();
        }
        ar.mute();
        ar.mute();

    }
}
