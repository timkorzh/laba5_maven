package com.company.commands;

import com.company.collection_manage.CollectionManagement;
import com.company.work_client.InputDevice;

public class AddCommand extends AbstractCommand {
    private final CollectionManagement collectionManagement;
    InputDevice device = new InputDevice();

    public AddCommand(CollectionManagement collectionManagement) {
        this.collectionManagement = collectionManagement;
    }
    @Override
    public void execute(String CommandArgs) {

        if (CommandArgs == null) {
            collectionManagement.add();
        }
       else {
           collectionManagement.add(CommandArgs);
        }

    }

    @Override
    public String describe() {
        return ("Добавляет новый элемент в коллекцию." + device.GetScriptName() + "\n Чтобы выйти из команды в режиме построчного ввода, напишите: exitcmd");
    }

}
