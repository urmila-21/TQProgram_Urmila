package com.treeMap;

import java.util.Objects;

public class Book implements Comparable<Book>{
	
		int id;
		String name;
		double price;
		
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(int id,String name, double price)
		{
			super();
			this.id=id;
			this.name=name;
			this.price=price;
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(id, name, price);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return id == other.id && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
		}
		@Override
		public String toString() {
			return "\nBook [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
		public int compareTo(Book b){ 
			 if(this.price==b.price) 
			return 0; 
			else if(price>b.price) 
			 return 1; 
			 else 
			 return -1; 
			 
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}

