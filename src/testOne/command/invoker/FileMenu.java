package testOne.command.invoker;

import testOne.command.interfaceCommand.FileCommand;

// FileCommand抽象命令的调用者
public class FileMenu {
    private FileCommand fileCommand;

    public void setFileCommand(FileCommand fileCommand) {
        this.fileCommand = fileCommand;
    }

    public void startExecuteCommand() {
        fileCommand.execute();
    }
}
