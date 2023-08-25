package GenericUtility;

public class readdataconstructor {
	public String id;
	public String st_name;
	public String phone;
	  public  readdataconstructor(String a,String b,String c)
	 {
		 this.id=a;
		 this.st_name=b;
		 this.phone=c;

}
	@Override
	public String toString() {
		return " [Student id =" + id + ", Student name =" + st_name + ", Student phone number =" + phone + "]";
	}}
