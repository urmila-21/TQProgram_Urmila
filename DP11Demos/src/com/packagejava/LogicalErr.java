package com.packagejava;

public class LogicalErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long kmFromSun = 150000000;
		long lightSpeed = 299792458;
		long mFromSun=kmFromSun*1000;
		long seconds=mFromSun/lightSpeed;
		
		System.out.print("Light will use ");
		long min=seconds/60;
		seconds=seconds-(min*60);
		System.out.print(min + " Minute(s)and " +seconds+" Seconds(s)");
		
		System.out.println("to travel from the Sun to Earth.");
	}

}
