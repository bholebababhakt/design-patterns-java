package designpattern.behavioralpattern.command;

public class UndoCommand extends Command{
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false; // Undo doesn't need to be saved in history
    }
}
