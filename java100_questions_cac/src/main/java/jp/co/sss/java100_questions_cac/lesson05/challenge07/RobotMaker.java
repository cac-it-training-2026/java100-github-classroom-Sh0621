/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題7  水量を表示する
 *
 * ロボット内の残水量を戻り値として返すメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  でもこれランダムに水を入れた時にロボット内の水量がわかりませんね。
 *
 *  G博士：
 *  そう言えばそうじゃな。よし、ちょっと待っとれ。
 *
 *  G博士：
 *  ......出来た！現在の水量を表示する機能じゃ。
 *
 *  「ガ～ピィーガ～、ゲンザイノスイリョウハ【※残水量】リットルデス。」
 *
 *  Rさん：
 *  なんか雑音が気になりますが、一応出来てますね。
 *
 */

package jp.co.sss.java100_questions_cac.lesson05.challenge07;

//ここに問題6で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：getWater(引数なし、戻り値int、
//現在の水量(フィールドwaterの値)を戻り値として返す)

public class RobotMaker {

    public static void main(String[] args) {

        System.out.println("Rさん：");
        System.out.println("でもこれランダムに水を入れた時にロボット内の水量がわかりませんね。\n");
        System.out.println("G博士：");
        System.out.println("そう言えばそうじゃな。よし、ちょっと待っとれ。\n");
        System.out.println("G博士：");
        System.out.println("......出来た！現在の水量を表示する機能じゃ。\n");

        int water = 0;

        //ここでRobotクラスのインスタンスを作り、
        //（インスタンス名はrobot）
        //randomWaterを実行する。
        //getWaterを実行する。

        System.out.println("「ガ～ピィーガ～、ゲンザイノスイリョウハ" + water + "リットルデス。」\n");

        System.out.println("Rさん：");
        System.out.println("なんか雑音が気になりますが、一応出来てますね。\n");
    }

}
