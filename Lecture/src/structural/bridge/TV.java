package structural.bridge;

public class TV implements Device{
    boolean state = false;
    int volume = 0;

    @Override
    public boolean isEnable() {
        return state;
    }

    @Override
    public void enable() {
        state = true;
        System.out.println("Mở TV");
    }

    @Override
    public void disable() {
        state = false;
        System.out.println("Tắt TV");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }
}
