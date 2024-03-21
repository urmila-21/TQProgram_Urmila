package com.map;

import java.util.Objects;

public class Apple {

	String type;
	double value;
	
	public Apple()
	{
		
	}
	public Apple(String type,double value)
	{
		super();
		this.type=type;
		this.value=value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(type, value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(type, other.type)
				&& Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
	}
	@Override
	public String toString() {
		return "Apple [type=" + type + ", value=" + value + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
