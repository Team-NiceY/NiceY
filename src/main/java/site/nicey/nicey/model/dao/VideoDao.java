package site.nicey.nicey.model.dao;

import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.dto.Video;

import java.util.List;

public interface VideoDao {
	// 전체 게시글을 몽땅 들고 오쎄용
	public List<Video> selectAll();

	// ID에 해당하는 게시글 하나 가져오기
	public Video selectOne(int id);

	// 조회수 증가
	public void updateViewCnt(int id);

	// 검색 기능
	public List<Video> search(SearchCondition condition);

}
