package dependencyInjectionTwo;

public class Car {
    
    private Engene engene;


    /*
        public Car(){
        this.engene = new Engene();
       }
     이렇게 하면 Car 객체가 직접 엔진을 만들어 내고 있음. 강력한 결합
     엔진이 수정되면 카 객체에서도 엔진과 관련된것 모두를 수정해야함
    */

    // 의존성 주입
    // 생성자를 통해 엔진을 받음
    // 어떤엔진인지 상관쓰지 않아도 됨
    public Car(Engene engene) {
        this.engene = engene;
    }

    public void sart(){
        engene.start();
    }


    //  즉 의존성 주입은 객체를 직접 생산하는것이아니라 외부에서 주입 받는 것이다.


// 출처 : https://creampuffy.tistory.com/156


/**
 * ## Spring Bean  ##
 * 
    클래스가 A가 B를 의존하고, A의 생성자에 B를 전달해야 한다면, 
    보통 코드는 new A(new B()) 와 같은 식으로 작성될 것입니다.

    그런데 만약 애플리케이션의 규모가 커지면 어떨까요?
    B가 또다른 클래스를 의존할 수도 있고 ( new A(new B(new C()))... ) 
    이러한 의존관계를 개발자가 매번 직접 파악하고 전달하기 어려워질 것입니다.

    이러한 문제를 Spring이라는 프레임워크가 해결해줄 수 있는데,
    필요한 객체들을 Spring Bean으로 생성해두고 알아서 조립해주는 방식입니다.

    즉 Spring Bean은 애플리케이션 동작에 필요한,
    인스턴스화 되어 스프링이 관리해주는 객체라고 정리할 수 있습니다.
 * 
 */



 /** ## Application Context ##
  * 
    마치 Connection들이 Connection Pool에서 관리되듯이,
    Spring Bean들은 Application Context에서 관리됩니다.

    여기서 말하는 관리는 인스턴스화, 설정(configure), 조립(assemble)을 의미합니다.
    또 앞서 Connection Pool을 비유했듯이, 우리가 필요로 하는 Spring Bean,
    즉 이미 인스턴스화 되어 있는 객체를 Application Context에서 가져올 수 있습니다.

    매번 새로 생성하지 않아도 되는 겁니다.
 */


 /*** ## Dependency Injection & Inversion Of Control ##
  * 
    제어 권한을 스프링 프레임워크에 위임함으로써 제어의 역전이 발생합니다

    앞서 A가 B를 의존하는 경우에 대해 예를 든 바 있습니다.
    new A(new B()) 와 같이 말이죠.

    이를 스프링이 조립해주도록 위임하면 어떨까요?
    1) Class A와 Class B를 Spring Bean으로 등록할게~
    2) A는 B가 필요해~
    라고 선언만 해두면, Application Context에서 A와 B 를 알아서 조립해주는 거죠.
    그러면 개발자는 A가 필요한 곳에서 직접 생성할 필요 없이,
    Application Context에 A 클래스를 달라고 요청만 하면 됩니다.
    이렇게 관리 역할을 위임하면 매번 새로 생성하지 않고 재사용된다는 장점도 있습니다.

    이렇게 애플리케이션이 구동되는 과정에서 필요한 객체들의 생성과 조립 등을
    개발자가 하지 않고 프레임워크가 하도록 제어 권한이 역전되는 것을
    제어의 역전, Inversion Of Control 이라고 합니다.
    의존성 주입, 즉 객체의 조립(assemble)을 프레임워크가 대신 수행하는 거죠.
  */



  /***
   * [여러가지 의존성 주입 방법]
   * 
    [1] 생성자 주입 Constructor Injection with 'final' declaration
    private final BoardDao boardDao;

    public ChessServiceImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }


    [2] 필드 주입 Field Injection using Autowired Annotation
    @Autowired
    private BoardDao boardDao;


    [3] 세터 주입 setter Injection with Autowired Annotation
    private BoardDao boardDao;

    @Autowired
    public void setBoardDao(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
   * 
   */


   /**
    * 
    # setter 주입을 먼저 보겠습니다.
        객체가 생성된 이후에 setter를 통해 의존성을 주입하는 방식입니다.
        따라서 객체의 상태값을 외부에서 변경할 수 있는 여지가 생겨 캡슐화가 깨집니다.
        애플리케이션 동작 중에 상태값이 변경될 수 있어 신뢰할 수 없게 됩니다.
        당연히 지양되어야 할 의존성 주입 방법입니다.

 
    # 다음으로 필드 주입을 보겠습니다.
        필드 주입을 사용할 경우 final 키워드 사용이 불가합니다.
        객체 생성 시점이 아닌 생성 이후에 의존성을 주입하기 때문입니다.
        필드 주입은 객체 생성 이후 reflection으로 우회해서 강제로 값을 할당하기 떄문입니다.
    ** private 선언된 필드의 값을 강제로 변경하는 것은
        캡슐화를 깨는 것이고, Java의 컨벤션을 우회하는 행위입니다.
        인텔리제이어서도 필드 주입은 권장하지 않는다고 이야기해줍니다.


    # 마지막으로 생성자 주입입니다.
        생성자 주입을 사용하려면 필드에 final 선언을 하고, 이를 주입받는 생성자를 선언해야 합니다.
        final 선언된 필드는 객체의 생성 시점에 값이 할당되어야 하기 때문입니다.
        스프링 프레임워크는 ChessServiceImpl 클래스에 선언된 @Service 애너테이션을 읽어서
        ChessServiceImpl을 Spring Bean으로 생성해서 Application Context에서 관리하고자 합니다.
        이 때, 생성자에 있는 의존성 BoardDao를 확인하고,
        Application Context내에 BoardDao에 맞는 Spring Bean을 찾아 내부적으로 조립해줍니다.
        이 과정은 필드 주입과 달리 우리가 선언해둔 생성자를 이용하기 때문에,
        reflection을 사용하지 않고 진행됩니다.
        추가적으로 Autowired 애너테이션 선언을 하지 않아도 됩니다.
    * 
    */

}
