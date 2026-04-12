/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題3  ロボットに機能を持たせる
 *
 * ロボットに本来の目的である調理機能を追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  G博士：
 *  今度は調理機能を実装してみたぞ！
 *
 *  Rさん：
 *  いいですね～。きんぴらごぼうとかひじきの煮つけとか。
 *
 *  G博士：
 *  ......そういうのはまだ無理じゃ。
 *
 *  Rさん：
 *  じゃあ何なら出来るんですか？
 *
 *  G博士：
 *  水なら出せる。
 *
 *  Rさん：
 *  それを調理機能と呼びますか？
 *
 *  G博士：
 *  でも無尽蔵に出せるぞ！実行する度に出る。
 *
 *  Rさん：
 *  それはそれで調理とか関係なくすごいですね。
 *
 *  G博士：
 *  試しに3回実行してみよう。
 *
 *  水を1リットル出しました。
 *
 *  水を1リットル出しました
 *
 *  水を1リットル出しました
 *
 *  G博士：
 *  上出来じゃ。
 *
 */

package jp.co.sss.java100_questions_cac.lesson05.challenge03;

//ここに問題2で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：pumpWater(引数なし、戻り値void、「水を1リットルだしました」と出力するメソッド)

public class RobotMaker {

    public static void main(String[] args) {

        System.out.println("G博士：");
        System.out.println("今度は調理機能を実装してみたぞ！\n");
        System.out.println("Rさん：");
        System.out.println("いいですね～。きんぴらごぼうとかひじきの煮つけとか。\n");
        System.out.println("G博士：");
        System.out.println("......そういうのはまだ無理じゃ。\n");
        System.out.println("Rさん：");
        System.out.println("じゃあ何なら出来るんですか？\n");
        System.out.println("G博士：");
        System.out.println("水なら出せる。\n");
        System.out.println("Rさん：");
        System.out.println("それを調理機能と呼びますか？\n");
        System.out.println("G博士：");
        System.out.println("でも無尽蔵に出せるぞ！実行する度に出る。\n");
        System.out.println("Rさん：");
        System.out.println("それはそれで調理とか関係なくすごいですね。\n");
        System.out.println("G博士：");
        System.out.println("試しに3回実行してみよう。\n");

        //ここでRobotクラスのインスタンスを作り、
        //（インスタンス名はrobot）
        //pumpWaterを3回実行する。

        System.out.println("G博士：");
        System.out.println("上出来じゃ。\n");
    }

}
