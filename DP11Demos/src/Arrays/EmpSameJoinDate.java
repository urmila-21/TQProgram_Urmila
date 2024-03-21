package Arrays;
import java.util.Arrays;
public class EmpSameJoinDate {
	

	int empid;
	double bsalary,netsalary;
	String name,date[];
	static String cname;
	
	static {
		
		System.out.println("In static init block of employee");
		cname="ThinkQuotient";
	}
	
	public EmpSameJoinDate()
	{
		
	}
	public EmpSameJoinDate(int eid,String name,double bsalary,String date[])
	{
		this.empid=eid;
		this.name=name;
		this.bsalary=bsalary;
		this.date=date;
	}
	public static void changeCname(String nm)
	{
		cname=nm;
	}
	
	public String toString()
	{
	return "\nEmployee Id :\t"+empid+"\nEmployee Name :\t"+name+"\nBasic Salary :\t"+bsalary+"\nNet Salary :\t"+netsalary+"\nJoin Date"+Arrays.toString(date);
	}
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			EmpSameJoinDate earr[]=new EmpSameJoinDate[4];
			
			String d1[]= {"6,8,2023"};
			String d2[]= {"1,3,2021"};
			String d3[]= {"2,9,2020"};
			String d4[]= {"6,8,2023"};
			
			earr[0]=new EmpSameJoinDate(121,"Tina",300000,d1);
			earr[1]=new EmpSameJoinDate(122,"Rina",100000,d2);
			earr[2]=new EmpSameJoinDate(123,"mina",00000,d3);
			earr[3]=new EmpSameJoinDate(124,"pina",100000,d4);
			
			

			for(EmpSameJoinDate e1:earr)
			{
				String sk[]=e1.date;
				for(String s:sk)
				{
					if(s.equals("6,8,2023"))
					{
						System.out.println("Employee have same join date");
						System.out.println(e1);
					}
				}
			}
			
		}
	}
