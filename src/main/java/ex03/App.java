package ex03;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Scanner;

// A 개발자가 만든 것
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        Method[] methods = UserController.class.getDeclaredMethods();

        UserController uc = new UserController();

        for (Method method : methods) {
            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class);
            if (rm == null) continue;

            if (rm.value().equals(path)) {
                Object[] argsToPass = new Object[method.getParameterCount()];

                Annotation[][] paramAnnotations = method.getParameterAnnotations();
                Class<?>[] paramTypes = method.getParameterTypes();

                for (int i = 0; i < paramAnnotations.length; i++) {
                    for (Annotation annotation : paramAnnotations[i]) {
                        if (annotation instanceof Princiapl) {
                            argsToPass[i] = SessionUser.getInstance();
                        }
                    }

                    if (argsToPass[i] == null) {
                        if (paramTypes[i] == Model.class) {
                            argsToPass[i] = Model.getInstance();
                        }
                    }
                }

                // ✅ 4. 실제 컨트롤러 메서드 호출
                try {
                    method.invoke(uc, argsToPass);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}