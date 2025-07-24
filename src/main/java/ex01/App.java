package ex01;

import java.util.Scanner;

// A 개발자가 만든 것
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        UserController uc = new UserController();

        // path = "/login" , "/join
        if (path.equals("/login")) {
            uc.login();
        } else if (path.equals("/join")) {
            uc.join();
        } else if (path.equals("/logout")) {
            uc.logout();
        } else {
            System.out.println("지원하지 않는 주소입니다.");
        }
    }
}
