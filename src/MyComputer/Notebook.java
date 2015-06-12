package MyComputer;

public class Notebook extends Computer {

	public Notebook(String model) {

		super(model);

	}

	@Override
	public void on() {

		print("Notebook: Hello! I'm notebook. Im switch on!!! My model is " + getModel()+".");
	}

	public void charge() {

		System.out.println("Im charging....");
	}
	
	
	
	@Override
	public void connect() {
	
		print("Notebook connect to monitor");
	}
	
}
