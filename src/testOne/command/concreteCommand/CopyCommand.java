package testOne.command.concreteCommand;

import testOne.command.interfaceCommand.EditCommand;
import testOne.command.receiver.BoardScreenCopy;
import testOne.command.receiver.BoardScreenCreate;

// 具体的命令实现类，copy命令实现文件命令接口
public class CopyCommand implements EditCommand {
    BoardScreenCopy boardScreenCopy;

    public CopyCommand(BoardScreenCopy boardScreenCopy) {
        this.boardScreenCopy = boardScreenCopy;
    }
    public void execute() {
        boardScreenCopy.copy();
    }
}
