package RetailMeNot;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
/*
A String provided with file names with extensions along with size of each file.

 need to aggregate the file size of each extension and return as string.
 
 like music files have extensions mp3,aac,flac
 like image files have extensions jpg,bmp,gif
 
 so final answer should be like below in the separate line.
 music 1000b
 image 1200b
 movie 1300b
 other 1250b
 */
	
	public static void main(String[] args) {

		String s = "my.song.mp3 11b\n" + "greatSong.flac 1000b\n" + "not3.txt 5b\n" + "video.mp4 200b\n"
				+ "game.exe 100b\n" + "mov!e.mkv 10000b";
		System.out.println(sol(s));

	}

	public static String sol(String s) {
		int music = 0;
		int image = 0;
		int movie = 0;
		int other = 0;

		Map<String, String> map = new HashMap<>();

		map.put("mp3", "music");
		map.put("aac", "music");
		map.put("flac", "music");
		map.put("jpg", "image");
		map.put("bmp", "image");
		map.put("gif", "image");
		map.put("mp4", "movie");
		map.put("avi", "movie");
		map.put("mkv", "movie");

		String lines[] = s.split("\\r?\\n");

		for (String line : lines) {

			String spaceSplit[] = line.split(" ");

			String dotSplit[] = spaceSplit[0].split("\\.");

			int length = dotSplit.length;

			String filetype = dotSplit[length - 1];

			String filesize = spaceSplit[1].substring(0, spaceSplit[1].length() - 1);

			if ("music".equals(map.get(filetype))) {
				music = music + Integer.parseInt(filesize);
			} else if ("image".equals(map.get(filetype))) {
				image = image + Integer.parseInt(filesize);
			} else if ("movie".equals(map.get(filetype))) {
				movie = movie + Integer.parseInt(filesize);
			} else {
				other = other + Integer.parseInt(filesize);
			}
		}
		return "music " + String.valueOf(music) + "b\n" + "image " + String.valueOf(image) + "b\n" + "movie "
				+ String.valueOf(movie) + "b\n" + "other " + String.valueOf(other) + "b";
	}
}