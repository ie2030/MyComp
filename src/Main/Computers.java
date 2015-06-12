package Main;

import MyComputer.Computer;
import MyComputer.Monitor;
import MyComputer.Notebook;
import MyComputer.PS4;

public class Computers {

	

	public static void main(String[] args) {

	
		Computer notebook = new Notebook("IBM");
		doSmth(notebook);
		Computer comp = new Computer("HP");
		doSmth(comp);
		Computer ps4 = new PS4("Sony");
		doSmth(ps4);


		Monitor monitor = new Monitor("Medion");
		monitor.connectDevice(notebook);
		monitor.connectDevice(ps4);
		monitor.connectDevice(comp);

	}
	
	public static void doSmth(Computer comp){
		
		if(comp instanceof Notebook){
			((Notebook) comp).on();
			((Notebook) comp).charge();
		}
		else{
			comp.on();
		}
		
		
		
	}
	

}
