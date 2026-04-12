/**
 * 第2章 名探偵のお仕事
 *
 * 問題9 容疑者の絞り込み
 *
 * 論理演算子&&を利用し、
 * コメントの位置に適切なコードを記述してください。
 *
 * <実行例>
 * 探偵：
 * 容疑者の特定は出来ていますか？
 *
 * 助手：
 * 私の調査によると、容疑者はＬ氏、Ｍ氏、Ｎ氏、Ｏ氏の4名が挙がっています。
 * 各人の特徴は、次の通りです。
 *
 * Ｌ氏：依頼主の知人。体重100kg、身長190cmの巨漢。
 * Ｍ氏：依頼主の隣人。体重65kg、身長170cmの中肉中背。
 * Ｎ氏：依頼主の後輩。体重79kg、身長186cmの痩せ身。
 * Ｏ氏：通りすがりの人。体重70kg、身長192cmのヒョロ長。
 *
 * 探偵：
 * あなたが犯人だと思う人の身長と体重を入れてみてください。
 *
 * 身長をここに入力＞○○
 * 体重をここに入力＞○○
 *
 *
 * <犯人の可能性がある場合の実行例>
 * 探偵：
 * その方は犯人である可能性がありますね。
 *
 * <犯人の可能性がない場合の実行例>
 * 探偵：
 * その方は犯人ではありませんね。
 *
 */

package jp.co.sss.java100_questions_cac.lesson02.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Detective {

	public static void main(String[] args) throws IOException {

		System.out.println("探偵：");
		System.out.println("容疑者の特定は出来ていますか？\n");
		System.out.println("助手：");
		System.out.println("私の調査によると、容疑者はＬ氏、Ｍ氏、Ｎ氏、Ｏ氏の4名が挙がっています。");
		System.out.println("各人の特徴は、次の通りです。\n");
		System.out.println("Ｌ氏：依頼主の知人。体重100kg、身長190cmの巨漢。");
		System.out.println("Ｍ氏：依頼主の隣人。体重65kg、身長170cmの中肉中背。");
		System.out.println("Ｎ氏：依頼主の後輩。体重79kg、身長186cmの痩せ身。");
		System.out.println("Ｏ氏：通りすがりの人。体重70kg、身長192cmのヒョロ長。\n");
		System.out.println("探偵：");
		System.out.println("あなたが犯人だと思う人の身長と体重を入れてみてください。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("身長をここに入力＞");
		String heightStr = br.readLine();
		System.out.print("体重をここに入力＞");
		String weightStr = br.readLine();
		int height = Integer.parseInt(heightStr);
		int weight = Integer.parseInt(weightStr);

		//ここに記述

	}

}
