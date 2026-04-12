/**
 * 第7章 武士のお仕事
 *
 * 問題7  toString()メソッドの利用
 *
 * toString()メソッドを適切にオーバーライドする。
 *
 * 問題4で作成した藩士クラスと問題5で作成した浪人クラスで
 * それぞれtoString()メソッドをオーバーライドし、<実行例>
 * と同じ結果になるように適切な処理記述しなさい。
 * （※Samuraiクラスにフィールドprotected String nameを追記）
 * （※藩士、浪人ともに名前はコンストラクタで設定する）
 * （※System.out.printlnを利用する）
 *
 * <実行例>
 * 藩士クラスのtoString()メソッドを確認します。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 *
 * 浪人クラスのtoString()メソッドを確認します。
 *
 * 拙者は武州○△□村の浪人、テスト兵衛ともうす。
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge07;

class Samurai {


    //ここにフィールドnameを記述


    void fight() {
        System.out.println("戦うよ～。");
    }

    void work() {
        System.out.println("何かして働くよ～");
    }

}


//ここにRetainerクラスを記述


//ここにRoninクラスを記述


public class CastleTown {

    public static void main(String[] args) {
        System.out.println("藩士クラスのtoString()メソッドを確認します。\n");


        //ここに適切な処理を記述


        System.out.println("\n浪人クラスのtoString()メソッドを確認します。\n");


        //ここに適切な処理を記述


    }
}
