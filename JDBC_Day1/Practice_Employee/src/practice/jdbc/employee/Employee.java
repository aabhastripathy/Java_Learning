package practice.jdbc.employee;

public class Employee {
private int empno;
private int deptno;
private String ename;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Employee(int empno,int deptno,String ename) {
	super();
	this.empno = empno;
	this.deptno = deptno;
	this.ename = ename;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", deptno=" + deptno + ", ename=" + ename + "]";
}

}
