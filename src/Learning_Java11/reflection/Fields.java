package Learning_Java11.reflection;

import java.lang.reflect.Field;

public class Fields {
    public static void main(String[] args) {
        EmployeeDetails obj = new EmployeeDetails();
        Class cl = obj.getClass();
        Field[] fields = cl.getFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }
}
