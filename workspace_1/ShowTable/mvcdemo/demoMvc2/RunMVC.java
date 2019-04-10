package demoMvc2;

public class RunMVC {

	private int start_value = 0;

	public RunMVC() {

		Model myModel = new Model();
		View myView = new View();

		myModel.addObserver(myView);

		Controller myController = new Controller();
		myController.addModel(myModel);
		myController.addView(myView);
		myController.initModel(start_value);

		myView.addController(myController);

	}

}
