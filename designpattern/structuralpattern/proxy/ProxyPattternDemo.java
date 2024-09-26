package designpattern.structuralpattern.proxy;

public class ProxyPattternDemo {
    public static void main(String[] args) {
        CommandExecutor adminExecutor = new CommandExecutorProxy("admin","admin@123");
        CommandExecutor userExecutor = new CommandExecutorProxy("user","user123");
        try {
            adminExecutor.runCommand("ls -ltr");
            adminExecutor.runCommand("rm -rf text.txt");

            userExecutor.runCommand("cd /home");
            userExecutor.runCommand("rm -rf nitin.java");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
