package domian;

import java.util.List;

/**
 * 
 * @author tosit
 *	����
 */
public class Dept {

	private String deptId;/*���ű��*/
	
	private String deptName;/*��������*/
	
	private List<Employee> emps;/*�����µ�����Ա��*/

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
