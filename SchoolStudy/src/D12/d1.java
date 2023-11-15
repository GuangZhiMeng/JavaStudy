package D12;//DriverManager 类 Connection Statement ResultSet 接口
import java.sql.*;//导入sql
public class d1 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");//加载类
        String url="jdbc:mysql://localhost:3306/test123?serverTimezone=GMT%2B8";
        String username="root";//数据库登录用户名
        String password="123456";//密码 没有设置则用两个双引号
        Connection conn=DriverManager.getConnection(url,username,password);
        String sql="select * from shoo";//查询语句
        Statement stmt=conn.createStatement();//创建执行对象
        ResultSet rs= stmt.executeQuery(sql);//把查询放到结果集中
        while (rs.next()){//rs.next()判断有没有下一条记录
            System.out.println("ID:"+rs.getString("shop_id")+//rs.getString("字段名")读取数据
                    "商品名称"+rs.getString("shop_name")+
                    "商品单价"+rs.getInt("shop_price")+
                    "商品数量"+rs.getInt("shop_num"));
        }
    }
}
