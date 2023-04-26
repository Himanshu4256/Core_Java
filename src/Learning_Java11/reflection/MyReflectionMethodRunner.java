package Learning_Java11.reflection;
import java.lang.reflect.Method;
public class MyReflectionMethodRunner {
    public static void main(String[] args) {
        EmployeeDetails obj = new EmployeeDetails();
        Class cl = obj.getClass();
        Method[] declaredMethods = cl.getDeclaredMethods();
        for (Method m : declaredMethods){
            System.out.println(m.getName() + m.getParameterCount());
        }
    }
}
