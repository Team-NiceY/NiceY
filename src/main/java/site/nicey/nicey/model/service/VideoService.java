package com.ssafy.board.model.service;

import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.dto.Video;

import java.util.List;

//사용자 친화적으로 작성
public interface VideoService {
	// 게시글 전체 조회
	List<Video> getList();

	// 게시글 상세 조회
	Video getVideo(int id);

	//검색 버튼을 눌렀을 때 처리할 메서드
	List<Video> search(SearchCondition condition);
}
