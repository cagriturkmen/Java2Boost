package com.bilgeadam.boost.maraton.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SchoolManagementUtil {

	public static LocalTime readTime() {

		int i = 0;
		int n = 0;
		boolean isloop = false;

		do {
			try {
				
				i = readInt("Lütfen saat bilgisini rakam olarak 1-24 arassinda giriniz.");
				n = readInt("Lütfen dakika bilgisini rakam olarak 1-59 arassinda giriniz.");

				LocalTime readTime = LocalTime.of(i, n);

				return readTime;

			} catch (DateTimeException de) {

				System.out.println("Lutfen belirtilen aralikta deger giriniz.");
				System.out.println();

				isloop = true;

			} catch (Exception e) {

				System.out.println();
			}

		} while (isloop);
		return null;

	}
	
	// read time icin alternatif dongu denemesi
	public static LocalTime readTimeDeneme() {

		int i = 0;
		int n = 0;
		

		while (true) {
			try {
				
				i = readInt("Lütfen saat bilgisini rakam olarak 1-24 arassinda giriniz.");
				n = readInt("Lütfen dakika bilgisini rakam olarak 1-59 arassinda giriniz.");

				LocalTime readTime = LocalTime.of(i, n);

				return readTime;

			} catch (DateTimeException de) {

				System.out.println("Lutfen belirtilen aralikta deger giriniz.");
				System.out.println();


			} catch (Exception e) {

				System.out.println();
			}

		} 


	}

	// input birthDate as a string from user

	public static String readBirthDate() {

		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.println("Lutfen dogum tarihinizi (yyyy-mm-dd) formatinda giriniz:");
				String BirthDate = input.nextLine();
				return BirthDate;

			} catch (DateTimeParseException e) {
				System.out.println("Tekrar giris yapiniz.");
				input.nextLine();
			}

		} while (true);
	}

	// kullanicidan alinan tarih ile yas belirleme
	public static Long readAge(String str) {

		LocalDate dateOfBirth = LocalDate.parse(str);
		Long age = dateOfBirth.until(LocalDate.now(), ChronoUnit.YEARS);

		return age;
	}

	// kullanicidan alinan tarih ile yas ve dogum yili belirleme
	public static Map<String, Object> readBirth() {

		Map<String, Object> myMap = new HashMap<>();

		String aDate = SchoolManagementUtil.readString("Lutfen dogum tarihinizi (yyyy-mm-dd) formatinda giriniz:");
		LocalDate dateOfBirth = LocalDate.parse(aDate);

		Long age = dateOfBirth.until(LocalDate.now(), ChronoUnit.YEARS);

		myMap.put("age", age);
		myMap.put("dateOfBirth", dateOfBirth);

		return myMap;
	}

	// kullanicidan tarih alma
	public static LocalDate readDate(String str) {
		boolean isloop = false;

		do {
			LocalDate Date = null;
			try {

				String aDate = SchoolManagementUtil.readString(str + " tarihini (yyyy-mm-dd) formatinda giriniz:");

				Date = LocalDate.parse(aDate);
				return Date;
			} catch (DateTimeParseException e) {

				isloop = true;

				System.out.println("Lutfen formata uygun giris yapiniz");

			}
			return Date;

		} while (isloop);

	}

	// kullanicidan String i Localdat e cevirme
	public static LocalDate stringToDate(String date) {
		boolean isloop = false;

		do {
			LocalDate Date = null;
			try {

				String aDate = date;

				Date = LocalDate.parse(aDate);
				return Date;
			} catch (DateTimeParseException e) {

				isloop = true;

				System.out.println("Lutfen formata uygun giris yapiniz");

			}
			return Date;

		} while (isloop);

	}

	// yeni dosya(file) olusturma
	public static Map<String, Object> newFile() {

		Map<String, Object> myMap = new HashMap<>();
		String path = "";
		try {
			path = SchoolManagementUtil.readString(
					"Lutfen dosya olusturmak istediginiz yolu (D:\\bilgeAdamDeneme\\folder\\homework.txt) seklinde belirtiniz");
			File myFile = new File(path);
			if (myFile.createNewFile()) {
				System.out.println("Dosya olusturuldu: " + myFile.getName());

			} else {
				System.out.println("Dosya olusturulamadi,zaten mevcut.");
			}

			myMap.put("path", path);
			myMap.put("file", myFile);

		} catch (IOException e) {
			System.out.println("Hata mevcut.");
			e.printStackTrace();
		}

		return myMap;
	}

	// yeni klasor(repository) olusturma
	public static String newFolder() {
		String path = "";

		path = SchoolManagementUtil.readString(
				"Lutfen klasor olusturmak istediginiz yolu (D:\\bilgeAdamDeneme\\folder) seklinde belirtiniz");

		File myFolder = new File(path);

		boolean bool = myFolder.mkdir();
		if (bool) {
			System.out.println("Klasor olusturuldu: " + myFolder.getName());
		} else {
			System.out.println("Klasor olusturulamadi.");
		}
		return path;
	}

	// dosyaya yazma islemi obj - to obj

	public static void writeFileObj(String path, List<Object> listObject) {

		File file = new File(path);

		try {
			FileOutputStream foutput = new FileOutputStream(file);
			ObjectOutputStream output = new ObjectOutputStream(foutput);
			output.writeObject(listObject);
			output.flush();
			output.close();

		} catch (IOException ex) {

			System.err.println("Hata!\nDosyaya Yazilamadi.");
			ex.printStackTrace();

		}catch (Exception e) {

			System.err.println("Hata!\nDosyaya Yazilamadi.");
			e.printStackTrace();

		}
	}

	public static List<Object> readFromFileObj(String path) {

		File file = new File(path);
		try {
			FileInputStream foutput = new FileInputStream(file);
			ObjectInputStream output = new ObjectInputStream(foutput);
			Object obj = null;
			if ((obj = output.readObject()) != null)

				return (List<Object>) obj;

		} catch (ClassNotFoundException | EOFException ex) {

			return new ArrayList<>();

		} catch (Exception e) {

			return new ArrayList<>();
		}
		return new ArrayList<>();

	}

	// dosyaya yazma islemi obj - to string
	public static void writeFile(String path, Object obj) {

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {

			bufferedWriter.write("\n" + obj.toString());
			bufferedWriter.flush();
			System.out.println("Yazma islemi basarili");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// dosya okuma islemi
	public static void readFile(String path) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

			String totalRows = "";
			String row = "";

			while ((row = bufferedReader.readLine()) != null) {
				totalRows = totalRows + row + "\n";
			}

			System.out.println(totalRows);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// dosya silme islemi
	public static void deleteFile(File file, String path) {

		try {

			if (file.exists()) {
				file.delete();
				System.out.println("Dosya Silindi");
			} else {
				System.out.println("Dosya Silinemedi");

				System.out.println("path:" + file.toPath());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// baslik ekleme
	public static void printTitle(String msg, int length) {

		printLine(length);
		int center = (Math.round((length + 10) / 2) - 10);
		int end = (length + 10) - (center + msg.length());
		print(String.format("%." + center + "s%s%" + end + "s", "", msg, ""), 2, true);
		printLine(length);
	}

	// basit baslik ekleme
	public static void basicTitle(String msg, int length) {

		// printLine(length);
		int center = (Math.round((length + 10) / 2) - 10);
		int end = (length + 10) - (center + msg.length());
		print(String.format("%." + center + "s%s%" + end + "s", "", msg, ""), 2, true);
		printLine(length);
	}

	// menu olusturma return int
	public static int showMenuI(String title, Map<Integer, String> menu) {

		printTitle(title, 20);

		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			print(String.format("%02d . %-30s ", key, val), 2, true);

		}
		printLine(20);
		System.out.println("                Lutfen yapmak istediginiz islemi seciniz:");
		return selectDigitSecim();
	}

	// basit ara menu olusturma return int
	public static int basicMenuI(String title, Map<Integer, String> menu) {

		basicTitle(title, 20);

		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			print(String.format("%02d . %-30s ", key, val), 2, true);

		}

		return selectDigitSecim();
	}

	// baslik ve menu icin cizgiler olusturma
	public static void printLine(int msgLong) {

		int lineLong = (msgLong % 2 == 0) ? msgLong + 20 : msgLong + 20;
		StringBuilder line = new StringBuilder();
		line.append("\t\t");
		for (int i = 0; i < lineLong; i++) {
			line.append("-");
		}
		System.out.printf("%s\n", line);
	}

	// baslik ve menu icin print methodu
	public static void print(String msg, int tabCount, boolean ln) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < tabCount; i++) {
			b.append("\t");
		}
		b.append(msg);
		b.append(ln ? "\n" : "");
		System.out.print(b);

	}

	public static String selectStringChoose() {

		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		return inputStr;

	}

	public static int selectDigitSecim() {
		Scanner input = new Scanner(System.in);

		do {

			try {

				int inputInt = input.nextInt();
				return inputInt;

			} catch (Exception e) {
				System.out.println("Lutfen belirtilen degerlerden secim yapiniz.\nTekrar Deneyiniz.");
				input.nextLine();

			}

		} while (true);
	}

	// kullanicidan int degeri alma
	public static int readInt(String msg) {
		Scanner input = new Scanner(System.in);

		do {

			try {
				System.out.println(msg);
				int inputInt = input.nextInt();
				return inputInt;

			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();

			}

		} while (true);

	}

	// kullanicidan string degeri alma
	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);

		do {

			try {
				System.out.println(msg);
				String inputStr = input.nextLine();
				return inputStr;

			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();

			}

		} while (true);
	}

	// kullanicidan buyuk harf string degeri alma
	public static String readFString(String msg) {
		Scanner input = new Scanner(System.in);

		do {

			try {
				System.out.println(msg);
				String inputStr = input.nextLine();
				return inputStr.toUpperCase();

			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();

			}

		} while (true);
	}

	// kullanicidan double degeri alma
	public static double readDouble(String msg) {
		Scanner input = new Scanner(System.in);

		do {

			try {
				System.out.println(msg);
				double inputDouble = input.nextDouble();
				return inputDouble;

			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();

			}

		} while (true);
	}

	// isleme devam etme loop
	public static boolean isContinue(String msg, String exitKey) {

		String key = "";

		Scanner input = new Scanner(System.in);
		System.out.println(msg);

		do {
			try {
				key = input.next();
				if (key.equalsIgnoreCase(exitKey)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {

			}

		} while (true);

	}


}

