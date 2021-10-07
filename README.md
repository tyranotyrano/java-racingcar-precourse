# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
---
# 기능목록

###1. 랜덤 값 생성
: 자동차 전진 or 멈춤 판단 기능에 사용되는 랜덤 값을 생성한다.
- 0~9 사이의 랜덤값 생성

###2. 전진/멈춤 판단
: 자동차의 전진 or 멈춤을 판단한다.
- 1번 에서 생성한 랜덤값이 4 이상이면 전진한다.
- 1번 에서 생성한 랜덤값이 3 이하면 멈춘다.

###3. 자동차 이름 생성
: 자동차 이름 정보를 담고있는 자동차 이름 도메인을 생성한다.
- 유효성 체크
  - 이름은 1자 ~ 5자 이하
###4. 자동차 거리 생성
: 자동차가 이동한 거리 정보를 담고있는 자동차 거리 도메인을 생성한다.
- 디폴트 값은 0 이다.
- 유효성 체크
  - 0 이상의 값을 가짐
###5. 자동차 생성
: 이름과 거리 정보를 담고있는 자동차 도메인을 생성한다.

###6. (View) 자동차 이름 입력
: 게임에 참여할 자동차의 이름을 입력한다.
- 쉼표(,)를 기준으로 구분
- 유효성 체크
    - 잘못된 값 입력 할 경우 [ERROR] 로 시작하는 에러 메시지 출력 후 다시 입력 받음

###7. (View) 이동횟수 입력
: 자동차들이 총 몇번의 이동을 할지 입력한다.
- 숫자 입력
- 유효성 체크
    - 잘못된 값 입력 할 경우 [ERROR] 로 시작하는 에러 메시지 출력 후 다시 입력 받음

###8. (View) 이동결과 출력
: 매 시도(이동) 마다 각 자동차들의 이동결과를 출력한다.
- 매 시도(이동)이 끝날때마다 이동 결과를 출력
- 이동결과는 하이픈(-)으로 출력 (ex. 3번이동 -> ---)

###9. (View) 우승자 출력
: 이동결과 최종 우승자를 출력한다.
- 우승자가 1명 이상인 경우, 쉼표(,)로 이름 구분하여 출력