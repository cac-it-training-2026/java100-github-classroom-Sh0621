/**
 * 第2章 名探偵のお仕事
 *
 * 問題10 犯人の特定
 *
 * 条件演算子を利用し、
 * コメントの位置に適切なコードを記述してください。
 *
 * <実行例>
 * 探偵：
 * 犯人の可能性があるのはＮ氏か、Ｏ氏ですね。
 * この二人について他に情報はありませんか？
 *
 * 助手：
 * Ｎ氏は犬に嫌われるタイプですぐに吠えられます。逆にＯ氏は犬好きです。
 *
 * 探偵：
 * それだけじゃ犯人を特定できませんね。
 *
 * 依頼主：
 * ちなみに犯行当日は裏山に続く道は工事中で通れませんでした。
 *
 * 探偵：
 * じゃあ犯人がわかりました。
 *
 * 助手：
 * 本当ですか！
 *
 * 探偵：
 * あなたが思う犯人は誰ですか？当ててみてください。
 *
 * 1．Ｎ氏
 * 2．Ｏ氏
 *
 * 1か2をここに入力＞
 *
 *
 * <犯人を当てた場合の実行例>
 * 探偵：
 * 正解です。
 *
 * <犯人を当たられなかった場合の実行例>
 * 探偵：
 * 不正解です。
 *********************************************************************
 *ご注意
 *この問題を完成させるには犯人が誰であるかを判断する処理を書かねばなりません。
 *プログラマーが犯人が誰であるかを知らないとプログラムは完成しません。
 *lesson5のchallenge09までの問題文と、この問題の問題文から犯人がN氏なのかＯ氏なのかを
 *判断して犯人を推測してください。
 *プログラムの利用者がコンソールから入力した選択肢が正解のときに「探偵：　犯人です。」を、
 *不正解のときには「探偵：　不正解です。」を表示するようにしてください
 ********************************************************************* *
 */

package jp.co.sss.java100_questions_cac.lesson02.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Detective {

	public static void main(String[] args) throws IOException {

		System.out.println("探偵：");
		System.out.println("犯人の可能性があるのはＮ氏か、Ｏ氏ですね。");
		System.out.println("この二人について他に情報はありませんか？\n");
		System.out.println("助手：");
		System.out.println("Ｎ氏は犬に嫌われるタイプですぐに吠えられます。逆にＯ氏は犬好きです。\n");
		System.out.println("探偵：");
		System.out.println("それだけじゃ犯人を特定できませんね。\n");
		System.out.println("依頼主：");
		System.out.println("ちなみに犯行当日は裏山に続く道は工事中で通れませんでした。\n");
		System.out.println("探偵：");
		System.out.println("じゃあ犯人がわかりました。\n");
		System.out.println("助手：");
		System.out.println("本当ですか！\n");
		System.out.println("探偵：");
		System.out.println("あなたが思う犯人は誰ですか？当ててみてください。\n");
		System.out.println("1．Ｎ氏");
		System.out.println("2．Ｏ氏");
		System.out.print("\n1か2をここに入力＞");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();
		int num = Integer.parseInt(numStr);

		//ここに記述する

	}

}
