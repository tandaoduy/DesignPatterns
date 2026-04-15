package OnTap.singleton.bai4;

public class AppSetting {
    private String theme, language;
    private int fontSize;
    private static AppSetting instance;

    private AppSetting() {
    }

    public static AppSetting getInstance(){
        if (instance == null)
            instance = new AppSetting();
        return instance;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTheme(String theme) {
        if (theme.equals("Dark") || theme.equals("Light")){
            this.theme = theme;
        }
        else System.out.println("ERROR");
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getTheme() {
        return theme;
    }

    public String getLanguage() {
        return language;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void showConfig(){
        System.out.println("-- Cấu hình hiện tại là: Language: " + language + " FontSize: " + fontSize + " Theme: "+ theme);
    }
}
