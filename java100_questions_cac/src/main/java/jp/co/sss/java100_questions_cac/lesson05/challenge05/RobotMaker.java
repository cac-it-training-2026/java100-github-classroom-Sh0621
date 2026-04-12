/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題5  出る水の量を自由に変える
 *
 * 引数を元に出力内容を変えるメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  でもランダムだと必要な量だけ出せないですね。
 *
 *  G博士：
 *  そう言うと思って水量調節機能を実装してみたぞ。
 *
 *  Rさん：
 *  どうやって使うんですか？
 *
 *  G博士：
 *  簡単じゃ。必要な水量をリットル単位で入力すればいいんじゃ。
 *
 *  出したい水の量を入力してください＞○
 *
 *  水を【※ここに水量を出力】リットル出します。
 *
 */

package jp.co.sss.java100_questions_cac.lesson05.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここに問題4で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：setWater(引数int water、戻り値void、フィールドwaterに引数の値を代入する)
//メソッドpumpWaterを改修し、randomWater()を削除

public class RobotMaker {

    public static void main(String[] args) throws IOException {

        System.out.println("Rさん：");
        System.out.println("でもランダムだと必要な量だけ出せないですね。\n");
        System.out.println("G博士：");
        System.out.println("そう言うと思って水量調節機能を実装してみたぞ。\n");
        System.out.println("Rさん：");
        System.out.println("どうやって使うんですか？\n");
        System.out.println("G博士：");
        System.out.println("簡単じゃ。必要な水量をリットル単位で入力すればいいんじゃ。\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("出したい水の量を入力してください＞");
        String waterStr = br.readLine();
        int water = Integer.parseInt(waterStr);

        //ここでRobotクラスのインスタンスを作り、
        //（インスタンス名はrobot）
        //setWaterを実行する。
        //pumpWaterを実行する。
    }

}
