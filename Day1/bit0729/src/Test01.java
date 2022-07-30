/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/29 10:08
 */
public class Test01 {
    public static void main(String[] args) {
        //用户提交过来一个页码，以及每页显示的记录条数
        int pageNo=5;//第5页
        int pageSize=10;//每页显示的记录条数
        int startIndex=(pageNo-1)*pageSize;
        String sql="select ...limit "+startIndex+","+pageSize;
    }
}
