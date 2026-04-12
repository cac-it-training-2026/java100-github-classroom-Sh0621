package jp.co.sss;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * 新人研修用の自動採点テストクラス。
 *
 * 仕様通りに @ParameterizedTest と @CsvSource を使用し、
 * データ駆動型で複数のクラスの main メソッドを検証します。
 * 標準出力のキャプチャ、OS依存の改行コードの吸収、無限ループ防止用のタイムアウト（5秒）を備えています。
 *
 * 追加の問題をテストする場合は、@CsvSource の textBlock 内に
 * クラス名 | 標準入力(必要に応じて) | 期待される標準出力
 * の形式で追記してください。
 */
public class TrainingExercisesTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final InputStream originalIn = System.in;

	@BeforeEach
	void setUp() {
		// 標準出力をキャプチャするための設定
		System.setOut(new PrintStream(outContent));
		outContent.reset();
	}

	@AfterEach
	void tearDown() {
		// テスト終了後に標準出力と標準入力を元に戻す
		System.setOut(originalOut);
		System.setIn(originalIn);
	}

	/**
	 * データ駆動型テスト。
	 * textBlockを利用して、期待される出力に改行を含めて直接記述できます。
	 * 改行は文字列としての "\\n" を使用して記述してください。
	 *
	 * ※ 注意: 実際の業務や課題の量に合わせて、ここに対象のクラスと期待値を追記してください。
	 *        標準入力を必要とする課題の場合は、第二引数に疑似入力文字列を指定します。
	 *        （例: "8\\n2\\n6\\n" のように \\n を使って複数行入力を表現します）
	 */
	@ParameterizedTest(name = "課題クラス: {0} の検証")
	@CsvSource(delimiter = '|', textBlock = """
			    jp.co.sss.java100_questions_cac.lesson01.challenge01.Patisserie | | たいへんお待たせしました。\\n【ポエール・ネルメ】\\nただいまより開店です！！
			    jp.co.sss.java100_questions_cac.lesson01.challenge10.Advertisement| | 【ポエール・ネルメ】クルー募集！！\\n\\nマカロンの名店【ポエール・ネルメ】では\\n私たちと一緒に働いてくれる方（クルー）を募集しています！\\n\\n※※※※募集要項※※※※\\n\\n勤務時間 7:30 ～ 22:00\\n時給     680円\\n制服貸与\\n委細面談\\nマカロンを切るだけの簡単な作業です。\\n\\n応募はこちらまで↓↓↓\\n070-4649-xxxx（担当：鬼瓦権三）
			""")
	@Timeout(value = 5, unit = TimeUnit.SECONDS) // 無限ループ対策
	void testMainMethods(String className, String inputs, String expectedOutput) throws Exception {
		// 1. 標準入力のモック設定（入力が必要な課題の場合）
		if (inputs != null && !inputs.isEmpty()) {
			// 文字列内の "\n" を実際の改行コードに変換
			inputs = inputs.replace("\\n", "\n");
			System.setIn(new ByteArrayInputStream(inputs.getBytes()));
		}

		// 2. リフレクションで対象のクラスと main メソッドを取得
		Class<?> targetClass = Class.forName(className.trim());
		Method mainMethod = targetClass.getMethod("main", String[].class);

		// 3. main メソッドを実行
		String[] args = new String[0];
		mainMethod.invoke(null, (Object) args);

		// 4. キャプチャした標準出力を取得
		String actualOutput = outContent.toString();

		// 5. 改行コードの揺れを吸収 (Windows の \r\n などを \n に統一し、前後の空白を除去)
		String normalizedActual = actualOutput.replaceAll("\\r\\n?", "\n").trim();

		String normalizedExpected = "";
		if (expectedOutput != null) {
			// 期待値文字列内の "\n" を実際の改行コードとして扱い、正規化する
			normalizedExpected = expectedOutput.replace("\\n", "\n").replaceAll("\\r\\n?", "\n").trim();
		}

		// 6. 期待値と実際の出力を比較検証 (assertEquals)
		assertEquals(normalizedExpected, normalizedActual, className + " の標準出力が期待値と一致しません。");
	}
}
