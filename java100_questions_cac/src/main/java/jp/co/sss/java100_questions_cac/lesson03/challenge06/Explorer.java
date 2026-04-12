/**
 * 第3章 探検隊のお仕事
 *
 * 問題6  トラが現れた
 *
 * 進行方向にトラが現れました。
 * この道を通るためには、トラがぐっすり寝ているタイミングで
 * 通り抜けなければなりません。
 * トラがぐっすり寝ている時間は1時間後、2時間後、3時間後
 * の何れかで、ランダムに決定します。
 * （※【int deepSleepTime = (int) (Math.random() * 10 % 3) + 1;】が
 *   ランダムに数値を作成する処理です。
 *   この処理によって、変数deepSleepTimeに1か2か3の数値が代入されます。）
 *
 * コメントの位置にfor文とif文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  トラ発見！
 *
 *
 *  隊長：
 *  1時間経過。
 *  今通り抜けますか？（はい… 1 : いいえ… その他のキー）＞2
 *
 *  隊長：
 *  2時間経過。
 *  今通り抜けますか？（はい… 1 : いいえ… その他のキー）＞2
 *
 *  隊長：
 *  3時間経過。
 *  もう後がないんで通り抜けますよ。
 *
 *
 * <通り抜けに失敗した場合の実行例>
 *  隊長：
 *  しまったトラがまだ起きてた！
 *
 * <通り抜けに成功した場合の実行例>
 *  隊長：
 *  成功！トラはぐっすり寝ています。
 *
 *
 * --------------------------------------------------------------------
 * 補足：Math.random()の解説
 * --------------------------------------------------------------------
 * Math.random()はテキストのLesson10クラスの利用で学習する内容ですが、
 * ここでは先取りして演習問題で利用してみましょう。
 * テキストP313～P314に概要説明がありますが、使い方は以下に説明します。
 *
 * ・Mathクラス
 * 数学的な計算を行う機能をまとめたクラスです。
 *
 * ・random()
 * 0.0以上で1.0より小さい、正の符号の付いたdouble型の数値を返します。乱数を生成するために
 * 利用される処理です。
 *
 * 戻り値：double型
 * 引数：なし
 * ※「戻り値」や「引数」はテキストのLesson8で学習する要素ですが、ここではあまり難しく考えないでください。
 *
 * この問題では1～3の乱数を求める必要があります。
 * しかし、Math.random()は0.0以上で1.0より小さいdouble型の乱数を返すため、
 * そのまま利用するだけでは1～3の乱数を取得できません。、
 *
 * Math.random()の結果を10倍すれば0.0以上で10より小さい数値にすることができます。
 * この数値を3で割った余り(剰余)を求めれば0.0以上で3.0より小さい数値にすることができます。
 * この問題で必要なのは1～3の範囲の変数なので、剰余の値に1を足せば1.0以上で4.0より小さいdouble型の
 * 数値を作り出すことができます。
 *
 */

package jp.co.sss.java100_questions_cac.lesson03.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

    public static void main(String[] args) throws IOException {

        System.out.println("隊長：");
        System.out.println("トラ発見！\n");

        int deepSleepTime = (int) (Math.random() * 10 % 3) + 1;
        int goTime = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //ここにfor文、if文を利用した処理を記述


        if (deepSleepTime == goTime) {
            System.out.println("\n隊長：");
            System.out.println("成功！トラはぐっすり寝ています。");
        } else {
            System.out.println("\n隊長：");
            System.out.println("しまったトラがまだ起きてた！");
        }

    }
}
