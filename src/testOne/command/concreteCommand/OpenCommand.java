package testOne.command.concreteCommand;

import testOne.command.receiver.BoardScreenOpen;
import testOne.command.interfaceCommand.FileCommand;

// 具体的命令实现类，open命令实现文件命令接口
public class OpenCommand implements FileCommand {
    BoardScreenOpen boardScreenOpen;

    public OpenCommand(BoardScreenOpen boardScreenOpen) {
        this.boardScreenOpen = boardScreenOpen;
    }
    public void execute() {
        boardScreenOpen.open();
    }
}
