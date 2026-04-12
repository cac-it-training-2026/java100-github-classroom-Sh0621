/**
 * 第7章 武士のお仕事
 *
 * 問題4  オーバーライド①
 *
 * 侍クラス（Samurai）のメソッドをオーバーライドする。
 *
 * 侍クラス（Samurai）にwork()メソッド（戻り値void）を追記し、
 * 藩士クラスでオーバーライドしてください。
 *
 * <実行例>
 * 侍は働きます。
 *
 * 侍1：
 * 何かして働くよ～。
 *
 * 具体的に言うと藩士は年貢を取り立てます。
 *
 * 藩士1：
 * 年貢を取り立てるよ～。
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge04;


class Samurai {

    void fight() {
        System.out.println("戦うよ～。");
    }


    //ここにwork()メソッドを記述


}


//ここに問題1で作成したRetainerを改変して記述


public class CastleTown {

    public static void main(String[] args) {
        System.out.println("侍は働きます。\n");

        System.out.println("侍1：");


        //ここに必要な処理を記述


        System.out.println("\n具体的に言うと藩士は年貢を取り立てます。\n");

        System.out.println("藩士1：");


        //ここに必要な処理を記述


    }
}
