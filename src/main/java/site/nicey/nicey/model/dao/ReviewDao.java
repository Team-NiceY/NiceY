package site.nicey.nicey.model.dao;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;

import java.util.List;

public interface ReviewDao {
	// 해당 비디오 Id 값의 리뷰들 다 가져오기
	public List<Board> selectAll(int id);

	// ID에 해당하는 게시글 하나 가져오기
	public Board selectOne(int id);

	// 게시글 등록
	public void insertBoard(Board board);

	// 게시글 삭제
	public void deleteBoard(int id);

	// 게시글 수정
	public void updateBoard(Board board);

	// 조회수 증가
	public void updateViewCnt(int id);

	// 검색 기능
	public List<Board> search(SearchCondition condition);

}
