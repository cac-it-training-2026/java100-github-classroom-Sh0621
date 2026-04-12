/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題1  宇宙船の気密を保つ
 *
 * 宇宙船クラス（Spaceship）のフィールドに
 * アクセス修飾子を設定します。
 *
 * 宇宙船の気密を保てるよう船内の空気タンク(air)に、
 * 適切なアクセス修飾子を施し、
 * 実行例と同じメッセージを表示しください。
 *
 * <実行例>
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
 *         フィールド Spaceship.air は不可視です
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge01;

class Spaceship {
    int air;
}

public class Astronaut {

    public static void main(String[] args) {

        Spaceship spaceship = new Spaceship();

        spaceship.air = -10;

    }

}
