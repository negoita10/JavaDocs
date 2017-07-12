package ro.teamnet.zerotohero.reflection;

import ro.teamnet.zerotohero.reflection.demoobjects.EnumClass;
import ro.teamnet.zerotohero.reflection.demoobjects.Soc;
import ro.teamnet.zerotohero.reflection.demoobjects.SuperSoc;
import ro.teamnet.zerotohero.reflection.demoobjects.SuperSuperSoc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * TODO
 * in order to resolve the exercises below, you will have to create
 * all the needed clasees, with their members and methods
 * (in ro.teamnet.zerotohero.reflection.demoobjects package)
 */
public class ClassReflectionDemoMain {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //TODO get the class for a String object, and print it
            String o = new String();
            System.out.println(o.getClass());
        //TODO get the class of an Enum, and print it
            Class todo2 = EnumClass.Monaco.getClass();
            System.out.println(todo2);

        //TODO get the class of a collection, and print it
            Class colectie= new ArrayList().getClass();
            System.out.println(colectie);

        //TODO get the class of a primitive type, and print it
            System.out.println(int.class);

        //TODO get and print the class for a field of primitive type

            System.out.println(Soc.class.getDeclaredField("a").getType());

        //TODO get and print the class for a primitive type, using the wrapper class
            System.out.println(Integer.TYPE);

        //TODO get the class for a specified class name
            Class a= Class.forName(Soc.class.getName());
            System.out.println(a);

        //TODO get the superclass of a class, and print it
        //TODO get the superclass of the superclass above, and print it
            System.out.println(SuperSoc.class.getSuperclass());
            System.out.println(SuperSuperSoc.class.getSuperclass().getSuperclass());

        //TODO get and print the declared classes within some other class
//        System.out.println(SuperSuperSoc.class.getDeclaredClasses());

            Class<?> []innerClasses = SuperSuperSoc.class.getDeclaredClasses();

            for (Class i:
                innerClasses) {
                System.out.println(i);
            }

        //TODO print the number of constructors of a class
            Constructor<?>[] arrayc;
            arrayc=SuperSuperSoc.class.getConstructors();
            System.out.println(arrayc.length);

        //TODO get and invoke a public constructor of a class
            System.out.println(SuperSuperSoc.class.getConstructor(int.class).newInstance(new Integer(10)));

        //TODO get and print the class of one private field 
            System.out.println(SuperSuperSoc.class.getDeclaredField("z").getType());

        //TODO set and print the value of one private field for an object
            SuperSuperSoc c = new SuperSuperSoc(5);
            Field privateField = SuperSuperSoc.class.getDeclaredField("z");
            privateField.setAccessible(true);
            privateField.set(c,4);
            System.out.println((int)privateField.get(c));

        //TODO get and print only the public fields class
            Field[] array2;
            SuperSuperSoc c2 = new SuperSuperSoc(4,5);
            array2 = SuperSuperSoc.class.getFields();
            for (Field f:
              array2) {
                 System.out.println(f.get(c2));
            }

        //TODO get and invoke one public method of a class
            Soc.class.getMethod("groaza").invoke(new Soc());

        //TODO get and invoke one inherited method of a class
            SuperSuperSoc.class.getMethod("Rupere").invoke(new SuperSuperSoc(5));


		//TODO invoke a method of a class the classic way for ten times, and print the timestamp (System.currentTimeMillis())
		//TODO invoke a method of a class by Reflection for 100 times, and print the timestamp
		//what do you observe?
		
    }
}
