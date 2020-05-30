package Revision3;

public class SingletonDummy {

	private static volatile SingletonDummy dummyObj = null;

	private SingletonDummy() {

	}

	public static SingletonDummy createInstance() {
		if (dummyObj == null) {
			synchronized (dummyObj) {

				if (dummyObj == null) {
					dummyObj = new SingletonDummy();
				}
				return dummyObj;
			}
		}
		return dummyObj;
	}
}
