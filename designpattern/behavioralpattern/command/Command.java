package designpattern.behavioralpattern.command;

// The base command class defines the common interface for all concrete commands.
public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    // Make a backup of the editor's state.
    public void saveBackup() {
        backup = editor.getText();
    }

    // Restore the editor's state.
    public void undo() {
        editor.setText(backup);
    }

    // Abstract method to force all concrete commands to provide their own implementations.
    public abstract boolean execute();

}
