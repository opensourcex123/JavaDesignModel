package testOne.command;

import testOne.command.concreteCommand.CopyCommand;
import testOne.command.concreteCommand.CreateCommand;
import testOne.command.concreteCommand.OpenCommand;
import testOne.command.concreteCommand.PasteCommand;
import testOne.command.interfaceCommand.EditCommand;
import testOne.command.interfaceCommand.FileCommand;
import testOne.command.invoker.EditMenu;
import testOne.command.invoker.FileMenu;
import testOne.command.receiver.BoardScreenCopy;
import testOne.command.receiver.BoardScreenCreate;
import testOne.command.receiver.BoardScreenOpen;
import testOne.command.receiver.BoardScreenPaste;

public class Test {
    public static void main(String[] args) {
        // 创建具体命令实现对象
        BoardScreenOpen boardScreenOpen = new BoardScreenOpen();
        BoardScreenCreate boardScreenCreate = new BoardScreenCreate();
        BoardScreenCopy boardScreenCopy = new BoardScreenCopy();
        BoardScreenPaste boardScreenPaste = new BoardScreenPaste();
        // 创建命令
        FileCommand fileCommand = new OpenCommand(boardScreenOpen);
        FileCommand fileCommand1 = new CreateCommand(boardScreenCreate);
        EditCommand editCommand = new CopyCommand(boardScreenCopy);
        EditCommand editCommand1 = new PasteCommand(boardScreenPaste);
        // 创建命令调用者
        FileMenu fileMenu = new FileMenu();
        EditMenu editMenu = new EditMenu();
        // 执行create命令
        fileMenu.setFileCommand(fileCommand1);
        fileMenu.startExecuteCommand();
        // 执行open命令
        fileMenu.setFileCommand(fileCommand);
        fileMenu.startExecuteCommand();
        // 执行copy命令
        editMenu.setEditCommand(editCommand);
        editMenu.startExecuteCommand();
        // 执行paste命令
        editMenu.setEditCommand(editCommand1);
        editMenu.startExecuteCommand();
    }
}
