/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題5 宇宙船に初期値を代入②
 *
 * 問題4で作成した宇宙船クラス（Spaceship）に
 * 受け取った引数を初期値として設定するコンストラクタを追加します。
 *
 * 宇宙船の空気タンクと燃料タンクにそれぞれ入力された値を初期値として
 * 代入する引数ありのコンストラクタを追加してください。
 *
 * <実行例>
 * 空気の初期値は：【引数なしのコンストラクタで設定した値】リットルです。
 * 燃料の初期値は：【引数なしコンストラクタで設定した値】ガロンです。
 *
 * 空気の初期値を入力してください＞○
 * 燃料の初期値を入力してください＞○
 *
 * 空気の初期値は：【引数ありのコンストラクタで設定した値】リットルです。
 * 燃料の初期値は：【引数ありコンストラクタで設定した値】ガロンです。
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Spaceship {
    private int air;
    private int fuel;

    public Spaceship() {
        this.air = 100;
        this.fuel = 100;
    }

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

    public static void main(String[] args) throws IOException {

        Spaceship spaceship1 = new Spaceship();
        System.out.print("空気の初期値は：" +spaceship1.getAir()+"リットルです。\n");
        System.out.print("燃料の初期値は：" +spaceship1.getFuel()+"ガロンです。\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n空気の初期値を入力してください＞");
        String airStr = br.readLine();
        int air = Integer.parseInt(airStr);

        System.out.print("燃料の初期値を入力してください＞");
        String fuelStr = br.readLine();
        int fuel = Integer.parseInt(fuelStr);

        //ここに適切な処理を記述する。

    }
}
