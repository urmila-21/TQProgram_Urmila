package com.ExceptionHandling;

import java.io.IOException;

public class ComplieTimePropagation { 

	void m() throws IOException  {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		ComplieTimePropagation obj = new ComplieTimePropagation();
		obj.p();
		System.out.println("normal flow");
	}
}
