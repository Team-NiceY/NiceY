package site.nicey.nicey.model.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value="비디오 바구니", description = "비디오 정보")
public class Video {
	private int videoId;
	private String videoTitle;
	private String chName;
	private String url;
	private String part;
	private int viewCnt;

	public Video() {
	}

//	public Video(String title, String writer, String content) {
//		super();
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//	}
//
//
//
//	public Video(int id, String title, String writer, String content, String regDate, int viewCnt) {
//		this.id = id;
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//		this.regDate = regDate;
//		this.viewCnt = viewCnt;
//	}


	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	@Override
	public String toString() {
		return "Video{" +
				"videoId=" + videoId +
				", videoTitle='" + videoTitle + '\'' +
				", chName='" + chName + '\'' +
				", url='" + url + '\'' +
				", part='" + part + '\'' +
				", viewCnt=" + viewCnt +
				'}';
	}
}
