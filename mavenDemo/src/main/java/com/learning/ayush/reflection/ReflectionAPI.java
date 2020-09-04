package com.learning.ayush.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionAPI {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Class cl = Child.class;
		Child c = (Child) cl.newInstance();
		Method[] methods = cl.getMethods();
		for (Method m : methods) {
			if (!m.getDeclaringClass().getName().contains("Object")) {
				System.out.println(m.getName());
			}
		}
		Method m = cl.getDeclaredMethod("getData", null);
		m.setAccessible(true);
		System.out.println(m.invoke(c, null));

		Method m2 = cl.getDeclaredMethod("setData", String.class);
		m2.setAccessible(true);
		m2.invoke(c, "Ayush");

		Method m3 = cl.getDeclaredMethod("getData", null);
		m3.setAccessible(true);
		System.out.println(m3.invoke(c, null));

	}
}
