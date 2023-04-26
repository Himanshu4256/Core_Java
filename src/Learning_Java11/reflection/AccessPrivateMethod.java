package Learning_Java11.reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AccessPrivateMethod //extends Employee
{
    public static void main(String[] args) throws ClassNotFoundException{
        Employee z = new Employee();
        Class c = z.getClass();
        try{
            Employee p = (Employee) c.newInstance(); // Object create hua hau hai "newInstance" reflection k through.
            Method privateMethod = Employee.class.getDeclaredMethod("test"); // mth name jisko access krna hai
            privateMethod.setAccessible(true);
            privateMethod.invoke(z,null);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
