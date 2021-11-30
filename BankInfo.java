package assignmentweek3day1;
//parent Class
public class BankInfo extends AxisBank{
	public void saving() {
		System.out.println("Saving Account");
	}
		public void fixed() {
		System.out.println("Fixed Account");	
		}
		public void deposit() {
			System.out.println("overrider deposit");
		}
	public static void main(String[] args) {
		BankInfo obj=new BankInfo();
		obj.saving();
		obj.fixed();
		obj.deposit();
		obj.deposit();
		
	}
	}


