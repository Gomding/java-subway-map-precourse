## 기능 구현 목록
   
* 프로그램 시작 시 역, 노선 등 필요한 정보를 미리 셋팅할 수 있다. (초기 설정 like 기본값)
    1. 지하철 역으로 교대역, 강남역, 역삼역, 남부터미널역, 양재역, 양재시민의숲역, 매봉역이 등록되어 있다.
    2. 지하철 노선으로 2호선, 3호선, 신분당선이 등록되어 있다.
    3. 기본 노선에는 역이 아래와 같이 등록되어 있다. (왼쪽 끝이 상행 종점)
        * 2호선 : 교대역 - 강남역 - 역삼역
        * 3호선 : 교대역 - 남부터미널역 - 양재역 - 매봉역
        * 신분당선 : 강남역 - 양재역 - 양재시민의숲역

   
* 역 관련 기능
    1. 지하철 역을 등록하고 삭제하는 기능 (단, 노선에 등록된 역은 삭제할 수 없다)
    2. 지하철 역의 목록을 조회할 수 있다.

   
* 역 관련 예외
    1. 중복된 지하철 역 이름은 등록할 수 없음
    2. 지하철 역 이름은 2글자 이상이어야 한다.
    3. 지하철 역을 삭제할 때 등록되지 않은 역에대한 삭제는 예외를 발생시킨다.
   

* 노선 관련 기능
    1. 지하철 노선을 등록하고 삭제할 수 있다.
    2. 노선 등록 시 상행 종점역과 하행 종점역을 입력 받는다.
    3. 지하철 노선의 목록을 조회할 수 있다.
   

* 노선 관련 예외
    1. 중복된 지하철 노선 이름이 등록될 수 없다.
    2. 지하철 노선 이름은 2글자 이상이어야 한다.
    3. 노선을 삭제할 때 등록되지 않은 노선에 대한 삭제는 예외를 발생시킨다.
    4. 더이상 노선이 없다면 삭제 기능이나 조회기능에 진입했을 때 메시지로 알려준다.(모든 노선을 삭제했을 때)
   

* 구간 추가 기능 (역과 역 사이를 구간, 구간들의 모음 = 노선)
    + 순서는 1부터 시작
    1. 지하철 노선에 구간을 추가하는 기능 ( 노선에 역을 추가하는 것)
    2. 하나의 역은 여러개의 노선에 추가가 가능
    3. 역과 역 사이에 새로운 역을 추가하는 기능
    4. 갈래길을 생성할 수 없음(예외사항)
    5. 노선에 이미 있는 역이라면 추가가 불가능(예외사항)
    6. 구간에 추가하는 역이 등록돼있는 역인지(StationRepository에 있는 역인지) 검사하는 기능(예외사항)
   
* 구간 삭제 기능
    1. 노선에 등록된 역을 제거하는 기능
    2. 종점을 제거할 경우 다음 역이 종점이됨
    3. 노선에 포함된 역이 2개 이하일때는 역을 제거할 수 없습니다. (예외사항)
   

* 노선에 등록된 역 리스트 조회기능
    1. 노선의 상행 종점부터 하행 종점까지 연결된 순서대로 역 목록을 조회하는 기능

