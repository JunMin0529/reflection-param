package ex02;

// B 개발자가 만든 것
public class UserController {

    @RequestMapping("/login")
    public void login() {
        System.out.println("login 호출됨");
    }

    @RequestMapping("/join")
    public void join() {
        System.out.println("join 호출됨");
    }

    @RequestMapping("/logout")
    public void logout() {
        System.out.println("logout 호출됨");
    }


    //
}
