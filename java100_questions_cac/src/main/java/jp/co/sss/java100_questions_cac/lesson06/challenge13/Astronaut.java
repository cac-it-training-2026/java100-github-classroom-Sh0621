/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題13 Mathクラス①（floor）
 *
 * そろそろ地球に戻りたくなってきました。
 * しかし途中一切補給をしていませんでしたので、
 * 燃料が足りるか不安です。
 * 小数点以下切り捨てで12ガロンあれば足りるのですが。。。
 *
 * 宇宙船クラス（Spaceship）に燃料タンク(fuel)とsetter、getterを記述し、
 * メソッドpublic boolean checkFuel(double fuelNum)を記述してください。
 * checkFuelメソッドは燃料が足りていればtrue、足りていなければ
 * falseを返します。
 *
 * <実行例1>
 *
 * 宇宙飛行士：
 * そろそ地球に帰りたくなってきたな～。
 * 燃料を調べてみるか。
 *
 * 燃料を入力してください＞12.35
 *
 * 宇宙飛行士：
 * よし！足りてる足りてる。
 *
 * <実行例2>
 *
 * 宇宙飛行士：
 * そろそ地球に帰りたくなってきたな～。
 * 燃料を調べてみるか。
 *
 * 燃料を入力してください＞11.75
 *
 * 宇宙飛行士：
 * えっ！足りてないよ。どうしよう。。。
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//ここにSpaceshipクラスを記述する


public class Astronaut {

    public static void main(String[] args) throws IOException {

        System.out.println("宇宙飛行士：");
        System.out.println("そろそ地球に帰りたくなってきたな～。");
        System.out.println("燃料を調べてみるか。\n");

        System.out.print("燃料を入力してください＞");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fuelStr = br.readLine();
        double fuelNum = Double.parseDouble(fuelStr);


        //ここに適切な処理を記述する


        boolean isCheck = false;


        //ここに適切な処理を記述する


        System.out.println("\n宇宙飛行士：");
        if(isCheck){
            System.out.println("よし！足りてる足りてる。");
        } else {
            System.out.println("えっ！足りてないよ。どうしよう。。。");
        }
    }
}
