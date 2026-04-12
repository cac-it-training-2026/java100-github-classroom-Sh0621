/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題6 宇宙船の製造を禁止する
 *
 * 宇宙船クラス（Spaceship）のコンストラクタ（引数なし）の
 * アクセス修飾子を変更して、引数なしで宇宙船オブジェクトを
 * 作成することが出来ないようにしてください。
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge06;

class Spaceship {
    private int air;
    private int fuel;

    //このコンストラクタを変更する。
    public Spaceship() {
        this.air = 100;
        this.fuel = 100;
    }

    public Spaceship(int air, int fuel) {
        this.air = air;
        this.fuel = fuel;
    }

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

        //コメントを外すとコンパイルエラーになる
        //Spaceship spaceship1 = new Spaceship();


    }
}
