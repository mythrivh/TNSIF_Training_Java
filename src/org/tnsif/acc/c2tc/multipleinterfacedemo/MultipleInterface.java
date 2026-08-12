package org.tnsif.acc.c2tc.multipleinterfacedemo;

class SmartPhone  implements Camera , MusicPlayer{

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing music using smartphone");
	}

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
		System.out.println(" TakingPhoto using SmartPhone ");
		
	}
	
}
public class MultipleInterface {
	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.playMusic();
		smartphone.takephoto();
	}

}
