package designpattern.structuralpattern.proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private CommandExecutor commandExecutor;
    private boolean isAdmin;

    public CommandExecutorProxy(String user,String passwprd){
        if("admin".equals(user)&&"admin@123".equals(passwprd)){
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String command) throws Exception {
        if(isAdmin){
            commandExecutor.runCommand(command);
        } else if (command.trim().startsWith("rm")) {
            throw new Exception("rm command is not allowed for non-admin users.");
        }else {
            commandExecutor.runCommand(command);
        }
    }


}
