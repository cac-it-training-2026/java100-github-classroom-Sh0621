/**
 * 第7章 武士のお仕事
 *
 * 問題2  侍クラスを継承する②
 *
 * 侍クラス（Samurai）を継承する
 * 浪人クラス（Ronin）を作る。
 *
 * 侍クラス（Samurai）を継承する浪人クラス（Ronin）を作り、
 * covered()メソッド（戻り値void） を足してください。
 *
 * <実行例>
 * 侍は戦います。
 *
 * 侍1：
 * 戦うよ～。
 *
 * 浪人はそれに加えて傘張りもします。
 *
 * 浪人1：
 * 戦うよ～。
 * 傘張りするよ～。
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge02;

class Samurai {

    void fight() {
        System.out.println("戦うよ～。");
    }

}


//ここにRoninクラスを記述


public class CastleTown {

    public static void main(String[] args) {
        System.out.println("侍は戦います。\n");

        System.out.println("侍1：");

        Samurai samurai1 = new Samurai();
        samurai1.fight();

        System.out.println("\n浪人はそれに加えて傘張りもします。\n");

        System.out.println("浪人1：");


        //ここに必要な処理を記述


    }

}
