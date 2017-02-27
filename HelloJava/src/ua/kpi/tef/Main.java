package ua.kpi.tef;

public class Main {

    public static void main(String[] args) {

                Model model = new Model();
                View view = new View();
                Controller controller = new Controller(model,view);
                controller.textout();

                //System.out.println(args[0] + " " + args[1]);
            }
        }


