package org.yen.day13.collection.music.model;

public class Music implements Comparable<Music> {
	// 곡명, 가수명
	private String title;
	private String singer;
	
	public Music() {}

	// 소스 -> generate ~ using fields
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	// comparable 상속받았으니 오버라이딩 해줘야함
	// 리스트의 title로 비교하는 것이니 오버라ㅇ딩해야함
	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.getTitle());		// 1, 0, -1;
	}
	
}
