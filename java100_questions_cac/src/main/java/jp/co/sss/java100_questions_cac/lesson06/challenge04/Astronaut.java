/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題4 宇宙船に初期値を代入①
 *
 * 宇宙船クラス（Spaceship）のフィールドに初期値を
 * 設定するコンストラクタを追加します。
 *
 * 宇宙船の空気タンクと燃料タンクにそれぞれ100を初期値として
 * 代入する引数なしのコンストラクタを追加してください。
 *
 * <実行例>
 * 空気の初期値は：【コンストラクタで設定した値】リットルです。
 * 燃料の初期値は：【コンストラクタで設定した値】ガロンです。
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge04;

class Spaceship {
    private int air;
    private int fuel;

    //ここに適切な処理を記述する。

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }

}

public class Astronaut {

    public static void main(String[] args) {

        //ここに適切な処理を記述する。

    }
}
