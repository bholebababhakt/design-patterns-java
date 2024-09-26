package designpattern.behavioralpattern.command;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();
    public void push(Command command){
        history.push(command);
    }
    public Command pop(){
        if(!history.empty()) {
            return history.pop();
        }
        return null;
    }
}
