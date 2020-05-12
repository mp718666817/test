package domian;

import java.util.Date;

/**
 * 
 * @author tosit
 *		雇员 
 */
public class Employee {

	private String  empId;/*雇员编号*/
	
	private String empName;/*雇员名称*/
	
	private double empSalary;/*雇员工资*/
	
	private String empSex;/*雇员性别*/
	
	private Date empJoinTime;/*入职日期*/
	
	private Dept dept;/*雇员所属部门*/

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
