package Learning_Java11.reflection;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAP12Binding;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.logging.Logger;

public class MyReflectionClassRunner {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class cl = Class.forName("Learning_Java11.reflection.Employee");
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getName());
        System.out.println(cl.isEnum());
        System.out.println(cl.isInterface());
        System.out.println(cl.getSuperclass());
        System.out.println(Modifier.toString(cl.getModifiers()));
        System.out.println("----------------------------------------------------------------------------");


        System.out.println("classloader of this class :" + MyReflectionClassRunner.class.getClassLoader());
        System.out.println("Classloader of logging :" + Logger.class.getClassLoader());
        System.out.println("Classloader of ArrayList :"+ ArrayList.class.getClassLoader());

    }
}
