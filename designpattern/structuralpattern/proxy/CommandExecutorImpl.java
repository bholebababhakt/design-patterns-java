package designpattern.structuralpattern.proxy;

// Real implementation of CommandExecutor
public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String command) throws Exception {
        System.out.println("Executing command: "+ command);
    }
}
