package site.nicey.nicey.model.service;

import com.ssafy.board.model.dao.ReviewDao;
import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

	private ReviewDao boardDao;
	
	@Autowired
	public void setBoardDao(ReviewDao reviewDao) {
		this.boardDao = reviewDao;
	}
	
	
	@Override
	public List<Board> getList(int id) {
		System.out.println("모든 게시글을 가지고 왔습니다.");
		return boardDao.selectAll(id);
	}

	@Transactional
	@Override
	public void writeBoard(Board board) {
		System.out.println("게시글을 작성합니다.");
		//강제로 ID를 99번으로 결정하겠다.
//		board.setId(99);
		boardDao.insertBoard(board);
//		boardDao.insertBoard(board);
	}

	@Override
	public Board getBoard(int id) {
		System.out.println(id+"번 글을 읽었습니다.");
		boardDao.updateViewCnt(id);
		return boardDao.selectOne(id);
	}

	//서6 최영진 훌륭 그자체
	@Transactional
	@Override
	public void modifyBoard(Board board) {
		boardDao.updateBoard(board);
	}

	@Transactional
	@Override
	public void removeBoard(int id) {
		System.out.println(id+"번 글을 삭제 했습니다.");
		boardDao.deleteBoard(id);
	}


	@Override
	public List<Board> search(SearchCondition condition) {
		return boardDao.search(condition);
	}

}
