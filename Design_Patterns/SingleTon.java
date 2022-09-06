
public class SingleTon{
	private static  volatile SingleTon _obj;
	private SingleTon(){

	}
     public static SingleTon getInstance(){
        if(_obj == null){
		    synchronized(SingleTon.class){
                    _obj = new myclass();
                }
			}
			
		}
        return _obj;
	}
}