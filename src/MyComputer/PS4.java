package MyComputer;

public class PS4 extends Computer {
	
	public PS4(String model){
		
		super(model);
	}

	
	@Override
	public void on() {
		
		print("PS4: Hello! I'm PS4. I'm switch on!!! My model is " + getModel()+".");
	}
	
	
	
	@Override
	public void connect() {
		print("PS4 connect to monitor");
	}}
