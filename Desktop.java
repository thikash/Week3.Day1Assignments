package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println(" This is a Desktopsize");
		
	}
public static void main(String[] args) {
	Desktop obj1=new Desktop();
	obj1.desktopSize();
	
	obj1.computerMode();
}
}
