package domian;

import java.util.Date;

/**
 * 
 * @author tosit
 *		��Ա 
 */
public class Employee {

	private String  empId;/*��Ա���*/
	
	private String empName;/*��Ա����*/
	
	private double empSalary;/*��Ա����*/
	
	private String empSex;/*��Ա�Ա�*/
	
	private Date empJoinTime;/*��ְ����*/
	
	private Dept dept;/*��Ա��������*/

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpSex() {
		return empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public Date getEmpJoinTime() {
		return empJoinTime;
	}

	public void setEmpJoinTime(Date empJoinTime) {
		this.empJoinTime = empJoinTime;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
}
