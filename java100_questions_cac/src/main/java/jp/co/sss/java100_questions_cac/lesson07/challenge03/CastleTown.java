/**
 * 第7章 武士のお仕事
 *
 * 問題3  藩士クラスを継承する
 *
 * 藩士クラス（Retainer）を継承する
 * 奉行クラス（Magistrate）を作る。
 *
 * 問題1で作成した藩士クラス（Retainer）を継承する
 * 奉行クラス（Magistrate）を作り、
 * judge()メソッド（戻り値void） を足してください。
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
 * 奉行はそれに加えて判決も下します。
 *
 * 奉行1：
 * 戦うよ～。
 * 給料をもらうよ～。
 * 判決を下すよ～。
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge03;

class Samurai {

    void fight() {
        System.out.println("戦うよ～。");
    }

}


//ここに問題1で作成したRetainerクラスを記述


//ここにMagistrateクラスを記述


public class CastleTown {

    public static void main(String[] args) {
        System.out.println("侍は戦います。\n");

        System.out.println("侍1：");

        Samurai samurai1 = new Samurai();
        samurai1.fight();

        System.out.println("\n藩士はそれに加えて給料をもらいます。\n");

        System.out.println("藩士1：");


        //ここに必要な処理を記述


        System.out.println("\n奉行はそれに加えて判決も下します。\n");

        System.out.println("奉行1：");


        //ここに必要な処理を記述


    }
}
