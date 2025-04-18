### ADAPTER

**의도**

:클래스 인터페이스를 사용자가 기대하는 인터페이스 형태로 변환시킨다.

서로 일치하지 않는 인터페이스를 갖는 클래스들을 함께 동작시킨다.

**활용성**

-기존 클래스를 사용하고 싶은데, 인터페이스가 맞지 않을 때

-이미 만든 것을 재사용 하고자 하나 이 재사용 가능한 라이브러리 수정할 수 없을 때

-(객체 Adapter Pattern만 해당) 이미 존재하는 여러개의 서브클래스를 사용해야 하는데, 이 서브클래스들 상속을 통해서 이들의 인터페이스를 다 개조한다는 것이 현실성이 없을 때 (부모 클래스에 인터페이스를 변형이 더 유리)

**구조**

**참여자**

- Target: 사용자가 사용할 응용 분야의 종속적인 인터페이스를 정의하는 클래스, 새로운 코드
- Client: Target 인터페이스를 만족하는 객체와 동작 할 대상
- Adaptee: 인터페이스의 적응이 필요한 기존 인터페이스를 정리하는 클래스, 적응 대상자, 기존 코드
- Adapter: 인터페이스를 적용 시키는 클래스, 기존 코드와 새로운 코드 연결

**협력 방법**

사용자는 적응자의 해당하는 클래스의 인스턴스에게 연산을 호출하고 적용자는 해당 요청을 수행 하기 위해 적응 대상자의 연산을 호출

**결과**

클래스 Adapter

- Adapter클래스패턴은 Adaptee 클래스의 서브클래스들을 사용할 수 없다는 단점이 있다.
- Adapter 클래스는 Adaptee 클래스를 상속하기 때문에 Adaptee 정의된 행동을 재정의할 수도 있다.
- 한 개의 객체만 사용하며, Adaptee로 가기 위한 추가적인 포인터 더 간섭화는 필요하지 않다.

객체 Adapter

- Adapter 클래스는 하나만 존재해도 수만은 Adaptee 클래스들과 동작 할 수 있다.(추상 Adaptee 클래스 사용으로)
- Adaptee 클래스 행동을 제 정리 하기가 매우 어렵다.

어댑터 패턴을 사용하면서 고려해야 할 추가적인 사항

1. Adapter 클래스가 실제 적응 작업을 위해 들어가는 폼이 얼마나 되나? : Target 인터페이스와 Adaptee 간에 얼마만큼의 유사성을 갖는가?
2. 대체 가능 적응자: 클래스 재상용성을 높이려면, 누가 이 클래스를 사용할지에 대한 생각 최소화
3. 양방향 적응자를 통한 투명성 제공: Target사용자와 Adaptee사용자의 적응 맞추기

**구현**

- 클래스 적응자를 class++로 구현
- 대체 가능 적응 자
    - 추상연산을 사용하는 방법
    - 위임 객체를 사용하는 방법
    - 매개변수화된 적응 자를 사용하는 방법