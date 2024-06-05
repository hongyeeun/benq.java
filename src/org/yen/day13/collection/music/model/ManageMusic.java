package org.yen.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManageMusic {

	private List<Music> mList;

	public ManageMusic() { // 생성자 안에서 선언
		mList = new ArrayList<Music>();
	}

	// 맨 뒤에 곡 추가
	public void registerMusic(Music music) {
		mList.add(music);
	}

	// 첫 위치에 곡 추가
	public void registerMusicAtFirst(Music music) {
		mList.add(0, music);
	}

	// 모든 곡 조회
	public List<Music> getAllMusics() {
		// TODO Auto-generated method stub
		return mList;
	}

	// 곡명으로 검색
	public Music searchMusicByTitle(String name) {
		if (name != "" && name != null) {
			for (Music music : mList) {
				if (name.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}

	public void deleteMusic(int index) {
		mList.remove(index);
	}

	public int searchIndexByName(String name) {
		if (name != "" && name != null) {
			int index = 0;
			for (Music music : mList) {
				if (name.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}
		return 0;
	}

	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}

	public void sortByTitleASC() {
		// 버블 정렬 예시
		// 버블 정렬 특징 - 오른쪽부터 정렬됨, 비교횟수 줄어들음
//		int nums [] = {4,3,2,1};
//		for(int i=0; i<nums.length-1;i++) {
//			for(int j=0; j<nums.length-1-i;j++) {
//				if(nums[j]>nums[j+1]) {
//					int temp = nums[j+1];
//					nums[j+1]=nums[j];
//					nums[j]=temp;
//				}
//			}
//		}
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < mList.size() - 1 - i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j + 1);
				// 문제점 : 객체비교는 부등호로는 무리
				// 비교해야 하는 것은 곡명(title)
				// title을 서로비교하여 ㄱ보다 늦은 순서인 경우 교체
				// 왼쪽이 크면 맨 오른쪽으로 보낸다.
				// 리스트에선 comparteTo로.. 0보다 크면 문자적으로 더 뒷순서라는 것이다아.
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
//						Music temp = mOne;
//						mOne = mTwo;
//						mTwo = temp;
					// mList의 순서를 바꿔줘야하므로 set를 이용해서 바꿔준다.
					mList.set(j, mTwo); // j자리에 mTwo
					mList.set(j + 1, mOne); // j+1 자리에 mOne
				}
			}
		}
	}

	public void sortByDESC() {
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < mList.size() - 1 - i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j + 1);
				// 내림차순
				// 맨 왼쪽이 작으면 맨 오른쪽으로 보내야함.
				if (mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
					mList.set(j, mTwo);
					mList.set(j + 1, mOne);
				}
			}	
		}
	}

	public void sortBySingerASC() {
		// collection.sort의 원리
//		List<String> strList = new ArrayList<String>();
//		strList.add("김만우");
//		strList.add("강진형");
//		strList.add("박은진");
//		Collections.sort(strList);	// 기본 오름차순 정렬
		// 숫자> 영어> 한글
		Collections.sort(mList);
		// comparte to 라는 메소드를 사용하는데
		// 비교하는것이 string이나 int가 아닌 music이므로 
		// 이것의 제목끼리 비교하도록 오버라이딩 해줘야한다.
		
//		for (int i = 0; i < mList.size() - 1; i++) {
//			for (int j = 0; j < mList.size() - 1 - i; j++) {
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j + 1);
//				// 오름차순
//				// 맨 왼쪽이 크면 맨 오른쪽으로 보내야함.
//				if (mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
//					mList.set(j, mTwo);
//					mList.set(j + 1, mOne);
//				}
//			}
//		}
	}

	public void sortBySingerDESC() {
		Collections.sort(mList, new DescTitle());
//		for (int i = 0; i < mList.size() - 1; i++) {
//			for (int j = 0; j < mList.size() - 1 - i; j++) {
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j + 1);
//				// 오름차순
//				// 맨 왼쪽이 크면 맨 오른쪽으로 보내야함.
//				if (mOne.getSinger().compareTo(mTwo.getSinger()) < 0)
//					mList.set(j, mTwo);
//					mList.set(j + 1, mOne);
//			}
//		}
	}
}
