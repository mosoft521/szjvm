package com.gmail.mosoft521.ch10.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionMain {
    public static void main(String[] args) throws Exception {
        Class clzStr = Class.forName("java.lang.String");
        Method[] ms = clzStr.getDeclaredMethods();
        for (Method m : ms) {
            String mod = Modifier.toString(m.getModifiers());
            System.out.print(mod + " " + m.getName() + " (");
            Class<?>[] ps = m.getParameterTypes();
            if (ps.length == 0) System.out.print(')');
            for (int i = 0; i < ps.length; i++) {
                char end = i == ps.length - 1 ? ')' : ',';
                System.out.print(ps[i].getSimpleName() + end);
            }
            System.out.println();
        }
    }
}
/*
public equals (Object)
public toString ()
public hashCode ()
public compareTo (String)
public volatile compareTo (Object)
public indexOf (String,int)
public indexOf (String)
public indexOf (int,int)
public indexOf (int)
static indexOf (char[],int,int,char[],int,int,int)
static indexOf (char[],int,int,String,int)
public static valueOf (int)
public static valueOf (long)
public static valueOf (float)
public static valueOf (boolean)
public static valueOf (char[])
public static valueOf (char[],int,int)
public static valueOf (Object)
public static valueOf (char)
public static valueOf (double)
public charAt (int)
private static checkBounds (byte[],int,int)
public codePointAt (int)
public codePointBefore (int)
public codePointCount (int,int)
public compareToIgnoreCase (String)
public concat (String)
public contains (CharSequence)
public contentEquals (CharSequence)
public contentEquals (StringBuffer)
public static copyValueOf (char[])
public static copyValueOf (char[],int,int)
public endsWith (String)
public equalsIgnoreCase (String)
public static transient format (Locale,String,Object[])
public static transient format (String,Object[])
public getBytes (int,int,byte[],int)
public getBytes (Charset)
public getBytes (String)
public getBytes ()
public getChars (int,int,char[],int)
 getChars (char[],int)
private indexOfSupplementary (int,int)
public native intern ()
public isEmpty ()
public static transient join (CharSequence,CharSequence[])
public static join (CharSequence,Iterable)
public lastIndexOf (int)
public lastIndexOf (String)
static lastIndexOf (char[],int,int,String,int)
public lastIndexOf (String,int)
public lastIndexOf (int,int)
static lastIndexOf (char[],int,int,char[],int,int,int)
private lastIndexOfSupplementary (int,int)
public length ()
public matches (String)
private nonSyncContentEquals (AbstractStringBuilder)
public offsetByCodePoints (int,int)
public regionMatches (int,String,int,int)
public regionMatches (boolean,int,String,int,int)
public replace (char,char)
public replace (CharSequence,CharSequence)
public replaceAll (String,String)
public replaceFirst (String,String)
public split (String)
public split (String,int)
public startsWith (String,int)
public startsWith (String)
public subSequence (int,int)
public substring (int)
public substring (int,int)
public toCharArray ()
public toLowerCase (Locale)
public toLowerCase ()
public toUpperCase ()
public toUpperCase (Locale)
public trim ()
 */