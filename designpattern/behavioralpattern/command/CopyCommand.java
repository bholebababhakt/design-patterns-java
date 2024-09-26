package designpattern.behavioralpattern.command;

// Concrete Command: Copy Command
public class CopyCommand extends Command{
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.setClipboard(editor.getSelection());
        return false; // No need to save in history since it doesn't change editor's state.
    }
}
