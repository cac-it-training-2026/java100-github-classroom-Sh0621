/**
 * 第7章 武士のお仕事
 *
 * 問題1  侍クラスを継承する①
 *
 * 侍クラス（Samurai）を継承する
 * 藩士クラス（Retainer）を作る。
 *
 * 侍クラス（Samurai）を継承する藩士クラス（Retainer）を作り、
 * getPaid()メソッド（戻り値void） を足してください。
 *
 * <実行例>
 * 侍は戦います。
 *
 * 侍1：
 * 戦うよ～。
 *
 * 藩士はそれに加えて給料をもらいます。
 *
 * 藩士1：
 * 戦うよ～。
 * 給料をもらうよ～。
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge01;

class Samurai {

    void fight() {
        System.out.println("戦うよ～。");
    }

}


//ここにRetainerクラスを記述


public class CastleTown {

    public static void main(String[] args) {
        System.out.println("侍は戦います。\n");

        System.out.println("侍1：");

        Samurai samurai1 = new Samurai();
        samurai1.fight();

        System.out.println("\n藩士はそれに加えて給料をもらいます。\n");

        System.out.println("藩士1：");


        //ここに必要な処理を記述


    }

}
