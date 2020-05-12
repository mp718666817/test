package domian;

import java.util.List;

/**
 * 
 * @author tosit
 *	部门
 */
public class Dept {

	private String deptId;/*部门编号*/
	
	private String deptName;/*部门名称*/
	
	private List<Employee> emps;/*部门下的所有员工*/

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	
	
}
