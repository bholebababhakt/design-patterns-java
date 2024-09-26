package designpattern.behavioralpattern.command;

// The application class acts as the invoker.
public class Application {
    private String clipboard;
    private Editor editor;
    private CommandHistory commandHistory;

    public Application(Editor editor) {
        this.editor = editor;
        this.commandHistory = new CommandHistory();
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void executeCommand(Command command){
        if(command.execute()){
            commandHistory.push(command); // Save command to history if it modifies the editor state
        }
    }

    public void undo() {
        Command lastCommand = commandHistory.pop();
        if(lastCommand!=null)
            lastCommand.undo();
    }
}
