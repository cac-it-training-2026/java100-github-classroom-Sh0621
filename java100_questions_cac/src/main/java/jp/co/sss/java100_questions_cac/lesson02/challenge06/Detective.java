/**
 * 第2章 名探偵のお仕事
 *
 * 問題6 犯行現場の捜査②（使用した道具）
 *
 * コメントの位置にif～else if～else文を入れて
 * 体重が80kgを超えている場合、
 * 体重が60kgを下回っている場合、
 * そのどちらでもない場合の
 * 三通りの処理の流れができるようにしてください
 *
 *
 * <実行例>
 * 探偵：
 * 犯人はどこから逃げたんですか？
 *
 * 依頼主：
 * おそらく、あのロープを使って1階に下りたのだと思います。
 * その後、庭に置いてあるトランポリンを使って塀を超えたのではないかと
 *
 * 助手：
 * 私の調査によると、ロープは80kg以上の体重で切れてしまいます。
 * トランポリンは60kg以上ないと塀を超えられる可能性が低くなります。
 *
 * 探偵：
 * つまり容疑者の体重が○○kgであった場合、その人は...
 *
 * <体重が80kg以上である場合の実行例>
 * 犯人ではありませんね。
 *
 * <体重が60kgを下回っている場合の実行例>
 * 犯人である可能性が低いですね。
 *
 * <どちらでもない場合の実行例>
 * 犯人である可能性が高いですね。
 *
 */

package jp.co.sss.java100_questions_cac.lesson02.challenge06;

public class Detective {

        public static void main(String[] args) {

                int weight = 95;

                System.out.println("探偵：");
                System.out.println("犯人はどこから逃げたんですか？\n");
                System.out.println("依頼主：");
                System.out.println("おそらく、あのロープを使って1階に下りたのだと思います。");
                System.out.println("その後、庭に置いてあるトランポリンを使って塀を超えたのではないかと\n");
                System.out.println("助手：");
                System.out.println("私の調査によると、ロープは80kg以上の体重で切れてしまいます。");
                System.out.println("トランポリンは60kg以上ないと塀を超えられる可能性が低くなります。\n");
                System.out.println("探偵：");
                System.out.println("つまり容疑者の体重が" + weight + "kgであった場合、その人は...\n");

                // ここにif～else if～else文を入れる


        }

}
