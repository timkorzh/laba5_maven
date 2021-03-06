package com.company.commands;

import com.company.collection_manage.CollectionManagement;
import com.company.work_client.InputDevice;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterBySemCommand extends AbstractCommand {

    CollectionManagement collectionManagement;
    public FilterBySemCommand(CollectionManagement collectionManagement) {
        this.collectionManagement = collectionManagement;
        }
        @Override
        public void execute(String CommandArgs) {
            InputDevice device = new InputDevice();
            int FBS;

            if(CommandArgs == null) {
                try {
                    FBS = device.ReadFilterSem();
                } catch (InputMismatchException Ex) {
                    System.out.println("Введите число");
                    return;
                }
            }
            else {
                Pattern p = Pattern.compile("-sem (\\d+?)( -|$)");
                Matcher m = p.matcher(CommandArgs);
                if (m.find()) {
                    FBS = Integer.parseInt(m.group(1));
                }
                else {
                    System.out.println("Ожидалось число");
                    return;
                    }
            }
        device.filterBySem(collectionManagement, FBS);

    }

        @Override
        public String describe() {
            return ("Выводит элементы, значение поля semesterEnum которых равно заданному");
        }
    }
