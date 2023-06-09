package bitcamp.Exam.stringExam;

public class Stringinstance {

  public static void main(String[] args) {

    String s1 = new String("Hello");

    // intern()
    // - String 객체에 들어 있는 문자열과 동일한 문자열을 갖고 있는 String 객체를 상수풀에서 찾는다.
    // - 있으면 그 String 객체의 주소를 리턴한다.
    // - 없으면 상수풀에 String 객체를 생성한 후 그 주소를 리턴한다.
    String s2 = s1.intern(); // 인턴

    String s3 = "Hello";// 해당 문자열을 가진 String 객체를 String Pool에서 찾는다.
    // 있으면 그 객체를 리턴한다. 없으면 새 객체를 만들고 리턴한다.

    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
  }

}
