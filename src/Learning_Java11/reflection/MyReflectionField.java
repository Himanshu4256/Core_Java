package Learning_Java11.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MyReflectionField {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        EmployeeDetails obj = new EmployeeDetails();
        Class clz = obj.getClass();

        Field[] fields = clz.getDeclaredFields();
        for(Field field : fields){
            System.out.println(Modifier.toString(field.getModifiers()) +" "+field.getType() + " " + field.getName());

            try{
                System.out.println((String)field.get(obj));
            }catch (IllegalArgumentException | IllegalAccessException e){

            }
        }
    }
}
