package org.yen.day13.collection.music.controller;

import java.util.List;

import org.yen.day13.collection.music.model.ManageMusic;
import org.yen.day13.collection.music.model.Music;
import org.yen.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String [] args) {
		ViewMusic view = new ViewMusic();
		ManageMusic mng = new ManageMusic();
		// 맨처음에 0값으로 선언해주고 그 뒤부터는 타입 안쓰고 변수명만 ㅇㅇ
		String name = "";
		int index = 0;
		while(true) {
			// 이렇게 처음에 null값으로 선언해줘야한다.
			int choice = view.printMenu();
			Music music = null;
			List<Music> mList = null;
			switch(choice) {
			case 1:
				 music = view.inputMusic();
				// 원래는 위에 null로 선언하고 music만 하는거임 (위처럼)
				mng.registerMusic(music);
				break;
			case 2:
				music = view.inputMusic();
				mng.registerMusicAtFirst(music);
				break;
			case 3:
				mList = mng.getAllMusics();
				if(mList.size() > 0) {
					view.printMusicInfo(mList);
				} else {
					view.printMsg("정보가 존재하지 않습니다.");
				}
				break;
			// 4. 특정 곡 검색
			case 4:
				name = view.inputTitle("검색");
				music = mng.searchMusicByTitle(name);
				if(music!=null) {
					view.printMusicInfo(music);
				}else {
					view.printMsg("검색 결과가 없습니다.");
				}
				break;
			case 5:
				name = view.inputTitle("삭제");
//				music = mng.searchMusicByTitle(name);
//				mng.deleteMusic(music);
				// 수정할 위치
				index = mng.searchIndexByName(name);
				// 해당값 삭제
				mng.deleteMusic(index);
				break;
			case 6:
				name = view.inputTitle("수정");
				// 수정할 위치
				index = mng.searchIndexByName(name);
				// 수정할 정보
				music = mng.searchMusicByTitle(name);
				music = view.modifyMusic(music);	// 덮어씌우기
				mng.modifyMusic(index, music);
				break;
			// 7. 곡명 오름차순 정렬
			case 7:
				mng.sortByTitleASC();
				break;
			// 8. 곡명 내림차순
			case 8:
				mng.sortByDESC();
				break;
			// 9. 가수명 오름차순 정렬
			case 9:
				mng.sortBySingerASC();
				break;
			// 10. 가수명 내림차순 정렬
			case 10:
				mng.sortBySingerDESC();
				break;
			case 0:
				view.printMsg("프로그램을 종료합니다.");
				break;
			default:
				view.printMsg("메뉴를 잘못 선택하셨습니다.");
				break;
			}
		}
	}
}
