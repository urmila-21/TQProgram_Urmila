package Arrays;
import java.util.Arrays;
public class EmployeeArray {
	
		int empid;
		double bsalary,netsalary,pf=10,hra=12,da=15;
		String name,skills[];
		static String cname;
		
		static {
			
			System.out.println("In static init block of employee");
			cname="ThinkQuotient";
		}
		
		public EmployeeArray()
		{
			
		}
		public EmployeeArray(int eid,String name,double bsalary,String s[])
		{
			this.empid=eid;
			this.name=name;
			this.bsalary=bsalary;
			this.skills=s;
		}
		public static void changeCname(String nm)
		{
			cname=nm;
		}
		
		public void calculatesalary()
		{
			
			netsalary=bsalary;
			
		}
		public String toString()
		{
			return "Employee Id :\t"+empid+"\nEmployee Name :\t"+name+"\nBasic Salary :\t"+bsalary+"\nNet Salary :\t"+netsalary+"\nSkills :"+Arrays.toString(skills);
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*EmployeeArray e=new EmployeeArray();
			e.calculatesalary();
			System.out.println(e);
			System.out.println("_________________________________________");*/
			
			EmployeeArray earr[]=new EmployeeArray[4];
			
			String s1[]= {"Java","Angular","Spring"};
			String s2[]= {"Sql","Angular","Spring"};
			String s3[]= {"Python","Django","ML"};
			String s4[]= {"Java","Angular","Spring"};
			
			earr[0]=new EmployeeArray(121,"Tina",100000,s1);
			earr[1]=new EmployeeArray(122,"Rina",100000,s2);
			earr[2]=new EmployeeArray(123,"mina",100000,s3);
			earr[3]=new EmployeeArray(124,"pina",100000,s4);
			
			System.out.println("_________________________________");
			
			for(EmployeeArray e:earr)
			{
				String sk[]=e.skills;
				for(String s:sk)
				{
					if(s.equals("Java"))
					{
						System.out.println(e);
					}
				}
			}
			/*for(int i=0;i<earr.length;i++)
			{
				System.out.println(earr[i]);
			}*/
			
		}

	}
