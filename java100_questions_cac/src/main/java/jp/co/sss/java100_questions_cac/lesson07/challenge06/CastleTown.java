/**
 * 第7章 武士のお仕事
 *
 * 問題6  finalを付ける
 *
 * 究極の剣豪クラス（UltimateSwordsman）の継承を禁止する。
 *
 * 侍クラス（Samurai）を継承する究極の剣豪クラス（UltimateSwordsman）を
 * 作成し（継承を禁止する）、ふつうの剣豪クラス（EasySwordsman）が
 * このクラスを継承しようとするとどうなるか確認してください。
 * （EasySwordsmanのオブジェクトを生成してください）
 *
 * <実行例>
 * 究極の剣豪クラスを継承してみます。
 *
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
 *         型 EasySwordsman は final クラス UltimateSwordsman をサブクラス化できません
 *
 *         at lesson11_12.challenge06.EasySwordsman.<init>(CastleTown.java:35)
 *         at lesson11_12.challenge06.CastleTown.main(CastleTown.java:44)
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge06;

class Samurai {

    void fight() {
        System.out.println("戦うよ～。");
    }

    void work() {
        System.out.println("何かして働くよ～");
    }

}


//ここにUltimateSwordsmanクラスを記述


//ここにEasySwordsmanクラスを記述


public class CastleTown {

    public static void main(String[] args) {
        System.out.println("究極の剣豪クラスを継承してみます。\n");


       //ここにEasySwordsmanクラスのオブジェクト生成処理を記述


    }
}
