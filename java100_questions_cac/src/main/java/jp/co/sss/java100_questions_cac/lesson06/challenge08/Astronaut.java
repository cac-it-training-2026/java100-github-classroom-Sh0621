/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題8 宇宙船の台数を数える
 *
 * 問題7で作成した宇宙船クラス（Spaceship）に
 * クラスメソッドcount()を追加して、現在までに作成された宇宙船が
 * 何台あるのかを表示してください。
 *
 * <実行例>
 * 新しい宇宙船を作成します。
 *
 * 新しい宇宙船を作成します。
 *
 * 新しい宇宙船を作成します。
 *
 * 宇宙船は全部で3台あります。
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge08;

class Spaceship {
    private int air;
    private int fuel;
    private static int number;

    public Spaceship() {
        System.out.println("新しい宇宙船を作成します。\n");
        number++;
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

    //ここに適切な処理を記述する。

}

public class Astronaut {

    public static void main(String[] args) {

        Spaceship spaceship1 = new Spaceship();
        Spaceship spaceship2 = new Spaceship();
        Spaceship spaceship3 = new Spaceship();

        //ここに適切な処理を記述する。
    }
}
