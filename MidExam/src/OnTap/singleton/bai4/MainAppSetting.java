package OnTap.singleton.bai4;

public class MainAppSetting {
    public static void main(String[] args) {
        AppSetting as = AppSetting.getInstance();
        System.out.println("Cấu hình ban dầu là");
        as.setFontSize(20);
        as.setLanguage("Tiếng việt");
        as.setTheme("Light");
        as.showConfig();

        AppSetting home = AppSetting.getInstance();
        AppSetting setting = AppSetting.getInstance();

        setting.setLanguage("Tiếng anh");
        setting.setFontSize(25);
        setting.setTheme("Dark");

        System.out.println(home.getFontSize());
        System.out.println(home.getLanguage());
        System.out.println(home.getTheme());
        System.out.println(setting.getTheme());


    }
}
