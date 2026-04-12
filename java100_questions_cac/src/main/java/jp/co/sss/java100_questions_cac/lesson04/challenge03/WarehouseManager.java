/**
 * 第4章 倉庫番のお仕事
 *
 * 問題3  倉庫管理の基礎③
 *
 * XO商事に入社して3日目を迎えたYさん。
 * 基礎編の研修は本日で終わりです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Z先輩：
 *  それではこれより新人研修の第3回目を始めます。
 *
 *  Yさん：
 *  はい、よろしくお願いします。
 *
 *  Z先輩：
 *  今回の研修では、配列のデータ型はString型で固定とさせていただき、
 *  要素数と代入する値については、お客様に入力していただくという
 *  手順をやってみましょう。
 *
 *  Yさん：
 *  はい、わかりました。
 *
 *  Z先輩：
 *  やや、お客様がご来店だ!
 *
 *  Z先輩：
 *  いらっしゃいませ、本日はString型のみの販売になります。
 *
 *  要素数を入れてください＞○
 *
 *  代入する値を入れてください＞○
 *
 *  代入する値を入れてください＞△
 *
 *  代入する値を入れてください＞□
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  Yさん：
 *  ...出来ました。
 *
 *  Z先輩：
 *  全部の要素を出力してください。
 *
 *  Yさん：
 *  【※ここに値を出力】
 *  【※ここに値を出力】
 *  【※ここに値を出力】
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *  です。
 *
 *  Z先輩：
 *  はい、ありがとう。ちゃんと出来てますね。
 *
 *
 */

package jp.co.sss.java100_questions_cac.lesson04.challenge03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		System.out.println("Z先輩：");
		System.out.println("それではこれより新人研修の第3回目を始めます。\n");
		System.out.println("Yさん：");
		System.out.println("はい、よろしくお願いします。\n");

		System.out.println("Z先輩：");
		System.out.println("今回の研修では、配列のデータ型はString型で固定とさせていただき、");
		System.out.println("要素数と代入する値については、お客様に入力していただくという");
		System.out.println("手順をやってみましょう。\n");

		System.out.println("Yさん：");
		System.out.println("はい,わかりました。\n");

		System.out.println("Z先輩：");
		System.out.println("やや、お客様がご来店だ!\n");

		System.out.println("Z先輩：");
		System.out.println("いらっしゃいませ、本日はString型のみの販売になります。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("要素数を入れてください＞");


		//ここに入力処理を記述する


		//ここに配列宣言を記述する


		//ここに値の入力+代入処理を記述する（for文）


		System.out.println("\nYさん：");
		System.out.println("...出来ました。\n");

		System.out.println("Z先輩：");
		System.out.println("全部の要素を出力してください。\n");

		System.out.println("Yさん：");


		//ここに配列の値の出力処理を記述する（for文）


		System.out.println("です。\n");

		System.out.println("Z先輩：");
		System.out.println("はい、ありがとう。ちゃんと出来てますね。\n");
	}
}
