package ex02;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
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
            Annotation anno = method.getDeclaredAnnotation(RequestMapping.class);
            RequestMapping rm = (RequestMapping) anno;

            if (rm.value().equals(path)) {
                try {
                    method.invoke(uc);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}