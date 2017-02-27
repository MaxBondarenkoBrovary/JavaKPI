package ua.kpi.tef;

import java.util.Scanner;

/**
 * Created by User on 14.02.2017.
 */
public class Controller {
    //The constants
    public static final int NUMBER = 3;

    Model model;
    View view;

    // Constructor
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void initNumber(){
        Scanner sc = new Scanner(System.in);

        model.setValue(inputIntValueWithScanner(sc));
        model.sqrAndAdd(NUMBER);

        view.printMessageAndInt(view.OUR_INT, model.getValue());
    }

    public void initArgs(String[] args) {
        if (args.length != 0) {
            model.setStr(args);
            for (int i = 0; i < model.getStr().length; i++)
                view.printMessage(model.getStr()[i]);
        }
        else
            view.printMessage(view.EMPTY_STR);
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
