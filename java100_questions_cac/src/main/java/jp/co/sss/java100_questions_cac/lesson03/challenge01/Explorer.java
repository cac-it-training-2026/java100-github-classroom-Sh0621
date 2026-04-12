/**
 * 第3章 探検隊のお仕事
 *
 * 問題1  探検隊の募集
 *
 * コメントの位置にfor文を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  探検隊の隊員を5名募集します。
 *
 *  応募する人の名前を入れてください＞○○
 *
 *  隊長：
 *  ○○さん合格！
 *
 *  応募する人の名前を入れてください＞△△
 *
 *  隊長：
 *  △△さん合格！
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  応募する人の名前を入れてください＞□□
 *
 *  隊長：
 *  □□さん合格！
 *
 *  定員に達しました。募集を締め切ります。
 *
 */

package jp.co.sss.java100_questions_cac.lesson03.challenge01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("探検隊の隊員を5名募集します。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//ここにfor文を記述する。

			System.out.print("応募する人の名前を入れてください＞");

			String name = br.readLine();
			System.out.println("\n隊長：");
			System.out.println(name + "さん合格！\n");

		//ここに  } を記述する。

		System.out.println("定員に達しました。募集を締め切ります。");

	}
}
