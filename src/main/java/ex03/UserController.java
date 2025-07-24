package ex03;

// B 개발자가 만든 것
public class UserController {

    @RequestMapping("/userinfo")
    public void userinfo(@Princiapl SessionUser sessionUser) {
        System.out.println("userinfo 호출됨");
        System.out.println(sessionUser.getUsername());
        System.out.println(sessionUser.getId());
    }

    // 모델 적혀 있으면 해당 uri 때리면 밑에서 출력
    @RequestMapping("/login")
    public void login(Model model) {
        System.out.println(model.getAttribute("username"));
        System.out.println("login 호출됨");
    }

    @RequestMapping("/join")
    public void join(SessionUser sessionUser) {
        System.out.println("join 호출됨");
    }

    @RequestMapping("/logout")
    public void logout() {
        System.out.println("logout 호출됨");
    }


    //
}
