/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題3 宇宙船の機能を切り替える
 *
 * 宇宙船クラス（Spaceship）にフィールド一つとメソッド二つを
 * 追加して、使用燃料を指定して航行するモードと、燃料を指定せずの
 * 自動で航行するモードを、引数の違いだけで切り替えること
 * ができるようにしてください。（オーバーロード）
 *
 * 宇宙船の燃料タンク(fuel)とsetter、getterを記述する。
 * メソッドconsumingFuel()を引数あり、なしでそれぞれ作成する。
 * （戻り値はlightYears）
 * 引数ありの方は受け取った値10倍する。fuelから受け取った値を引く。
 * なしの方はfuel/2の値を10倍する。fuelの値は1/2になる。
 * 実行例と同じメッセージを表示しください。
 *
 * <実行例>
 * 空気を入れてください＞○
 * 燃料を入れてください＞○
 *
 * 【※設定した値】リットルの空気が入りました。
 *
 * 自動で航行します。
 * 航行距離：○○○光年
 *
 * 燃料で航行します。
 * 使用燃料を入力してください＞○
 * 航行距離：○○○光年
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Spaceship {
    private int air;
   //ここにフィールドを追加する。

    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }


    //ここに適切な処理を記述する。


}

public class Astronaut {

    public static void main(String[] args) throws IOException {

        System.out.print("空気を入れてください＞");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String airStr = br.readLine();
        int air = Integer.parseInt(airStr);

        System.out.print("燃料を入れてください＞");
        String fuelStr = br.readLine();
        int fuel = Integer.parseInt(fuelStr);

        Spaceship spaceship = new Spaceship();
        spaceship.setAir(air);


        //ここでフィールドのfuelに値を設定する。


        System.out.println("\n"+spaceship.getAir() + "リットルの空気が入りました。");

        System.out.println("自動で航行します。");


        //ここに適切な処理を記述する。


        System.out.println("燃料で航行します。");
        System.out.print("使用燃料を入力してください＞");
        String consumingFuelStr = br.readLine();
        int consumingFuel = Integer.parseInt(consumingFuelStr);


        //ここに適切な処理を記述する。


    }

}
