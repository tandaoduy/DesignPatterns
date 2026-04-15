package OnTap.singleton.bai2;

public class Module {
    private String moduleName;

    public Module(String moduleName) {
        this.moduleName = moduleName;
    }
    public void operation(String task){
        Logger lg = Logger.getInstance();
        lg.log(moduleName + " thực hiện công việc:  " + task);

    }
}
