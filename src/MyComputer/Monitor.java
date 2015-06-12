package MyComputer;

public class Monitor extends Computer {

	public Monitor(String model) {
		super(model);

	}

	@Override
	public void on() {

		print("Monitor: Hello! I'm switch on!!! My  model is " + getModel()
				+ ".");

	}

	public void connectDevice(Computer comp) {//invoke that method from class Monitor using polymorthism

		comp.connect();
	}

}
