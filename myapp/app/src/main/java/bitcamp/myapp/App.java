package bitcamp.myapp;

import bitcamp.myapp.handler.MemberHandler;
import bitcamp.util.Prompt;

public class App {

  public static void main(String[] args) {

    printTitle();

    printMenu();

    while (true) {
      String menuNo = Prompt.inputString("메인> ");
      if (menuNo.equals("6")) {
        break;
      } else if (menuNo.equals("7")) {
        printMenu();
      } else if (menuNo.equals("1")) { // 1. 회원등록
        MemberHandler.inputMember();
      } else if (menuNo.equals("2")) { // 회원목록
        MemberHandler.printMembers();
      } else if (menuNo.equals("3")) { // 회원조회
        MemberHandler.viewMember();
      } else if (menuNo.equals("4")) { // 회원정보수정
        MemberHandler.updateMember();
      } else if (menuNo.equals("5")) { // 회원삭제
        MemberHandler.deleteMember();
      } else {
        System.out.println(menuNo);
      }
    }

    Prompt.close();
  }

  static void printMenu() {
    System.out.println("1.회원등록");
    System.out.println("2.회원목록");
    System.out.println("3.회원조회");
    System.out.println("4.회원변경");
    System.out.println("5.회원삭제");
    System.out.println("6.종료");
  }

  static void printTitle() {
    System.out.println("나의 목록 관리 시스템");
    System.out.println("-------------------------");

  }

  static boolean promptContinue() {

    String response = Prompt.inputString("계속하시겠습니까? (Y/N)");
    // equalsIgnoreCase = 대소문자를 구분하지 않음.
    if (!"".equals(response) && !"Y".equalsIgnoreCase(response)) {
      return false;

    }
    return true;
  }

}
