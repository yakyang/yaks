package yak.manager.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import yak.manager.notice.INoticeManagerDao;
import yak.manager.notice.NoticeManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoticeDaoTest {
	
	@Autowired
	INoticeManagerDao noticeManagerDao;
	
	@Test
	public void queryNoticeManagerById(){
		try {
			NoticeManager notice = noticeManagerDao.queryNoticeManagerById(8821);
			System.out.println("=============>"+notice.getContent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
