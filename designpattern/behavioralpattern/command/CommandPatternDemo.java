package designpattern.behavioralpattern.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Application app = new Application(editor);

        // Set some text and selection in the editor
        editor.setText("Hello World");
        editor.setSelection("World");

        // Create and execute commands
        System.out.println("Original Text: " + editor.getText());

        // Copy Command
        Command copyCommand = new CopyCommand(app, editor);
        app.executeCommand(copyCommand);
        System.out.println("Clipboard after Copy: " + app.getClipboard());

        // Cut Command
        Command cutCommand = new CutCommand(app, editor);
        app.executeCommand(cutCommand);
        System.out.println("Text after Cut: " + editor.getText());

        // Paste Command
        Command pasteCommand = new PasteCommand(app, editor);
        app.executeCommand(pasteCommand);
        System.out.println("Text after Paste: " + editor.getText());

        // Undo Command
        Command undoCommand = new UndoCommand(app, editor);
        app.executeCommand(undoCommand);
        System.out.println("Text after Undo: " + editor.getText());
    }
}
