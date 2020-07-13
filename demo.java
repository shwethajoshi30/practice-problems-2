//exercise 33;
package set2;
public class demo {
	public static void main(String[] args) {
		student s=new student();
		s.setStudentid(101);
		s.setStudentname("shwetha");
		s.setMarks(78);
		s.setSecondchance(true);
		System.out.println(s.getStudentid()+" "+s.getStudentname()+" "+s.getMarks());
		s.identifymarks(10,100);	
	}
}
class student{
	private int studentid;
	private String studentname;
	float marks;
	private boolean secondchance;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public float getMarks()
	{
		return marks;
	}
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	public boolean isSecondchance() {
		return secondchance;
	}
	public void setSecondchance(boolean secondchance) {
		this.secondchance = secondchance;
	}
	
	void identifymarks(float e_marks)
	{
		if(secondchance == false)
		{
			marks=e_marks;
			System.out.println(marks);
		}
		
	}
	void identifymarks(float fc, float sc)
	{
		marks=fc>sc?fc:sc;
		System.out.println(marks);
		
	}
	
}
