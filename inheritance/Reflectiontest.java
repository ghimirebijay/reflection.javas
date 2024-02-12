package reflection
import java.util.*;
import java .lang.reflect.*;
/**
 * This program uses reflection to print all features of a class.
 * @version 1.1 2004-02-21
 * @author Cay Horstmann
 */
public class Reflectiontest {
    public static void main (String[] args)
    {
        // read class name from command line args or user input
        String name;
        if(args.length>0)name= args[0];
        else
        {
            Scanner in= new Scanner (System.in);
            System.out.println("Enter class name(eg java.util.Date)");
            name=in.next();

        }

        try
        {
            // print class name and superclass name(if !=Object)
            Class cl= Class.forName(name);
            Class supercl=cl.getSuperclass();
            String modifiers=Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0)System.out.print(modifiers+"");
            System.out.printl("class"+name);
            if(supercl !=null && supercl !=Object.class) System.out.print("extends"+supercl.getName());
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(c);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.exit(0);
    }
/**
 * Print all constructors of a class
 * @param cl a class
 */
public static void printConstructors(class cl){
    Constructor[] constructors =cl.getDeclaredConstructors();
    for(Constructor c :constructors)
    {
        String name= c.getName();
        System.out.print("");
        String modifiers =Modifier.toString(c.getModifiers());
        if(modifiers.length()>0) System.out.print(modifiers+"");
        System.out.print(name+"(");
        // print parameter types 
        Class[] paramTypes =c.getParameterTypes();
        for(int j=0;j<paramTypes.length;j++)
        {
            if(j>0) System.out.print(paramTypes[j].getName());
        }
        System.out.println(");");
    }
}
/**
 * Print all methods of a class
 * @param cl a class
 */
public static void printMethods(Class cl)
{
    Method[] methods =cl.getDeclareMethods();
    for(Method m:methods)
    {
        Class reType=m.getReturnType();
        String name=m.getName();
        System.out.print("");
        //print modifiers,return type and method name
        String modifiers= Modidier.toString(m.getModifiers());
        if(modifiers.length()>0)
        System.out.print(modifiers+"");
        System.out.print(reType.getName()+""+name+"(");

        //print parameter types
        Class[] paramTypes=m.getParameterTypes();
        for(int j=0;j<paramTypes.length;j++)
        {
            if(j>0)System.out.print(",");
            System.out.print(paramtypes[j].getName());

        }
        System.out.println(");");
    }
    }
    /**
     * Print all fields of a class
     * @param cl a class
     */
    public static void printFields(Class cl)
    {
        Field[] fields =cl.getDeclaredFields();
        for(Field f : fields)
        {
            Class type =f.getType();
            String name =f.getName();
            System.out.print("");
            String modifiers =Modifier.toString(f.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+"");
            System.out.println(type.getName()+""+name+";");
        }
    

    }
}

    
