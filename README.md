# 🚀 1단계 - 인수 테스트 기반 리팩터링

- LineService의 비즈니스 로직을 도메인으로 옮기기
- 한번에 많은 부분을 고치려 하지 말고 나눠서 부분부분 리팩터링하기
- 전체 기능은 인수 테스트로 보호한 뒤 세부 기능을 TDD로 리팩터링하기

1. Domain으로 옮길 로직을 찾기
- 스프링 빈을 사용하는 객체와 의존하는 로직을 제외하고는 도메인으로 옮길 예정
- 객체지향 생활체조를 참고
2. Domain의 단위 테스트를 작성하기
- 서비스 레이어에서 옮겨 올 로직의 기능을 테스트
- SectionsTest나 LineTest 클래스가 생성될 수 있음
3. 로직을 옮기기
- 기존 로직을 지우지 말고 새로운 로직을 만들어 수행
- 정상 동작 확인 후 기존 로직 제거

## 요구사항 기능 체크리스트 (LineService)
- [X] StationService 대신 StationRepository 사용
- [X] Domain으로 옮길 로직을 찾기
  - Section 추가
  - Section 조회
  - Section 제거
  - Section Validation
  - Stations 조회  
- [X] 로직 옮기기 
  - [X] Section 조회 기능
    - [X] Domain의 단위 테스트를 작성하기
    - [X] 새로운 로직 만들기
    - [X] 정상 동작 확인 후 기존 로직 제거   
  - [X] Section 등록 Validation 기능
    - [X] Domain의 단위 테스트를 작성하기
    - [x] 새로운 로직 만들기
    - [X] 정상 동작 확인 후 기존 로직 제거 
  - [X] Section 추가 기능
    - [X] Domain의 단위 테스트를 작성하기
    - [X] 새로운 로직 만들기
    - [X] 정상 동작 확인 후 기존 로직 제거 
  - [X] Section 제거 기능
    - [X] Domain의 단위 테스트를 작성하기
    - [X] 새로운 로직 만들기
    - [X] 정상 동작 확인 후 기존 로직 제거
  - [X] Stations 조회 기능
    - [X] Domain의 단위 테스트를 작성하기
    - [X] 새로운 로직 만들기
    - [X] 정상 동작 확인 후 기존 로직 제거

# 🚀 2단계 - 경로 조회 기능
 
## 요구사항 기능 체크리스트
- [X] 최단 경로 조회 기능 구현하기 
  - [X] 최단 경로 조회 인수 테스트 작성
  - [X] 최단 경로 조회 기능 추가
  - [X] 예외 사항 Validation 기능 구현하기
    - [X] 출발역과 도착역이 같은 경우
      - [X] 인수 테스트 작성
      - [X] 도메인 테스트 작성
      - [X] Validation 기능 구현
    - [X] 출발역과 도착역이 연결이 되어 있지 않은 경우
      - [X] 인수 테스트 작성
      - [X] 도메인 테스트 작성
      - [X] Validation 기능 구현 
    - [X] 존재하지 않은 출발역이나 도착역을 조회 할 경우
      - [X] 인수 테스트 작성
      - [X] Validation 기능 구현  
