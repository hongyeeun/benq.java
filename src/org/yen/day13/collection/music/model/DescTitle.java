package org.yen.day13.collection.music.model;

import java.util.Comparator;

public class DescTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle()) * -1 ;
		// -1 을 곱해서 1 결과일땐 -1 나오고, 1 결과일땐 -1 나오므로 
		// 역순으로 나온다.
	}

}
