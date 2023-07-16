package com.pratiti.App;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.pratiti.dao.AlbumSongDao;
import com.pratiti.entity.Album;
import com.pratiti.entity.Song;

public class AlbumSongApp {
	public static void main(String[] args) {
		AlbumSongDao dao = new AlbumSongDao();
		
//		adding album & songs at a time   *******************************************************************************
//		Album alb = new Album();
//
//		Song song = new Song();
//		song.setTitle("songgggggg title2");
//		song.setArtist("Artist2");
//		song.setAlbum(alb);
//
//		
//		Song song2 = new Song();
//		song2.setTitle("songgggggggggg title3");
//		song2.setArtist("Artist3");
//		song2.setAlbum(alb);
//		
//		// Album la value dilya
//		alb.setName("Album2222");
//		alb.setReleased(LocalDate.of(2022, 11, 10));
//		
//		List<Song> songList = new ArrayList<Song>();
//		songList.add(song);
//		songList.add(song2);
//		alb.setSongs(songList);
//		
//		dao.save(alb);
		
// 		jar already banlelya album madhe values add karaychya aslya***************************************************
//		Album alb2 = (Album) dao.fetchById(Album.class, 14);
		
//		song.setTitle("song title3");
//		song.setArtist("Artist3");
//		song.setAlbum(alb2);
//		dao.save(song);					//************ fakt song add karaych asl tar
//		
//		song.setTitle("song title4");
//		song.setArtist("Artist4");
//		song.setAlbum(alb2);
//		dao.save(song);
//		
//		song.setTitle("song title5");
//		song.setArtist("Artist5");
//		song.setAlbum(alb2);
//		dao.save(song);

// fetching song with artist name **************************************************************************
//		List<Song> l = dao.fetchSongSungBy("Artist2");
//		for(Song i:l) {
//			System.out.println(i.getTitle() + "   ----->     " + i.getArtist());
//		}

// fetching album with artist name **************************************************************************
		List<Album> l2 = dao.fetchAlbumByArtist("Artist2");
		for(Album i:l2) {
			System.out.println(i.getName() + "   ----->     " + i.getReleased());
		}
	}


}
