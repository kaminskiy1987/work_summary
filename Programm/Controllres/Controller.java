package Programm.Controllres;



import Programm.Views.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    View view = new View();
    ControlAnimalsCreate controlAnimalsCreate = new ControlAnimalsCreate();
    ControlCommand controlCommand = new ControlCommand();
    DataBase dataBase = new DataBase();

    public void runAlgorithm() {
        while (true) {
            view.showMenu(view.mainMenu(), "ГЛАВНОЕ МЕНЮ");
            int number = view.selectMenuNumber();

            switch (number) {
                case 1 -> {
                    System.out.println("\nРаздел записи в справочник");
                    controlAnimalsMenu(number);
                }
                case 2 -> {
                    System.out.println("\nРаздел чтения справочника");
                    controlAnimalsMenu(number);
                }
                case 3 -> {
                    System.out.println("\nДанные обо всех животных");
                    System.out.println("\nЗАПИСИ ВСЕХ СПРАВОЧНИКОВ");
                    List<String[]> listDirectory = new ArrayList<>();
                    List<String[]> listCommands = new ArrayList<>();

                    for (String name : view.createListAnimals()) {
                        List<String[]> listDirectoryFile = dataBase.fileReading(name, name);
                        List<String[]> listCommandsFile = dataBase.fileReading(name + "Commands", name);
                        if (!listDirectoryFile.get(0)[0].equals("Файл не существует")) {
                            listDirectory.addAll(listDirectoryFile);
                        }

                        if (!listCommandsFile.get(0)[0].equals("Файл не существует")) {
                            listCommands.addAll(listCommandsFile);
                        }
                    }

                    view.showEntryAll(listDirectory, listCommands);
                }
                case 4 -> {
                    System.out.println("\nРаздел добавления изученной команды");
                    controlAnimalsMenu(number);
                }
                case 5 -> {
                    System.out.println("\nЗавершение программы...");
                    return;
                }
                default -> System.out.println("Нет такого пункта меню\n");
            }
        }
    }

    public void controlAnimalsMenu(int numberMainMenu) {
        while (true) {
            view.showMenu(view.animalMenu(), "МЕНЮ ВЫБОРА СПРАВОЧНИКА");
            int numberMenuAnimals = view.selectMenuNumber();

            switch (numberMenuAnimals) {
                case 1 -> {
                    String title = "dogs";
                    List<String[]> commandsFile = dataBase.fileReading(title + "Commands", title);

                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        view.showEntry(dataBase.fileReading(title, title), title, commandsFile);
                    } else if (numberMainMenu == 4) {
                        int i = 0;
                        List<String[]> animalsList = dataBase.fileReading(title, title);

                        if (!animalsList.get(0)[0].equals("Файл не существует")) {
                            List<String[]> listCommands = new ArrayList<>();
                            if (!commandsFile.get(0)[0].equals("Файл не существует")) {
                                listCommands = commandsFile;
                            }

                            view.showEntry(animalsList, title, commandsFile);
                            listCommands.add(controlCommand.addCommands(animalsList, commandsFile));

                            for (String[] text : listCommands) {
                                Boolean records = true;
                                if (i == 0) {
                                    records = false;
                                }

                                i++;
                                dataBase.fileWriting(title + "Commands", records, text[0] + "," + text[1]);
                            }
                        } else {
                            System.out.println("Список животных пуст");
                        }
                    }
                }
                case 2 -> {
                    String title = "cats";
                    List<String[]> commandsFile = dataBase.fileReading(title + "Commands", title);

                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        view.showEntry(dataBase.fileReading(title, title), title, commandsFile);
                    } else if (numberMainMenu == 4) {
                        int i = 0;
                        List<String[]> animalsList = dataBase.fileReading(title, title);

                        if (!animalsList.get(0)[0].equals("Файл не существует")) {
                            List<String[]> listCommands = new ArrayList<>();
                            if (!commandsFile.get(0)[0].equals("Файл не существует")) {
                                listCommands = commandsFile;
                            }

                            view.showEntry(animalsList, title, commandsFile);
                            listCommands.add(controlCommand.addCommands(animalsList, commandsFile));

                            for (String[] text : listCommands) {
                                Boolean records = true;
                                if (i == 0) {
                                    records = false;
                                }

                                i++;
                                dataBase.fileWriting(title + "Commands", records, text[0] + "," + text[1]);
                            }
                        } else {
                            System.out.println("Список животных пуст");
                        }
                    }
                }
                case 3 -> {
                    String title = "hamsters";
                    List<String[]> commandsFile = dataBase.fileReading(title + "Commands", title);

                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        view.showEntry(dataBase.fileReading(title, title), title, commandsFile);
                    } else if (numberMainMenu == 4) {
                        int i = 0;
                        List<String[]> animalsList = dataBase.fileReading(title, title);

                        if (!animalsList.get(0)[0].equals("Файл не существует")) {
                            List<String[]> listCommands = new ArrayList<>();
                            if (!commandsFile.get(0)[0].equals("Файл не существует")) {
                                listCommands = commandsFile;
                            }

                            view.showEntry(animalsList, title, commandsFile);
                            listCommands.add(controlCommand.addCommands(animalsList, commandsFile));

                            for (String[] text : listCommands) {
                                Boolean records = true;
                                if (i == 0) {
                                    records = false;
                                }
                                i++;
                                dataBase.fileWriting(title + "Commands", records, text[0] + "," + text[1]);
                            }
                        } else {
                            System.out.println("Список животных пуст");
                        }
                    }
                }
                case 4 -> {
                    String title = "horses";
                    List<String[]> commandsFile = dataBase.fileReading(title + "Commands", title);

                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        view.showEntry(dataBase.fileReading(title, title), title, commandsFile);
                    } else if (numberMainMenu == 4) {
                        int i = 0;
                        List<String[]> animalsList = dataBase.fileReading(title, title);

                        if (!animalsList.get(0)[0].equals("Файл не существует")) {
                            List<String[]> listCommands = new ArrayList<>();
                            if (!commandsFile.get(0)[0].equals("Файл не существует")) {
                                listCommands = commandsFile;
                            }

                            view.showEntry(animalsList, title, commandsFile);
                            listCommands.add(controlCommand.addCommands(animalsList, commandsFile));

                            for (String[] text : listCommands) {
                                Boolean records = true;
                                if (i == 0) {
                                    records = false;
                                }
                                i++;
                                dataBase.fileWriting(title + "Commands", records, text[0] + "," + text[1]);
                            }
                        } else {
                            System.out.println("Список животных пуст");
                        }
                    }
                }
                case 5 -> {
                    String title = "camels";
                    List<String[]> commandsFile = dataBase.fileReading(title + "Commands", title);

                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        view.showEntry(dataBase.fileReading(title, title), title, commandsFile);
                    } else if (numberMainMenu == 4) {
                        int i = 0;
                        List<String[]> animalsList = dataBase.fileReading(title, title);

                        if (!animalsList.get(0)[0].equals("Файл не существует")) {
                            List<String[]> listCommands = new ArrayList<>();
                            if (!commandsFile.get(0)[0].equals("Файл не существует")) {
                                listCommands = commandsFile;
                            }

                            view.showEntry(animalsList, title, commandsFile);
                            listCommands.add(controlCommand.addCommands(animalsList, commandsFile));

                            for (String[] text : listCommands) {
                                Boolean records = true;
                                if (i == 0) {
                                    records = false;
                                }
                                i++;
                                dataBase.fileWriting(title + "Commands", records, text[0] + "," + text[1]);
                            }
                        } else {
                            System.out.println("Список животных пуст");
                        }
                    }
                }
                case 6 -> {
                    String title = "donkeys";
                    List<String[]> commandsFile = dataBase.fileReading(title + "Commands", title);

                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        view.showEntry(dataBase.fileReading(title, title), title, commandsFile);
                    } else if (numberMainMenu == 4) {
                        int i = 0;
                        List<String[]> animalsList = dataBase.fileReading(title, title);

                        if (!animalsList.get(0)[0].equals("Файл не существует")) {
                            List<String[]> listCommands = new ArrayList<>();
                            if (!commandsFile.get(0)[0].equals("Файл не существует")) {
                                listCommands = commandsFile;
                            }

                            view.showEntry(animalsList, title, commandsFile);
                            listCommands.add(controlCommand.addCommands(animalsList, commandsFile));

                            for (String[] text : listCommands) {
                                Boolean records = true;
                                if (i == 0) {
                                    records = false;
                                }
                                i++;
                                dataBase.fileWriting(title + "Commands", records, text[0] + "," + text[1]);
                            }
                        } else {
                            System.out.println("Список животных пуст");
                        }
                    }
                }
                case 7 -> {
                    return;
                }
                default -> System.out.println("Нет такого пункта меню\n");
            }
        }
    }
}