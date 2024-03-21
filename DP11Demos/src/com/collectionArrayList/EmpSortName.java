package com.collectionArrayList;

public class EmpSortName {

		private int eid;
		private double sal;
		private String name,dept;
		public EmpSortName() {
			// TODO Auto-generated constructor stub
		}
		
		
		public EmpSortName(int eid, double sal, String name, String dept) {
			super();
			this.eid = eid;
			this.sal = sal;
			this.name = name;
			this.dept = dept;
		}
	    

		public int getEid() {
			return eid;
		}


		public void setEid(int eid) {
			this.eid = eid;
		}


		public double getSal() {
			return sal;
		}


		public void setSal(double sal) {
			this.sal = sal;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDept() {
			return dept;
		}


		public void setDept(String dept) {
			this.dept = dept;
		}


		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", sal=" + sal + ", name=" + name + ", dept=" + dept + "]";
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EmpSortName obj=new EmpSortName();
			System.out.println(obj);
			EmpSortName obj1=new EmpSortName(101, 45000, "anita", "admin");
			System.out.println(obj1);

		}


		
//		public int compareTo(EmpSortName o) {
//			// TODO Auto-generated method stub
//			System.out.println("I am in compare");
//			if(this.eid>o.eid)
//				return 1;
//			else if(this.eid<o.eid)
//				return -1;
//			else	
//				return 0;
//		}
		
		public int compareTo(EmpSortName o) {
			// TODO Auto-generated method stub
			System.out.println("I am in compare");
			return this.name.compareTo(o.name);
		}

		
	}

