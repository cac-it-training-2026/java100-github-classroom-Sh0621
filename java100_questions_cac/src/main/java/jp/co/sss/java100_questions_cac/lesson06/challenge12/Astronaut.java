/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//ここにOmegalianクラスを記述する


public class Astronaut {

    public static void main(String[] args) throws IOException {

        System.out.print("Ω星人にアイテムを渡してください＞");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String present = br.readLine();


        //ここに適切な処理を記述する


        String item = null;


        //ここに適切な処理を記述する


        System.out.println("\nΩ星人：");
        System.out.println("えっ！" + item + "をくれるオメガか！");
        System.out.println("ありがとうオメガ。");
    }
}
