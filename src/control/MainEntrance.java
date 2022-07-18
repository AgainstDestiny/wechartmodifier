package control;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Description: control
 * @author: Axu
 * @date:2022/5/30 17:27
 */
public class MainEntrance {

    Image offScreenImage = null;

    JFrame jf = new JFrame();

    private String[] friends = {"阿旭"};

    //定义一个JList对象
    JList friendsList;

    //定义登录按钮
    JButton loginBtn;

    boolean flag = false;

    Box vb;

    Box vb2;

    JLabel account;

    JTextField accountText;

    JTextField passwordText;

    JLabel connectTip;

    JPanel connJPanel;

    JList user;

    JButton call;

    JButton look;

    JButton mine;

    ImageIcon cIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/通讯录.png");
    ImageIcon lIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/发现.png");
    ImageIcon mineIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/我的.png");


    JButton messageBtn2;
    JButton callBtn2;
    JButton lookBtn2;
    JButton mineBtn2;

    double total = 0;

    double total2 = 0;

    double money = 0;

    JLabel moneyText;

    JButton twentyQB = new JButton("20Q币");

    JButton thirtyQB = new JButton("30Q币");

    JButton oneHundredQB = new JButton("100Q币");

    JButton QBAndVip = new JButton("<html>10Q币+<br>1个月视频会员</html>");

    JPanel QBRechargeJpanel;

    double num = 0;

    JLabel moneyAmount;

    Cursor cursor=new Cursor(Cursor.HAND_CURSOR);

    public MainEntrance() {
        jf.setUndecorated(true);//去掉窗口的装饰

        jf.getRootPane().setWindowDecorationStyle(JRootPane.NONE);//采用指定的窗口装饰风格
        jf.getContentPane().setBackground(Color.WHITE);
        ImageIcon icon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/设置.png");
        icon.setImage(icon.getImage().getScaledInstance(15, 15, 0));
        JButton jb = new JButton(icon);
        jb.setOpaque(false);//设置控件是否透明，true不透明，false透明
        jb.setContentAreaFilled(false);//设置图片填满按钮所在区域
        jb.setBorderPainted(false);//设置是否绘制边框
        jb.setBorder(null);//设置边框
        jb.setBounds(240, 10, 15, 15);
        jb.setCursor(cursor);
        //给设置按钮添加事件
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//               jf.setVisible(false);
                jf.dispose();//这些Componen的资源将被破坏，释放资源。可以使用pack 或 show 方法恢复，并且可以恢复到dispose前的状态
                JFrame jf2 = new JFrame();
                jf2.setUndecorated(true);//去掉窗口的装饰
                jf2.getRootPane().setWindowDecorationStyle(JRootPane.NONE);//采用指定的窗口装饰风格
                jf2.getContentPane().setBackground(Color.WHITE);
                ImageIcon icon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/管理员.png");
                icon2.setImage(icon2.getImage().getScaledInstance(15, 15, 0));
                JButton jb3 = new JButton(icon2);
                jb3.setOpaque(false);//设置控件是否透明，true不透明，false透明
                jb3.setContentAreaFilled(false);//设置图片填满按钮所在区域
                jb3.setBorderPainted(false);//设置是否绘制边框
                jb3.setBorder(null);//设置边框
                jb3.setBounds(240, 10, 15, 15);
                jb3.setCursor(cursor);

                ImageIcon icon3 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/叉号.png");
                icon3.setImage(icon3.getImage().getScaledInstance(15, 15, 0));
                JButton jb4 = new JButton(icon3);
                jb4.setOpaque(false);//设置控件是否透明，true不透明，false透明
                jb4.setContentAreaFilled(false);//设置图片填满按钮所在区域
                jb4.setBorderPainted(false);//设置是否绘制边框
                jb4.setBorder(null);//设置边框
                jb4.setBounds(270, 10, 15, 15);
                jb4.setCursor(cursor);

                JLabel title2 = new JLabel("微信");
                title2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                title2.setForeground(Color.GRAY);
                title2.setOpaque(false);
                title2.setBorder(null);
                title2.setBounds(10, 0, 50, 30);
                JPanel top2 = new JPanel();
                top2.setPreferredSize(new Dimension(300, 300));
                top2.setOpaque(false);
                top2.setLayout(null);
                top2.add(title2);
                top2.add(jb3);
                top2.add(jb4);

                JLabel tip = new JLabel("网络代理设置");
                tip.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                tip.setOpaque(false);
                tip.setBorder(null);

                JPanel tipPane1 = new JPanel();
                tipPane1.add(tip);
                tipPane1.setOpaque(false);
                Box tpBox = Box.createVerticalBox();
                tpBox.add(tipPane1);

                JRadioButton button1 = new JRadioButton("关闭", true);
                button1.setOpaque(false);
                button1.setContentAreaFilled(false);
                button1.setBorderPainted(false);
                button1.setBorder(null);
                button1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                button1.setForeground(Color.GRAY);
                button1.setCursor(cursor);

                JRadioButton button2 = new JRadioButton("开启");
                button2.setOpaque(false);
                button2.setContentAreaFilled(false);
                button2.setBorderPainted(false);
                button2.setBorder(null);
                button2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                button2.setForeground(Color.GRAY);
                button2.setCursor(cursor);

                ButtonGroup bg = new ButtonGroup();
                bg.add(button1);
                bg.add(button2);


                JLabel tip2 = new JLabel("使用代理");
                tip2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                tip2.setForeground(Color.GRAY);
                JPanel tipPane = new JPanel();
                tipPane.setOpaque(false);
                tipPane.setLayout(new FlowLayout(0, 30, 10));
                tipPane.add(tip2);
                tipPane.add(button1);
                tipPane.add(button2);
                tipPane.setPreferredSize(new Dimension(300, 700));


                Box wholeBox = Box.createVerticalBox();
                wholeBox.add(top2);
                wholeBox.add(tpBox);
                wholeBox.add(tipPane);


                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1.setSelected(true);
                        if (button1.isSelected()) {
                            button2.setIcon(null);
                            ImageIcon imageIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/单选按钮.png");
                            imageIcon.setImage(imageIcon.getImage().getScaledInstance(15, 15, 0));
                            button1.setIcon(imageIcon);
                            vb.setVisible(false);
                        }

                    }
                });

                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button2.setSelected(true);
                        if (button2.isSelected()) {
                            button1.setIcon(null);
                            ImageIcon imageIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/单选按钮.png");
                            imageIcon.setImage(imageIcon.getImage().getScaledInstance(15, 15, 0));
                            button2.setIcon(imageIcon);
                            JLabel address = new JLabel("地址");
                            address.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                            address.setForeground(Color.GRAY);
                            JTextField addressText = new JTextField(20);
                            addressText.setOpaque(false);
                            addressText.setBorder(null);
                            ImageIcon img = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/下划线.png");
                            img.setImage(img.getImage().getScaledInstance(170, 10, 0));
                            JLabel underLine1 = new JLabel(img);
                            Box infoBox = Box.createVerticalBox();
                            infoBox.add(addressText);
                            infoBox.add(underLine1);
                            JPanel addressJpanel = new JPanel();
                            addressJpanel.setLayout(new FlowLayout(0, 15, 10));
                            addressJpanel.setOpaque(false); //设置控件为透明的。false为透明的,true为不透明的。
                            addressJpanel.add(address);
                            addressJpanel.add(infoBox);
                            JLabel port = new JLabel("端口");
                            port.setForeground(Color.GRAY);
                            port.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                            JTextField portText = new JTextField(20);
                            portText.setOpaque(false);
                            portText.setBorder(null);
                            ImageIcon img2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/下划线.png");
                            img2.setImage(img2.getImage().getScaledInstance(170, 10, 0));
                            JLabel underLine2 = new JLabel(img);
                            Box infoBox2 = Box.createVerticalBox();
                            infoBox2.add(portText);
                            infoBox2.add(underLine2);
                            JPanel portJpanel = new JPanel();
                            portJpanel.setLayout(new FlowLayout(0, 15, 10));
                            portJpanel.setOpaque(false); //设置控件为透明的。false为透明的,true为不透明的。
                            portJpanel.add(port);
                            portJpanel.add(infoBox2);

                            JButton installBtn = new JButton("更多设置");
                            installBtn.setOpaque(false);
                            installBtn.setContentAreaFilled(false);
                            installBtn.setBorderPainted(false);
                            installBtn.setBorder(null);
                            installBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                            installBtn.setForeground(Color.BLUE);
                            JPanel rightPanel = new JPanel();
                            rightPanel.setOpaque(false);
                            rightPanel.setBorder(null);
                            rightPanel.setLayout(new FlowLayout(0, 170, -1));
                            rightPanel.add(installBtn);

                            installBtn.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {

                                    installBtn.setVisible(false);

                                    account = new JLabel("账户");
                                    account.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                    account.setForeground(Color.GRAY);
                                    accountText = new JTextField(20);
                                    accountText.setOpaque(false);
                                    accountText.setBorder(null);
                                    ImageIcon img3 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/下划线.png");
                                    img3.setImage(img3.getImage().getScaledInstance(170, 10, 0));
                                    JLabel underLine3 = new JLabel(img3);
                                    Box infoBox3 = Box.createVerticalBox();
                                    infoBox3.add(accountText);
                                    infoBox3.add(underLine3);
                                    JPanel accountJpanel = new JPanel();
                                    accountJpanel.setLayout(new FlowLayout(0, 15, 10));
                                    accountJpanel.setOpaque(false); //设置控件为透明的。false为透明的,true为不透明的。
                                    accountJpanel.add(account);
                                    accountJpanel.add(infoBox3);
                                    JLabel password = new JLabel("密码");
                                    password.setForeground(Color.GRAY);
                                    password.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                    passwordText = new JTextField(20);
                                    passwordText.setOpaque(false);
                                    passwordText.setBorder(null);
                                    ImageIcon img4 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/下划线.png");
                                    img4.setImage(img4.getImage().getScaledInstance(170, 10, 0));
                                    JLabel underLine4 = new JLabel(img4);
                                    Box infoBox4 = Box.createVerticalBox();
                                    infoBox4.add(passwordText);
                                    infoBox4.add(underLine4);

                                    JPanel passwordJpanel = new JPanel();
                                    passwordJpanel.setLayout(new FlowLayout(0, 15, 10));
                                    passwordJpanel.setOpaque(false); //设置控件为透明的。false为透明的,true为不透明的。
                                    passwordJpanel.add(password);
                                    passwordJpanel.add(infoBox4);

                                    vb2 = Box.createVerticalBox();
                                    vb2.add(accountJpanel);
                                    vb2.add(passwordJpanel);
                                    flag = true;
                                }
                            });

                            JButton bottomLoginBtn = new JButton("确定");
                            bottomLoginBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                            bottomLoginBtn.setForeground(Color.WHITE);
                            bottomLoginBtn.setBackground(Color.GREEN);
                            bottomLoginBtn.setPreferredSize(new Dimension(160, 40));
//                            bottomLoginBtn.setHorizontalTextPosition(SwingConstants.CENTER);
//                            bottomLoginBtn.setVerticalTextPosition(SwingConstants.CENTER);
                            JPanel bottomLoginBtnJpanel = new JPanel();
                            bottomLoginBtnJpanel.setPreferredSize(new Dimension(jf2.getWidth(), 120));
                            bottomLoginBtnJpanel.setLayout(new FlowLayout(0, 40, 20));
                            bottomLoginBtnJpanel.setOpaque(false);
                            bottomLoginBtnJpanel.add(bottomLoginBtn);
                            if (flag == false) {
                                vb = Box.createVerticalBox();
                                vb.add(addressJpanel);
                                vb.add(portJpanel);
                                vb.add(rightPanel);
                                vb.add(bottomLoginBtnJpanel);
                                tipPane.add(vb);

                            }
                            if (flag == true) {
                                vb = Box.createVerticalBox();
                                vb.add(connectTip);
                                vb.add(addressJpanel);
                                vb.add(portJpanel);
                                vb.add(vb2);
                                vb.add(bottomLoginBtnJpanel);
                                tipPane.add(vb);

                            }
                            bottomLoginBtn.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    //使用线程执行任务
                                    new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            ImageIcon connBg = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\连接背景.png");
                                            ImageIcon connBg2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\连接背景2.png");
                                            addressText.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            portText.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            if (!addressText.getText().equals("@localhost") && portText.getText().length() != 4) {

                                                connBg.setImage(connBg.getImage().getScaledInstance(80, 40, 0));
                                                connectTip = new JLabel();
                                                connectTip.setIcon(connBg);
                                                connectTip.setHorizontalTextPosition(SwingConstants.CENTER);
                                                connectTip.setVerticalTextPosition(SwingConstants.CENTER);
                                                connectTip.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                connectTip.setForeground(Color.GRAY);


                                                connJPanel = new JPanel();
                                                connJPanel.setOpaque(false);
                                                connJPanel.add(connectTip);

                                                tpBox.add(connJPanel);

                                                ImageIcon imgLoad = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\加载.gif");
                                                imgLoad.setImage(imgLoad.getImage().getScaledInstance(40, 30, 0));
                                                bottomLoginBtn.setIcon(imgLoad);

                                                bottomLoginBtn.setText("连接中");

                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException ex) {
                                                    ex.printStackTrace();
                                                }
                                                bottomLoginBtn.setIcon(null);
                                                bottomLoginBtn.setText("确定");
                                                connJPanel.setVisible(false);
                                            }
                                            if (addressText.getText().equals("@localhost") && portText.getText().length() == 4) {
                                                connBg2.setImage(connBg2.getImage().getScaledInstance(90, 40, 0));
                                                connectTip.setIcon(connBg2);
                                                connectTip.setText("连接成功");
                                                connectTip.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                connectTip.setForeground(Color.GRAY);


                                                connJPanel = new JPanel();
                                                connJPanel.setOpaque(false);
                                                connJPanel.add(connectTip);

                                                tpBox.add(connJPanel);

                                                ImageIcon imgLoad = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\加载.gif");
                                                imgLoad.setImage(imgLoad.getImage().getScaledInstance(40, 30, 0));
                                                bottomLoginBtn.setIcon(imgLoad);

                                                bottomLoginBtn.setText("连接中");

                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException ex) {
                                                    ex.printStackTrace();
                                                }
                                                bottomLoginBtn.setIcon(null);
                                                bottomLoginBtn.setText("确定");
                                                connJPanel.setVisible(false);
                                                addressText.setEditable(false);
                                                portText.setEditable(false);
                                                bottomLoginBtn.setVisible(false);
                                                installBtn.setVisible(false);
                                                try {
                                                    Thread.sleep(800);
                                                } catch (InterruptedException ex) {
                                                    ex.printStackTrace();
                                                }
//                                                jf2.setVisible(false);
                                                jf2.dispose();//这些Componen的资源将被破坏，释放资源。可以使用pack 或 show 方法恢复，并且可以恢复到dispose前的状态
                                                jf.setVisible(true);

                                            }

                                        }
                                    }).start();

                                }
                            });

                        }

                    }
                });

                jf2.setSize(300, 380);
                jf2.add(wholeBox);

                jf2.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/resources/微信.png")));

                jf2.setLocationRelativeTo(null);
                jf2.setResizable(false);
                jf2.setVisible(true);

                jb3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        jf2.setVisible(false);
                        jf2.dispose();//这些Componen的资源将被破坏，释放资源。可以使用pack 或 show 方法恢复，并且可以恢复到dispose前的状态
                        jf.setVisible(true);
                    }
                });
                jb4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
        });

        ImageIcon icon1 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/叉号.png");
        icon1.setImage(icon1.getImage().getScaledInstance(15, 15, 0));
        JButton jb2 = new JButton(icon1);
        jb2.setOpaque(false);//设置控件是否透明，true不透明，false透明
        jb2.setContentAreaFilled(false);//设置图片填满按钮所在区域
        jb2.setBorderPainted(false);//设置是否绘制边框
        jb2.setBorder(null);//设置边框
        jb2.setBounds(270, 10, 15, 15);
        jb2.setCursor(cursor);
        //给关闭按钮设置事件
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JLabel title = new JLabel("微信");
        title.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        title.setForeground(Color.GRAY);
        title.setOpaque(false);
        title.setBorder(null);
        title.setBounds(10, 0, 50, 30);
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(300, 100));
        top.setOpaque(false);
        top.setLayout(null);
        top.add(title);
        top.add(jb);
        top.add(jb2);
        jf.setSize(300, 380);
        jf.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/resources/微信.png")));

        friendsList = new JList(friends);
        MyRendered m = new MyRendered();
        friendsList.setCellRenderer(m);

        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/resources/圆角矩形.png"));
        //设置图片大小
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(200, 45, 0));

        loginBtn = new JButton("登录", imageIcon);
        loginBtn.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        loginBtn.setForeground(Color.WHITE);

        //设置按钮大小
        loginBtn.setPreferredSize(new Dimension(180, 30));
        loginBtn.setOpaque(false); //设置控件是否透明，true为不透明，false为透明
        loginBtn.setContentAreaFilled(false);//设置图片填满按钮所在的区域
        //loginBtn.setFocusPainted(false);//设置这个按钮是不是获得焦点
        loginBtn.setBorderPainted(false);//设置是否绘制边框
        loginBtn.setBorder(null);//设置边框
        //用于设置文字相对于图片的位置。
        loginBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        loginBtn.setVerticalTextPosition(SwingConstants.CENTER);


        JPanel bottomJpanel = new JPanel();
        bottomJpanel.setOpaque(false);
        bottomJpanel.add(loginBtn);
        Box bottom = Box.createVerticalBox();

        Cursor cursor=new Cursor(Cursor.HAND_CURSOR);

        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { //当光标移上去的时候，光标样式发生改变
                loginBtn.setCursor(cursor);
            }

            @Override
            public void mouseExited(MouseEvent e) {//当光标移出的时候，光标样式还原。
                loginBtn.setCursor(null);
            }
        });

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                jf.setVisible(false);
                jf.dispose();//这些Componen的资源将被破坏，释放资源。可以使用pack 或 show 方法恢复，并且可以恢复到dispose前的状态
                JFrame jf3 = new JFrame();
                jf3.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/resources/微信.png")));
                jf3.setUndecorated(true);//去掉窗口的装饰
                jf3.getRootPane().setWindowDecorationStyle(JRootPane.NONE);//采用指定的窗口装饰
                jf3.getContentPane().setBackground(Color.WHITE);
                jf3.setSize(400, 700);
                jf3.setResizable(false);
                jf3.setLocationRelativeTo(null);

                ImageIcon icon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\搜索.png");
                icon2.setImage(icon2.getImage().getScaledInstance(30, 20, 0));
                JButton jb3 = new JButton();
                jb3.setIcon(icon2);
                jb3.setOpaque(false);//设置控件是否透明，true不透明，false透明
                jb3.setContentAreaFilled(false);//设置图片填满按钮所在区域
                jb3.setBorderPainted(false);//设置是否绘制边框
                jb3.setBorder(null);//设置边框
                jb3.setBounds(320, 10, 30, 20);

                jb3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        jf3.setVisible(false);
                        jf3.dispose();//这些Componen的资源将被破坏，释放资源。可以使用pack 或 show 方法恢复，并且可以恢复到dispose前的状态
                        JFrame jf4 = new JFrame();
                        jf4.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\微信.png"));
                        jf4.setUndecorated(true);//去掉窗口修饰
                        jf4.getRootPane().setWindowDecorationStyle(JRootPane.NONE);//指定窗口装饰风格
                        jf4.getContentPane().setBackground(Color.WHITE);
                        jf4.setSize(jf3.getWidth(), jf3.getHeight());
                        jf4.setLocationRelativeTo(null);
                        jf4.setResizable(false);
                        JTextField search = new JTextField("         探索", 20);
                        search.setBorder(new LineBorder(Color.GRAY, 2, true));
                        search.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                        search.setForeground(Color.GRAY);
                        search.setBounds(15, 20, 320, 30);

                        JButton cancle = new JButton("取消");
                        cancle.setOpaque(false);
                        cancle.setContentAreaFilled(false);
                        cancle.setBorderPainted(false);
                        cancle.setBorder(null);
                        cancle.setHorizontalTextPosition(SwingConstants.CENTER);
                        cancle.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                        cancle.setForeground(Color.BLUE);
                        cancle.setBounds(340, 20, 40, 30);

                        cancle.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
//                                jf4.setVisible(false);
                                jf4.dispose();//这些Componen的资源将被破坏，释放资源。可以使用pack 或 show 方法恢复，并且可以恢复到dispose前的状态
                                jf3.setVisible(true);
                            }
                        });
                        ImageIcon sIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\查找.png");
                        sIcon.setImage(sIcon.getImage().getScaledInstance(30, 20, 0));
                        JLabel sLabel = new JLabel(sIcon);
                        sLabel.setOpaque(false);
                        sLabel.setSize(new Dimension(40, 30));

                        ImageIcon yIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\语音.png");
                        yIcon.setImage(yIcon.getImage().getScaledInstance(30, 20, 0));
                        JLabel yLabel = new JLabel(yIcon);
                        yLabel.setOpaque(false);
//                        yLabel.setSize(new Dimension(40,30));

                        JButton voice = new JButton();
                        voice.setOpaque(false);
                        voice.setBorderPainted(true);
                        voice.setContentAreaFilled(false);
                        voice.setBorder(null);
                        voice.add(yLabel);
                        voice.setBounds(280, 0, 40, 30);

                        search.add(sLabel);
                        search.add(voice);

                        JLabel sInfoLabel = new JLabel();
                        sInfoLabel.setText("搜索指定内容");
                        sInfoLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                        sInfoLabel.setForeground(Color.GRAY);
                        sInfoLabel.setBounds(40, 80, 100, 20);

                        JButton friend = new JButton("朋友圈");
                        friend.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                        friend.setForeground(Color.BLUE);
                        friend.setOpaque(false);
                        friend.setBorder(null);
                        friend.setBorderPainted(false);
                        friend.setContentAreaFilled(false);
                        friend.setBounds(30, 120, 60, 20);

                        JButton thePublic = new JButton("公众号");
                        thePublic.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                        thePublic.setForeground(Color.BLUE);
                        thePublic.setOpaque(false);
                        thePublic.setBorder(null);
                        thePublic.setBorderPainted(false);
                        thePublic.setContentAreaFilled(false);
                        thePublic.setBounds(120, 120, 60, 20);

                        JButton applet = new JButton("小程序");
                        applet.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                        applet.setForeground(Color.BLUE);
                        applet.setOpaque(false);
                        applet.setBorder(null);
                        applet.setBorderPainted(false);
                        applet.setContentAreaFilled(false);
                        applet.setBounds(210, 120, 60, 20);

                        JButton emoji = new JButton("表情");
                        emoji.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                        emoji.setForeground(Color.BLUE);
                        emoji.setOpaque(false);
                        emoji.setBorder(null);
                        emoji.setBorderPainted(false);
                        emoji.setContentAreaFilled(false);
                        emoji.setBounds(300, 120, 50, 20);

                        JButton server = new JButton("服务");
                        server.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                        server.setForeground(Color.BLUE);
                        server.setOpaque(false);
                        server.setBorder(null);
                        server.setBorderPainted(false);
                        server.setContentAreaFilled(false);
                        server.setBounds(30, 160, 50, 20);

                        JPanel searchJpanel = new JPanel();
                        searchJpanel.setOpaque(false);
                        searchJpanel.setLayout(null);
                        searchJpanel.add(search);
                        searchJpanel.add(cancle);
                        searchJpanel.add(sInfoLabel);
                        searchJpanel.add(friend);
                        searchJpanel.add(thePublic);
                        searchJpanel.add(applet);
                        searchJpanel.add(emoji);
                        searchJpanel.add(server);

                        jf4.add(searchJpanel);
                        jf4.setVisible(true);
                    }
                });

                ImageIcon icon3 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources\\添加.png");
                icon3.setImage(icon3.getImage().getScaledInstance(30, 20, 0));
                JMenu jb4 = new JMenu();
                jb4.setIcon(icon3);
                jb4.setOpaque(false);//设置控件是否透明，true不透明，false透明
                jb4.setContentAreaFilled(false);//设置图片填满按钮所在区域
                jb4.setBorderPainted(false);//设置是否绘制边框
                jb4.setBorder(null);//设置边框
//                JMenuItem jMenuItem1=new JMenuItem("发起群聊");
//                jMenuItem1.setForeground(Color.RED);
//                jb4.add(jMenuItem1);
//                jb4.add(jMenuItem2);
//                jb4.add(jMenuItem3);
//                jb4.add(jMenuItem4);

                jb4.setBounds(360, 10, 50, 20);

                JLabel title2 = new JLabel("微信");
                title2.setFont(new Font("微软雅黑", Font.BOLD, 16));
                title2.setForeground(Color.BLACK);
                title2.setOpaque(false);
                title2.setBorder(null);
                title2.setBounds(180, 5, 50, 30);
                JPanel top2 = new JPanel();
                top2.setOpaque(false);
                top2.setLayout(null);

                top2.add(title2);
                top2.add(jb3);
                top2.add(jb4);

                String[] name = {"妈妈", "爸爸", "爷爷", "妹妹", "21网络7", "网课", "付老二", "高通"};
                user = new JList(name);
                user.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//设置选择模式为单选。
                MyRendered2 myRendered2 = new MyRendered2();
                user.setCellRenderer(myRendered2);

                JFrame jf14=new JFrame("聊天窗口");

                jf14.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                jf14.setSize(500, 400);
                jf14.setResizable(false);
                jf14.setLocationRelativeTo(null);
                JTextArea textArea=new JTextArea(22,20);
                textArea.setFont(new Font("微软雅黑", Font.PLAIN, 14));
               textArea.setBounds(0, 0, jf14.getWidth(), 320);
               textArea.setBorder(null);
               textArea.setOpaque(false);

               JTextField textField=new JTextField(20);
               textField.setBounds(0, 340, 400, 30);

               JButton sendBtn=new JButton("发送");
               sendBtn.setBorderPainted(false);
               sendBtn.setBorder(null);
               sendBtn.setBounds(401, 340, 100, 30);

               sendBtn.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       new Thread(new Runnable(){
                           @Override
                           public void run() {
                               if (textField.getText().length()>0) {
                                   textArea.append("\n" + "阿旭:" + textField.getText());
                                   if ("在？".equals(textField.getText())) {
                                       textField.setText(null);
                                       try {
                                           Thread.sleep(2000);
                                       } catch (InterruptedException ex) {
                                           ex.printStackTrace();
                                       }
                                       textArea.append("\n" + user.getSelectedValue() + ":在");
                                   }
                                   if ("你吃饭了某？".equals(textField.getText())) {
                                       textField.setText(null);
                                       try {
                                           Thread.sleep(500);
                                       } catch (InterruptedException ex) {
                                           ex.printStackTrace();
                                       }
                                           textArea.append("\n" + user.getSelectedValue() + ":刚吃了");
                                   }
                                   if ("我一会儿去嫩家吃冰糕去".equals(textField.getText())) {
                                       textField.setText(null);
                                       try {
                                           Thread.sleep(500);
                                       } catch (InterruptedException ex) {
                                           ex.printStackTrace();
                                       }
                                       textArea.append("\n" + user.getSelectedValue() + ":吃呗");
                                   }
                                   if ("那我现在过去吧？".equals(textField.getText())) {
                                       textField.setText(null);
                                       try {
                                           Thread.sleep(500);
                                       } catch (InterruptedException ex) {
                                           ex.printStackTrace();
                                       }
                                       textArea.append("\n" + user.getSelectedValue() + ":中，来吧");
                                   }
                                   if ("中，我先把电脑关了".equals(textField.getText())){
                                       textField.setText(null);
                                       try {
                                           Thread.sleep(500);
                                       } catch (InterruptedException ex) {
                                           ex.printStackTrace();
                                       }
                                       textArea.append("\n" + user.getSelectedValue() + ":OK,你要是过来晚了冰糕都吃完了");
                                   }
                                   if ("我马上过去".equals(textField.getText())){
                                       textField.setText(null);
                                       try {
                                           Thread.sleep(500);
                                       } catch (InterruptedException ex) {
                                           ex.printStackTrace();
                                       }
                                       textArea.append("\n" + user.getSelectedValue() + ":快点吧");
                                   }
                                   textField.setText(null);
                               }else {
                                   JOptionPane.showMessageDialog(jf14, "您要发送的信息不能为空","信息",JOptionPane.CANCEL_OPTION);
                               }
                           }
                       }).start();
                   }
               });

              sendBtn.setCursor(cursor);

               jf14.getContentPane().setLayout(null);
               jf14.add(textArea);
               jf14.add(textField);
               jf14.add(sendBtn);


                jf14.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        jf14.dispose();
                        textArea.setText(null);
                        jf3.show();
                    }
                });

                user.addListSelectionListener((ListSelectionListener)->{
                    jf3.dispose();
                    jf14.setVisible(true);
                });

                JPanel uJp = new JPanel();
                uJp.setPreferredSize(new Dimension(400, 500));
                uJp.setOpaque(false);
                uJp.setBorder(new LineBorder(Color.GRAY));
                uJp.add(user);

                JButton message = new JButton();
                message.setText("微信");
                message.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                message.setHorizontalTextPosition(SwingConstants.CENTER);
                message.setVerticalTextPosition(SwingConstants.BOTTOM);
                message.setOpaque(false);
                message.setBorder(null);
                message.setContentAreaFilled(false);
                message.setBorderPainted(false);
                ImageIcon mIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/消息.png");
                mIcon.setImage(mIcon.getImage().getScaledInstance(40, 30, 0));
                message.setPreferredSize(new Dimension(40, 50));
                message.setIcon(mIcon);

                message.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        call.setIcon(cIcon);
                        call.setForeground(null);
                        look.setIcon(lIcon);
                        look.setForeground(null);
                        mine.setIcon(mineIcon);
                        mine.setForeground(null);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                ImageIcon mIcon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/消息 (1).png");
                                mIcon2.setImage(mIcon2.getImage().getScaledInstance(40, 30, 0));
                                message.setIcon(mIcon2);
                                message.setForeground(Color.GREEN);
                            }
                        }).start();
                    }
                });

                call = new JButton();
                call.setText("通讯录");
                call.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                call.setHorizontalTextPosition(SwingConstants.CENTER);
                call.setVerticalTextPosition(SwingConstants.BOTTOM);
                call.setOpaque(false);
                call.setBorder(null);
                call.setContentAreaFilled(false);
                call.setBorderPainted(false);

                cIcon.setImage(cIcon.getImage().getScaledInstance(40, 30, 0));
                call.setPreferredSize(new Dimension(40, 50));
                call.setIcon(cIcon);

                call.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        message.setIcon(mIcon);
                        message.setForeground(null);
                        look.setIcon(lIcon);
                        look.setForeground(null);
                        mine.setIcon(mineIcon);
                        mine.setForeground(null);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                ImageIcon cIcon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/通讯录 (1).png");
                                cIcon2.setImage(cIcon2.getImage().getScaledInstance(40, 30, 0));
                                call.setIcon(cIcon2);
                                call.setForeground(Color.GREEN);
                            }
                        }).start();
                    }
                });

                look = new JButton();
                look.setText("发现");
                look.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                look.setHorizontalTextPosition(SwingConstants.CENTER);
                look.setVerticalTextPosition(SwingConstants.BOTTOM);
                look.setOpaque(false);
                look.setBorder(null);
                look.setContentAreaFilled(false);
                look.setBorderPainted(false);

                lIcon.setImage(lIcon.getImage().getScaledInstance(40, 30, 0));
                look.setPreferredSize(new Dimension(40, 50));
                look.setIcon(lIcon);

                look.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        message.setIcon(mIcon);
                        message.setForeground(null);
                        call.setIcon(cIcon);
                        call.setForeground(null);
                        mine.setIcon(mineIcon);
                        mine.setForeground(null);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                ImageIcon lIcon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/发现 (1).png");
                                lIcon2.setImage(lIcon2.getImage().getScaledInstance(40, 30, 0));
                                look.setIcon(lIcon2);
                                look.setForeground(Color.GREEN);
                            }
                        }).start();
                    }
                });

                mine = new JButton();
                mine.setText("我");
                mine.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                mine.setHorizontalTextPosition(SwingConstants.CENTER);
                mine.setVerticalTextPosition(SwingConstants.BOTTOM);
                mine.setOpaque(false);
                mine.setBorder(null);
                mine.setContentAreaFilled(false);
                mine.setBorderPainted(false);
                mineIcon.setImage(mineIcon.getImage().getScaledInstance(40, 30, 0));
                mine.setPreferredSize(new Dimension(40, 50));
                mine.setIcon(mineIcon);

                mine.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        message.setIcon(mIcon);
                        message.setForeground(null);
                        call.setIcon(cIcon);
                        call.setForeground(null);
                        look.setIcon(lIcon);
                        look.setForeground(null);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                ImageIcon mineIcon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/我的 (1).png");
                                mineIcon2.setImage(mineIcon2.getImage().getScaledInstance(40, 30, 0));
                                mine.setIcon(mineIcon2);
                                mine.setForeground(null);
                                jf3.dispose();
                                mine.setIcon(mineIcon);
                                JFrame jf5 = new JFrame();
                                jf5.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                                jf5.setUndecorated(true);
                                jf5.setSize(jf3.getWidth(), jf3.getHeight());
                                jf5.setLocationRelativeTo(null);
                                jf5.setResizable(false);


                                JLabel mineLabel = new JLabel(new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/wechat.png"));
                                mineLabel.setOpaque(false);
                                mineLabel.setBorder(null);
                                mineLabel.setBounds(20, 80, 77, 78);

                                JLabel mineName = new JLabel("阿旭");
                                mineName.setOpaque(false);
                                mineName.setFont(new Font("微软雅黑", Font.BOLD, 16));
                                mineName.setForeground(Color.BLACK);
                                mineName.setBounds(107, 90, 40, 20);

                                JLabel wechatNo = new JLabel("微信号:a1957804838");
                                wechatNo.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                wechatNo.setForeground(Color.GRAY);
                                wechatNo.setOpaque(false);
                                wechatNo.setBounds(107, 130, 160, 20);

                                ImageIcon qrIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/二维码.png");
                                qrIcon.setImage(qrIcon.getImage().getScaledInstance(30, 20, 0));

                                JLabel qrCode = new JLabel(qrIcon);
                                qrCode.setOpaque(false);
                                qrCode.setBounds(267, 130, 160, 20);

                                ImageIcon arrow = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/箭头 右.png");
                                arrow.setImage(arrow.getImage().getScaledInstance(20, 15, 0));


                                JButton arrowBtn = new JButton();
                                arrowBtn.setIcon(arrow);
                                arrowBtn.setOpaque(false);
                                arrowBtn.setContentAreaFilled(false);
                                arrowBtn.setBorder(null);
                                arrowBtn.setBorderPainted(false);
                                arrowBtn.setBounds(370, 130, 20, 20);

                                ImageIcon payIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信支付.png");
                                payIcon.setImage(payIcon.getImage().getScaledInstance(30, 30, 0));

                                JLabel pay = new JLabel(payIcon);

                                JButton sBtn = new JButton("服务");
                                sBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                sBtn.setForeground(Color.BLACK);
                                sBtn.setHorizontalTextPosition(SwingConstants.RIGHT);
                                sBtn.setOpaque(false);
                                sBtn.setContentAreaFilled(false);
                                sBtn.setBackground(Color.WHITE);
                                sBtn.add(pay);
                                sBtn.setBounds(0, 170, jf5.getWidth(), 40);

                                sBtn.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        jf5.dispose();
                                        JFrame jf6 = new JFrame();
                                        jf6.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                                        jf6.setUndecorated(true);
                                        jf6.getContentPane().setBackground(Color.GRAY);
                                        jf6.setBounds(510, 0, jf5.getWidth(), jf5.getHeight() + 200);
                                        jf6.setResizable(false);

                                        ImageIcon arrowIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/左箭头.png");
                                        arrowIcon.setImage(arrowIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton arrowBtn = new JButton();
                                        arrowBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        arrowBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        arrowBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        arrowBtn.setOpaque(false);
                                        arrowBtn.setContentAreaFilled(false);
                                        arrowBtn.setBorderPainted(false);
                                        arrowBtn.setIcon(arrowIcon);
                                        arrowBtn.setBounds(10, 10, 30, 30);

                                        arrowBtn.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                jf6.dispose();
                                                jf5.show();
                                            }
                                        });

                                        JLabel serverLabel = new JLabel("服务");
                                        serverLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                                        serverLabel.setBounds(jf6.getWidth() / 2 - 20, 15, 80, 20);

                                        ImageIcon moreIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/更多.png");
                                        moreIcon.setImage(moreIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton moreBtn = new JButton();
                                        moreBtn.setOpaque(false);
                                        moreBtn.setContentAreaFilled(false);
                                        moreBtn.setBorderPainted(false);
                                        moreBtn.setIcon(moreIcon);
                                        moreBtn.setBounds(350, 10, 30, 30);

                                        ImageIcon rpIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/收付款.png");
                                        rpIcon.setImage(rpIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton rpBtn = new JButton("收付款");
                                        rpBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        rpBtn.setForeground(Color.WHITE);
                                        rpBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        rpBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        rpBtn.setOpaque(false);
                                        rpBtn.setContentAreaFilled(false);
                                        rpBtn.setBorderPainted(false);
                                        rpBtn.setIcon(rpIcon);
                                        rpBtn.setBounds(80, 80, 80, 50);

                                        ImageIcon walletIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/钱包.png");
                                        walletIcon.setImage(walletIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton walletBtn = new JButton("钱包");
                                        walletBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        walletBtn.setForeground(Color.WHITE);
                                        walletBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        walletBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        walletBtn.setOpaque(false);
                                        walletBtn.setContentAreaFilled(false);
                                        walletBtn.setBorderPainted(false);
                                        walletBtn.setIcon(rpIcon);
                                        walletBtn.setBounds(240, 80, 80, 50);

                                        money = 13880.99;
                                        total += money;

                                        walletBtn.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                jf6.dispose();
                                                JFrame jf7 = new JFrame();
                                                jf7.setUndecorated(true);
                                                jf7.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                                                jf7.getContentPane().setBackground(Color.GRAY);
                                                jf7.setBounds(jf6.getX(), jf6.getY(), jf6.getWidth(), jf6.getHeight());
                                                jf7.setResizable(false);

                                                ImageIcon leftArrowIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/左箭头.png");
                                                leftArrowIcon.setImage(leftArrowIcon.getImage().getScaledInstance(30, 30, 0));

                                                JButton leftArrowBtn = new JButton(leftArrowIcon);
                                                leftArrowBtn.setOpaque(false);
                                                leftArrowBtn.setContentAreaFilled(false);
                                                leftArrowBtn.setBorderPainted(false);
                                                leftArrowBtn.setBounds(10, 10, 30, 30);

                                                leftArrowBtn.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        money = 0;
                                                        jf7.dispose();
                                                        jf6.show();
                                                    }
                                                });

                                                JLabel walletLabel = new JLabel("钱包");
                                                walletLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                                                walletLabel.setBounds(jf7.getWidth() / 2, 10, 50, 30);

                                                JLabel billLabel = new JLabel("账单");
                                                billLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                                                billLabel.setBounds(350, 10, 50, 30);

                                                ImageIcon moneyIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/零钱.png");
                                                moneyIcon.setImage(moneyIcon.getImage().getScaledInstance(30, 30, 0));

                                                JLabel moneyLabel = new JLabel("零钱");
                                                moneyLabel.setIcon(moneyIcon);
                                                moneyLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                moneyLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                moneyLabel.setBounds(20, 70, 130, 30);

                                                moneyText = new JLabel("¥" + total);
                                                moneyText.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                moneyText.setOpaque(false);
                                                moneyText.setBounds(260, 80, 600, 20);
                                                ImageIcon moneyArrowIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/箭头 右.png");
                                                moneyArrowIcon.setImage(moneyArrowIcon.getImage().getScaledInstance(30, 20, 0));
                                                JButton moneyBtn = new JButton(moneyArrowIcon);
                                                moneyBtn.setOpaque(false);
                                                moneyBtn.setContentAreaFilled(false);
                                                moneyBtn.setBorderPainted(false);
                                                moneyBtn.setBounds(360, 80, 30, 20);
                                                moneyBtn.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        jf7.dispose();
                                                        JFrame jf8 = new JFrame();
                                                        jf8.getContentPane().setBackground(Color.GRAY);
                                                        jf8.setUndecorated(true);
                                                        jf8.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                                                        jf8.setBounds(jf5.getX(), jf5.getY(), jf5.getWidth(), jf5.getHeight());
                                                        jf8.setResizable(false);

                                                        ImageIcon leftIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/左箭头.png");
                                                        leftIcon.setImage(leftIcon.getImage().getScaledInstance(30, 20, 0));

                                                        JButton returnBtn = new JButton(leftIcon);
                                                        returnBtn.setOpaque(false);
                                                        returnBtn.setContentAreaFilled(false);
                                                        returnBtn.setBorderPainted(false);
                                                        returnBtn.setBounds(10, 20, 30, 20);

                                                        JLabel billDetail = new JLabel("零钱明细");
                                                        billDetail.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                        billDetail.setBounds(330, 20, 80, 20);

                                                        returnBtn.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                jf8.dispose();
                                                                jf7.show();
                                                            }
                                                        });

                                                        ImageIcon billIcon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/零钱.png");
                                                        billIcon2.setImage(billIcon2.getImage().getScaledInstance(40, 40, 0));

                                                        JLabel bill = new JLabel(billIcon2);
                                                        bill.setBounds(jf8.getWidth() / 2 - 10, 100, 40, 40);

                                                        JLabel myMoney = new JLabel("我的零钱");
                                                        myMoney.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                        myMoney.setBounds(jf8.getWidth() / 2 - 20, 160, 80, 20);

                                                        JLabel allMoney = new JLabel("¥" + total);
                                                        allMoney.setFont(new Font("微软雅黑", Font.BOLD, 30));
                                                        allMoney.setBounds(jf8.getWidth() / 2 - 90, 200, 600, 40);

                                                        JLabel tip = new JLabel("免费开通零钱通 给自己加加薪>");
                                                        tip.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                                                        tip.setForeground(Color.ORANGE);
                                                        tip.setBounds(jf8.getWidth() / 2 - 73, 260, 240, 20);

                                                        ImageIcon rechargeBg = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/充值背景.png");
                                                        rechargeBg.setImage(rechargeBg.getImage().getScaledInstance(120, 40, 0));

                                                        JButton recharge = new JButton("充值", rechargeBg);
                                                        recharge.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                        recharge.setForeground(Color.WHITE);
                                                        recharge.setOpaque(false);
                                                        recharge.setHorizontalTextPosition(SwingConstants.CENTER);
                                                        recharge.setVerticalTextPosition(SwingConstants.CENTER);
                                                        recharge.setContentAreaFilled(false);
                                                        recharge.setBorderPainted(false);
                                                        recharge.setBounds(jf8.getWidth() / 2 - 55, 410, 120, 40);

                                                        recharge.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                jf8.dispose();
                                                                JFrame jf9 = new JFrame();
                                                                jf9.setUndecorated(true);
                                                                jf9.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                                                                jf9.getContentPane().setBackground(Color.GRAY);
                                                                jf9.setBounds(jf8.getX(), jf8.getY(), jf8.getWidth(), jf8.getHeight());
                                                                jf9.setResizable(false);

                                                                ImageIcon leftArrowIcon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/左箭头.png");
                                                                leftArrowIcon2.setImage(leftArrowIcon2.getImage().getScaledInstance(30, 20, 0));

                                                                JButton leftArrowBtn2 = new JButton(leftArrowIcon2);
                                                                leftArrowBtn2.setOpaque(false);
                                                                leftArrowBtn2.setContentAreaFilled(false);
                                                                leftArrowBtn2.setBorderPainted(false);
                                                                leftArrowBtn2.setBounds(10, 20, 30, 20);


                                                                leftArrowBtn2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        jf9.dispose();
                                                                        jf8.show();
                                                                    }
                                                                });

                                                                JLabel rechargeLabel2 = new JLabel("充值");
                                                                rechargeLabel2.setFont(new Font("微软雅黑", Font.BOLD, 16));
                                                                rechargeLabel2.setBounds(jf9.getWidth() / 2, 20, 80, 20);

                                                                JLabel rechargeStyle = new JLabel("充值方式");
                                                                rechargeStyle.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                rechargeStyle.setBounds(35, 80, 80, 20);

                                                                ImageIcon bank = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/建设银行.png");
                                                                bank.setImage(bank.getImage().getScaledInstance(20, 20, 0));

                                                                JLabel bankCard = new JLabel("建设银行(6304)");
                                                                bankCard.setIcon(bank);
                                                                bankCard.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                bankCard.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                                bankCard.setBounds(130, 80, 140, 20);

                                                                ImageIcon rightArrow = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/箭头 右.png");
                                                                rightArrow.setImage(rightArrow.getImage().getScaledInstance(20, 20, 0));

                                                                JButton rightArrowBtn = new JButton(rightArrow);
                                                                rightArrowBtn.setOpaque(false);
                                                                rightArrowBtn.setContentAreaFilled(false);
                                                                rightArrowBtn.setBorderPainted(false);
                                                                rightArrowBtn.setBounds(360, 80, 20, 20);

                                                                JLabel rechargeAmount = new JLabel("充值金额");
                                                                rechargeAmount.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                rechargeAmount.setBounds(35, 150, 80, 20);

                                                                JLabel moneySymbol = new JLabel("¥");
                                                                moneySymbol.setFont(new Font("微软雅黑", Font.BOLD, 26));
                                                                moneySymbol.setBounds(35, 170, 80, 40);

                                                                JTextField rechargemoney = new JTextField(400);
                                                                rechargemoney.setOpaque(false);
                                                                rechargemoney.setBorder(null);
                                                                rechargemoney.setFont(new Font("微软雅黑", Font.BOLD, 22));
                                                                rechargemoney.setBounds(70, 175, 100, 30);

                                                                JButton rechargeBtn2 = new JButton("充值");
                                                                rechargeBtn2.setIcon(rechargeBg);
                                                                rechargeBtn2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                rechargeBtn2.setForeground(Color.WHITE);
                                                                rechargeBtn2.setOpaque(false);
                                                                rechargeBtn2.setContentAreaFilled(false);
                                                                rechargeBtn2.setBorderPainted(false);
                                                                rechargeBtn2.setHorizontalTextPosition(SwingConstants.CENTER);
                                                                rechargeBtn2.setVerticalTextPosition(SwingConstants.CENTER);
                                                                rechargeBtn2.setBounds(jf9.getWidth() / 2 - 60, 240, 120, 30);


                                                                rechargeBtn2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        new Thread(new Runnable() {
                                                                            @Override
                                                                            public void run() {
                                                                                Double aDouble = Double.valueOf(rechargemoney.getText());
                                                                                total += aDouble;
                                                                                allMoney.setText("¥" + total);
                                                                                moneyText.setText("¥" + total);
                                                                                JLabel rechargeTip = new JLabel("充值成功！");
                                                                                rechargeTip.setFont(new Font("微软雅黑", Font.BOLD, 16));
                                                                                JOptionPane.showMessageDialog(jf9, rechargeTip, "信息", JOptionPane.NO_OPTION, payIcon);
                                                                                jf9.dispose();
                                                                                jf8.show();
                                                                            }
                                                                        }).start();
                                                                    }
                                                                });

                                                                JPanel rechargeJpanel = new JPanel();
                                                                rechargeJpanel.setOpaque(false);
                                                                rechargeJpanel.setLayout(null);
                                                                rechargeJpanel.add(leftArrowBtn2);
                                                                rechargeJpanel.add(rechargeLabel2);
                                                                rechargeJpanel.add(rechargeStyle);
                                                                rechargeJpanel.add(bankCard);
                                                                rechargeJpanel.add(rightArrowBtn);
                                                                rechargeJpanel.add(rechargeAmount);
                                                                rechargeJpanel.add(moneySymbol);
                                                                rechargeJpanel.add(rechargemoney);
                                                                rechargeJpanel.add(rechargeBtn2);

                                                                jf9.add(rechargeJpanel);
                                                                jf9.setVisible(true);

                                                            }
                                                        });

                                                        ImageIcon withdrawBg = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/提现背景.png");
                                                        withdrawBg.setImage(withdrawBg.getImage().getScaledInstance(120, 40, 0));

                                                        JButton withdrawBtn = new JButton("提现", withdrawBg);
                                                        withdrawBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                        withdrawBtn.setForeground(Color.GRAY);
                                                        withdrawBtn.setOpaque(false);
                                                        withdrawBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                                        withdrawBtn.setVerticalTextPosition(SwingConstants.CENTER);
                                                        withdrawBtn.setContentAreaFilled(false);
                                                        withdrawBtn.setBorderPainted(false);
                                                        withdrawBtn.setBounds(jf8.getWidth() / 2 - 55, 470, 120, 40);

                                                        JPanel billJpanel = new JPanel();
                                                        billJpanel.setOpaque(false);
                                                        billJpanel.setLayout(null);
                                                        billJpanel.add(returnBtn);
                                                        billJpanel.add(billDetail);
                                                        billJpanel.add(bill);
                                                        billJpanel.add(myMoney);
                                                        billJpanel.add(allMoney);
                                                        billJpanel.add(tip);
                                                        billJpanel.add(recharge);
                                                        billJpanel.add(withdrawBtn);

                                                        jf8.add(billJpanel);
                                                        jf8.setVisible(true);
                                                    }
                                                });

                                                ImageIcon incomeIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/矩形.png");
                                                incomeIcon.setImage(incomeIcon.getImage().getScaledInstance(120, 30, 0));

                                                JLabel incomeLabel = new JLabel("收益率1.69%");
                                                incomeLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                                                incomeLabel.setForeground(Color.ORANGE);
                                                incomeLabel.setIcon(incomeIcon);
                                                incomeLabel.setHorizontalTextPosition(SwingConstants.CENTER);
                                                incomeLabel.setVerticalTextPosition(SwingConstants.CENTER);
                                                incomeLabel.setBounds(110, 110, 120, 30);

                                                ImageIcon moneyMgArrowIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/箭头 右.png");
                                                moneyMgArrowIcon.setImage(moneyMgArrowIcon.getImage().getScaledInstance(30, 20, 0));

                                                JButton moneyMgBtn = new JButton(moneyArrowIcon);
                                                moneyMgBtn.setOpaque(false);
                                                moneyMgBtn.setContentAreaFilled(false);
                                                moneyMgBtn.setBorderPainted(false);
                                                moneyMgBtn.setBounds(360, 120, 30, 20);

                                                ImageIcon moneyMgIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/钻石.png");
                                                moneyMgIcon.setImage(moneyMgIcon.getImage().getScaledInstance(30, 30, 0));

                                                JLabel moneyMgLabel = new JLabel("零钱通");
                                                moneyMgLabel.setIcon(moneyMgIcon);
                                                moneyMgLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                moneyMgLabel.setBounds(20, 110, 130, 30);

                                                ImageIcon bankCardIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/银行卡.png");
                                                bankCardIcon.setImage(bankCardIcon.getImage().getScaledInstance(30, 30, 0));

                                                JLabel bankCardLabel = new JLabel("银行卡");
                                                bankCardLabel.setIcon(bankCardIcon);
                                                bankCardLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                bankCardLabel.setBounds(20, 150, 130, 30);

                                                ImageIcon bankArrowIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/箭头 右.png");
                                                bankArrowIcon.setImage(bankArrowIcon.getImage().getScaledInstance(30, 20, 0));

                                                JButton bankCardBtn = new JButton(moneyArrowIcon);
                                                bankCardBtn.setOpaque(false);
                                                bankCardBtn.setContentAreaFilled(false);
                                                bankCardBtn.setBorderPainted(false);
                                                bankCardBtn.setBounds(360, 160, 30, 20);

                                                ImageIcon payIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/积分.png");
                                                payIcon.setImage(payIcon.getImage().getScaledInstance(30, 30, 0));

                                                JLabel payScoreLabel = new JLabel("支付分");
                                                payScoreLabel.setIcon(payIcon);
                                                payScoreLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                payScoreLabel.setBounds(20, 190, 130, 30);

                                                JButton payBtn = new JButton(moneyArrowIcon);
                                                payBtn.setOpaque(false);
                                                payBtn.setContentAreaFilled(false);
                                                payBtn.setBorderPainted(false);
                                                payBtn.setBounds(360, 200, 30, 20);

                                                ImageIcon relativesIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/亲属卡.png");
                                                relativesIcon.setImage(relativesIcon.getImage().getScaledInstance(40, 40, 0));

                                                JLabel relativesLabel = new JLabel("亲属卡");
                                                relativesLabel.setIcon(relativesIcon);
                                                relativesLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                relativesLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                relativesLabel.setBounds(10, 230, 130, 40);

                                                JButton relativesBtn = new JButton(moneyArrowIcon);
                                                relativesBtn.setOpaque(false);
                                                relativesBtn.setContentAreaFilled(false);
                                                relativesBtn.setBorderPainted(false);
                                                relativesBtn.setBounds(360, 240, 30, 20);

                                                ImageIcon identityIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/身份证.png");
                                                identityIcon.setImage(identityIcon.getImage().getScaledInstance(30, 30, 0));

                                                JLabel identityLabel = new JLabel("身份信息");
                                                identityLabel.setIcon(identityIcon);
                                                identityLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                identityLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                identityLabel.setBounds(20, 270, 130, 30);

                                                JButton identityBtn = new JButton(moneyArrowIcon);
                                                identityBtn.setOpaque(false);
                                                identityBtn.setContentAreaFilled(false);
                                                identityBtn.setBorderPainted(false);
                                                identityBtn.setBounds(360, 280, 30, 20);

                                                ImageIcon securityIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/安全保障.png");
                                                securityIcon.setImage(securityIcon.getImage().getScaledInstance(30, 30, 0));

                                                JLabel securityLabel = new JLabel("安全保障");
                                                securityLabel.setIcon(securityIcon);
                                                securityLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                securityLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                securityLabel.setBounds(20, 310, 130, 30);

                                                JButton securityBtn = new JButton(moneyArrowIcon);
                                                securityBtn.setOpaque(false);
                                                securityBtn.setContentAreaFilled(false);
                                                securityBtn.setBorderPainted(false);
                                                securityBtn.setBounds(360, 320, 30, 20);

                                                ImageIcon payInstallIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/支付设置.png");
                                                payInstallIcon.setImage(payInstallIcon.getImage().getScaledInstance(30, 30, 0));

                                                JLabel payInstallLabel = new JLabel("支付设置");
                                                payInstallLabel.setIcon(payInstallIcon);
                                                payInstallLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                payInstallLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                payInstallLabel.setBounds(20, 350, 130, 30);

                                                JButton payInstallBtn = new JButton(moneyArrowIcon);
                                                payInstallBtn.setOpaque(false);
                                                payInstallBtn.setContentAreaFilled(false);
                                                payInstallBtn.setBorderPainted(false);
                                                payInstallBtn.setBounds(360, 360, 30, 20);

                                                JLabel helpCenter = new JLabel("帮助中心");
                                                helpCenter.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                                                helpCenter.setForeground(Color.BLUE);
                                                helpCenter.setBounds(jf7.getWidth() / 2 - 30, 700, 100, 20);

                                                JLabel apply = new JLabel("本服务由财付通提供");
                                                apply.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                apply.setForeground(Color.WHITE);
                                                apply.setBounds(jf7.getWidth() / 2 - 60, 730, 150, 20);

                                                JPanel walletJpanel = new JPanel();
                                                walletJpanel.setOpaque(false);
                                                walletJpanel.setLayout(null);
                                                walletJpanel.add(leftArrowBtn);
                                                walletJpanel.add(walletLabel);
                                                walletJpanel.add(billLabel);
                                                walletJpanel.add(moneyLabel);
                                                walletJpanel.add(moneyText);
                                                walletJpanel.add(moneyBtn);
                                                walletJpanel.add(moneyMgLabel);
                                                walletJpanel.add(incomeLabel);
                                                walletJpanel.add(moneyMgBtn);
                                                walletJpanel.add(bankCardLabel);
                                                walletJpanel.add(bankCardBtn);
                                                walletJpanel.add(payScoreLabel);
                                                walletJpanel.add(payBtn);
                                                walletJpanel.add(relativesLabel);
                                                walletJpanel.add(relativesBtn);
                                                walletJpanel.add(identityLabel);
                                                walletJpanel.add(identityBtn);
                                                walletJpanel.add(securityLabel);
                                                walletJpanel.add(securityBtn);
                                                walletJpanel.add(payInstallLabel);
                                                walletJpanel.add(payInstallBtn);
                                                walletJpanel.add(helpCenter);
                                                walletJpanel.add(apply);

                                                jf7.add(walletJpanel);
                                                jf7.setVisible(true);
                                            }
                                        });

                                        JLabel financeLabel = new JLabel("金融理财");
                                        financeLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        financeLabel.setForeground(Color.WHITE);
                                        financeLabel.setBounds(30, 180, 100, 20);

                                        ImageIcon repayIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/信用卡.png");
                                        repayIcon.setImage(repayIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton repayBtn = new JButton("信用卡还贷");
                                        repayBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        repayBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        repayBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        repayBtn.setOpaque(false);
                                        repayBtn.setContentAreaFilled(false);
                                        repayBtn.setBorderPainted(false);
                                        repayBtn.setIcon(repayIcon);
                                        repayBtn.setBounds(30, 220, 120, 50);

                                        ImageIcon financeMgIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/理财宝.png");
                                        financeMgIcon.setImage(financeMgIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton financeMgBtn = new JButton("理财通");
                                        financeMgBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        financeMgBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        financeMgBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        financeMgBtn.setOpaque(false);
                                        financeMgBtn.setContentAreaFilled(false);
                                        financeMgBtn.setBorderPainted(false);
                                        financeMgBtn.setIcon(financeMgIcon);
                                        financeMgBtn.setBounds(170, 220, 80, 50);

                                        ImageIcon insuranceServerIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/保险.png");
                                        insuranceServerIcon.setImage(insuranceServerIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton insuranceServerBtn = new JButton("保险服务");
                                        insuranceServerBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        insuranceServerBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        insuranceServerBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        insuranceServerBtn.setOpaque(false);
                                        insuranceServerBtn.setContentAreaFilled(false);
                                        insuranceServerBtn.setBorderPainted(false);
                                        insuranceServerBtn.setIcon(insuranceServerIcon);
                                        insuranceServerBtn.setBounds(260, 220, 120, 50);

                                        JLabel lifeServer = new JLabel("生活服务");
                                        lifeServer.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        lifeServer.setForeground(Color.WHITE);
                                        lifeServer.setBounds(30, 300, 100, 20);

                                        ImageIcon phoneRechargeIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/手机充值.png");
                                        phoneRechargeIcon.setImage(phoneRechargeIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton phoneRechargeBtn = new JButton("手机充值");
                                        phoneRechargeBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        phoneRechargeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        phoneRechargeBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        phoneRechargeBtn.setOpaque(false);
                                        phoneRechargeBtn.setContentAreaFilled(false);
                                        phoneRechargeBtn.setBorderPainted(false);
                                        phoneRechargeBtn.setIcon(phoneRechargeIcon);
                                        phoneRechargeBtn.setBounds(15, 340, 100, 50);

                                        phoneRechargeBtn.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                jf6.dispose();
                                                JFrame jf10 = new JFrame();
                                                jf10.setUndecorated(true);
                                                jf10.getContentPane().setBackground(Color.GRAY);
                                                jf10.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                                                jf10.setBounds(550, 100, 400, 600);
                                                jf10.setResizable(false);

                                                ImageIcon arrowIcon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/左箭头.png");
                                                arrowIcon2.setImage(arrowIcon2.getImage().getScaledInstance(30, 20, 0));

                                                JButton returnBtn2 = new JButton(arrowIcon2);
                                                returnBtn2.setOpaque(false);
                                                returnBtn2.setContentAreaFilled(false);
                                                returnBtn2.setBorderPainted(false);
                                                returnBtn2.setBounds(10, 15, 30, 20);

                                                returnBtn2.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        jf10.dispose();
                                                        jf6.show();
                                                    }
                                                });

                                                JPanel phoneRechargeJpanel = new JPanel();

                                                JLabel phoneRechargeLabel = new JLabel("手机充值");
                                                phoneRechargeLabel.setFont(new Font("微软雅黑", Font.BOLD, 18));
                                                phoneRechargeLabel.setBounds(170, 5, 120, 40);

                                                JTextField phoneNum = new JTextField(11);
                                                phoneNum.setFont(new Font("微软雅黑", Font.BOLD, 22));
                                                phoneNum.setOpaque(false);
                                                phoneNum.setBorder(null);
                                                phoneNum.setBounds(20, 70, 200, 40);


                                                ImageIcon phoneBookIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/电话簿.png");
                                                phoneBookIcon.setImage(phoneBookIcon.getImage().getScaledInstance(30, 30, 0));

                                                JButton phoneBook = new JButton(phoneBookIcon);
                                                phoneBook.setOpaque(false);
                                                phoneBook.setContentAreaFilled(false);
                                                phoneBook.setBorderPainted(false);
                                                phoneBook.setBorder(null);
                                                phoneBook.setBounds(350, 80, 30, 30);

                                                JButton threety = new JButton("30元");
                                                threety.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                threety.setForeground(Color.GREEN);
                                                threety.setHorizontalTextPosition(SwingConstants.CENTER);
                                                threety.setVerticalTextPosition(SwingConstants.CENTER);
                                                threety.setBorder(new LineBorder(Color.GREEN, 2));
                                                threety.setContentAreaFilled(false);
                                                threety.setBounds(20, 170, 110, 50);

                                                JFrame jf12 = new JFrame();
                                                jf12.setUndecorated(true);
                                                jf12.getContentPane().setBackground(Color.WHITE);
                                                jf12.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                                                jf12.setBounds(jf10.getX(), jf10.getY() + 50, 400, 400);
                                                jf12.setResizable(false);

                                                JPanel callCharges = new JPanel();

                                                jf12.add(callCharges);
                                                jf12.addWindowListener(new WindowAdapter() {
                                                    @Override
                                                    public void windowClosing(WindowEvent e) {
                                                        jf12.dispose();
                                                        jf10.show();
                                                    }
                                                });

                                                threety.addActionListener((ActionListener) -> {
                                                    new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (phoneNum.getText().length() < 11 || phoneNum.getText().length() > 11)
                                                                JOptionPane.showMessageDialog(jf10, "您输入的电话号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                            else {
                                                                JOptionPane.showMessageDialog(jf10, "30元充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                total -= 30;
                                                                try {
                                                                    Thread.sleep(2000);
                                                                } catch (InterruptedException ex) {
                                                                    ex.printStackTrace();
                                                                }
                                                                jf10.dispose();

                                                                ImageIcon phoneIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/手机.png");
                                                                phoneIcon.setImage(phoneIcon.getImage().getScaledInstance(30, 20, 0));

                                                                JLabel phoneLabel = new JLabel(phoneIcon);
                                                                phoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                                phoneLabel.setForeground(Color.BLACK);
                                                                phoneLabel.setBounds(10, 10, 30, 20);

                                                                JLabel phoneStyle = new JLabel("手机充值");
                                                                phoneStyle.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneStyle.setForeground(Color.BLACK);
                                                                phoneStyle.setBounds(40, 10, 100, 20);

                                                                JLabel rechargeAmount = new JLabel("付款金额");
                                                                rechargeAmount.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                rechargeAmount.setForeground(Color.GRAY);
                                                                rechargeAmount.setBounds(165, 130, 100, 20);

                                                                moneyAmount = new JLabel("¥30.00");
                                                                moneyAmount.setFont(new Font("微软雅黑", Font.BOLD, 30));
                                                                moneyAmount.setBounds(140, 160, 120, 30);

                                                                JLabel payStyle = new JLabel("支付方式");
                                                                payStyle.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                payStyle.setForeground(Color.GRAY);
                                                                payStyle.setBounds(10, 210, 100, 20);

                                                                JLabel style = new JLabel("零钱");
                                                                style.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                style.setForeground(Color.BLACK);
                                                                style.setBounds(70, 210, 100, 20);

                                                                callCharges.setOpaque(false);
                                                                callCharges.setLayout(null);
                                                                callCharges.add(phoneLabel);
                                                                callCharges.add(phoneStyle);
                                                                callCharges.add(rechargeAmount);
                                                                callCharges.add(moneyAmount);
                                                                callCharges.add(payStyle);
                                                                callCharges.add(style);
                                                                jf12.setVisible(true);
                                                            }
                                                        }
                                                    }).start();
                                                });


                                                JButton fifty = new JButton("50元");
                                                fifty.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                fifty.setForeground(Color.GREEN);
                                                fifty.setHorizontalTextPosition(SwingConstants.CENTER);
                                                fifty.setVerticalTextPosition(SwingConstants.CENTER);
                                                fifty.setBorder(new LineBorder(Color.GREEN, 2));
                                                fifty.setContentAreaFilled(false);
                                                fifty.setBounds(150, 170, 110, 50);

                                                fifty.addActionListener((ActionListener) -> {
                                                    new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (phoneNum.getText().length() < 11 || phoneNum.getText().length() > 11)
                                                                JOptionPane.showMessageDialog(jf10, "您输入的电话号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                            else {
                                                                JOptionPane.showMessageDialog(jf10, "50元充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                total -= 50;
                                                                try {
                                                                    Thread.sleep(2000);
                                                                } catch (InterruptedException ex) {
                                                                    ex.printStackTrace();
                                                                }
                                                                jf10.dispose();
                                                                JLabel moneyAmount2 = new JLabel("¥50.00");
                                                                moneyAmount2.setFont(new Font("微软雅黑", Font.BOLD, 30));
                                                                moneyAmount2.setBounds(140, 160, 120, 30);

                                                                ImageIcon phoneIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/手机.png");
                                                                phoneIcon.setImage(phoneIcon.getImage().getScaledInstance(30, 20, 0));

                                                                JLabel phoneLabel = new JLabel(phoneIcon);
                                                                phoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                                phoneLabel.setForeground(Color.BLACK);
                                                                phoneLabel.setBounds(10, 10, 30, 20);

                                                                JLabel phoneStyle = new JLabel("手机充值");
                                                                phoneStyle.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneStyle.setForeground(Color.BLACK);
                                                                phoneStyle.setBounds(40, 10, 100, 20);

                                                                JLabel rechargeAmount = new JLabel("付款金额");
                                                                rechargeAmount.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                rechargeAmount.setForeground(Color.GRAY);
                                                                rechargeAmount.setBounds(165, 130, 100, 20);

                                                                JLabel payStyle = new JLabel("支付方式");
                                                                payStyle.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                payStyle.setForeground(Color.GRAY);
                                                                payStyle.setBounds(10, 210, 100, 20);

                                                                JLabel style = new JLabel("零钱");
                                                                style.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                style.setForeground(Color.BLACK);
                                                                style.setBounds(70, 210, 100, 20);

                                                                callCharges.setOpaque(false);
                                                                callCharges.setLayout(null);
                                                                callCharges.add(phoneLabel);
                                                                callCharges.add(phoneStyle);
                                                                callCharges.add(rechargeAmount);
                                                                callCharges.add(moneyAmount2);
                                                                callCharges.add(payStyle);
                                                                callCharges.add(style);
                                                                jf12.setVisible(true);
                                                            }
                                                        }
                                                    }).start();
                                                });

                                                JButton oneHundred = new JButton("100元");
                                                oneHundred.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                oneHundred.setForeground(Color.GREEN);
                                                oneHundred.setHorizontalTextPosition(SwingConstants.CENTER);
                                                oneHundred.setVerticalTextPosition(SwingConstants.CENTER);
                                                oneHundred.setBorder(new LineBorder(Color.GREEN, 2));
                                                oneHundred.setContentAreaFilled(false);
                                                oneHundred.setBounds(280, 170, 110, 50);

                                                oneHundred.addActionListener((ActionListener) -> {
                                                    new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (phoneNum.getText().length() < 11 || phoneNum.getText().length() > 11)
                                                                JOptionPane.showMessageDialog(jf10, "您输入的电话号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                            else {
                                                                JOptionPane.showMessageDialog(jf10, "100元充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                total -= 100;
                                                                try {
                                                                    Thread.sleep(2000);
                                                                } catch (InterruptedException ex) {
                                                                    ex.printStackTrace();
                                                                }
                                                                jf10.dispose();
                                                                JLabel moneyAmount3 = new JLabel("¥100.00");
                                                                moneyAmount3.setFont(new Font("微软雅黑", Font.BOLD, 30));
                                                                moneyAmount3.setBounds(140, 160, 120, 30);

                                                                ImageIcon phoneIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/手机.png");
                                                                phoneIcon.setImage(phoneIcon.getImage().getScaledInstance(30, 20, 0));

                                                                JLabel phoneLabel = new JLabel(phoneIcon);
                                                                phoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                                phoneLabel.setForeground(Color.BLACK);
                                                                phoneLabel.setBounds(10, 10, 30, 20);

                                                                JLabel phoneStyle = new JLabel("手机充值");
                                                                phoneStyle.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneStyle.setForeground(Color.BLACK);
                                                                phoneStyle.setBounds(40, 10, 100, 20);

                                                                JLabel rechargeAmount = new JLabel("付款金额");
                                                                rechargeAmount.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                rechargeAmount.setForeground(Color.GRAY);
                                                                rechargeAmount.setBounds(165, 130, 100, 20);

                                                                JLabel payStyle = new JLabel("支付方式");
                                                                payStyle.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                payStyle.setForeground(Color.GRAY);
                                                                payStyle.setBounds(10, 210, 100, 20);

                                                                JLabel style = new JLabel("零钱");
                                                                style.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                style.setForeground(Color.BLACK);
                                                                style.setBounds(70, 210, 100, 20);

                                                                callCharges.setOpaque(false);
                                                                callCharges.setLayout(null);
                                                                callCharges.add(phoneLabel);
                                                                callCharges.add(phoneStyle);
                                                                callCharges.add(rechargeAmount);
                                                                callCharges.add(moneyAmount3);
                                                                callCharges.add(payStyle);
                                                                callCharges.add(style);
                                                                jf12.setVisible(true);
                                                            }
                                                        }
                                                    }).start();
                                                });

                                                JButton twoHundred = new JButton("200元");
                                                twoHundred.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                twoHundred.setForeground(Color.GREEN);
                                                twoHundred.setHorizontalTextPosition(SwingConstants.CENTER);
                                                twoHundred.setVerticalTextPosition(SwingConstants.CENTER);
                                                twoHundred.setBorder(new LineBorder(Color.GREEN, 2));
                                                twoHundred.setContentAreaFilled(false);
                                                twoHundred.setBounds(20, 230, 110, 50);

                                                twoHundred.addActionListener((ActionListener) -> {
                                                    new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (phoneNum.getText().length() < 11 || phoneNum.getText().length() > 11)
                                                                JOptionPane.showMessageDialog(jf10, "您输入的电话号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                            else {
                                                                JOptionPane.showMessageDialog(jf10, "200元充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                total -= 200;
                                                                try {
                                                                    Thread.sleep(2000);
                                                                } catch (InterruptedException ex) {
                                                                    ex.printStackTrace();
                                                                }
                                                                jf10.dispose();
                                                                JLabel moneyAmount4 = new JLabel("¥200.00");
                                                                moneyAmount4.setFont(new Font("微软雅黑", Font.BOLD, 30));
                                                                moneyAmount4.setBounds(140, 160, 120, 30);

                                                                ImageIcon phoneIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/手机.png");
                                                                phoneIcon.setImage(phoneIcon.getImage().getScaledInstance(30, 20, 0));

                                                                JLabel phoneLabel = new JLabel(phoneIcon);
                                                                phoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                                phoneLabel.setForeground(Color.BLACK);
                                                                phoneLabel.setBounds(10, 10, 30, 20);

                                                                JLabel phoneStyle = new JLabel("手机充值");
                                                                phoneStyle.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneStyle.setForeground(Color.BLACK);
                                                                phoneStyle.setBounds(40, 10, 100, 20);

                                                                JLabel rechargeAmount = new JLabel("付款金额");
                                                                rechargeAmount.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                rechargeAmount.setForeground(Color.GRAY);
                                                                rechargeAmount.setBounds(165, 130, 100, 20);

                                                                JLabel payStyle = new JLabel("支付方式");
                                                                payStyle.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                payStyle.setForeground(Color.GRAY);
                                                                payStyle.setBounds(10, 210, 100, 20);

                                                                JLabel style = new JLabel("零钱");
                                                                style.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                style.setForeground(Color.BLACK);
                                                                style.setBounds(70, 210, 100, 20);

                                                                callCharges.setOpaque(false);
                                                                callCharges.setLayout(null);
                                                                callCharges.add(phoneLabel);
                                                                callCharges.add(phoneStyle);
                                                                callCharges.add(rechargeAmount);
                                                                callCharges.add(moneyAmount4);
                                                                callCharges.add(payStyle);
                                                                callCharges.add(style);
                                                                jf12.setVisible(true);

                                                            }
                                                        }
                                                    }).start();
                                                });

                                                JButton threeHundred = new JButton("300元");
                                                threeHundred.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                threeHundred.setForeground(Color.GREEN);
                                                threeHundred.setHorizontalTextPosition(SwingConstants.CENTER);
                                                threeHundred.setVerticalTextPosition(SwingConstants.CENTER);
                                                threeHundred.setBorder(new LineBorder(Color.GREEN, 2));
                                                threeHundred.setContentAreaFilled(false);
                                                threeHundred.setBounds(150, 230, 110, 50);

                                                threeHundred.addActionListener((ActionListener) -> {
                                                    new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (phoneNum.getText().length() < 11 || phoneNum.getText().length() > 11)
                                                                JOptionPane.showMessageDialog(jf10, "您输入的电话号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                            else {
                                                                JOptionPane.showMessageDialog(jf10, "300元充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                total -= 300;
                                                                try {
                                                                    Thread.sleep(2000);
                                                                } catch (InterruptedException ex) {
                                                                    ex.printStackTrace();
                                                                }
                                                                jf10.dispose();
                                                                JLabel moneyAmount5 = new JLabel("¥300.00");
                                                                moneyAmount5.setFont(new Font("微软雅黑", Font.BOLD, 30));
                                                                moneyAmount5.setBounds(140, 160, 120, 30);

                                                                ImageIcon phoneIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/手机.png");
                                                                phoneIcon.setImage(phoneIcon.getImage().getScaledInstance(30, 20, 0));

                                                                JLabel phoneLabel = new JLabel(phoneIcon);
                                                                phoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                                phoneLabel.setForeground(Color.BLACK);
                                                                phoneLabel.setBounds(10, 10, 30, 20);

                                                                JLabel phoneStyle = new JLabel("手机充值");
                                                                phoneStyle.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneStyle.setForeground(Color.BLACK);
                                                                phoneStyle.setBounds(40, 10, 100, 20);

                                                                JLabel rechargeAmount = new JLabel("付款金额");
                                                                rechargeAmount.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                rechargeAmount.setForeground(Color.GRAY);
                                                                rechargeAmount.setBounds(165, 130, 100, 20);

                                                                JLabel payStyle = new JLabel("支付方式");
                                                                payStyle.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                payStyle.setForeground(Color.GRAY);
                                                                payStyle.setBounds(10, 210, 100, 20);

                                                                JLabel style = new JLabel("零钱");
                                                                style.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                style.setForeground(Color.BLACK);
                                                                style.setBounds(70, 210, 100, 20);

                                                                callCharges.setOpaque(false);
                                                                callCharges.setLayout(null);
                                                                callCharges.add(phoneLabel);
                                                                callCharges.add(phoneStyle);
                                                                callCharges.add(rechargeAmount);
                                                                callCharges.add(moneyAmount5);
                                                                callCharges.add(payStyle);
                                                                callCharges.add(style);
                                                                jf12.setVisible(true);
                                                            }
                                                        }
                                                    }).start();
                                                });

                                                JButton fiveHundred = new JButton("500元");
                                                fiveHundred.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                fiveHundred.setForeground(Color.GREEN);
                                                fiveHundred.setHorizontalTextPosition(SwingConstants.CENTER);
                                                fiveHundred.setVerticalTextPosition(SwingConstants.CENTER);
                                                fiveHundred.setBorder(new LineBorder(Color.GREEN, 2));
                                                fiveHundred.setContentAreaFilled(false);
                                                fiveHundred.setBounds(280, 230, 110, 50);

                                                fiveHundred.addActionListener((ActionListener) -> {
                                                    new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (phoneNum.getText().length() < 11 || phoneNum.getText().length() > 11)
                                                                JOptionPane.showMessageDialog(jf10, "您输入的电话号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                            else {
                                                                JOptionPane.showMessageDialog(jf10, "500元充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                total -= 500;
                                                                try {
                                                                    Thread.sleep(2000);
                                                                } catch (InterruptedException ex) {
                                                                    ex.printStackTrace();
                                                                }
                                                                jf10.dispose();
                                                                JLabel moneyAmount6 = new JLabel("¥500.00");
                                                                moneyAmount6.setFont(new Font("微软雅黑", Font.BOLD, 30));
                                                                moneyAmount6.setBounds(140, 160, 120, 30);

                                                                ImageIcon phoneIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/手机.png");
                                                                phoneIcon.setImage(phoneIcon.getImage().getScaledInstance(30, 20, 0));

                                                                JLabel phoneLabel = new JLabel(phoneIcon);
                                                                phoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
                                                                phoneLabel.setForeground(Color.BLACK);
                                                                phoneLabel.setBounds(10, 10, 30, 20);

                                                                JLabel phoneStyle = new JLabel("手机充值");
                                                                phoneStyle.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                phoneStyle.setForeground(Color.BLACK);
                                                                phoneStyle.setBounds(40, 10, 100, 20);

                                                                JLabel rechargeAmount = new JLabel("付款金额");
                                                                rechargeAmount.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                                rechargeAmount.setForeground(Color.GRAY);
                                                                rechargeAmount.setBounds(165, 130, 100, 20);

                                                                JLabel payStyle = new JLabel("支付方式");
                                                                payStyle.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                payStyle.setForeground(Color.GRAY);
                                                                payStyle.setBounds(10, 210, 100, 20);

                                                                JLabel style = new JLabel("零钱");
                                                                style.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                                style.setForeground(Color.BLACK);
                                                                style.setBounds(70, 210, 100, 20);

                                                                callCharges.setOpaque(false);
                                                                callCharges.setLayout(null);
                                                                callCharges.add(phoneLabel);
                                                                callCharges.add(phoneStyle);
                                                                callCharges.add(rechargeAmount);
                                                                callCharges.add(moneyAmount6);
                                                                callCharges.add(payStyle);
                                                                callCharges.add(style);
                                                                jf12.setVisible(true);
                                                            }
                                                        }
                                                    }).start();
                                                });

                                                JLabel phoneMoney = new JLabel("充话费");
                                                phoneMoney.setForeground(Color.WHITE);
                                                phoneMoney.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                phoneMoney.setBounds(20, 140, 80, 20);

                                                JLabel moreRecharge = new JLabel("更多充值");
                                                moreRecharge.setForeground(Color.WHITE);
                                                moreRecharge.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                                moreRecharge.setBounds(20, 290, 80, 20);

                                                JButton disCount = new JButton("特惠流量包");
                                                disCount.setForeground(Color.GREEN);
                                                disCount.setFont(new Font("微软雅黑", Font.BOLD, 14));
                                                disCount.setBorder(new LineBorder(Color.GREEN, 2));
                                                disCount.setContentAreaFilled(false);
                                                disCount.setBounds(20, 320, 120, 40);


                                                phoneRechargeJpanel.setOpaque(false);
                                                phoneRechargeJpanel.setLayout(null);
                                                phoneRechargeJpanel.add(returnBtn2);
                                                phoneRechargeJpanel.add(phoneRechargeLabel);
                                                phoneRechargeJpanel.add(phoneNum);
                                                phoneRechargeJpanel.add(phoneBook);
                                                phoneRechargeJpanel.add(phoneMoney);
                                                phoneRechargeJpanel.add(threety);
                                                phoneRechargeJpanel.add(fifty);
                                                phoneRechargeJpanel.add(oneHundred);
                                                phoneRechargeJpanel.add(twoHundred);
                                                phoneRechargeJpanel.add(threeHundred);
                                                phoneRechargeJpanel.add(fiveHundred);
                                                phoneRechargeJpanel.add(moreRecharge);
                                                phoneRechargeJpanel.add(disCount);

                                                jf10.add(phoneRechargeJpanel);
                                                jf10.setVisible(true);
                                            }
                                        });

                                        ImageIcon livingExpensesIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/生活缴费.png");
                                        livingExpensesIcon.setImage(livingExpensesIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton livingExpensesBtn = new JButton("生活缴费");
                                        livingExpensesBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        livingExpensesBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        livingExpensesBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        livingExpensesBtn.setOpaque(false);
                                        livingExpensesBtn.setContentAreaFilled(false);
                                        livingExpensesBtn.setBorderPainted(false);
                                        livingExpensesBtn.setIcon(livingExpensesIcon);
                                        livingExpensesBtn.setBounds(115, 340, 100, 50);

                                        ImageIcon QBRechargeIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/QB充值.png");
                                        QBRechargeIcon.setImage(QBRechargeIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton QBRechargeBtn = new JButton("Q币充值");
                                        QBRechargeBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        QBRechargeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        QBRechargeBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        QBRechargeBtn.setOpaque(false);
                                        QBRechargeBtn.setContentAreaFilled(false);
                                        QBRechargeBtn.setBorderPainted(false);
                                        QBRechargeBtn.setIcon(QBRechargeIcon);
                                        QBRechargeBtn.setBounds(215, 340, 100, 50);

                                        QBRechargeBtn.addActionListener((ActionListener) -> {
                                            jf6.dispose();
                                            JFrame jf11 = new JFrame();
                                            jf11.setUndecorated(true);
                                            jf11.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信.png"));
                                            jf11.getContentPane().setBackground(Color.GRAY);
                                            jf11.setBounds(jf6.getX() + 30, jf6.getY() + 80, 400, 600);
                                            jf11.setResizable(false);

                                            ImageIcon crossIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/左箭头.png");
                                            crossIcon.setImage(crossIcon.getImage().getScaledInstance(30, 20, 0));

                                            JButton crossBtn = new JButton(crossIcon);
                                            crossBtn.setOpaque(false);
                                            crossBtn.setBorderPainted(false);
                                            crossBtn.setContentAreaFilled(false);
                                            crossBtn.setBorder(null);
                                            crossBtn.setBounds(10, 20, 30, 20);

                                            crossBtn.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf11.dispose();
                                                    jf6.show();
                                                }
                                            });

                                            JLabel tencentRecharge = new JLabel("腾讯充值");
                                            tencentRecharge.setFont(new Font("微软雅黑", Font.BOLD, 16));
                                            tencentRecharge.setBounds(160, 15, 100, 30);

                                            JLabel moreLabel = new JLabel(moreIcon);
                                            moreLabel.setBounds(350, 17, 30, 30);

                                            JLabel qbRecharge = new JLabel("Q币充值");
                                            qbRecharge.setFont(new Font("微软雅黑", Font.BOLD, 18));
                                            qbRecharge.setBounds(30, 130, 100, 30);

                                            JTextField QQNum = new JTextField(20);
                                            QQNum.setFont(new Font("微软雅黑", Font.BOLD, 16));
                                            QQNum.setOpaque(false);
                                            QQNum.setBorder(null);
                                            QQNum.setBounds(30, 170, jf11.getWidth(), 30);

                                            JLabel RMB = new JLabel("元");
                                            RMB.setForeground(Color.BLACK);
                                            RMB.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                                            RMB.setBounds(90, 325, 60, 20);

                                            JLabel QBCount = new JLabel();
                                            QBCount.setFont(new Font("微软雅黑", Font.BOLD, 18));
                                            QBCount.setForeground(Color.GREEN);
                                            QBCount.setBounds(30, 320, 100, 30);

                                            JButton rechargeNow = new JButton("立即充值");
                                            rechargeNow.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            rechargeNow.setForeground(Color.WHITE);
                                            rechargeNow.setHorizontalTextPosition(SwingConstants.CENTER);
                                            rechargeNow.setVerticalTextPosition(SwingConstants.CENTER);
                                            rechargeNow.setBackground(Color.GREEN);
                                            rechargeNow.setBorderPainted(false);
                                            rechargeNow.setBounds(30, 350, 220, 40);

                                            JButton tenQB = new JButton("10Q币");
                                            tenQB.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            tenQB.setBackground(Color.GRAY);
                                            tenQB.setBorder(new LineBorder(Color.BLACK, 1));
                                            tenQB.setHorizontalTextPosition(SwingConstants.CENTER);
                                            tenQB.setVerticalTextPosition(SwingConstants.CENTER);
                                            tenQB.setBounds(30, 210, 100, 40);

                                            twentyQB.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            twentyQB.setBackground(Color.GRAY);
                                            twentyQB.setBorder(new LineBorder(Color.BLACK, 1));
                                            twentyQB.setHorizontalTextPosition(SwingConstants.CENTER);
                                            twentyQB.setVerticalTextPosition(SwingConstants.CENTER);
                                            twentyQB.setBounds(150, 210, 100, 40);

                                            thirtyQB.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            thirtyQB.setBackground(Color.GRAY);
                                            thirtyQB.setBorder(new LineBorder(Color.BLACK, 1));
                                            thirtyQB.setHorizontalTextPosition(SwingConstants.CENTER);
                                            thirtyQB.setVerticalTextPosition(SwingConstants.CENTER);
                                            thirtyQB.setBounds(270, 210, 100, 40);

                                            oneHundredQB.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            oneHundredQB.setBackground(Color.GRAY);
                                            oneHundredQB.setBorder(new LineBorder(Color.BLACK, 1));
                                            oneHundredQB.setHorizontalTextPosition(SwingConstants.CENTER);
                                            oneHundredQB.setVerticalTextPosition(SwingConstants.CENTER);
                                            oneHundredQB.setBounds(30, 270, 100, 40);

                                            QBAndVip.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            QBAndVip.setBackground(Color.GRAY);
                                            QBAndVip.setBorder(new LineBorder(Color.BLACK, 1));
                                            QBAndVip.setHorizontalTextPosition(SwingConstants.CENTER);
                                            QBAndVip.setVerticalTextPosition(SwingConstants.CENTER);
                                            QBAndVip.setBounds(150, 270, 100, 40);

                                            ButtonGroup btnGroup = new ButtonGroup();
                                            btnGroup.add(tenQB);
                                            btnGroup.add(twentyQB);
                                            btnGroup.add(thirtyQB);
                                            btnGroup.add(oneHundredQB);
                                            btnGroup.add(QBAndVip);

                                            JFrame jf13 = new JFrame("温馨提示");
                                            jf13.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/QQ.png"));
                                            ImageIcon qbIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/Q币.jpeg");
                                            qbIcon.setImage(qbIcon.getImage().getScaledInstance(500, 400, 0));

                                            JLabel qbBg = new JLabel(qbIcon);
                                            qbBg.setBounds(0, 0, qbIcon.getIconWidth(), qbIcon.getIconHeight());

                                            jf13.getLayeredPane().add(qbBg, new Integer(Integer.MIN_VALUE));
                                            JPanel pan = (JPanel) jf13.getContentPane();
                                            pan.setOpaque(false);
                                            pan.setLayout(null);

                                            JLabel DearLabel = new JLabel("尊敬的");
                                            DearLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            DearLabel.setBounds(5, 5, 60, 20);

                                            JLabel userNameAndQQ = new JLabel(" 笃（1957804838）:");
                                            userNameAndQQ.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            userNameAndQQ.setForeground(Color.ORANGE);
                                            userNameAndQQ.setBounds(45, 5, 120, 20);

                                            ImageIcon wcPayIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/微信支付.png");
                                            wcPayIcon.setImage(wcPayIcon.getImage().getScaledInstance(40, 40, 0));

                                            JLabel wcPayLabel = new JLabel(wcPayIcon);
                                            wcPayLabel.setBounds(70, 70, wcPayIcon.getIconWidth(), wcPayIcon.getIconHeight());

                                            JLabel QBRecharge=new JLabel("您充值QB成功");
                                            QBRecharge.setFont(new Font("微软雅黑", Font.PLAIN, 16));
                                            QBRecharge.setBounds(120, 75, 120, 30);

                                            JLabel thisRecharge=new JLabel("本次充值:");
                                            thisRecharge.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            thisRecharge.setBounds(120, 115, 80, 20);
                                            
                                            JLabel QB=new JLabel();
                                            QB.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            QB.setForeground(Color.RED);
                                            QB.setBounds(190, 115, 60, 20);
                                            
                                            JLabel QBUnit=new JLabel("Q币");
                                            QBUnit.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            QBUnit.setBounds(217, 115, 60, 20);

                                            Date date = new Date();
                                            String format="yyyy年MM月dd日 HH时mm分ss秒";
                                            SimpleDateFormat dateFormat = new SimpleDateFormat(format);

                                            JLabel rechargeDate=new JLabel("充值时间:"+dateFormat.format(date));
                                            rechargeDate.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                            rechargeDate.setForeground(Color.RED);
                                            rechargeDate.setBounds(120, 145, 300, 20);

                                            pan.add(DearLabel);
                                            pan.add(userNameAndQQ);
                                            pan.add(wcPayLabel);
                                            pan.add(QBRecharge);
                                            pan.add(thisRecharge);
                                            pan.add(QB);
                                            pan.add(QBUnit);
                                            pan.add(rechargeDate);

                                            jf13.setSize(qbBg.getWidth(), qbBg.getHeight());
                                            jf13.setLocationRelativeTo(null);
                                            jf13.addWindowListener(new WindowAdapter() {
                                                @Override
                                                public void windowClosing(WindowEvent e) {
                                                    jf13.dispose();
                                                    jf11.show();
                                                }
                                            });
                                            tenQB.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    num = 0;
                                                    twentyQB.setBackground(Color.GRAY);
                                                    thirtyQB.setBackground(Color.GRAY);
                                                    oneHundredQB.setBackground(Color.GRAY);
                                                    QBAndVip.setBackground(Color.GRAY);
                                                    tenQB.setBackground(Color.GREEN);
                                                    QBCount.setText("10.00");
                                                    QBRechargeJpanel.add(RMB);
                                                new Thread(new Runnable(){
                                                    @Override
                                                    public void run() {
                                                        rechargeNow.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                if (num == 0) {
                                                                    if (QQNum.getText().length() != 10)
                                                                        JOptionPane.showMessageDialog(jf11, "您输入的QQ号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                                    else {
                                                                        total -= 10;
                                                                        JOptionPane.showMessageDialog(jf11, "10Q币充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                        try {
                                                                            Thread.sleep(2000);
                                                                        } catch (InterruptedException ex) {
                                                                            ex.printStackTrace();
                                                                        }
                                                                        QB.setText("10");
                                                                        jf11.dispose();
                                                                        jf13.setVisible(true);

                                                                    }
                                                                }
                                                            }
                                                        });
                                                    }
                                                }).start();
                                                }
                                            });

                                            twentyQB.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    num = 1;
                                                    tenQB.setBackground(Color.GRAY);
                                                    thirtyQB.setBackground(Color.GRAY);
                                                    oneHundredQB.setBackground(Color.GRAY);
                                                    QBAndVip.setBackground(Color.GRAY);
                                                    twentyQB.setBackground(Color.GREEN);
                                                    QBCount.setText("20.00");
                                                    QBRechargeJpanel.add(RMB);
                                                    new Thread(new Runnable(){
                                                        @Override
                                                        public void run() {
                                                            rechargeNow.addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {
                                                                    if (num == 1) {
                                                                        if (QQNum.getText().length() != 10)
                                                                            JOptionPane.showMessageDialog(jf11, "您输入的QQ号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                                        else {
                                                                            total -= 20;
                                                                            JOptionPane.showMessageDialog(jf11, "20Q币充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                            try {
                                                                                Thread.sleep(2000);
                                                                            } catch (InterruptedException ex) {
                                                                                ex.printStackTrace();
                                                                            }
                                                                            QB.setText("20");
                                                                            jf11.dispose();
                                                                            jf13.setVisible(true);

                                                                        }
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }).start();
                                                }
                                            });

                                            thirtyQB.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    num = 2;
                                                    tenQB.setBackground(Color.GRAY);
                                                    twentyQB.setBackground(Color.GRAY);
                                                    oneHundredQB.setBackground(Color.GRAY);
                                                    QBAndVip.setBackground(Color.GRAY);
                                                    thirtyQB.setBackground(Color.GREEN);
                                                    QBCount.setText("30.00");
                                                    QBRechargeJpanel.add(RMB);
                                                    new Thread(new Runnable(){
                                                        @Override
                                                        public void run() {
                                                            rechargeNow.addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {
                                                                    if (num == 2) {
                                                                        if (QQNum.getText().length() != 10)
                                                                            JOptionPane.showMessageDialog(jf11, "您输入的QQ号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                                        else {
                                                                            total -= 30;
                                                                            JOptionPane.showMessageDialog(jf11, "30Q币充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                            try {
                                                                                Thread.sleep(2000);
                                                                            } catch (InterruptedException ex) {
                                                                                ex.printStackTrace();
                                                                            }
                                                                            QB.setText("30");
                                                                            jf11.dispose();
                                                                            jf13.setVisible(true);

                                                                        }
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }).start();
                                                }
                                            });

                                            oneHundredQB.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    num = 3;
                                                    tenQB.setBackground(Color.GRAY);
                                                    twentyQB.setBackground(Color.GRAY);
                                                    thirtyQB.setBackground(Color.GRAY);
                                                    QBAndVip.setBackground(Color.GRAY);
                                                    oneHundredQB.setBackground(Color.GREEN);
                                                    QBCount.setText("100.00");
                                                    QBRechargeJpanel.add(RMB);
                                                    new Thread(new Runnable(){
                                                        @Override
                                                        public void run() {
                                                            rechargeNow.addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {
                                                                    if (num == 3) {
                                                                        if (QQNum.getText().length() != 10)
                                                                            JOptionPane.showMessageDialog(jf11, "您输入的QQ号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                                        else {
                                                                            total -= 100;
                                                                            JOptionPane.showMessageDialog(jf11, "100Q币充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                            try {
                                                                                Thread.sleep(2000);
                                                                            } catch (InterruptedException ex) {
                                                                                ex.printStackTrace();
                                                                            }
                                                                            QB.setText("100");
                                                                            jf11.dispose();
                                                                            jf13.setVisible(true);

                                                                        }
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }).start();
                                                }
                                            });
                                            QBAndVip.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    num = 4;
                                                    tenQB.setBackground(Color.GRAY);
                                                    twentyQB.setBackground(Color.GRAY);
                                                    thirtyQB.setBackground(Color.GRAY);
                                                    oneHundredQB.setBackground(Color.GRAY);
                                                    QBAndVip.setBackground(Color.GREEN);
                                                    QBCount.setText("25.00");
                                                    QBRechargeJpanel.add(RMB);
                                                    new Thread(new Runnable(){
                                                        @Override
                                                        public void run() {
                                                            rechargeNow.addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {
                                                                    if (num == 4) {
                                                                        if (QQNum.getText().length() != 10)
                                                                            JOptionPane.showMessageDialog(jf11, "您输入的QQ号码不存在！", "信息", JOptionPane.CANCEL_OPTION);
                                                                         else {
                                                                            total -= 25;
                                                                            JOptionPane.showMessageDialog(jf11, "10Q币+1个月视频会员充值成功！", "信息", JOptionPane.NO_OPTION, payIcon);
                                                                            try {
                                                                                Thread.sleep(2000);
                                                                            } catch (InterruptedException ex) {
                                                                                ex.printStackTrace();
                                                                            }
                                                                            QB.setText("25");
                                                                            jf11.dispose();
                                                                            jf13.setVisible(true);
                                                                        }
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }).start();
                                                }
                                            });


                                            QBRechargeJpanel = new JPanel();
                                            QBRechargeJpanel.setOpaque(false);
                                            QBRechargeJpanel.setLayout(null);
                                            QBRechargeJpanel.add(crossBtn);
                                            QBRechargeJpanel.add(tencentRecharge);
                                            QBRechargeJpanel.add(moreLabel);
                                            QBRechargeJpanel.add(qbRecharge);
                                            QBRechargeJpanel.add(QQNum);
                                            QBRechargeJpanel.add(tenQB);
                                            QBRechargeJpanel.add(twentyQB);
                                            QBRechargeJpanel.add(thirtyQB);
                                            QBRechargeJpanel.add(oneHundredQB);
                                            QBRechargeJpanel.add(QBAndVip);
                                            QBRechargeJpanel.add(QBCount);
                                            QBRechargeJpanel.add(rechargeNow);

                                            jf11.add(QBRechargeJpanel);
                                            jf11.setVisible(true);
                                        });

                                        ImageIcon cityServerIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/城市.png");
                                        cityServerIcon.setImage(cityServerIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton cityServerBtn = new JButton("城市服务");
                                        cityServerBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        cityServerBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        cityServerBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        cityServerBtn.setOpaque(false);
                                        cityServerBtn.setContentAreaFilled(false);
                                        cityServerBtn.setBorderPainted(false);
                                        cityServerBtn.setIcon(cityServerIcon);
                                        cityServerBtn.setBounds(315, 340, 100, 50);

                                        ImageIcon tencentWelfareIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/公益.png");
                                        tencentWelfareIcon.setImage(tencentWelfareIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton tencentWelfareBtn = new JButton("腾讯公益");
                                        tencentWelfareBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        tencentWelfareBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        tencentWelfareBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        tencentWelfareBtn.setOpaque(false);
                                        tencentWelfareBtn.setContentAreaFilled(false);
                                        tencentWelfareBtn.setBorderPainted(false);
                                        tencentWelfareBtn.setIcon(tencentWelfareIcon);
                                        tencentWelfareBtn.setBounds(15, 440, 100, 50);

                                        ImageIcon medicalHealthIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/医疗.png");
                                        medicalHealthIcon.setImage(medicalHealthIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton medicalHealthBtn = new JButton("医疗健康");
                                        medicalHealthBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        medicalHealthBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        medicalHealthBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        medicalHealthBtn.setOpaque(false);
                                        medicalHealthBtn.setContentAreaFilled(false);
                                        medicalHealthBtn.setBorderPainted(false);
                                        medicalHealthBtn.setIcon(medicalHealthIcon);
                                        medicalHealthBtn.setBounds(115, 440, 100, 50);

                                        ImageIcon healthCodeIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/健康码.png");
                                        healthCodeIcon.setImage(healthCodeIcon.getImage().getScaledInstance(30, 30, 0));


                                        JButton healthCodeBtn = new JButton("防疫健康码");
                                        healthCodeBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        healthCodeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        healthCodeBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        healthCodeBtn.setOpaque(false);
                                        healthCodeBtn.setContentAreaFilled(false);
                                        healthCodeBtn.setBorderPainted(false);
                                        healthCodeBtn.setIcon(healthCodeIcon);
                                        healthCodeBtn.setBounds(215, 440, 120, 50);

                                        JLabel promotion = new JLabel("限时推广");
                                        promotion.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                                        promotion.setForeground(Color.ORANGE);
                                        promotion.setBounds(250, 500, 80, 20);

                                        JLabel traffic = new JLabel("交通出行");
                                        traffic.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        traffic.setForeground(Color.WHITE);
                                        traffic.setBounds(30, 510, 80, 20);

                                        ImageIcon trafficServerIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/导航.png");
                                        trafficServerIcon.setImage(trafficServerIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton trafficServerBtn = new JButton("出行服务");
                                        trafficServerBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        trafficServerBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        trafficServerBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        trafficServerBtn.setOpaque(false);
                                        trafficServerBtn.setContentAreaFilled(false);
                                        trafficServerBtn.setBorderPainted(false);
                                        trafficServerBtn.setIcon(trafficServerIcon);
                                        trafficServerBtn.setBounds(0, 550, 120, 50);

                                        ImageIcon trainAndplaneTicketIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/火车票.png");
                                        trainAndplaneTicketIcon.setImage(trainAndplaneTicketIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton trainAndplaneTicketBtn = new JButton("火车票机票");
                                        trainAndplaneTicketBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        trainAndplaneTicketBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        trainAndplaneTicketBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        trainAndplaneTicketBtn.setOpaque(false);
                                        trainAndplaneTicketBtn.setContentAreaFilled(false);
                                        trainAndplaneTicketBtn.setBorderPainted(false);
                                        trainAndplaneTicketBtn.setIcon(trainAndplaneTicketIcon);
                                        trainAndplaneTicketBtn.setBounds(100, 550, 120, 50);

                                        ImageIcon ddTrafficIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/滴滴出行.png");
                                        ddTrafficIcon.setImage(ddTrafficIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton ddTrafficBtn = new JButton("滴滴出行");
                                        ddTrafficBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        ddTrafficBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        ddTrafficBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        ddTrafficBtn.setOpaque(false);
                                        ddTrafficBtn.setContentAreaFilled(false);
                                        ddTrafficBtn.setBorderPainted(false);
                                        ddTrafficBtn.setIcon(ddTrafficIcon);
                                        ddTrafficBtn.setBounds(200, 550, 120, 50);

                                        ImageIcon hotelIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/酒店.png");
                                        hotelIcon.setImage(hotelIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton hotelBtn = new JButton("酒店");
                                        hotelBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        hotelBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        hotelBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        hotelBtn.setOpaque(false);
                                        hotelBtn.setContentAreaFilled(false);
                                        hotelBtn.setBorderPainted(false);
                                        hotelBtn.setIcon(hotelIcon);
                                        hotelBtn.setBounds(300, 550, 100, 50);

                                        JLabel shopping = new JLabel("购物消费");
                                        shopping.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        shopping.setForeground(Color.WHITE);
                                        shopping.setBounds(30, 620, 80, 20);

                                        ImageIcon shoppingIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/购物.png");
                                        shoppingIcon.setImage(shoppingIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton shoppingBtn = new JButton("腾讯惠聚");
                                        shoppingBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        shoppingBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        shoppingBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        shoppingBtn.setOpaque(false);
                                        shoppingBtn.setContentAreaFilled(false);
                                        shoppingBtn.setBorderPainted(false);
                                        shoppingBtn.setIcon(shoppingIcon);
                                        shoppingBtn.setBounds(0, 660, 120, 50);

                                        ImageIcon JDshoppingIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/京东.png");
                                        JDshoppingIcon.setImage(JDshoppingIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton JDshoppingBtn = new JButton("京东购物");
                                        JDshoppingBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        JDshoppingBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        JDshoppingBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        JDshoppingBtn.setOpaque(false);
                                        JDshoppingBtn.setContentAreaFilled(false);
                                        JDshoppingBtn.setBorderPainted(false);
                                        JDshoppingBtn.setIcon(JDshoppingIcon);
                                        JDshoppingBtn.setBounds(100, 660, 120, 50);

                                        ImageIcon meituanIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/美团.png");
                                        meituanIcon.setImage(meituanIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton meituanBtn = new JButton("美团外卖");
                                        meituanBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        meituanBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        meituanBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        meituanBtn.setOpaque(false);
                                        meituanBtn.setContentAreaFilled(false);
                                        meituanBtn.setBorderPainted(false);
                                        meituanBtn.setIcon(meituanIcon);
                                        meituanBtn.setBounds(200, 660, 120, 50);

                                        ImageIcon movieIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/黑猫.png");
                                        movieIcon.setImage(movieIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton movieBtn = new JButton("电影演出赛事");
                                        movieBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        movieBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        movieBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        movieBtn.setOpaque(false);
                                        movieBtn.setContentAreaFilled(false);
                                        movieBtn.setBorderPainted(false);
                                        movieBtn.setIcon(movieIcon);
                                        movieBtn.setBounds(290, 660, 120, 50);

                                        ImageIcon meituanIcon2 = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/美团团购.png");
                                        meituanIcon2.setImage(meituanIcon2.getImage().getScaledInstance(30, 30, 0));

                                        JButton meituanBtn2 = new JButton("美团团购");
                                        meituanBtn2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        meituanBtn2.setHorizontalTextPosition(SwingConstants.CENTER);
                                        meituanBtn2.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        meituanBtn2.setOpaque(false);
                                        meituanBtn2.setContentAreaFilled(false);
                                        meituanBtn2.setBorderPainted(false);
                                        meituanBtn2.setIcon(meituanIcon2);
                                        meituanBtn2.setBounds(0, 720, 120, 50);

                                        ImageIcon pddIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/拼多多.png");
                                        pddIcon.setImage(pddIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton pddBtn = new JButton("拼多多");
                                        pddBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        pddBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        pddBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        pddBtn.setOpaque(false);
                                        pddBtn.setContentAreaFilled(false);
                                        pddBtn.setBorderPainted(false);
                                        pddBtn.setIcon(pddIcon);
                                        pddBtn.setBounds(100, 720, 120, 50);

                                        ImageIcon vipshopIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/唯品会.png");
                                        vipshopIcon.setImage(vipshopIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton vipshopBtn = new JButton("唯品会特卖");
                                        vipshopBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        vipshopBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        vipshopBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        vipshopBtn.setOpaque(false);
                                        vipshopBtn.setContentAreaFilled(false);
                                        vipshopBtn.setBorderPainted(false);
                                        vipshopBtn.setIcon(vipshopIcon);
                                        vipshopBtn.setBounds(200, 720, 120, 50);

                                        ImageIcon zzIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/转转.png");
                                        zzIcon.setImage(zzIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton zzBtn = new JButton("转转二手");
                                        zzBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        zzBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        zzBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        zzBtn.setOpaque(false);
                                        zzBtn.setContentAreaFilled(false);
                                        zzBtn.setBorderPainted(false);
                                        zzBtn.setIcon(zzIcon);
                                        zzBtn.setBounds(290, 720, 120, 50);

                                        ImageIcon findHomeIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/房子.png");
                                        findHomeIcon.setImage(findHomeIcon.getImage().getScaledInstance(30, 30, 0));

                                        JButton findHomeBtn = new JButton("贝壳找家");
                                        findHomeBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                        findHomeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
                                        findHomeBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
                                        findHomeBtn.setOpaque(false);
                                        findHomeBtn.setContentAreaFilled(false);
                                        findHomeBtn.setBorderPainted(false);
                                        findHomeBtn.setIcon(findHomeIcon);
                                        findHomeBtn.setBounds(0, 790, 120, 50);

                                        JPanel serverJpanel = new JPanel();
                                        serverJpanel.setOpaque(false);
                                        serverJpanel.setLayout(null);
                                        serverJpanel.add(arrowBtn);
                                        serverJpanel.add(serverLabel);
                                        serverJpanel.add(moreBtn);
                                        serverJpanel.add(rpBtn);
                                        serverJpanel.add(walletBtn);
                                        serverJpanel.add(financeLabel);
                                        serverJpanel.add(repayBtn);
                                        serverJpanel.add(financeMgBtn);
                                        serverJpanel.add(insuranceServerBtn);
                                        serverJpanel.add(lifeServer);
                                        serverJpanel.add(phoneRechargeBtn);
                                        serverJpanel.add(livingExpensesBtn);
                                        serverJpanel.add(QBRechargeBtn);
                                        serverJpanel.add(cityServerBtn);
                                        serverJpanel.add(tencentWelfareBtn);
                                        serverJpanel.add(medicalHealthBtn);
                                        serverJpanel.add(healthCodeBtn);
                                        serverJpanel.add(promotion);
                                        serverJpanel.add(traffic);
                                        serverJpanel.add(trafficServerBtn);
                                        serverJpanel.add(trainAndplaneTicketBtn);
                                        serverJpanel.add(ddTrafficBtn);
                                        serverJpanel.add(hotelBtn);
                                        serverJpanel.add(shopping);
                                        serverJpanel.add(shoppingBtn);
                                        serverJpanel.add(JDshoppingBtn);
                                        serverJpanel.add(meituanBtn);
                                        serverJpanel.add(movieBtn);
                                        serverJpanel.add(meituanBtn2);
                                        serverJpanel.add(pddBtn);
                                        serverJpanel.add(vipshopBtn);
                                        serverJpanel.add(zzBtn);
                                        serverJpanel.add(findHomeBtn);

                                        jf6.add(serverJpanel);
                                        jf6.setVisible(true);
                                    }
                                });

                                ImageIcon collectIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/收藏.png");
                                collectIcon.setImage(collectIcon.getImage().getScaledInstance(30, 30, 0));

                                JLabel collect = new JLabel(collectIcon);

                                JButton cBtn = new JButton("收藏");
                                cBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                cBtn.setForeground(Color.BLACK);
                                cBtn.setHorizontalTextPosition(SwingConstants.RIGHT);
                                cBtn.setOpaque(false);
                                cBtn.setContentAreaFilled(false);
                                cBtn.setBackground(Color.WHITE);
                                cBtn.add(collect);
                                cBtn.setBounds(0, 220, jf5.getWidth(), 40);

                                ImageIcon friendCircleIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/朋友圈.png");
                                friendCircleIcon.setImage(friendCircleIcon.getImage().getScaledInstance(30, 30, 0));

                                JLabel friendCircle = new JLabel(friendCircleIcon);

                                JButton fBtn = new JButton("朋友圈");
                                fBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                fBtn.setForeground(Color.BLACK);
                                fBtn.setHorizontalTextPosition(SwingConstants.RIGHT);
                                fBtn.setOpaque(false);
                                fBtn.setContentAreaFilled(false);
                                fBtn.setBackground(Color.WHITE);
                                fBtn.add(friendCircle);
                                fBtn.setBounds(0, 259, jf5.getWidth(), 40);

                                ImageIcon cardBagIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/卡包.png");
                                cardBagIcon.setImage(cardBagIcon.getImage().getScaledInstance(30, 30, 0));

                                JLabel cardBagLabel = new JLabel(cardBagIcon);

                                JButton cardBtn = new JButton("卡包");
                                cardBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                cardBtn.setForeground(Color.BLACK);
                                cardBtn.setHorizontalTextPosition(SwingConstants.RIGHT);
                                cardBtn.setOpaque(false);
                                cardBtn.setContentAreaFilled(false);
                                cardBtn.setBackground(Color.WHITE);
                                cardBtn.add(cardBagLabel);
                                cardBtn.setBounds(0, 298, jf5.getWidth(), 40);

                                ImageIcon emojiIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/表情.png");
                                emojiIcon.setImage(emojiIcon.getImage().getScaledInstance(30, 30, 0));

                                JLabel emojiLabel = new JLabel(emojiIcon);

                                JButton eBtn = new JButton("表情");
                                eBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                eBtn.setForeground(Color.BLACK);
                                eBtn.setHorizontalTextPosition(SwingConstants.RIGHT);
                                eBtn.setOpaque(false);
                                eBtn.setContentAreaFilled(false);
                                eBtn.setBackground(Color.WHITE);
                                eBtn.add(emojiLabel);
                                eBtn.setBounds(0, 337, jf5.getWidth(), 40);

                                ImageIcon installIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/icon_设置.png");
                                installIcon.setImage(installIcon.getImage().getScaledInstance(30, 30, 0));

                                JLabel installLabel = new JLabel(installIcon);

                                JButton iBtn = new JButton("设置");
                                iBtn.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                iBtn.setForeground(Color.BLACK);
                                iBtn.setHorizontalTextPosition(SwingConstants.RIGHT);
                                iBtn.setOpaque(false);
                                iBtn.setContentAreaFilled(false);
                                iBtn.setBackground(Color.WHITE);
                                iBtn.add(installLabel);
                                iBtn.setBounds(0, 387, jf5.getWidth(), 40);

                                ImageIcon wechatIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/消息.png");
                                wechatIcon.setImage(wechatIcon.getImage().getScaledInstance(30, 30, 0));

                                messageBtn2 = new JButton("微信", wechatIcon);
                                messageBtn2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                messageBtn2.setOpaque(false);
                                messageBtn2.setHorizontalTextPosition(SwingConstants.CENTER);
                                messageBtn2.setVerticalTextPosition(SwingConstants.BOTTOM);
                                messageBtn2.setContentAreaFilled(false);
                                messageBtn2.setBorderPainted(false);
                                messageBtn2.setBounds(10, 640, 80, 50);

                                messageBtn2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        cIcon.setImage(cIcon.getImage().getScaledInstance(30, 30, 0));
                                        lIcon.setImage(lIcon.getImage().getScaledInstance(30, 30, 0));
                                        mineIcon.setImage(mineIcon.getImage().getScaledInstance(30, 30, 0));
                                        callBtn2.setIcon(cIcon);
                                        lookBtn2.setIcon(lIcon);
                                        mineBtn2.setIcon(mineIcon);
                                        ImageIcon wechatIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/消息 (1).png");
                                        wechatIcon.setImage(wechatIcon.getImage().getScaledInstance(30, 30, 0));
                                        messageBtn2.setIcon(wechatIcon);
                                        jf5.dispose();
                                        jf3.show();
                                    }
                                });

                                ImageIcon callIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/通讯录.png");
                                callIcon.setImage(callIcon.getImage().getScaledInstance(30, 30, 0));
                                callBtn2 = new JButton("通讯录", callIcon);
                                callBtn2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                callBtn2.setOpaque(false);
                                callBtn2.setHorizontalTextPosition(SwingConstants.CENTER);
                                callBtn2.setVerticalTextPosition(SwingConstants.BOTTOM);
                                callBtn2.setContentAreaFilled(false);
                                callBtn2.setBorderPainted(false);
                                callBtn2.setBounds(120, 640, 80, 50);

                                callBtn2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        mIcon.setImage(mIcon.getImage().getScaledInstance(30, 30, 0));
                                        lIcon.setImage(lIcon.getImage().getScaledInstance(30, 30, 0));
                                        mineIcon.setImage(mineIcon.getImage().getScaledInstance(30, 30, 0));
                                        messageBtn2.setIcon(mIcon);
                                        lookBtn2.setIcon(lIcon);
                                        mineBtn2.setIcon(mineIcon);
                                        ImageIcon callIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/通讯录 (1).png");
                                        callIcon.setImage(callIcon.getImage().getScaledInstance(30, 30, 0));
                                        callBtn2.setIcon(callIcon);
                                    }
                                });

                                ImageIcon lookIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/发现.png");
                                lookIcon.setImage(lookIcon.getImage().getScaledInstance(30, 30, 0));

                                lookBtn2 = new JButton("发现", lookIcon);
                                lookBtn2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                lookBtn2.setOpaque(false);
                                lookBtn2.setHorizontalTextPosition(SwingConstants.CENTER);
                                lookBtn2.setVerticalTextPosition(SwingConstants.BOTTOM);
                                lookBtn2.setContentAreaFilled(false);
                                lookBtn2.setBorderPainted(false);
                                lookBtn2.setBounds(220, 640, 80, 50);

                                lookBtn2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        cIcon.setImage(cIcon.getImage().getScaledInstance(30, 30, 0));
                                        mIcon.setImage(mIcon.getImage().getScaledInstance(30, 30, 0));
                                        mineIcon.setImage(mineIcon.getImage().getScaledInstance(30, 30, 0));
                                        messageBtn2.setIcon(mIcon);
                                        callBtn2.setIcon(cIcon);
                                        mineBtn2.setIcon(mineIcon);
                                        ImageIcon lookIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/发现 (1).png");
                                        lookIcon.setImage(lookIcon.getImage().getScaledInstance(30, 30, 0));
                                        lookBtn2.setIcon(lookIcon);
                                    }
                                });

                                ImageIcon mineIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/我的.png");
                                mineIcon.setImage(mineIcon.getImage().getScaledInstance(30, 30, 0));

                                mineBtn2 = new JButton("我", mineIcon);
                                mineBtn2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                                mineBtn2.setOpaque(false);
                                mineBtn2.setHorizontalTextPosition(SwingConstants.CENTER);
                                mineBtn2.setVerticalTextPosition(SwingConstants.BOTTOM);
                                mineBtn2.setContentAreaFilled(false);
                                mineBtn2.setBorderPainted(false);
                                mineBtn2.setBounds(320, 640, 80, 50);

                                mineBtn2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        mIcon.setImage(mIcon.getImage().getScaledInstance(30, 30, 0));
                                        cIcon.setImage(cIcon.getImage().getScaledInstance(30, 30, 0));
                                        lIcon.setImage(lIcon.getImage().getScaledInstance(30, 30, 0));
                                        messageBtn2.setIcon(mIcon);
                                        callBtn2.setIcon(cIcon);
                                        lookBtn2.setIcon(lIcon);
                                        ImageIcon mineIcon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/我的 (1).png");
                                        mineIcon.setImage(mineIcon.getImage().getScaledInstance(30, 30, 0));
                                        mineBtn2.setIcon(mineIcon);
                                    }
                                });

                                JPanel mineJpanel = new JPanel();
                                mineJpanel.setOpaque(false);
                                mineJpanel.setLayout(null);
                                mineJpanel.add(mineLabel);
                                mineJpanel.add(mineName);
                                mineJpanel.add(wechatNo);
                                mineJpanel.add(qrCode);
                                mineJpanel.add(arrowBtn);
                                mineJpanel.add(sBtn);
                                mineJpanel.add(cBtn);
                                mineJpanel.add(fBtn);
                                mineJpanel.add(cardBtn);
                                mineJpanel.add(eBtn);
                                mineJpanel.add(iBtn);
                                mineJpanel.add(messageBtn2);
                                mineJpanel.add(callBtn2);
                                mineJpanel.add(lookBtn2);
                                mineJpanel.add(mineBtn2);

                                jf5.add(mineJpanel);
                                jf5.setVisible(true);
                            }
                        }).start();
                    }
                });

                ButtonGroup btnGroup = new ButtonGroup();
                btnGroup.add(message);
                btnGroup.add(call);
                btnGroup.add(look);
                btnGroup.add(mine);

                JPanel messageJp = new JPanel();
                messageJp.setOpaque(false);
                messageJp.setBorder(new LineBorder(Color.GRAY));
                messageJp.setLayout(new FlowLayout(0, 47, 15));
                messageJp.add(message);
                messageJp.add(call);
                messageJp.add(look);
                messageJp.add(mine);


                Box vbb = Box.createVerticalBox();
                vbb.add(uJp);
                vbb.add(messageJp);

                Box vb4 = Box.createVerticalBox();

                vb4.add(top2);
                vb4.add(vbb);
                jf3.add(vb4);

                jf3.setVisible(true);

            }
        });
        bottom.add(friendsList);

        bottom.add(bottomJpanel);

        JButton bottomBtn1 = new JButton("切换账号");
        bottomBtn1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        bottomBtn1.setForeground(Color.BLUE);
        bottomBtn1.setOpaque(false);//设置控件是否透明,true为不透明,false为透明
        bottomBtn1.setContentAreaFilled(false);//设置图片填满按钮所在区域
        bottomBtn1.setBorderPainted(false);//设置是否绘制边框
        bottomBtn1.setBorder(null);//设置边框


        JButton bottomBtn2 = new JButton("仅传输文件");
        bottomBtn2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        bottomBtn2.setForeground(Color.BLUE);
        bottomBtn2.setOpaque(false);//设置控件是否透明,true为不透明,false为透明
        bottomBtn2.setContentAreaFilled(false);//设置图片填满按钮所在区域
        bottomBtn2.setBorderPainted(false);//设置是否绘制边框
        bottomBtn2.setBorder(null);//设置边框


        JPanel bottomBtn = new JPanel();
        bottomBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        bottomBtn.setBorder(null);
        bottomBtn.setOpaque(false);
        bottomBtn.add(bottomBtn1);
        bottomBtn.add(bottomBtn2);
        Box whole = Box.createVerticalBox();
        whole.setOpaque(false);
        whole.add(top);
        whole.add(bottom);
        whole.add(bottomBtn);

        jf.add(whole);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setVisible(true);


    }

    private class MyRendered extends JPanel implements ListCellRenderer {

        private String name;
        private ImageIcon icon;
        //记录背景色
        private Color background;

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            this.name = value.toString();
            this.icon = new ImageIcon(this.getClass().getResource("/resources/wechat.png"));
            this.background = list.getBackground();
            return this;
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(300, 200);
        }


        @Override
        public void paint(Graphics g) {
            int imageWidth = icon.getImage().getWidth(null);
            int imageHeight = icon.getImage().getHeight(null);
            //填充背景
            g.setColor(background);
            g.fillRect(0, 0, getWidth(), getHeight());

            //绘制头像
            g.drawImage(icon.getImage(), this.getWidth() / 2 - 45, 10, null);

            //绘制昵称
            g.setColor(Color.BLACK);
            g.setFont(new Font("微软雅黑", Font.PLAIN, 18));
            g.drawString(this.name, this.getWidth() / 2 - 21, 50 + imageHeight);

        }
    }

    private class MyRendered2 extends JPanel implements ListCellRenderer {
        private String name2;
        private ImageIcon icon;//设置好友头像
        private Color foreGround;//设置前景色
        private Color backGround;//设置背景色

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            //重置成员变量的值
            name2 = value.toString();
            this.icon = new ImageIcon("D:\\19578\\IdeaProjects\\wechartmodifier\\src\\resources/" + name2 + ".jpg");

            if (isSelected) {
                this.backGround = Color.GRAY;
                this.foreGround = user.getSelectionForeground();
            } else {
                this.backGround = user.getBackground();
                this.foreGround = user.getForeground();
            }

//                this.backGround=isSelected?user.getSelectionBackground():user.getBackground();
//                this.foreGround=isSelected?user.getSelectionForeground():user.getForeground();
            return this;
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 65);
        }

        @Override
        public void paint(Graphics g) {
            int iconWidth = icon.getImage().getWidth(null);
            int iconHeight = icon.getImage().getHeight(null);

            //填充背景矩形
            g.setColor(this.backGround);
            g.fillRect(0, 0, getWidth(), getHeight());

            //绘制头像
            g.drawImage(icon.getImage(), this.getWidth() / 2 - iconWidth - 120, 10, null);

            //绘制昵称
            g.setColor(foreGround);
            g.setFont(new Font("微软雅黑", Font.BOLD, 14));
            g.drawString(this.name2, this.getWidth() / 2 - this.name2.length() / 2 - 100, 42);
        }
    }
}

