package testOne.command.invoker;

import testOne.command.interfaceCommand.EditCommand;

// EditCommand抽象命令的调用者
public class EditMenu {
    private EditCommand editCommand;

    public void setEditCommand(EditCommand editCommand) {
        this.editCommand = editCommand;
    }

    public void startExecuteCommand() {
        editCommand.execute();
    }
}
