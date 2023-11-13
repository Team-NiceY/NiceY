package site.nicey.nicey.model.service;

import com.ssafy.board.model.dao.VideoDao;
import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.dto.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

	private VideoDao videoDao;

	@Autowired
	public void setVideoDao(VideoDao videoDao) {
		this.videoDao = videoDao;
	}

	@Override
	public Video getVideo(int id) {
		System.out.println(id+"번 글을 읽었습니다.");
		videoDao.updateViewCnt(id);
		return videoDao.selectOne(id);
	}

	@Override
	public List<Video> getList() {
		System.out.println("모든 게시글을 가지고 왔습니다.");
		return videoDao.selectAll();
	}

	@Override
	public List<Video> search(SearchCondition condition) {
		return videoDao.search(condition);
	}

}
