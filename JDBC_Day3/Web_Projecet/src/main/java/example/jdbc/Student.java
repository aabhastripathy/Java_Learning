package example.jdbc;

public class Student {
private int studentid;
private String name;
private String city;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int studentid, String name, String city) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.city = city;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", city=" + city + "]";
	}

}
