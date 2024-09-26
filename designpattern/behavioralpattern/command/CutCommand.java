package designpattern.behavioralpattern.command;

// Concrete Command: Cut Command
public class CutCommand extends Command {

    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup(); // Save state before making changes
        app.setClipboard(editor.getSelection());
        editor.deleteSelection(); // Changes editor state, so it's saved in history
        return true;
    }
}
