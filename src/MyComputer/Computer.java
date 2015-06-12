package MyComputer;



 public class Computer {

	public double price;
	public double weight;
	public int hdd;
	public int ram;
	public double screensize;
	public String model;
	public String vendor;
	
	public Computer(String model) {
		
		this.model = model;
		
		
	}
	
//	public Computer(double price, double weight, int hdd, int ram,
//			double screensize, String model, String vendor) {
//
//		this.price = price;
//		this.weight = weight;
//		this.hdd = hdd;
//		this.ram = ram;
//		this.screensize = screensize;
//		this.model = model;
//		this.vendor = vendor;
//	}

	

	public void print(String str) {

		System.out.println(str);
	}

	public void on() {

		print("Computer: Hello! Im computer. Im  switch on and my model is " + getModel()+".");
	}

	public void off() {

		print("Im swith off. My capacity of memory is low");

	}

	public void load() {

		print("Im loading Windows. HHD is enough");

	}
	
	public void connect(){
		print("Computer connect to monitor");
	}
	@Override
	public String toString(){
		
		return price + " " + weight + " " + hdd + " " + ram + " " + screensize + " " + model + " " + vendor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getScreensize() {
		return screensize;
	}

	public void setScreensize(double screensize) {
		this.screensize = screensize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
