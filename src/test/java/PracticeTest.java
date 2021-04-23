import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
