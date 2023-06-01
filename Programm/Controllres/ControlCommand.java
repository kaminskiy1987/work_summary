package Programm.Controllres;



import java.util.List;

import Programm.Views.View;

public class ControlCommand {
    View view = new View();

    public String[] addCommands(List<String[]> data, List<String[]> commandsFile) {
        String[] listCommands = new String[2];
        int numberEntry = view.selectEntryNumber(data);

        if (numberEntry != 0) {
            view.showEntryOne(data.get(numberEntry - 1), commandsFile, numberEntry);
            listCommands[0] = String.valueOf(numberEntry);
            listCommands[1] = view.runCommand();
        }

        return listCommands;
    }
}