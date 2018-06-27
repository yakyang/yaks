package yak.manager.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INoticeManagerServiceImpl implements INoticeManagerService {
	
	@Autowired
	private INoticeManagerDao noticeManagerDao;
	
	@Override
	public NoticeManager queryNoticeManagerById(Integer noticeId) throws Exception {
		return noticeManagerDao.queryNoticeManagerById(noticeId);
	}

}
