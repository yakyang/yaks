package yak.manager.notice;

import java.io.Serializable;
import java.util.List;

/**
 * 公告管理查询条件
 * 
 * @author liangxincheng
 *
 */
public class NoticeManagerCondition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2225258498632132316L;
	private String title;	//标题
	private List<String> type;	//类型
	private List<String> status;	//状态
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	public List<String> getStatus() {
		return status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "NoticeManagerCondition{" +
                "title=" + title +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
	}
}
