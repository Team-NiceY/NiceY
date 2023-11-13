package com.ssafy.board.model.dto;

import io.swagger.annotations.ApiModel;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@ApiModel(value="게시판 바구니", description = "게시글 정보")
public class Board {
	private int reviewId;
	private int videoId;
	private String writerId;
	private String writerName;
	private String reviewTitle;
	private String reviewContent;
	private String writeDate;

	public Board() {
	}

//	public Board(String title, String writer, String content) {
//		super();
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//	}

	public Board(int videoId, String writerId, String writerName, String reviewTitle, String reviewContent) {
		this.videoId = videoId;
		this.writerId = writerId;
		this.writerName = writerName;
		this.reviewTitle = reviewTitle;
		this.reviewContent = reviewContent;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "Board{" +
				"reviewId=" + reviewId +
				", videoId=" + videoId +
				", writerId='" + writerId + '\'' +
				", writerName='" + writerName + '\'' +
				", reviewTitle='" + reviewTitle + '\'' +
				", reviewContent='" + reviewContent + '\'' +
				", wireDate=" + writeDate +
				'}';
	}
}
