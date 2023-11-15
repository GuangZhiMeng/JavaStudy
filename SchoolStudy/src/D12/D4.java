package D12;

import javax.swing.*;
import javax.swing.table.JTableHeader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class D4 extends JFrame {
    private JScrollPane scpDemo;
    private JTableHeader jth;
    private JTable tabDemo;
    private JButton btnShow;
    public D4(){
        super("商品查询");
        this.setSize(330,400);
        this.setLayout(null);
        this.setLocation(100,50);
        this.scpDemo = new JScrollPane();
        this.scpDemo.setBounds(10,50,300,270);
        this.btnShow = new JButton("查询商品数据");
        this.btnShow.setBounds(10,10,300,30);
        this.btnShow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                btnShow_ActionPerformed(ae);
            }
        });
        add(this.scpDemo);
        add(this.btnShow);
        this.setVisible(true);
    }
    public void btnShow_ActionPerformed(ActionEvent ae){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test123?serverTimezoneGMT%2B8","root","123456");
            String sql = "select * from shop";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int count = 0;
            while(rs.next()){
                count++;
            }
            //rs = pstm.executeQuery();
            Object[][] info = new Object[count][4];
            count = 0;
            rs.beforeFirst();
            while(rs.next()){
                info[count][0] = rs.getString("shop_id");
                info[count][1] = rs.getString("shop_name");
                info[count][2] = Integer.valueOf( rs.getString("shop_price") );
                info[count][3] = rs.getString("shop_num");
                count++;
            }
            String[] title = {"商品编号","商品名称","价格","数量"};
            this.tabDemo = new JTable(info,title);
            this.jth = this.tabDemo.getTableHeader();
            this.scpDemo.getViewport().add(tabDemo);
        }catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null,"数据源错误","错误",JOptionPane.ERROR_MESSAGE);
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,"数据操作错误","错误",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args){
        new D4();
    }
}

