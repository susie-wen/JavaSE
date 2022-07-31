/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/31 18:57
 */
public class PosIndexNotLegalException extends RuntimeException{
    public PosIndexNotLegalException(){

    }
    public PosIndexNotLegalException(String msg){
        super(msg);
    }
}
