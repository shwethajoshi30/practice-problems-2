package set2;
class admin{
	private int custid;
	private String custname,address,acctype;
	private double custbalance;
	public admin() {
		this.custid=0;
		this.custname="";
		this.address="";
		this.acctype="";
		this.custbalance=0;
	}
	public admin(int id,String name,String addr ){
		this.custid=id;
		this.custname=name;
		this.address=addr;
	}
	public admin(int id,String name ){
		this.custid=id;
		this.custname=name;
		 
	}
	public admin(int id,String name,String addr,String act,double bal ){
		this.custid=id;
		this.custname=name;
		this.address=addr;
		this.acctype=act;
		this.custbalance=bal;
	}
	public void display() {
		
		System.out.println(custid+" "+custname+" "+address+" "+acctype+" "+custbalance);
	}
}

public class customer_29 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//admin a1=new admin();
		//a1.display();
		admin a2=new admin(23,"rina","Bang-01 street");
		a2.display();
		admin a3=new admin(54,"teena");
		a3.display();
		admin a4=new admin(23,"rina","Bang-02 street","sa",12400);
		a4.display();

	}

}