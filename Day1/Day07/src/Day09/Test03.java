package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 16:56
 */
public class Test03 {
    //用户名和密码输入到String[] args当中
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("请使用该系统输入程序参数，参数中包括用户名和密码信息：");
            return;
        }
        //程序执行到此处，说明用户确实提供了用户名和密码
        //接下来应该判断用户名和密码是否正确
        //取出用户名
        String username=args[0];
        String password=args[1];
        //假设用户名是admin，密码是123的时候表示登录成功，其他的一律失败
        //判断两个字符串是否相等，需要使用equals方法
        if(username.equals("admin") && (password.equals("123"))){
            System.out.println("登录成功,欢迎【"+username+"】回来");
            System.out.println("您可以继续使用该系统！");
        }else{
            System.out.println("验证失败！请重新尝试！");
        }
    }
}
