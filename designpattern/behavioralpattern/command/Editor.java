package designpattern.behavioralpattern.command;

public class Editor {
    private String text = "";
    private String selection = "";


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public void deleteSelection() {
        text = text.replace(selection, "");
        selection = "";
    }

    public void replaceSelection(String newText) {
        //just adding text
        text +=newText;
    }
}
