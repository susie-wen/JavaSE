/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/6 19:56
 */

//运行时异常，则继承RuntimeException
public class EmptyStackException extends RuntimeException{
    //加上构造方法
    public EmptyStackException(){

    }
    public EmptyStackException(String msg){
        super(msg);
    }
}
