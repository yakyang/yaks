package yak.manager.notice;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface INoticeManagerDao {
	/**
	 * 保存公告管理
	 * @param noticeManager	公告管理信息
	 * @return
	 * @throws Exception
	 * @author liangxincheng
	 * @date 2015-05-30
	 */
	public int save(NoticeManager noticeManager) throws Exception;
	
	/**
	 * 删除公告管理
	 * @param noticeId 公告管理ID
	 * @return
	 * @throws Exception
	 * @author liangxincheng
	 * @date 2015-05-30
	 */
	public int deleteNoticeManager(Integer noticeId) throws Exception;
	
	/**
	 * 修改公告管理
	 * @param noticeManager 公告管理信息
	 * @return
	 * @throws Exception
	 * @author liangxincheng
	 * @date 2015-05-30
	 */
	public int editNoticeManager(NoticeManager noticeManager) throws Exception;
	
	/**
	 * 查询公告管理信息
	 * @param noticeManagerCondition 公告管理查询条件
	 * @return
	 * @throws Exception
	 * @author liangxincheng
	 * @date 2015-05-30
	 */
	public List<NoticeManager> queryNoticeManager(NoticeManagerCondition noticeManagerCondition) throws Exception;
	
	/**
	 * 查询已发布的公告
	 * @param noticeManagerCondition 公告管理查询条件
	 * @return
	 * @throws Exception
	 * @author liangxincheng
	 * @date 2015-05-30
	 */
	public List<NoticeManager> queryReleaseNotice(NoticeManagerCondition noticeManagerCondition) throws Exception;
	
	/**
	 * 根据公告管理ID获取信息
	 * @param noticeId 公告管理ID
	 * @return
	 * @throws Exception
	 * @author liangxincheng
	 * @date 2015-05-30
	 */
	public NoticeManager queryNoticeManagerById(Integer noticeId) throws Exception;
	
	/**
	 * 发布
	 * @param noticeId	公告管理ID
	 * @return
	 * @throws Exception
	 * @author liangxincheng
	 * @date 2015-05-30
	 */
	public int releaseNotice(String noticeId) throws Exception;
	
	/**
	 * 失效
	 * @param noticeId	公告管理ID
	 * @return
	 * @throws Exception
	 * @author liangxincheng
	 * @date 2015-05-30
	 */
	public int invalidNotice(String noticeId) throws Exception;
}
