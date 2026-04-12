/**
 * 第3章 探検隊のお仕事
 *
 * 問題9  洞窟を抜ける
 *
 * 洞窟の中には、出口にたどり着く前に10個の間欠泉があり、
 * 熱湯を噴き出しているため、そこを通る時は1/2の確立で
 * 熱湯を浴びることになります。
 * 幸いなことに隊長を始め隊員たちは江戸っ子なので
 * 5回までなら熱湯に耐えられます。
 *
 * コメントの位置にif文とcontinue文を利用した
 * 処理を記述して実行例と同じメッセージを表示してください。
 * (※continue文の練習ですので、continue文は必ず使用してください。)
 *
 * <実行例>
 *  隊長：
 *  間欠泉が10個あるよ気をつけて！
 *
 *  隊長：
 *  1個目。熱湯
 *  うわ熱っ！（ダメージ1）
 *
 *  隊長：
 *  2個目。セーフ
 *  ラッキー！
 *
 *  隊長：
 *  3個目。熱湯
 *  うわ熱っ！（ダメージ2）
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  隊長：
 *  10個目。熱湯
 *  うわ熱っ！（ダメージ5）
 *
 *  洞窟の出口にたどり着きました。
 *
 *
 * <ダメージが6以上になった場合の実行例>
 *  隊長：
 *  8個目。熱湯
 *  うわ熱っ！（ダメージ6）
 *
 *  探検隊は全滅しました。
 *
 *
 */

package jp.co.sss.java100_questions_cac.lesson03.challenge09;

public class Explorer {

    public static void main(String[] args) {

        System.out.println("隊長：");
        System.out.println("間欠泉が10個あるよ気をつけて！\n");

        int geyser = 0;
        int damage = 0;
        for (int i = 0; i < 10; i++) {

            geyser = (int) (Math.random() * 10 % 2);


            //ここにif文、continue文を利用した処理を記述


            damage++;
            System.out.println("隊長：");
            System.out.println((i + 1) + "個目。熱湯");
            System.out.println("うわ熱っ！（ダメージ" + damage + "）\n");

            if (damage == 6) {
                break;
            }
        }
        if (damage != 6) {
            System.out.println("洞窟の出口にたどり着きました。");
        } else {
            System.out.println("探検隊は全滅しました。");
        }
    }
}
