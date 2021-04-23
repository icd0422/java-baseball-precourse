import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PracticeTest {

    @Test
    @DisplayName("split 테스트")
    void splitTest() {
        // given
        String numbersStr1 = "1,2";
        String numbersStr2 = "1,";

        // when
        String[] splitStrArr1 = numbersStr1.split(",");
        String[] splitStrArr2 = numbersStr2.split(",");

        // then
        assertThat(splitStrArr1).contains("1", "2");
        assertThat(splitStrArr2).containsExactly("1");
    }

    @Test
    @DisplayName("subString 테스트")
    void subStringTest() {
        // given
        String numbersStr = "(1,2)";

        // when
        String subStr = numbersStr.substring(1, 4);

        // then
        assertThat(subStr).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 테스트 - index 내 성공 케이스")
    void charAtTest() {
        // given
        String givenStr = "abc";

        // when
        char c = givenStr.charAt(1);

        // then
        assertThat(c).isEqualTo('b');
    }

    @Test
    @DisplayName("charAt 테스트 - index 밖 접근 예외 케이스")
    void charAtTestForException() {
        // given
        String givenStr = "abc";

        // then
        assertThatThrownBy(() -> givenStr.charAt(5))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageStartingWith("String index out of range: 5");
    }
}
