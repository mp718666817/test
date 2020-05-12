package domian;

import java.util.List;

/**
 * 
 * @author tosit
 *	 分页封装类
 */
public class PageBean<T> {

	private Integer pageNo;
	
	private Integer pageSize;
	
	private List<T> datas;
	
	private Integer totalPage; //总页数
	

	
	
	
	
	
	
/**
 * 
 * @param pageNo
 * @param pageSize
 * @param datas
 * @param countTotal  - 总记录数
 */
	public PageBean(Integer pageNo, Integer pageSize,Integer countTotal) {
		super();
		
		if(pageNo<=1) {
			this.pageNo =1;
		}
		this.pageSize = pageSize;
		totalPage = countTotal%pageSize==0?countTotal/pageSize:countTotal/pageSize+1;
		
		if(pageNo>=totalPage) {
			this.pageNo=totalPage;
		}
	}

	public Integer getPageNo() {
		
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}


	
	
	
	
}
