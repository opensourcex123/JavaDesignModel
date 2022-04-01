package testOne.command.concreteCommand;

import testOne.command.interfaceCommand.EditCommand;
import testOne.command.receiver.BoardScreenCopy;
import testOne.command.receiver.BoardScreenPaste;

// 具体的命令实现类，paste命令实现文件命令接口
public class PasteCommand implements EditCommand {
    BoardScreenPaste boardScreenPaste;

    public PasteCommand(BoardScreenPaste boardScreenPaste) {
        this.boardScreenPaste = boardScreenPaste;
    }
    public void execute() {
        boardScreenPaste.paste();
    }
}
