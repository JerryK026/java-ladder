package nextstep.ladder.domain.ladder;

import nextstep.ladder.domain.Condition;
import nextstep.ladder.domain.ladder.strategy.Strategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    @DisplayName("높이 값으로 사다리를 생성한다")
    void shouldCreateWithHeight() {
        Ladder ladder = Ladder.from(Condition.of(4, 3), new Strategy.Fake());
        assertThat(ladder).isEqualTo(Ladder.from(Condition.of(4, 3), new Strategy.Fake()));
    }
}