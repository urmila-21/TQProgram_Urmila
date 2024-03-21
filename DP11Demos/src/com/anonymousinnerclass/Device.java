package com.anonymousinnerclass;

public class Device {

	Switchable obj = new Switchable() {

		public void on() {
			System.out.println("I am in on()");
		}

		public void off() {
			System.out.println("I am in off");
		}
	};

	public void play(Switchable obj) {
		obj.on();
		obj.off();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Device d = new Device();
		d.obj.on();
		d.obj.off();
		d.play(new Switchable() {
			

			public void on() {
				System.out.println("I am in on of play()");
			}

			public void off() {
				System.out.println("I am in off of play()");
			}
		});

	}
}
