package sample;

import java.sql.*;
import java.util.InputMismatchException;

import com.sun.org.apache.xpath.internal.operations.And;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class Main extends Application {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver?useSSL=False";
    static final String DB_URL = "jdbc:mysql://localhost/cpt01";

    static final String USER = "root";
    static final String PASS = "dickssss";

    @Override
    public void start(Stage primaryStage){

        GridPane root0 = new GridPane();
        GridPane bpane = new GridPane();
        GridPane lpane = new GridPane();
        GridPane tpane = new GridPane();
        Scene scene0 = new Scene(root0,400, 400);

        Button btn0 = new Button("I want to be a runner");
        Button btn1 = new Button("I want to sponsor a runner");
        Button btn2 = new Button("I want to find out more");
        Button btn3 = new Button("Login");
        btn0.setPrefSize(300,50);
        btn1.setPrefSize(300,50);
        btn2.setPrefSize(300,50);
        btn3.setPrefSize(150,30);

        btn0.setOnAction(value ->{
            try {
            page1(primaryStage);
            }
            catch (Exception e){}
        });

        btn1.setOnAction(value ->{
            sponsor_a_runner(primaryStage);
        });

        btn2.setOnAction(value ->{

        });

        btn3.setOnAction(value ->{
            page2(primaryStage);
        });

        Label msb = new Label();
        msb.setText("marathon");
        msb.setFont(Font.font("Open Sans", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 50));

        root0.setPadding(new Insets(10));
        root0.setHgap(5);
        root0.setVgap(5);
        root0.setAlignment(Pos.BOTTOM_CENTER);

        bpane.setPadding(new Insets(10));
        bpane.setHgap(5);
        bpane.setVgap(5);
        bpane.setAlignment(Pos.CENTER);

        lpane.setPadding(new Insets(10));
        lpane.setHgap(5);
        lpane.setVgap(5);
        lpane.setAlignment(Pos.CENTER);

        tpane.setPadding(new Insets(10));
        tpane.setHgap(5);
        tpane.setVgap(5);
        tpane.setAlignment(Pos.CENTER);

        tpane.add(btn1, 0, 0);

        bpane.add(btn0,0, 0);
        bpane.add(btn1,0, 10);
        bpane.add(btn2,0, 20);

        lpane.add(btn3,50,0);

        root0.add(tpane,0,0);
        root0.add(bpane,0,20);
        root0.add(lpane,0,40);

        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setScene(scene0);
        primaryStage.setTitle("window hello world");
        primaryStage.show();

    }


    public void page1(Stage primaryStage)  {

        GridPane root1 = new GridPane();
        GridPane bpane1 = new GridPane();
        GridPane lpane1 = new GridPane();
        GridPane hpane1 = new GridPane();
        Scene scene1 = new Scene(root1, 500, 500);

        Button btn0 = new Button("I have competed before");
        Button btn1 = new Button("I am a new competitor");
        Button lbtn = new Button("Login");
        Button bbtn = new Button("Back");

        btn0.setPrefSize(300, 50);
        btn1.setPrefSize(300, 50);
        lbtn.setPrefSize(150, 30);
        bbtn.setPrefSize(50, 30);

        btn0.setOnAction(value ->{
            page2(primaryStage);
        });
        btn1.setOnAction(value ->{

        });
        lbtn.setOnAction(value ->{
            page2(primaryStage);
        });
        bbtn.setOnAction(value ->{
            try { start(primaryStage); }
            catch (Exception e) {}
        });


        hpane1.setPadding(new Insets(10));
        hpane1.setHgap(5);
        hpane1.setVgap(5);
        hpane1.setAlignment(Pos.CENTER_LEFT);

        root1.setPadding(new Insets(10));
        root1.setHgap(5);
        root1.setVgap(5);
        root1.setAlignment(Pos.CENTER);

        bpane1.setPadding(new Insets(10));
        bpane1.setHgap(5);
        bpane1.setVgap(5);
        bpane1.setAlignment(Pos.CENTER);

        lpane1.setPadding(new Insets(10));
        lpane1.setHgap(5);
        lpane1.setVgap(5);
        lpane1.setAlignment(Pos.BOTTOM_RIGHT);

        hpane1.add(bbtn, 0, 0);

        bpane1.add(btn0, 0, 0);
        bpane1.add(btn1, 0, 15);

        lpane1.add(lbtn, 50, 0);

        root1.add(bpane1, 0, 5);
        root1.add(lpane1, 0, 30);
        root1.add(hpane1, 0, 0);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("tfo 3leek");
        primaryStage.show();
    }


    public void page2(Stage primaryStage) {

        GridPane root = new GridPane();
        GridPane bpane = new GridPane();
        GridPane hpane = new GridPane();
        Scene scene = new Scene(root, 500, 500);

        Text text1 = new Text("E-mail");
        Text text2 = new Text("Password");
        TextField txtfield1 = new TextField("zulma.laurie@saucedout.com");
        TextField txtfield2 = new TextField("E6V7enaE");
        Button btn1 = new Button("Log in");
        Button btn2 = new Button("Clear");
        Button bbtn = new Button("Back");

        txtfield1.setPrefSize(300, 0);
        txtfield2.setPrefSize(300, 0);
        btn1.setPrefSize(100, 0);
        btn2.setPrefSize(100, 0);

        btn1.setOnAction(value -> {
            String token = signin(txtfield1.getText(), txtfield2.getText());
            if (token.equals("R")){runner_menu(primaryStage);}
            if (token.equals("C")){}
            if (token.equals("A")){}

        });

        btn2.setOnAction(value -> {
            txtfield1.setText("");
            txtfield2.setText("");
        });

        bbtn.setOnAction(value -> {
            try { start(primaryStage); }
            catch (Exception e) {}
        });

        root.setPadding(new Insets(10));
        root.setVgap(5);
        root.setHgap(5);
        root.setAlignment(Pos.CENTER);

        bpane.setPadding(new Insets(10));
        bpane.setVgap(5);
        bpane.setHgap(5);
        bpane.setAlignment(Pos.CENTER);

        hpane.setPadding(new Insets(10));
        hpane.setVgap(5);
        hpane.setHgap(5);
        hpane.setAlignment(Pos.CENTER_LEFT);

        bpane.add(txtfield1, 0, 5);
        bpane.add(txtfield2, 0, 15);
        bpane.add(btn1, 0, 30);
        bpane.add(btn2, 1, 30);
        bpane.add(text2, 0, 10);
        bpane.add(text1, 0, 0);

        hpane.add(bbtn, 0, 0);

        root.add(hpane, 0, 0);
        root.add(bpane, 0, 5);

        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("window hello world");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public void sponsor_a_runner(Stage primaryStage){
        //----------------panes and scene------------------------
        GridPane root = new GridPane();
        GridPane header = new GridPane();
        GridPane footer = new GridPane();
        GridPane main = new GridPane();
        GridPane maintop = new GridPane();
        GridPane mainbott = new GridPane();
        GridPane mainbottleft = new GridPane();
        GridPane mainbottright = new GridPane();

        Scene aaa = new Scene(root, 500, 500);



        //--------------defining nodes---------------
        //buttons
        Button back = new Button("back");
        Button paynow = new Button("pay now");
        Button cancel = new Button("cancel");
        Button plus10 = new Button("+");
        Button minus10 = new Button("-");

        //textfields
        TextField yourname = new TextField();
        TextField runner = new TextField();
        TextField cardname = new TextField();
        TextField cardnum = new TextField();
        TextField expiremonth = new TextField();
        TextField expireyear = new TextField();
        TextField cvc = new TextField();
        TextField payamount = new TextField();

        expiremonth.setPrefSize(50, 0);
        payamount.setPrefSize(50, 0);
        //labels
        Label titletxt = new Label("Marathon Skill 2015");
        Label headertxt = new Label("Sponsor a runner");
        Label countdowntxt = new Label();
        Label body1txt = new Label("Please choose the runner you would like to sponsor and the amount you would like to sponsor them for. Thank you for your support of the runners and their charities");
        Label sponsdetailslabel = new Label("Sponsorship details");
        Label charitylabel = new Label("charity");
        Label charitynametxt = new Label("Runner's charity");
        Label amountlabel = new Label("Amount to donate");
        Label amountxtt = new Label("0");
        Label urnametxt = new Label("Your Name");
        Label runnername = new Label("Runner");
        Label cardnametxt = new Label("Name on Card");
        Label cardnumtxt = new Label("Card Number");
        Label expiretxt = new Label("Expiry Date");
        Label cvctxt = new Label("CVC");

        body1txt.setWrapText(true);
        body1txt.prefHeightProperty().bind(aaa.heightProperty());

        //------------------------pane properties--------------------------------
        GridPane[] panelist = {root, header, footer, main, mainbott, maintop, mainbottleft, mainbottright};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(3));
            pane.setVgap(5);
            pane.setHgap(5);
            pane.setAlignment(Pos.CENTER);
        }
        root.add(header,0, 0);
        root.add(main,0, 5);
        root.add(footer,0, 10);

        header.add(back, 0, 0);
        header.add(titletxt, 1, 0);

        footer.add(countdowntxt, 0, 0);

        main.add(maintop, 0, 0);
        main.add(mainbott, 0, 1);

        maintop.add(headertxt, 0, 0);
        maintop.add(body1txt, 0, 1);

        mainbott.add(mainbottleft, 0, 0);
        mainbott.add(mainbottright, 1, 0);

        mainbottleft.add(sponsdetailslabel, 1, 0);
        mainbottleft.add(urnametxt, 0, 1);
        mainbottleft.add(runnername,0, 2);
        mainbottleft.add(cardnametxt,0, 3);
        mainbottleft.add(cardnumtxt,0, 4);
        mainbottleft.add(expiretxt,0, 5);
        mainbottleft.add(cvctxt,0, 6);
        mainbottleft.add(yourname, 1, 1);
        mainbottleft.add(runner,1, 2);
        mainbottleft.add(cardname,1, 3);
        mainbottleft.add(cardnum,1, 4);
        mainbottleft.add(expireyear,1, 5);
        mainbottleft.add(expiremonth,2, 5);
        mainbottleft.add(cvc,1, 6);

        mainbottright.add(charitylabel,1, 0);
        mainbottright.add(charitynametxt, 1, 1);
        mainbottright.add(amountlabel, 1, 2);
        mainbottright.add(amountxtt, 1, 3);
        mainbottright.add(minus10, 0, 4);
        mainbottright.add(plus10, 2, 4);
        mainbottright.add(payamount, 1, 4);
        mainbottright.add(paynow, 1, 5);
        mainbottright.add(cancel, 1, 6);

        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Sponsor a runner");
        primaryStage.setScene(aaa);
        primaryStage.show();
        //----------------------button actions---------------------------
        back.setOnAction(value ->{
            start(primaryStage);
        });
        plus10.setOnAction(value ->{
            Integer x;
            try{
                x = Integer.valueOf(payamount.getText())+10;
                payamount.setText(x.toString());
                amountxtt.setText(x.toString());
            }
            catch (NumberFormatException e){payamount.setText("10");}
        });
        minus10.setOnAction(value ->{
            Integer x;
            try{
                x = Integer.valueOf(payamount.getText())-10;
                if(!(x<0)){
                    payamount.setText(x.toString());
                    amountxtt.setText(x.toString());
                }
            }
            catch (NumberFormatException e){payamount.setText("0");}
        });
    }


    public void runner_menu(Stage primaryStage){
        //-------------------panes and scene--------------
        GridPane root = new GridPane();
        GridPane header = new GridPane();
        GridPane main = new GridPane();
        GridPane maintop = new GridPane();
        GridPane mainbot = new GridPane();
        GridPane footer = new GridPane();
        Scene scene = new Scene(root, 500, 500);

        //-------------------node definitions-------------
        //buttons
        Button back = new Button("back");
        Button logout = new Button("logout");
        Button regis = new Button("register for an event");
        Button myrace = new Button("my race results");
        Button edit = new Button("edit your profile");
        Button myspons = new Button("my sponsorship");
        Button contact_information = new Button("contact information");
        //labels
        Label title = new Label("Marathon skills 2015");
        Label runner = new Label("Runner menu");
        Label timer = new Label("do this k?");

        //------------------------pane properties--------------
        GridPane[] panelist = {root, header, footer, main, mainbot, maintop};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
            }

        root.prefHeight(500);
        root.prefWidth(500);
        root.add(header, 0, 0);
        root.add(main, 0, 10);
        root.add(footer, 0, 20);

        header.add(back, 0, 0);
        header.add(title, 5, 0);
        header.add(logout, 10, 0);

        footer.add(timer, 0, 0);

        main.add(maintop, 0, 0);
        main.add(mainbot, 0, 2);

        maintop.add(runner, 0, 0);

        mainbot.add(regis, 0, 0);
        mainbot.add(myrace, 1, 0);
        mainbot.add(edit, 0, 1);
        mainbot.add(myspons, 1, 1);
        mainbot.add(contact_information, 0, 2);

        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("runner menu");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public String signin(String uemail, String upassword){
        String roleid = new String();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //connecting to the database
            System.out.println("Connecting to a database");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //creating a statement
            stmt = conn.createStatement();
            String sql;
            sql = "select email, password, roleid from user";
            ResultSet rs = stmt.executeQuery(sql);
            //extracting data from result set
            boolean signedin = false;
            while(rs.next()){
                String email = rs.getString("email");
                String password = rs.getString("password");
                String role = rs.getString("roleid");
                if (uemail.equals(email)  && upassword.equals(password)){
                    signedin = true;
                    System.out.println("signed in");
                    System.out.println(email+"\n"+password);
                    if(role.equals("R")){
                        System.out.println("runner");
                    }
                    if(role.equals("C")){
                        System.out.println("Coordinator");
                    }
                    else{
                        System.out.println("Admin");
                    }
                    roleid = role;
                    break;
                }
            }
            if (!signedin) {System.out.println("email or password is incorrect");}

            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException se){
            //Handles jdbc errors
            se.printStackTrace();
        }
        catch(Exception e) {
            //Handles errors for Class.forname
            e.printStackTrace();
        }

        finally {
            //finally block used to close resources
            try {
                if(stmt != null)
                    stmt.close();
            }
            catch (SQLException se2){
                // nothing we can do
            }
            try {
                if (conn!=null)
                    conn.close();
            }
            catch (SQLException se){
                se.printStackTrace();
            }
        }
        return (roleid);
    }

    public static void main(String[] args) {

    launch(args);
    }
}
