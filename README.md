# kotlin-lotto

## step2 - 로또 (자동)
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### 기능 목록
- [x] 입력 후에 구매 입력에 대한 개수가 나온다.
- [x] 로또 개수 만큼 랜덤 으로 로또 용지를 생성 한다. 
- [x] 지난주 당첨 번호를 입력 한다.
- [x] 당첨 번호에 숫자가 아닌 값이 있을 경우 에러를 보여준다.
- [x] 당첨 결과를 보여준다.
- [x] 당첨 금액이 잘 맞는다
- [x] 당첨 금액의 비율이 잘 맞는다


### 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

## step1 - 문자열 덧셈 계산기

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 
  각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다.
  커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
  예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며,
  결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

### 기능 목록
- [x] ,을 사용해서 문자열을 더한다.
- [x] :을 사용해서 덧셈한다.
- [x] ,와 :을 섞어서 사용해도 잘 더한다.
- [x] 빈 문자열은 0을 반환한다.
- [x] 숫자 이외의 값은 RuntimeException을 throw 한다.
- [x] 음수의 값은 RuntimeException을 throw 한다.
- [x] 커스텀 구분자를 사용할 경우 커스텀 구분자를 사용해도 잘 계산이 된다.
- [x] 하나의 숫자 입력시 하나의 숫자 반환
- [x] 생성된 로또는 6개의 숫자를 가진다.

### 프로그래밍 요구 사항
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.
