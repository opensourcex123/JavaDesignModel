package testOne.command.concreteCommand;

import testOne.command.interfaceCommand.FileCommand;
import testOne.command.receiver.BoardScreenCreate;
import testOne.command.receiver.BoardScreenOpen;

// 具体的命令实现类，create命令实现文件命令接口
public class CreateCommand implements FileCommand {
    BoardScreenCreate boardScreenCreate;

    public CreateCommand(BoardScreenCreate boardScreenCreate) {
        this.boardScreenCreate = boardScreenCreate;
    }
    public void execute() {
        boardScreenCreate.create();
    }
}
