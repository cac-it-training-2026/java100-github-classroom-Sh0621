/**
 * 第3章 探検隊のお仕事
 *
 * 問題5  ロープで崖を登る
 *
 * 進行方向に高さ30mの崖を発見しました。
 * 登るためには、鉤爪の付いたロープを投げて崖に引っ掛けながら
 * 登らなければなりません。
 * 投げるロープの長さは5m～8mの間で選べます。（小数点不可）
 *
 * コメントの位置にdo～while文を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  崖発見！
 *
 *  何メートルのロープを投げますか？（5～8）＞5
 *
 *  隊長：
 *  5m登ったよ
 *
 *  何メートルのロープを投げますか？（5～8）＞6
 *
 *  隊長：
 *  11m登ったよ
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  隊長：
 *  32m登ったよ
 *
 *  隊長：
 *  登り切ったよ！
 *
 *
 * <投げたロープが範囲外であった場合の実行例>
 *
 *  隊長：
 *  ロープの長さを間違ってるよ
 *
 */

package jp.co.sss.java100_questions_cac.lesson03.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

        public static void main(String[] args) throws IOException {

                System.out.println("隊長：");
                System.out.println("崖発見！\n");

                int fullHeight = 30;
                int totalLength = 0;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                //ここに do{ を記述する。

                        System.out.print("何メートルのロープを投げますか？（5～8）＞");
                        String lengthStr = br.readLine();
                        int length = Integer.parseInt(lengthStr);

                        System.out.println("\n隊長：");
                        if(5 <= length && length <= 8){
                                totalLength += length;
                                System.out.println(totalLength + "m登ったよ\n");
                        } else{
                                System.out.println("ロープの長さを間違ってるよ\n");
                        }

                ///ここにwhile文を記述する。

                System.out.println("登り切ったよ！");

        }
}
