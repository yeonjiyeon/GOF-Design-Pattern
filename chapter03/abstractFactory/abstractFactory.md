**ABSTRACT FACTORY**

추상 팩토리

**의도**

:구체적인 서브클래스를 몰라도, 서로 관련된 여러 객체를 한꺼번에 만들어주는 설계 방식

**활용성**

-객체가 생성되거나 구성·표현되는 방식과 무관하게 시스템을 독립적으로 만들고자 할 때

-여러 제품군 중 하나를 선택해서 시스템을 설정해야 하고, 한번 구성한 제품을 다른 것으로 대체할 수 있을 때

-관련된 제품 객체들이 함께 사용되도록 설계되었고, 이 부분에 대한 제약이 외부에도 지켜지도록 하고 싶을 때

-제품에 대한 클래스 라이브러리를 제공하고, 그들의 구현이 아닌 인터페이스를 노출시키고 싶을 때

**구조**

**참여자**

- AbstractFactory: 개념적 제품에 대한 객체를 생성하는 연산으로 인터페이스를 정의
- ConcreteFactory: 구체적인 제품 객체를 생성하는 연산 구현
- AbstractProduct: 개념적 제품 객체에 대한 인터페이스 정의
- ConcreteProduct: 구체적인 팩토리가 생성할 객체 징의, AbstractProduct가 정의하는 인터페이스 구현
- Client:  AbstractFactory와 AbstractProduct 클래스에 선언되 인터페이스 사용

**협력 방법**

-일반적으로 ConcreteFactory 클래스의 인스턴스 한 개가 런타임에 생성

-구체 팩토리는 어떤 특정한 구현을 가진 제품 객체 생성

**결과**

- 구체적인 클래스 분리
- 제품군 쉽게 대체 가능
- 제품 사이의 일관성 증진
- 새로운 종류의 제품 제공 어려움