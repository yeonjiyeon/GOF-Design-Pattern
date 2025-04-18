### Facade

**의도**

:한 서브 시스템에 인터페이스 집합에 대한 획일화 된 하나의 인터페이스를 제공하는 패턴. 서브 시스템을 사용하기 쉽도록 상의 수준의 인터페이스를 정의

**동기**

:서브시스템들 사이의 의사소통 및 종속성을 최소화하려는 공통적인 설계 목표를 도와주는 패턴

**활용성**

-복잡한 서브시스템에 대한 단순한 인터페이스 제공이 필요할 때

-추상 개념에 대한 구현 클래스와 사용자 사이에 너무 많은 종속성이 존재할 때

-서브시스템을 계층화 시킬 때

**구조**

**참여자**

- 퍼사드:
    - 통합 인터페이스 제공,
    - 어떤 클래스가 어떤 요청을 처리해야 하는지 알고 있음
    - 사용자 요청을 해당 서브시스템 객체에 전달
- 서브시스템 클래스들:
    - 서브시스템의 기능 구현
    - Facade 객체로 할당된 작업 처리
    - Facade에 대한 정보 x(Facade 참조자 없음)

**협력 방법**

-사용자는 Facade 정의된 인터페이스를 이용해서 서브시스템과 상호 작용 한다.

파사드를 사용하는 사용자는 서브시스템을 구성하는 객체로 직접 접근 하지 않아도 된다.

**결과**

사용 이점

1. 서브시스템의 구성요소를 보호 할 수 있다.
2. 서브시스템과 사용자 코드 간의 결합도를 더욱 약하게 만든다.
3. 응용프로그램 쪽에서 서브시스템 클래스를 사용하는 것을 완전히 막지는 않으므로 Facade를 사용 할지 서브시스템 클래스를 직접 사용 할지 결정할 수 있다. → 유연하게 작성이 가능하다

**구현**

1. 사용자 와 서브시스템 간의 결합도 줄이기
2. 서브시스템 클래스 중 공개 할 것과 감출 것