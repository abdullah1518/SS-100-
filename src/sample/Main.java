package sample;

import java.sql.*;

import com.sun.org.apache.xpath.internal.operations.And;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class Main extends Application {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver?useSSL=False";
    static final String DB_URL = "jdbc:mysql://localhost/cpt01";

    static final String USER = "root";
    static final String PASS = "dickssss";

    @Override
    public void start(Stage primaryStage) throws Exception{

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


    public void page1(Stage primaryStage) throws Exception {

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
        TextField txtfield1 = new TextField();
        TextField txtfield2 = new TextField();
        Button btn1 = new Button("Log in");
        Button btn2 = new Button("Clear");
        Button bbtn = new Button("Back");

        txtfield1.setPrefSize(300, 0);
        txtfield2.setPrefSize(300, 0);
        btn1.setPrefSize(100, 0);
        btn2.setPrefSize(100, 0);

        btn1.setOnAction(value -> {
            signin(txtfield1.getText(), txtfield2.getText());


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
        //labels
        Label titletxt = new Label("Marathon Skill 2015");
        Label headertxt = new Label();
        Label countdowntxt = new Label();
        Label body1txt = new Label("Please choose the runner you would like to sponsor and the amount you would like to sponsor them for. Thank you for your support of the runners and their charities");
        Label sponsdetailslabel = new Label("Sponsorship details");
        Label charitylabel = new Label();
        Label charitynametxt = new Label();
        Label amountlabel = new Label();
        Label amountxtt = new Label();
        Label urnametxt = new Label("Your Name");
        Label runnername = new Label("Runner");
        Label cardnametxt = new Label("Name on Card");
        Label cardnumtxt = new Label("Card Number");
        Label expiretxt = new Label("Expiry Date");
        Label cvctxt = new Label("CVC");

        body1txt.setWrapText(true);
        body1txt.prefHeightProperty().bind(aaa.heightProperty());

        //----------pane properties------------
        GridPane[] panelist = {root, header, footer, main, mainbott, maintop, mainbottleft, mainbottright};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(5);
            pane.setHgap(5);
            pane.setAlignment(Pos.CENTER);
            System.out.println(pane);
        }
        root.add(header,0, 0);
        root.add(main,0, 5);
        root.add(footer,0, 10);

        header.add(back, 0, 0);
        header.add(titletxt, 1, 0);

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

        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Sponsor a runner");
        primaryStage.setScene(aaa);
        primaryStage.show();


    }

    public void signin(String uemail, String upassword){
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
            sql = "select email, password from user";
            ResultSet rs = stmt.executeQuery(sql);

            //extracting data from result set
            boolean signedin = false;
            while(rs.next()){
                String email = rs.getString("email");
                String password = rs.getString("password");
                /*System.out.println(email);
                System.out.println(password);*/
                if (uemail.equals(email)  && upassword.equals(password)){
                    signedin = true;
                    System.out.println("signed in");
                    break;
                }
            }
            if (!signedin)
            System.out.println("email or password is incorrect");

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

    }

    public void dbinsert(){

        System.out.println("Staff ID Num\tFull Name\tDate of Birth\tGender\tPosition ID\tPosition Name\tPosition Description\tPay Period\tPay Rate\tEmail Address\n" +
            "1\tLAKISHA # TOMBLIN\t8/6/1961\tF\t2\tAdministrative Clerk\tProvides administrative support\tH\t $55.00 \tl_tomblin@nnl.com\n" +
            "2\tKRIS|SWEELY\t12/24/1980\tM\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tk_sweely@yahoo.com\n" +
            "3\tELSIE|ESTELL\t7/7/1974\tF\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \telsie.estell@rrg.net\n" +
            "4\tTYRELL|ROSENBERG\t8/2/1965\tMale\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \ttyrell_rosenberg@hotmail.com\n" +
            "5\tMADELYN # HOOVER\t12/4/1962\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tH\t $68.00 \tmadelyn_hoover@@hotmail.com\n" +
            "6\tKENETH *PARHAM\t3/30/1967\tMale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tk_parham@live.com\n" +
            "7\tLYLE *MALLORY\t7/6/1989\tMales\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tl_mallory@live.com\n" +
            "8\tCLIFTON *FIGUEROA\t3/23/1956\tM\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tc_figueroa@live.com\n" +
            "9\tMOHAMMAD|RICHEY\t7/1/1995\tMale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tmohammad_richey@jcl.net\n" +
            "10\tWINIFRED # DUNCAN\t10/20/1968\tFemales\t11\tSponsorship Coordinator\tIdentifies, develops and maintains effective relationships with all sponsors\tYearly\t $70,000.00 \tw_duncan@hotmail.com\n" +
            "11\tVERNITA # SEABORN\t10/13/1993\tFemale\t19\tAdministrative Manager\tOversees the administrative functions of the organisation\tYearly\t $65,000.00 \tv_seaborn@gmail.com\n" +
            "12\tLENORA|HIGGINS\t6/29/1997\tF\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tl_higgins@msv.org\n" +
            "13\tDON *RUSS\t10/13/1971\tMale\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tdon_russ@jcl.net\n" +
            "14\tTHADDEUS *STALEY\t2/13/1992\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tt_staley@nnl.com\n" +
            "15\tWILFORD *RIVERA\t9/21/1978\tMale\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \twilford.rivera@gmail.com\n" +
            "16\tLANCE|BEYER\t9/30/1990\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tl_beyer@rnl.com\n" +
            "17\tLASHANDA|SNOWDEN\t6/28/1983\tF\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tlashanda.snowden@rrg.net\n" +
            "18\tGLORY *FELDER\t11/18/1963\tF\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tglory.felder@@hotmail.com\n" +
            "19\tESTELLA *BLALOCK\t10/17/1951\tF\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \te_blalock@@ccf.org\n" +
            "20\tTRAVIS # RAMOS\t4/21/1983\tMales\t1\tHelpdesk Advisor\tWorks on the helpdesk\tH\t $68.00 \ttravis_ramos@hotmail.com\n" +
            "21\tILA *THOMPSON\t5/17/1979\tF\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \ti_thompson@yahoo.com\n" +
            "22\tLORRAINE|MCKEE\t10/11/1973\tFemale\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tl_mckee@hotmail.com\n" +
            "23\tSHELLIE *MONTANO\t9/19/1974\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tshellie_montano@hotmail.com\n" +
            "24\tERVIN # LAWRENCE\t12/20/1984\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tervin_lawrence@hotmail.com\n" +
            "25\tGOLDA # GRANGER\t4/28/1982\tFemale\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tg_granger@msv.org\n" +
            "26\tKING|MERCADO\t11/26/1952\tM\t13\tSocial Media Coordinator\tManages content across social media platforms\tYearly\t $78,000.00 \tk_mercado@@hotmail.com\n" +
            "27\tGERARDO # BOWSER\t8/19/1953\tM\t2\tAdministrative Clerk\tProvides administrative support\tH\t $55.00 \tgerardo_bowser@hotmail.com\n" +
            "28\tKARIN # MCCARTY\t10/17/1985\tF\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tk_mccarty@gmail.com\n" +
            "29\tMAYRA # CALLAHAN\t8/7/1979\tFemales\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tH\t $45.00 \tm_callahan@live.com\n" +
            "30\tCALLAN|MCCONNELL\t12/13/1958\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tcallan.mcconnell@@gmail.com\n" +
            "31\tCLAYTON # MARKS\t3/8/1988\tMale\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tH\t $56.00 \tc_marks@nnl.com\n" +
            "32\tTRACY # CUMMINGS\t1/7/1991\tF\t4\tFinance Clerk\tProvides support to the Finance Manager\tH\t $62.00 \ttracy.cummings@gmail.com\n" +
            "33\tNELSON *CASEY\t6/18/1986\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tn_casey@hr.org\n" +
            "34\tSTAN # STOVALL\t10/7/1960\tMale\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \ts_stovall@gmail.com\n" +
            "35\tEARLENE|HOGAN\t2/27/1964\tF\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \te_hogan@gmail.com\n" +
            "36\tWAYNE|ROSARIO\t6/20/1953\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tw_rosario@gmail.com\n" +
            "37\tAUTUMN # MCCALL\t3/11/1965\tF\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tautumn.mccall@rrg.net\n" +
            "38\tPRINCESS *CATT\t6/21/1970\tFemales\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tp_catt@hotmail.com\n" +
            "39\tSIBYL *TAGALA\t5/21/1998\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tsibyl.tagala@hotmail.com\n" +
            "40\tMILAGROS *BUSCH\t12/20/1965\tFemale\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tmilagros_busch@jcl.net\n" +
            "41\tDONNIE *JENNINGS\t10/15/1969\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \td_jennings@@msv.org\n" +
            "42\tOTIS # ENRIQUEZ\t1/11/1986\tMales\t11\tSponsorship Coordinator\tIdentifies, develops and maintains effective relationships with all sponsors\tYearly\t $70,000.00 \totis_enriquez@hotmail.com\n" +
            "43\tPETE *REDDING\t12/17/1988\tM\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tp_redding@ccf.org\n" +
            "44\tVAN|JACK\t2/18/1967\tMales\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tv_jack@hr.org\n" +
            "45\tCYNTHIA *SOSA\t11/8/1989\tFemale\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tc_sosa@gmail.com\n" +
            "46\tLUCIA *SPICER\t9/26/1952\tFemale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tl_spicer@@yahoo.com\n" +
            "47\tTONJA|LEPPALA\t5/20/1958\tF\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tt_leppala@yahoo.com\n" +
            "48\tRENATO # CREECH\t11/8/1967\tMales\t3\tHR Clerk\tProvides support to the HR Manager\tH\t $35.00 \trenato.creech@yahoo.com\n" +
            "49\tDESMOND *JEFFERS\t5/31/1952\tMale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tdesmond_jeffers@@hotmail.com\n" +
            "50\tCANDELARIA *WISE\t8/1/1967\tFemale\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tc_wise@hotmail.com\n" +
            "51\tRORY|RODEFER\t9/19/1995\tMale\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \trory_rodefer@ffrs.gov\n" +
            "52\tSHERRI|CRAWFORD\t1/24/1953\tF\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \ts_crawford@@yahoo.com\n" +
            "53\tMANUELA *PRUETT\t10/3/1964\tF\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tmanuela_pruett@yahoo.com\n" +
            "54\tTASHA *INGRAHAM\t10/6/1965\tFemales\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tt_ingraham@@gmail.com\n" +
            "55\tTAMIKA *ESCOBEDO\t3/29/1951\tF\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tt_escobedo@@msv.org\n" +
            "56\tMARTYN *GLEASON\t6/8/1979\tMale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tm_gleason@nnl.com\n" +
            "57\tCHRISTOPHER|LANGEVIN\t11/12/1962\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tc_langevin@@hotmail.com\n" +
            "58\tNICHOLAS|FORRESTER\t8/29/1996\tMales\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tnicholas.forrester@rrg.net\n" +
            "59\tMARITA *ELAM\t2/21/1984\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tm_elam@@yahoo.com\n" +
            "60\tRYAN *HAHN\t4/20/1968\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tryan_hahn@hotmail.com\n" +
            "61\tCHI *MIMS\t8/5/1963\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tc_mims@@msv.org\n" +
            "62\tSUSAN *VANCE\t9/7/1973\tF\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \ts_vance@gmail.com\n" +
            "63\tGARETH *ROBERSON\t4/30/1978\tMale\t11\tSponsorship Coordinator\tIdentifies, develops and maintains effective relationships with all sponsors\tYearly\t $70,000.00 \tg_roberson@nnl.com\n" +
            "64\tGREIG # WALTERS\t11/3/1976\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tH\t $56.00 \tg_walters@hotmail.com\n" +
            "65\tARMANDO *MOSLEY\t1/1/1956\tMale\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \ta_mosley@hotmail.com\n" +
            "66\tJAYSON|MCCLELLAND\t3/15/1967\tM\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tj_mcclelland@yahoo.com\n" +
            "67\tGRANT # DOWDY\t12/15/1955\tMale\t21\tFinance Manager\tResponsible for the financial health of Marathon Skills\tYearly\t $115,000.00 \tgrant.dowdy@hotmail.com\n" +
            "68\tALVA *OWEN\t8/20/1971\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \ta_owen@hotmail.com\n" +
            "69\tELDON|CRAIG\t7/15/1983\tM\t10\tVolunteer Coordinator\tCoordinates  recruitment and role allocation of volunteers\tY\t $90,000.00 \te_craig@gmail.com\n" +
            "70\tBOYCE # WILLIAM\t12/6/1983\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tH\t $62.00 \tb_william@hotmail.com\n" +
            "71\tVITO # KANIECKI\t3/31/1965\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tH\t $62.00 \tv_kaniecki@hr.org\n" +
            "72\tNAPOLEON # PEDROZO\t4/7/1964\tMale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tn_pedrozo@hotmail.com\n" +
            "73\tDARYL # MASON\t8/14/1977\tMale\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tH\t $56.00 \td_mason@fin.gov\n" +
            "74\tLESLIE *BOSTON\t7/24/1995\tMale\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tleslie.boston@yahoo.com\n" +
            "75\tMITCHEL *KIM\t12/29/1994\tMale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tm_kim@hotmail.com\n" +
            "76\tBERTA|HERMAN\t5/24/1993\tFemales\t13\tSocial Media Coordinator\tManages content across social media platforms\tYearly\t $78,000.00 \tb_herman@gmail.com\n" +
            "77\tWILDA *LAMBERT\t9/3/1991\tFemale\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tw_lambert@yahoo.com\n" +
            "78\tNEVA # CLAY\t12/26/1978\tF\t7\tAssistant\tWorks  in any number of areas\tH\t $40.00 \tn_clay@gmail.com\n" +
            "79\tCHARLES *MACK\t8/11/1975\tM\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tc_mack@hotmail.com\n" +
            "80\tHETTIE *CARMONA\t6/8/1996\tFemale\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \th_carmona@ccf.org\n" +
            "81\tLUCIEN|MURILLO\t6/24/1965\tMale\t10\tVolunteer Coordinator\tCoordinates  recruitment and role allocation of volunteers\tYearly\t $90,000.00 \tl_murillo@fin.gov\n" +
            "82\tDEVON|GOBERN\t9/2/1958\tMale\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \td_gobern@ccf.org\n" +
            "83\tKRISTA *EARLY\t8/21/1985\tFemale\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tk_early@hr.org\n" +
            "84\tGREIG *CONN\t10/30/1993\tMale\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tgreig_conn@hotmail.com\n" +
            "85\tIRMA|MONTANEZ\t11/27/1954\tF\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \ti_montanez@gmail.com\n" +
            "86\tJERRELL|OHARA\t5/16/1967\tMale\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tj_ohara@msv.org\n" +
            "87\tBRANDON|YANG\t10/10/1975\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tbrandon.yang@gmail.com\n" +
            "88\tMARLENE # SCHUMACHER\t11/5/1987\tF\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tmarlene.schumacher@rrg.net\n" +
            "89\tCLEMENTINE # JACKSON\t6/13/1972\tF\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tclementine.jackson@gmail.com\n" +
            "90\tSHAWANDA *CANTU\t5/2/1977\tF\t13\tSocial Media Coordinator\tManages content across social media platforms\tYearly\t $78,000.00 \ts_cantu@hr.org\n" +
            "91\tTAMIKA *COE\t9/2/1953\tF\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tt_coe@fin.gov\n" +
            "92\tABRAHAM *GATLIN\t6/19/1987\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tabraham.gatlin@hotmail.com\n" +
            "93\tJANE|HEDRICK\t3/5/1975\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tj_hedrick@gmail.com\n" +
            "94\tALONSO|HITCHCOCK\t1/29/1968\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \talonso.hitchcock@gmail.com\n" +
            "95\tLEO # VEGA\t11/17/1957\tM\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tl_vega@live.com\n" +
            "96\tTANA *HILLMAN\t1/20/1957\tF\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \ttana_hillman@hotmail.com\n" +
            "97\tNELLIE|LINDSEY\t6/5/1985\tFemales\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tn_lindsey@ccf.org\n" +
            "98\tKELLEY|DANIEL\t6/19/1966\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tkelley.daniel@gmail.com\n" +
            "99\tMARGARETTE|STEM\t9/12/1966\tF\t16\tIT Manager\tOversees the planning and coordinating of technological solutions\tY\t $130,000.00 \tm_stem@ccf.org\n" +
            "100\tKELVIN|RULAPAUGH\t8/23/1983\tM\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tk_rulapaugh@gmail.com\n" +
            "101\tMAYRA # SMITH\t1/17/1982\tFemales\t7\tAssistant\tWorks  in any number of areas\tH\t $40.00 \tm_smith@yahoo.com\n" +
            "102\tJANNA|NICKA\t8/7/1980\tFemale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tj_nicka@msv.org\n" +
            "103\tPAULINE # NEWCOMB\t12/7/1957\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tH\t $68.00 \tp_newcomb@@gmail.com\n" +
            "104\tELVA # PATTEN\t4/7/1983\tF\t7\tAssistant\tWorks  in any number of areas\tH\t $40.00 \te_patten@msv.org\n" +
            "105\tSHANE *COLAIZZO\t5/30/1970\tM\t16\tIT Manager\tOversees the planning and coordinating of technological solutions\tYearly\t $130,000.00 \ts_colaizzo@fin.gov\n" +
            "106\tTHERSA|ARREDONDO\t2/2/1964\tF\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tt_arredondo@@gmail.com\n" +
            "107\tAMPARO # SYKES\t2/29/1960\tFemale\t16\tIT Manager\tOversees the planning and coordinating of technological solutions\tYearly\t $130,000.00 \ta_sykes@ccf.org\n" +
            "108\tJORGE *BLACKWELL\t5/8/1955\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tj_blackwell@hotmail.com\n" +
            "109\tTYLER *BOOTH\t1/26/1972\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tt_booth@gmail.com\n" +
            "110\tJORGE *WAYMIRE\t2/17/1988\tMale\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tjorge_waymire@@ffrs.gov\n" +
            "111\tKENNETH|MEIER\t3/17/1984\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tkenneth_meier@ffrs.gov\n" +
            "112\tAUBREY *ERWIN\t11/1/1960\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \ta_erwin@yahoo.com\n" +
            "113\tCHARLES *STILES\t8/25/1981\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tc_stiles@gmail.com\n" +
            "114\tLOWELL *BAER\t8/1/1951\tM\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tl_baer@@fin.gov\n" +
            "115\tTRACEY *ONOFRIO\t1/7/1986\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tt_onofrio@@ccf.org\n" +
            "116\tSTELLA *HIEBER\t7/23/1972\tF\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tstella_hieber@hotmail.com\n" +
            "117\tROSEANNE *VILLANUEVA\t6/14/1955\tFemale\t9\tCEO\tChief Executive Officer\tYearly\t $75,000.00 \troseanne_villanueva@yahoo.com\n" +
            "118\tVALENTIN # PARRISH\t11/22/1978\tMales\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tvalentin.parrish@rrg.net\n" +
            "119\tTERESITA *RUSH\t7/5/1991\tF\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tt_rush@yahoo.com\n" +
            "120\tCAREY *HALEY\t2/4/1979\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tc_haley@yahoo.com\n" +
            "121\tBURT # PLATT\t2/27/1962\tM\t23\tWorkforce Manager\tResponsible for coordinating the workforce at the venue\tYearly\t $130.00 \tb_platt@hotmail.com\n" +
            "122\tZORA *TATE\t6/23/1967\tFemale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tzora_tate@jcl.net\n" +
            "123\tPENELOPE|ROOT\t7/16/1963\tFemale\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tpenelope.root@@rrg.net\n" +
            "124\tDENNY *MORALES\t3/21/1995\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tdenny_morales@hotmail.com\n" +
            "125\tDALE|BRANCH\t4/6/1982\tM\t14\tOperations Manager\tOversees all logistical aspects of bringing the marathon together\tY\t $110,000.00 \td_branch@live.com\n" +
            "126\tLAURENCE *METCALF\t6/13/1956\tMales\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tlaurence.metcalf@yahoo.com\n" +
            "127\tMERYL *BENNETT\t4/25/1963\tFemales\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tm_bennett@@nnl.com\n" +
            "128\tBERNARDO|RICHEY\t3/7/1951\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tb_richey@@live.com\n" +
            "129\tDAN|KINNEY\t2/12/1974\tMales\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \td_kinney@hotmail.com\n" +
            "130\tARCHIE # ATKINSON\t3/6/1970\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \ta_atkinson@ccf.org\n" +
            "131\tHUGH # VARRIANO\t2/10/1958\tM\t10\tVolunteer Coordinator\tCoordinates  recruitment and role allocation of volunteers\tYearly\t $90,000.00 \thugh.varriano@gmail.com\n" +
            "132\tSONYA *HOLBROOK\t12/19/1969\tFemale\t16\tIT Manager\tOversees the planning and coordinating of technological solutions\tYearly\t $130,000.00 \ts_holbrook@rnl.com\n" +
            "133\tPATRICA *OLSEN\t9/12/1982\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tp_olsen@gmail.com\n" +
            "134\tDELIA *SHOMO\t12/19/1986\tFemale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \td_shomo@yahoo.com\n" +
            "135\tCARLA|VINSON\t1/21/1958\tF\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tc_vinson@ccf.org\n" +
            "136\tFRANCIS # NGUYEN\t11/10/1986\tFemales\t13\tSocial Media Coordinator\tManages content across social media platforms\tYearly\t $78,000.00 \tf_nguyen@live.com\n" +
            "137\tWILLARD # PUTNAM\t8/28/1958\tM\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tw_putnam@gmail.com\n" +
            "138\tTARSHA *WILKINSON\t4/2/1963\tFemale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tt_wilkinson@@hr.org\n" +
            "139\tDEBBY # DUNLAP\t1/4/1974\tFemale\t23\tWorkforce Manager\tResponsible for coordinating the workforce at the venue\tYearly\t $130.00 \tdebby_dunlap@jcl.net\n" +
            "140\tGILDA *PERRY\t7/20/1993\tF\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tg_perry@yahoo.com\n" +
            "141\tGARRY # SANTANA\t7/2/1993\tMale\t4\tFinance Clerk\tProvides support to the Finance Manager\tH\t $62.00 \tg_santana@live.com\n" +
            "142\tNICKOLAS *NUNEZ\t3/3/1994\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tnickolas.nunez@gmail.com\n" +
            "143\tPALMA *GRIER\t8/24/1962\tF\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tp_grier@yahoo.com\n" +
            "144\tRUSSELL # WHITTINGTON\t9/1/1957\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tH\t $65.00 \trussell_whittington@hotmail.com\n" +
            "145\tOLIVE|SALMON\t5/7/1954\tF\t23\tWorkforce Manager\tResponsible for coordinating the workforce at the venue\tY\t $130.00 \to_salmon@ccf.org\n" +
            "146\tGARRETT # BOLLINGER\t12/19/1970\tM\t1\tHelpdesk Advisor\tWorks on the helpdesk\tH\t $68.00 \tg_bollinger@@gmail.com\n" +
            "147\tIGNACIO *COKLEY\t1/23/1955\tM\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tignacio_cokley@jcl.net\n" +
            "148\tNOBLE *MEINERDING\t8/21/1950\tM\t20\tHR Manager\tManages the recruitment, retention and development of staff\tYearly\t $70,000.00 \tn_meinerding@@ccf.org\n" +
            "149\tTHELMA *SKURSKY\t4/28/1959\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tt_skursky@@rnl.com\n" +
            "150\tAL *BOWLES\t2/1/1969\tM\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tal.bowles@@hotmail.com\n" +
            "151\tCRAIG # COUSEY\t2/16/1970\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \tc_cousey@gmail.com\n" +
            "152\tTRACI # BROOKS\t2/15/1969\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tH\t $68.00 \ttraci_brooks@@hotmail.com\n" +
            "153\tISABELLA *WATERMAN\t1/1/1979\tF\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tisabella.waterman@rrg.net\n" +
            "154\tJEROME *JACKSON\t1/23/1956\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tjerome.jackson@rrg.net\n" +
            "155\tSILAS *DIAS\t2/8/1997\tMale\t13\tSocial Media Coordinator\tManages content across social media platforms\tYearly\t $78,000.00 \ts_dias@hotmail.com\n" +
            "156\tTOD|CLARKE\t4/4/1964\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tt_clarke@ccf.org\n" +
            "157\tDONNELL *MYLES\t1/2/1991\tM\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \td_myles@gmail.com\n" +
            "158\tKEITH # MEADOWS\t8/8/1959\tMale\t2\tAdministrative Clerk\tProvides administrative support\tH\t $55.00 \tk_meadows@live.com\n" +
            "159\tJOHNNIE # PRESTON\t9/19/1957\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tjohnnie.preston@gmail.com\n" +
            "160\tNANETTE *TALBOT\t4/29/1994\tF\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tn_talbot@hotmail.com\n" +
            "161\tRENATA *ENGLISH\t1/3/1956\tFemales\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tr_english@gmail.com\n" +
            "162\tSAMMIE|DICKENS\t7/5/1972\tF\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \ts_dickens@msv.org\n" +
            "163\tANDRA # CAREY\t11/27/1987\tFemales\t3\tHR Clerk\tProvides support to the HR Manager\tH\t $35.00 \ta_carey@gmail.com\n" +
            "164\tGREGOR *WOLNY\t4/30/1980\tMale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tg_wolny@yahoo.com\n" +
            "165\tLUTHER # DOYLE\t4/29/1998\tMale\t10\tVolunteer Coordinator\tCoordinates  recruitment and role allocation of volunteers\tYearly\t $90,000.00 \tl_doyle@gmail.com\n" +
            "166\tENOLA *AUSTIN\t11/23/1991\tFemale\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \te_austin@nnl.com\n" +
            "167\tDARIUS *NOBLE\t12/6/1959\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \td_noble@gmail.com\n" +
            "168\tWILTON # SEXTON\t12/3/1982\tM\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tw_sexton@msv.org\n" +
            "169\tKATHY|KRAMER\t2/20/1989\tFemale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tkathy_kramer@yahoo.com\n" +
            "170\tLUPE *MAILLARD\t4/23/1981\tFemale\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tlupe_maillard@hotmail.com\n" +
            "171\tLEANNE *NIELSEN\t6/22/1982\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tl_nielsen@gmail.com\n" +
            "172\tSEYMOUR *GROVES\t5/2/1978\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tseymour.groves@rrg.net\n" +
            "173\tGLENNA # FELTON\t6/21/1964\tF\t2\tAdministrative Clerk\tProvides administrative support\tH\t $55.00 \tg_felton@hotmail.com\n" +
            "174\tLIN *PALAIA\t12/3/1961\tFemale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tlin.palaia@yahoo.com\n" +
            "175\tSHANELL *ORTIZ\t8/29/1962\tF\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tshanell_ortiz@jcl.net\n" +
            "176\tNICOLETTE # DAVISON\t5/17/1996\tFemale\t3\tHR Clerk\tProvides support to the HR Manager\tH\t $35.00 \tn_davison@ccf.org\n" +
            "177\tGREGORIA|RYDER\t9/21/1955\tFemales\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tgregoria.ryder@gmail.com\n" +
            "178\tKARRIE|TRUJILLO\t11/8/1990\tFemales\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tk_trujillo@hr.org\n" +
            "179\tSTACEY *SWITZER\t7/23/1955\tFemale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tstacey.switzer@hotmail.com\n" +
            "180\tKATHERYN # SPEER\t2/11/1976\tFemale\t7\tAssistant\tWorks  in any number of areas\tH\t $40.00 \tk_speer@gmail.com\n" +
            "181\tPRUDENCE *HACKETT\t9/30/1950\tFemale\t10\tVolunteer Coordinator\tCoordinates  recruitment and role allocation of volunteers\tYearly\t $90,000.00 \tp_hackett@@hotmail.com\n" +
            "182\tROSANNE *CORCORAN\t1/19/1977\tFemales\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \trosanne_corcoran@jcl.net\n" +
            "183\tROSALIE|STEM\t7/15/1985\tFemale\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \trosalie.stem@hotmail.com\n" +
            "184\tGEORGE # LYONS\t3/12/1984\tMale\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tgeorge_lyons@ffrs.gov\n" +
            "185\tJAYNE *HARMAN\t1/11/1982\tF\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tj_harman@yahoo.com\n" +
            "186\tMALLORY # WORRELL\t1/25/1992\tFemale\t23\tWorkforce Manager\tResponsible for coordinating the workforce at the venue\tYearly\t $130.00 \tm_worrell@hotmail.com\n" +
            "187\tCAMERON # NORMAN\t12/16/1974\tM\t7\tAssistant\tWorks  in any number of areas\tH\t $40.00 \tcameron.norman@yahoo.com\n" +
            "188\tBERNARD *CROSBY\t2/6/1977\tM\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tb_crosby@yahoo.com\n" +
            "189\tSHANELL *VILLALOBOS\t3/19/1960\tF\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \ts_villalobos@yahoo.com\n" +
            "190\tEVELYN *DEMESA\t6/8/1961\tF\t10\tVolunteer Coordinator\tCoordinates  recruitment and role allocation of volunteers\tY\t $90,000.00 \te_demesa@live.com\n" +
            "191\tTY *LABRECHE\t6/25/1966\tMale\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tt_labreche@hotmail.com\n" +
            "192\tBRANDEE # MEANS\t6/3/1962\tFemales\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tH\t $45.00 \tb_means@nnl.com\n" +
            "193\tLARISSA # COTTRELL\t8/10/1957\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tl_cottrell@gmail.com\n" +
            "194\tFRIEDA *BRAND\t4/28/1965\tF\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tfrieda_brand@hotmail.com\n" +
            "195\tDANI *GRIFFIN\t7/24/1994\tF\t14\tOperations Manager\tOversees all logistical aspects of bringing the marathon together\tYearly\t $110,000.00 \td_griffin@gmail.com\n" +
            "196\tLEE *DOW\t12/28/1960\tMale\t11\tSponsorship Coordinator\tIdentifies, develops and maintains effective relationships with all sponsors\tYearly\t $70,000.00 \tl_dow@yahoo.com\n" +
            "197\tMEAGAN|BRUCE\t3/20/1982\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tm_bruce@live.com\n" +
            "198\tJEANETTE *DOYLE\t10/14/1989\tFemale\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tjeanette_doyle@jcl.net\n" +
            "199\tANTHONY *SHAW\t6/27/1977\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tanthony.shaw@rrg.net\n" +
            "200\tROBYN # ROSA\t5/13/1984\tFemale\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tr_rosa@msv.org\n" +
            "201\tRANDI # CHAFFINS\t8/27/1979\tF\t4\tFinance Clerk\tProvides support to the Finance Manager\tH\t $62.00 \tr_chaffins@gmail.com\n" +
            "202\tMARJORIE *BLEDSOE\t7/13/1969\tF\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tm_bledsoe@gmail.com\n" +
            "203\tDALE *PEARSON\t11/1/1975\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \td_pearson@live.com\n" +
            "204\tPAULA|BROWER\t4/9/1960\tF\t9\tCEO\tChief Executive Officer\tYearly\t $75,000.00 \tpaula_brower@hotmail.com\n" +
            "205\tDEVIN *MEYERS\t7/1/1973\tMale\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \td_meyers@nnl.com\n" +
            "206\tCHANTEL *LINDSEY\t4/14/1972\tF\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tchantel_lindsey@ffrs.gov\n" +
            "207\tTOMAS|ABERNATHY\t11/18/1958\tM\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tt_abernathy@hr.org\n" +
            "208\tKRISTI # CROOK\t10/16/1972\tF\t2\tAdministrative Clerk\tProvides administrative support\tH\t $55.00 \tk_crook@hr.org\n" +
            "209\tRAMIRO # HIATT\t5/25/1952\tM\t7\tAssistant\tWorks  in any number of areas\tH\t $40.00 \tramiro.hiatt@@yahoo.com\n" +
            "210\tMARANDA *MEIER\t8/18/1952\tFemale\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tm_meier@@live.com\n" +
            "211\tHESTER *CARDENAS\t1/5/1975\tF\t8\tWorkforce Support\tProvides support to the Workforce Manager\tHourly\t $65.00 \th_cardenas@gmail.com\n" +
            "212\tJOESPH # LANKFORD\t3/6/1993\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tH\t $56.00 \tjoesph_lankford@hotmail.com\n" +
            "213\tBRANDY # MUELLER\t2/15/1972\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tH\t $56.00 \tb_mueller@hotmail.com\n" +
            "214\tMAUD *MORGAN\t10/19/1971\tF\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tm_morgan@gmail.com\n" +
            "215\tIDA|GUERRERO\t11/30/1989\tFemales\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \ti_guerrero@hr.org\n" +
            "216\tTOMASA # HANDY\t12/14/1956\tF\t1\tHelpdesk Advisor\tWorks on the helpdesk\tH\t $68.00 \tt_handy@hotmail.com\n" +
            "217\tDANNY *WILLARD\t11/26/1953\tM\t23\tWorkforce Manager\tResponsible for coordinating the workforce at the venue\tYearly\t $130.00 \td_willard@hotmail.com\n" +
            "218\tDEMETRA|DURHAM\t5/1/1998\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \td_durham@rnl.com\n" +
            "219\tSAUL # PYLE\t4/26/1998\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tH\t $62.00 \ts_pyle@fin.gov\n" +
            "220\tCECELIA *MCDONALD\t6/22/1968\tF\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tc_mcdonald@nnl.com\n" +
            "221\tJULES *BLACKMAN\t7/1/1979\tMale\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \tjules_blackman@hotmail.com\n" +
            "222\tDEBBY *NUGENT\t11/3/1958\tF\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \td_nugent@rnl.com\n" +
            "223\tMARTIN|JIMENEZ\t5/5/1994\tMale\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tm_jimenez@hotmail.com\n" +
            "224\tWARREN # PINTO\t10/16/1973\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tH\t $65.00 \twarren.pinto@rrg.net\n" +
            "225\tJUDI *NEWMAN\t3/15/1961\tF\t2\tAdministrative Clerk\tProvides administrative support\tHourly\t $55.00 \tj_newman@ccf.org\n" +
            "226\tBORIS *LEBLANC\t8/28/1977\tM\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tboris_leblanc@jcl.net\n" +
            "227\tGERTRUDE # ALFARO\t1/7/1972\tF\t19\tAdministrative Manager\tOversees the administrative functions of the organisation\tYearly\t $65,000.00 \tg_alfaro@rnl.com\n" +
            "228\tJONATHON|DELASANCHA\t6/17/1952\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tjonathon.delasancha@@rrg.net\n" +
            "229\tLIZABETH|HUMPHREY\t2/8/1998\tFemale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tl_humphrey@ccf.org\n" +
            "230\tKATHI *FULTON\t6/10/1977\tFemale\t1\tHelpdesk Advisor\tWorks on the helpdesk\tHourly\t $68.00 \tk_fulton@yahoo.com\n" +
            "231\tDENIS|BUCK\t6/5/1966\tM\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \td_buck@hotmail.com\n" +
            "232\tBRET # ACUFF\t1/26/1951\tM\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tH\t $56.00 \tb_acuff@@hotmail.com\n" +
            "233\tBEULAH # OSTOLAZA\t10/13/1955\tF\t7\tAssistant\tWorks  in any number of areas\tH\t $40.00 \tb_ostolaza@msv.org\n" +
            "234\tRODOLFO # MERCADO\t2/11/1954\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tr_mercado@yahoo.com\n" +
            "235\tLEONARDO # CONNER\t5/16/1998\tM\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tl_conner@live.com\n" +
            "236\tARTHUR *YUM\t3/26/1957\tM\t4\tFinance Clerk\tProvides support to the Finance Manager\tHourly\t $62.00 \ta_yum@yahoo.com\n" +
            "237\tMARSHALL # CHANG\t8/1/1984\tM\t8\tWorkforce Support\tProvides support to the Workforce Manager\tH\t $65.00 \tm_chang@gmail.com\n" +
            "238\tCHUN|RYAN\t3/2/1974\tFemale\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tc_ryan@yahoo.com\n" +
            "239\tJACK|GRUBB\t1/6/1973\tMale\t3\tHR Clerk\tProvides support to the HR Manager\tHourly\t $35.00 \tj_grubb@hr.org\n" +
            "240\tBLANCH *HARDING\t7/8/1987\tFemale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tb_harding@fin.gov\n" +
            "241\tANGEL # JERNIGAN\t1/20/1962\tFemale\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \ta_jernigan@ccf.org\n" +
            "242\tSTEPHAINE *FARRELL\t12/10/1978\tFemale\t23\tWorkforce Manager\tResponsible for coordinating the workforce at the venue\tY\t $130.00 \ts_farrell@yahoo.com\n" +
            "243\tELIJAH *SNOW\t1/7/1990\tM\t23\tWorkforce Manager\tResponsible for coordinating the workforce at the venue\tYearly\t $130.00 \te_snow@yahoo.com\n" +
            "244\tRORY *HENGEL\t5/22/1996\tM\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tr_hengel@hotmail.com\n" +
            "245\tJOSEFINA *CHRISTIAN\t1/16/1997\tF\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tjosefina.christian@yahoo.com\n" +
            "246\tJANNA *HILLS\t10/14/1995\tFemale\t5\tMarketing Assistant\tProvides support to the Marketing Manager\tHourly\t $56.00 \tjanna_hills@hotmail.com\n" +
            "247\tQUINCY # LAMBERT\t9/21/1977\tMale\t2\tAdministrative Clerk\tProvides administrative support\tH\t $55.00 \tquincy_lambert@hotmail.com\n" +
            "248\tJERRY # DARLING\t2/25/1980\tF\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \tj_darling@ccf.org\n" +
            "249\tSUSIE *CARDONA\t3/11/1986\tFemale\t7\tAssistant\tWorks  in any number of areas\tHourly\t $40.00 \tsusie_cardona@yahoo.com\n" +
            "250\tALEXANDRIA *SMALLS\t5/17/1980\tFemale\t6\tSocial Media Assistant\tProvides support to the Social Media Coordinator\tHourly\t $45.00 \talexandria.smalls@hotmail.com\n" +
            "251\tDESMOND *STONE\t3/28/1991\tM\t20\tHR Manager\tManages the recruitment, retention and development of staff\tY\t $70,000.00 \td_stone@gmail.com\n" +
            "TOTAL STAFF:\t251\t\t\t\t\t\t\t\t\n");
    }

    public static void main(String[] args) {

    launch(args);
    }
}
