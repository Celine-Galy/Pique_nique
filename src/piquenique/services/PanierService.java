package piquenique.services;

import piquenique.utils.ConsoleManager;

public class PanierService<ServiceAction> {

    public void run() {
        printTitle("Bienvenue dans ma videothèque!");

        String answer;

        do {
            answer = printMenu((ServiceAction[]) PanierActions.values());
            ConsoleManager.getInstance().consoleLineBreak();

            // handle the user action
            handleAction(answer);
        } while (!answer.equalsIgnoreCase(ActionConstants.EXIT_ID)); // loop while until user wants to exit

    }
    private void printTitle(String title) {
        ConsoleManager.getInstance().consoleLineBreak();
        ConsoleManager.getInstance().printLine();
        ConsoleManager.getInstance().printToConsole(title, true);
        ConsoleManager.getInstance().printLine();
        ConsoleManager.getInstance().consoleLineBreak();
    }

    private String printMenu(ServiceAction[] actions) {
        boolean rightAnswer = false;
        String answer = "";

        do {
            // print the option menu
            ConsoleManager.getInstance().printLine();
            ConsoleManager.getInstance().consoleLineBreak();

            for (ServiceAction action : actions) {
                ConsoleManager.getInstance().printToConsole(action.toString(), true);
            }

            ConsoleManager.getInstance().printToConsole("What do you want to do : ", false);

            // ask user answer
            answer = ConsoleManager.getInstance().readUserInput();

            if (PanierActions.containsAction(answer)) {
                rightAnswer = true;
            }
        } while (!rightAnswer);

        return answer;
    }

    private void handleAction(String answer) {

        if (answer.equalsIgnoreCase(PanierActions.ADD_NBR_PERS.getValue())) {
            addNbrPers();
        }

        if (answer.equalsIgnoreCase(PanierActions.SELECT_PIQUENIQUE.getValue())) {
            selectPiqueNique();
        }

        if (answer.equalsIgnoreCase(PanierActions.OPTION_BOTTLE.getValue())) {
            optionBottle();
        }

        if (answer.equalsIgnoreCase(PanierActions.CHOICE_BOTTLE.getValue())) {
            choiceBottle();
        }

    }

    private void addNbrPers(){

    }

    private void selectPiqueNique(){

    }

    private void optionBottle(){

    }

    private void choiceBottle(){

    }
}
