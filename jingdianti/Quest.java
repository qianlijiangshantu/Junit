package jingdianti;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quest {
	public static void main ( String [] args) throws ParseException {
		String inPut = "2017/3/11";
		System.out.println("inPut=" + inPut);
		Quest.henkan(inPut);		
	}
	private static String henkan(String strDate) {
		SimpleDateFormat henKanTime = new SimpleDateFormat("yyyy/MM/dd");
		henKanTime.setLenient(false);
		Date tempDate = null;
		try {
			tempDate = henKanTime.parse(strDate);
		}catch(ParseException e) {
			System.out.println("入力日付が不正です");
			return "変換できません";
		}
		SimpleDateFormat henkan2 = new SimpleDateFormat("yyyy/MM");
		String strHenkan = henkan2.format(tempDate);
		System.out.println("inPut=" + strHenkan);
		return strHenkan;
	}
}
