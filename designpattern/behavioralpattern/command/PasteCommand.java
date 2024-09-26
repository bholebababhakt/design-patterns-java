package designpattern.behavioralpattern.command;

public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();// Save state before making changes
        editor.replaceSelection(app.getClipboard());
        return true; // Changes editor state, so it's saved in history
    }
}
