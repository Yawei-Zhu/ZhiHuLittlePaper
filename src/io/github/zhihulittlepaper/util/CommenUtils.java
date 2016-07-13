package io.github.zhihulittlepaper.util;

public class CommenUtils {
	public static String parseDate(String date) {
		StringBuilder sb = new StringBuilder();
		if(date != null && date.length() == 8) {
			sb.append(date.substring(0, 4));
			sb.append("��");
			sb.append(date.substring(4, 6));
			sb.append("��");
			sb.append(date.substring(6, 8));
			sb.append("��");
		}
		return sb.toString();
	}
}
