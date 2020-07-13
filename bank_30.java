package set2;

public class bank_30 {

	public static void main(String[] args)
	{
		bank_30 b1=new bank_30();
		bank_30 b2=new bank_30(523.0,2,85);
		b2.calc_intrest();
		b2.withdraw(90);
	}
	private double bal;
	private int intrest_rate,acc_no;
	public bank_30()
	{
		this.bal=500;
		this.intrest_rate=4;
		this.acc_no=100234567;
	}
	public bank_30(double b,int i,int a_no)
	{
		this.bal=b;
		this.intrest_rate=i;
		this.acc_no=a_no;
		
	}
	public void withdraw(double amount)
	{
		if(amount> bal)
		{
			System.out.println("no enough money to withdraw....");
		}
		else
		{
			bal=bal-amount;
			System.out.println("amount withdraw successfull..."+bal);
		}
	}
	public void calc_intrest()
	{
		int time=60;
		int sim_intrest=(int) ((bal*intrest_rate*time)/100);
		System.out.println(bal);
		System.out.println(sim_intrest);
	}


}
