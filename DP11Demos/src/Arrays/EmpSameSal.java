package Arrays;

import java.util.Arrays;
public class EmpSameSal {
	
		int empid;
		double bsalary,netsalary,pf=10,hra=12,da=15;
		String name,skills[];
		static String cname;
		
		static {
			
			System.out.println("In static init block of employee");
			cname="ThinkQuotient";
		}
		
		public EmpSameSal()
		{
			
		}
		public EmpSameSal(int eid,String name,double bsalary,String s[])
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
			return "\nEmployee Id :\t"+empid+"\nEmployee Name :\t"+name+"\nBasic Salary :\t"+bsalary+"\nNet Salary :\t"+netsalary+"\nSkills :"+Arrays.toString(skills)+"\n";
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			EmployeeArray earr[]=new EmployeeArray[4];
			
			String s1[]= {"Java","Angular","Spring"};
			String s2[]= {"Sql","Angular","Spring"};
			String s3[]= {"Python","Django","ML"};
			String s4[]= {"DBMS","Angular","CSS"};
			
			earr[0]=new EmployeeArray(121,"Tina",300000,s1);
			earr[1]=new EmployeeArray(122,"Rina",100000,s2);
			earr[2]=new EmployeeArray(123,"mina",00000,s3);
			earr[3]=new EmployeeArray(124,"pina",100000,s4);
			
			
			for(EmployeeArray e1:earr)
			{
				String sk[]=e1.skills;
				for(String s:sk)
				{
					if(s.equals("java"))
					{
						System.out.println("Employee skillset have java skills");
						System.out.println(e1);
					}
				}
			}
			for(int i=0;i<earr.length;i++)
			{
				for(int j=i+1;j<earr.length;j++)
				{
					if(earr[i].bsalary==earr[j].bsalary)
					{
						System.out.println(earr[i]+" "+earr[j]+"\n same salary");
					}
				}
			}
			
		}

	}
