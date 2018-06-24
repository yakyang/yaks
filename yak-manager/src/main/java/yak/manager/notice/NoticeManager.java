package yak.manager.notice;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 材料管理相关配置
 * @author 
 *
 */
public class NoticeManager implements Serializable {

	private static final long serialVersionUID = 8264571590003114881L;
	
	private Integer noticeId;	//主键
	private String title;	//标题
	private String content;	//内容
	private String type;	//类型
	private String fileDownloadUrl;	//附件URL
	private String fileName;	//附件名称
	private String fileOssKey;	//附件osskey
	private String releaser;		//发布者
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date releaseTime;	//发布时间
	private String status;	//状态
	private String creater;	//创建者
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;	//创建时间
	
	private String modifier;	//修改者
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;	//修改时间
	
	private String comments;	//备注
	
	/**
	 * 一些冗余字段
	 */
	private String statusName;
	private String typeName;
	
	public Integer getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFileDownloadUrl() {
		return fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileOssKey() {
		return fileOssKey;
	}
	public void setFileOssKey(String fileOssKey) {
		this.fileOssKey = fileOssKey;
	}
	public String getReleaser() {
		return releaser;
	}
	public void setReleaser(String releaser) {
		this.releaser = releaser;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "MaterialManager{" +
                "noticeId=" + noticeId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", typeName='" + typeName + '\'' +
                ", fileDownloadUrl='" + fileDownloadUrl + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileOssKey='" + fileOssKey + '\'' +
                ", releaser='" + releaser + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", status='" + status + '\'' +
                ", statusName='" + statusName + '\'' +
                ", creater='" + creater + '\'' +
                ", createTime='" + createTime + '\'' +
                ", modifier='" + modifier + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                ", comments=" + comments +
                '}';
	}
}
