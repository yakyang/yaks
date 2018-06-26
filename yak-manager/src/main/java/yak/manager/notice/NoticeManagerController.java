package yak.manager.notice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("noticeManager")
public class NoticeManagerController {
	
	private Logger logger = LoggerFactory.getLogger(NoticeManagerController.class);
	
	@Autowired
	private INoticeManagerService noticeManagerService;
	
	/**
	 * 根据公告管理ID查询
	 * @param noticeId	公告管理ID
	 * @return
	 * @author liangxincheng
	 * @date 2018-05-30
	 */
	@ResponseBody
	@RequestMapping(value="queryById", method=RequestMethod.POST)
	public Result<NoticeManager> queryById(Integer noticeId) {
		NoticeManager noticeManager = null;
		try {
			noticeManager= noticeManagerService.queryNoticeManagerById(noticeId);
		} catch (Exception e) {
			logger.error("查询出错:", e);
			return new Result<NoticeManager>("0000", "查询出错！");
		}
		return new Result<NoticeManager>("1000", "查询成功！", noticeManager);
	}
	
}
