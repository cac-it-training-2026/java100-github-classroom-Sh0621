/**
 * 第3章 探検隊のお仕事
 *
 * 問題3  船で現地へ
 *
 * 船で現地へ向かいます。
 * この船は1時間で22マイル進み、目的地までは500マイルです。
 *
 * コメントの位置にwhile文を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  出発進行！
 *
 *  隊長：
 *  1時間たったよ
 *
 *  隊長：
 *  2時間たったよ
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  隊長：
 *  23時間たったよ
 *
 *  到着！
 *
 */

package jp.co.sss.java100_questions_cac.lesson03.challenge03;

import java.io.IOException;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("出発進行！\n");

		int nauticalMile = 500;
		int apsedTime = 0;

		//ここにwhile文を記述する。

			nauticalMile -= 22;
			System.out.println("隊長：");
			System.out.println((apsedTime += 1) + "時間たったよ\n");

		//ここに  } を記述する。

		System.out.println("到着！");

	}
}
