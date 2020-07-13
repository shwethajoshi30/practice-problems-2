package set2;

public class employee_27 {
	private int eid;
	private String ename,edesgn,edept;
	//id
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public int getEid()
	{
		return eid;
	}
	//name
	public void setEname(String ename)
	{
		
		if(ename.length()==0)
		{
			System.out.println("please enter valid name...");
		}
		this.ename=ename;
	}
	public String getEname()
	{
		
		return ename;
	}
	
	//desgn
	public void setEdesgn(String edesgn)
	{
		
		if(edesgn.equals("developer") || edesgn.equals("tester") || edesgn.equals("lead"))
		{
			this.edesgn=edesgn;
			
		}
		else
		{
			System.out.println("invalid designation");
			this.edesgn="";
		}
		
		
	}
	public String getEdesgn()
	{
		return edesgn;
	}
	//dept
	public void setEdept(String edept)
	{
		
		if(!edept.equals("TTH") && !edept.equals("RCM") && !edept.equals("Digital") && !edept.equals("DevOps"))
		{
			System.out.println("invalid department");
			edept="";
		}
		this.edept=edept;
	}
	public String getEdept()
	{
		return edept;
	}
	
	public static void main(String[] args) {
		employee_27 emp=new employee_27();
		emp.setEid(101);
		emp.setEname("shwetha");
		emp.setEdesgn("");
		emp.setEdept("RCM");
		System.out.println(emp.getEid()+" ");
		System.out.println(emp.getEname()+" ");
		System.out.println(emp.getEdesgn()+" ");
		System.out.println(emp.getEdept()+" ");
	}

}
