package week07;

public class Week07Singleton {

	/* this is not thread safe*/
	private static Week07Singleton m_instance = null;

	public static Week07Singleton getInstance() {
		if (m_instance == null) {
			m_instance = new Week07Singleton();
		}

		return m_instance;
	}
	
	/* this is thread safe*/
//	private final static Week07Singleton m_instance = new Week07Singleton();
//	
//	public static Week07Singleton getInstance()
//    {
//        return m_instance;
//    }
//
//    private Week07Singleton()
//    {
//        // Exists only to prevent instantiation
//        // Users MUST use the getInstance method()
//    }
    
}
