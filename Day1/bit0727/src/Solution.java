/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/27 12:21
 */
public class Solution {
    private char[][] board;//仅仅为了递归少传参数
    private String word;//仅仅为了递归少传参数
    public boolean exist(char[][] board,String word){
        this.board=board;
        this.word=word;
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[0].length;j++){
                //每个点都当成【起点】处理，看是否满足，只要有一个满足，就返回true
                if(dfs(i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int i,int j,int k){
        //当前的点越界了or与给定值不同（包含已经处理过了），这种直接false
        if(i<0 || i> board.length || j<0 || j> board[0].length || board[i][j]!=word.charAt(k)){
            return false;
        }
        //检查到最后，返回true
        if(k==word.length()-1){
            return true;
        }
        char c=board[i][j];//临时保存，需要恢复
        board[i][j]=0;//字符串没有0，这里赋值的0和‘0’是不一样的，0和任何字符都匹配不上，表明当前字符已经搜索过了
        //k+1即为给定字符串的下一个位置，既然当前相同，则比较下一个是否相同
        //上下左右搜索，看下一个字符是否匹配（本方法是递归的，是看后续的字符是否全部匹配）
        boolean ret=dfs(i-1,j,k+1)||dfs(i,j-1,k+1)||dfs(i+1,j,k+1)||dfs(i,j+1,k+1);
        //只要其中有一个是true就是true
        board[i][j]=c;//恢复
        return ret;
    }
}
