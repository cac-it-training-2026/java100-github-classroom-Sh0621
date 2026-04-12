/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題2 宇宙船に補給ができるようにする
 *
 * 宇宙船クラス（Spaceship）のフィールドに
 * 値を設定できるようにします。
 *
 * 船内の空気タンク(air)に値を設定するメソッド（setter）、
 * 空気タンク(air)から値を取りだすメソッド（getter）を
 * それぞれ適切な名前でSpaceshipクラスに追加して、
 * 実行例と同じメッセージを表示しください。
 *
 * <実行例>
 * 空気を入れてください＞○
 *
 * 【※設定した値】リットルの空気が入りました。
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Spaceship {
    private int air;

    //ここに適切な処理を記述する。
}

public class Astronaut {

    public static void main(String[] args) throws IOException {

        System.out.print("空気を入れてください＞");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String airStr = br.readLine();
        int air = Integer.parseInt(airStr);

        //ここに適切な処理を記述する。

    }

}
