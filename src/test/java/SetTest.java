import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set 크기 테스트")
    void setSizeTest() {
        // then
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("set contain 테스트")
    void setContainTest(int value) {
        // then
        assertThat(numbers.contains(value)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "4:false"}, delimiter = ':')
    @DisplayName("set contain  테스트2")
    void setContainTest2(int value, boolean expectedBoolean) {
        // then
        assertThat(numbers.contains(value)).isEqualTo(expectedBoolean);
    }
}
