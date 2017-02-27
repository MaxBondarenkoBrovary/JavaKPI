package ua.kpi.tef;

public class Controller{
	Model model;
	View view;
	
	public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }
	
	
	
	public void textout(){
		this.view.printmessage(model.msg);
	}
}