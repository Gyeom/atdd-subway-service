package nextstep.subway.path.ui;

import nextstep.subway.auth.domain.LoginMember;
import nextstep.subway.path.application.PathService;
import nextstep.subway.station.domain.Station;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static nextstep.subway.Fixture.createLine;
import static nextstep.subway.Fixture.createStation;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("지하철 경로 관련 컨트롤러 테스트")
@ExtendWith(MockitoExtension.class)
public class PathControllerTest {

    @InjectMocks
    private PathController pathController;

    @Mock
    private PathService pathService;

    @DisplayName("최단 경로 조회에 성공한다.")
    @Test
    void findShortestPath() {
        Station 강남역 = createStation("강남역", 1L);
        Station 종각역 = createStation("종각역", 2L);
        createLine("1호선", "blue", 강남역, 종각역, 5, 100);

        ResponseEntity<PathResponse> responseEntity = pathController.findShortestPath(
                new LoginMember(1L, "koreatech93@naver.com", 30), 강남역.getId(), 종각역.getId()
        );
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
