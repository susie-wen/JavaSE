/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/8/1 9:33
 */
public class IndexNotLegalException extends RuntimeException{
    public IndexNotLegalException(){

    }
    public IndexNotLegalException(String msg){
        super(msg);
    }
}
