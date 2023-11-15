package D12;
import  javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class d2 extends JFrame{
    d2(){//构造方法
        setTitle("商品查询界面");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(3);//关闭程序
        setLocationRelativeTo(null);
        JLabel jl[]={new JLabel("用户名："),new JLabel("密码：")};
        JTextField yhm=new JTextField();
        JPasswordField mm=new JPasswordField();
        JButton jb[]={new JButton("登录"),new JButton("重置")};
        setLayout(null);
        add(jl[0]).setBounds(50,20,80,30);
        add(yhm).setBounds(130,20,120,30);
        add(jl[1]).setBounds(50,70,80,30);
        add(mm).setBounds(130,70,120,30);
        add(jb[0]).setBounds(50,120,80,30);
        add(jb[1]).setBounds(170,120,80,30);
        jb[1].addActionListener(new ActionListener() {//设置重置按钮事件
            public void actionPerformed(ActionEvent e) {
                yhm.setText("");
                mm.setText("");
            }
        });
        jb[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String un=yhm.getText().trim();//trim()去除空格
                    String pw=new String(mm.getPassword()).trim();
                    Class.forName("com.mysql.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/tes123?serverTimezone=GMT%2B8";
                    String username="root";
                    String password="123456";
                    String sql="select * from user where userid like '"+un+"'";
                    Connection conn= DriverManager.getConnection(url,username,password);
                    Statement stmt=conn.createStatement();
                    ResultSet rs= stmt.executeQuery(sql);
                    if (rs.next()){
                        if (rs.getString("password").equals(pw))
                            JOptionPane.showMessageDialog(null,"验证成功");
                        else
                            JOptionPane.showMessageDialog(null,"密码错误");
                    }else
                        JOptionPane.showMessageDialog(null,"用户不存在");
                }catch (Exception ee){
                    ee.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        new d2();
    }
}
