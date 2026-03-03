package structural.bridge;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
}
