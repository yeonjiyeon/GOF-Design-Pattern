### 싱글톤

**의도**

:오직 한 개의 클래스 인스턴스만을 갖도록 보장하고 이에 대한 전역적인 접근점을 제공

**활용성**

-클래스 인스턴스가 오직 하나여야함을 보장하고 잘 정리된 접근점으로 모든 사용자가 접근할 수 있도록 해야 할 때

-유일한 인스턴스가 서브클래싱으로 확 되어야 하며 사용자는 코드의 수정 없이 확장된 서브클래스의 인스턴스를 사용할 수 있어야 할 때

**구조**

**참여자**

- Singleton: Instance() 연산을 정의(유일한 인스턴스 생성 메서드), 유일한 인스턴스에 접근할 수 있도록 한다.

**협력 방법**

-사용자는 Singleton 클래스의 Instance() 연산을 통해 유일하게 생성되는 단일체 인스턴스에 접근

**결과**

-유일하게 존재하는 인스턴스로의 접근을 통제

-이름 공간을 좁힌다.

-연산 및 표현의 정제를 허용: Singleton 클래스가 상속될 수 있기 때문에 서브클래스를 통한 새로운 인스턴스 생성 가능

-인스턴스의 개수를 변경하기가 자유롭다

클래스 연산을 사용하는 것보다 훨씬 유연한 방법이다.

**구현**

싱글톤 패턴을 사용할 때 고려사항

1. 인스턴스가 유일 해야함을 보장
2. 싱글톤 클래스를 서브 클래싱 한다.