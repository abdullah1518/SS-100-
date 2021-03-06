package sample;

import com.sun.org.apache.xpath.internal.operations.Variable;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import jdk.internal.dynalink.support.BottomGuardingDynamicLinker;
import  java.util.Collection.*;

import java.awt.*;
import java.beans.EventHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.Calendar.*;


public class Main extends Application {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver?allowprivateKeyRetrieval=true&useSSL=False";
    static final String DB_URL = "jdbc:mysql://localhost/cpt01?allowprivateKeyRetrieval=true&autoReconnect=true&useSSL=false";

    static final String USER = "root";
    static final String PASS = "mypass";

    String currentEmail;
    Stage primaryStage;

    @Override
    public void start(Stage baaalb) {
        primaryStage = baaalb;

        BorderPane root0 = new BorderPane();
        GridPane bpane = new GridPane();
        GridPane lpane = new GridPane();
        GridPane tpane = new GridPane();
        Scene scene0 = new Scene(root0, 400, 400);
        scene0.getStylesheets().add(getClass().getResource("styling.css").toString());

        Label copyRlbl = new Label("© Abdullah Binsheheween");
        Label titlelbl = new Label("Marathon skills 2019");
        titlelbl.setId("heading-font");

        Button btn0 = new Button("I want to be a runner");
        Button btn1 = new Button("I want to sponsor a runner");
        Button btn2 = new Button("I want to find out more");
        Button btn3 = new Button("Login");
        btn0.setPrefSize(300, 50);
        btn1.setPrefSize(300, 50);
        btn2.setPrefSize(300, 50);
        btn3.setPrefSize(150, 30);

        btn0.setOnAction(value -> {

            try {
                page1();
            } catch (Exception e) {
            }
        });

        btn1.setOnAction(value -> {
            sponsor_a_runner();
        });

        btn2.setOnAction(value -> {
            find_out_more();
        });

        btn3.setOnAction(value -> {
            loginpage();
        });


        bpane.setPadding(new Insets(10));
        bpane.setHgap(5);
        bpane.setVgap(5);
        bpane.setAlignment(Pos.CENTER);

        bpane.setId("mainpane");

        lpane.setPadding(new Insets(10));
        lpane.setHgap(5);
        lpane.setVgap(5);
        lpane.setAlignment(Pos.CENTER);

        lpane.setId("header-footer");

        tpane.setPadding(new Insets(10));
        tpane.setHgap(5);
        tpane.setVgap(5);
        tpane.setAlignment(Pos.CENTER);

        tpane.add(titlelbl, 0, 0);
        tpane.setId("header-footer");

        bpane.add(btn0, 0, 0);
        bpane.add(btn1, 0, 10);
        bpane.add(btn2, 0, 20);

        lpane.add(btn3, 20, 0);
        lpane.add(copyRlbl, 0, 0);
        root0.setTop(tpane);
        root0.setCenter(bpane);
        root0.setBottom(lpane);

        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setScene(scene0);
        primaryStage.setTitle("Marathon Skills");
        primaryStage.show();



    }


    private void page1() {

        BorderPane root1 = new BorderPane();
        GridPane bpane1 = new GridPane();
        GridPane lpane1 = new GridPane();
        GridPane hpane1 = new GridPane();
        Scene scene1 = new Scene(root1, 500, 500);
        scene1.getStylesheets().add(getClass().getResource("styling.css").toString());

        hpane1.setId("header-footer");
        lpane1.setId("header-footer");
        bpane1.setId("mainpane");

        Label titlelbl = new Label("Marathon skills 2019");
        titlelbl.setId("heading-font");

        Button btn0 = new Button("I have competed before");
        Button btn1 = new Button("I am a new competitor");
        Button lbtn = new Button("Login");
        Button bbtn = new Button("Back");

        btn0.setPrefSize(300, 50);
        btn1.setPrefSize(300, 50);
        lbtn.setPrefSize(150, 30);
        bbtn.setPrefSize(50, 30);

        btn0.setOnAction(value -> {
            loginpage();
        });
        btn1.setOnAction(value -> {
            register_runner();
        });
        lbtn.setOnAction(value -> {
            loginpage();
        });
        bbtn.setOnAction(value -> {
            try {
                start(primaryStage);
            } catch (Exception e) {
            }
        });


        hpane1.setPadding(new Insets(10));
        hpane1.setHgap(5);
        hpane1.setVgap(5);
        hpane1.setAlignment(Pos.CENTER_LEFT);

        bpane1.setPadding(new Insets(10));
        bpane1.setHgap(5);
        bpane1.setVgap(5);
        bpane1.setAlignment(Pos.CENTER);

        lpane1.setPadding(new Insets(10));
        lpane1.setHgap(5);
        lpane1.setVgap(5);
        lpane1.setAlignment(Pos.CENTER);

        hpane1.add(bbtn, 0, 0);
        hpane1.add(titlelbl, 12, 0);

        bpane1.add(btn0, 0, 0);
        bpane1.add(btn1, 0, 15);

        lpane1.add(lbtn, 50, 0);

        root1.setTop(hpane1);
        root1.setCenter(bpane1);
        root1.setBottom(lpane1);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Marathon Skills");
        primaryStage.show();

    }


    private void loginpage() {

        BorderPane root = new BorderPane();
        GridPane bpane = new GridPane();
        GridPane hpane = new GridPane();
        GridPane fpane = new GridPane();
        Scene scene = new Scene(root, 600, 600);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());

        hpane.setId("header-footer");
        fpane.setId("header-footer");
        bpane.setId("mainpane");

        Text text1 = new Text("E-mail");
        Text text2 = new Text("Password");
        TextField txtfield1 = new TextField("");
        TextField txtfield2 = new TextField("");
        Button btn1 = new Button("Log in");
        Button btn2 = new Button("Clear");
        Button bbtn = new Button("Back");

        txtfield1.setPrefSize(300, 0);
        txtfield2.setPrefSize(300, 0);
        btn1.setPrefSize(100, 0);
        btn2.setPrefSize(100, 0);

        btn1.setOnAction(value -> {
            String token = signin(txtfield1.getText(), txtfield2.getText());
            if (token.equals("R")) {
                runner_menu();
            }
            if (token.equals("C")) {
                coordinator_menu();
            }
            if (token.equals("A")) {
                admin_menu();
            }

        });

        btn2.setOnAction(value -> {
            txtfield1.setText("");
            txtfield2.setText("");
        });

        bbtn.setOnAction(value -> {
            try {
                start(primaryStage);
            } catch (Exception e) {
            }
        });


        bpane.setPadding(new Insets(10));
        bpane.setVgap(5);
        bpane.setHgap(5);
        bpane.setAlignment(Pos.CENTER);

        hpane.setPadding(new Insets(10));
        hpane.setVgap(5);
        hpane.setHgap(5);
        hpane.setAlignment(Pos.CENTER_LEFT);

        fpane.setPadding(new Insets(20));
        fpane.setVgap(10);
        fpane.setHgap(10);
        fpane.setAlignment(Pos.CENTER_LEFT);

        bpane.add(txtfield1, 0, 5);
        bpane.add(txtfield2, 0, 15);
        bpane.add(btn1, 0, 30);
        bpane.add(btn2, 1, 30);
        bpane.add(text2, 0, 10);
        bpane.add(text1, 0, 0);

        hpane.add(bbtn, 0, 0);


        root.setTop(hpane);
        root.setCenter(bpane);
        root.setBottom(fpane);

        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Marathon Skills");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    private void sponsor_a_runner() {
        //----------------panes and scene------------------------
        BorderPane root = new BorderPane();
        GridPane header = new GridPane();
        GridPane footer = new GridPane();
        GridPane main = new GridPane();
        GridPane maintop = new GridPane();
        GridPane mainbott = new GridPane();
        GridPane mainbottleft = new GridPane();
        GridPane mainbottright = new GridPane();

        Scene aaa = new Scene(root, 600, 600);
        aaa.getStylesheets().add(getClass().getResource("styling.css").toString());

        //--------------defining nodes---------------
        //buttons
        Button back = new Button("back");
        Button paynow = new Button("pay now");
        Button cancel = new Button("cancel");
        Button plus10 = new Button("+");
        Button minus10 = new Button("-");
        back.setFocusTraversable(false);
        //textfields
        TextField yourname = new TextField();
        ComboBox runner = new ComboBox();
        TextField cardname = new TextField();
        TextField cardnum = new TextField();
        TextField expiremonth = new TextField();
        TextField expireyear = new TextField();
        TextField cvc = new TextField();
        TextField payamount = new TextField();

        expiremonth.setPrefSize(50, 0);
        payamount.setPrefSize(50, 0);
        //labels
        Label titletxt = new Label("Marathon Skill 2019");
        Label headertxt = new Label("Sponsor a runner");
        Label countdowntxt = new Label("");
        Label body1txt = new Label("Please choose the runner you would like to sponsor and the amount you would like to sponsor them for. Thank you for your support of the runners and their charities");
        Label sponsdetailslabel = new Label("Sponsorship details");
        Label charitylabel = new Label("charity");
        Label charitynametxt = new Label("Runner's charity");
        Label amountlabel = new Label("Amount to donate");
        Label amountxtt = new Label("0");
        Label urnametxt = new Label("Your Name");
        Label runnername = new Label("Runner's name");
        Label cardnametxt = new Label("Name on Card");
        Label cardnumtxt = new Label("Card Number");
        Label expiretxt = new Label("Expiry Date");
        Label cvctxt = new Label("CVC");


        int numberOfRunners = 0;
        int x = 0;
        final String[] runnerId = new String[1];
        ResultSet runnerrs = sqlquery("select firstname, lastname from user");
        try {
            ResultSet runnersSet = sqlquery("SELECT user.Firstname, user.Lastname, runner.CountryCode, RegistrationEvent.BibNumber, Charity.CharityName, Charity.CharityDescription, Charity.CharityLogo, Registration.RunnerId FROM ((((user INNER JOIN runner ON runner.Email = user.Email) INNER JOIN Registration ON runner.RunnerId = Registration.RunnerId) INNER JOIN RegistrationEvent ON Registration.RegistrationId = RegistrationEvent.RegistrationId) INNER JOIN Charity ON Registration.CharityId = Charity.CharityId);");
            while (runnersSet.next()) numberOfRunners = runnersSet.getRow();
            runnersSet.beforeFirst();
            String[][] charityTable = new String[numberOfRunners][4];

            while (runnersSet.next()) {
                runner.getItems().addAll(
                        runnersSet.getString("LastName") + ", "
                                + runnersSet.getString("FirstName") + " - "
                                + runnersSet.getString("BibNumber") + " ("
                                + runnersSet.getString("CountryCode") + ")");
                charityTable[x][0] = runnersSet.getString("CharityName");
                charityTable[x][1] = runnersSet.getString("CharityDescription");
                charityTable[x][2] = runnersSet.getString("CharityLogo");
                charityTable[x][3] = runnersSet.getString("RunnerId");
                x++;
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }


        body1txt.setWrapText(true);
        body1txt.prefHeightProperty().bind(aaa.heightProperty());
        headertxt.setAlignment(Pos.CENTER);
        //styling nodes
        header.setId("header-footer");
        footer.setId("header-footer");
        titletxt.setId("heading-font");
        main.setId("mainpane");
        //------------------------pane properties--------------------------------
        GridPane[] panelist = {header, footer, main, mainbott, maintop, mainbottleft, mainbottright};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(3));
            pane.setVgap(5);
            pane.setHgap(5);
            pane.setAlignment(Pos.CENTER);
        }

        maintop.setPadding(new Insets(10));

        root.setTop(header);
        root.setCenter(main);
        root.setBottom(footer);

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
        mainbottleft.add(runnername, 0, 2);
        mainbottleft.add(cardnametxt, 0, 3);
        mainbottleft.add(cardnumtxt, 0, 4);
        mainbottleft.add(expiretxt, 0, 5);
        mainbottleft.add(cvctxt, 0, 6);
        mainbottleft.add(yourname, 1, 1);
        mainbottleft.add(runner, 1, 2);
        mainbottleft.add(cardname, 1, 3);
        mainbottleft.add(cardnum, 1, 4);
        mainbottleft.add(expireyear, 1, 5);
        mainbottleft.add(expiremonth, 2, 5);
        mainbottleft.add(cvc, 1, 6);

        mainbottright.add(charitylabel, 1, 0);
        mainbottright.add(charitynametxt, 1, 1);
        mainbottright.add(amountlabel, 1, 2);
        mainbottright.add(amountxtt, 1, 3);
        mainbottright.add(minus10, 0, 4);
        mainbottright.add(plus10, 2, 4);
        mainbottright.add(payamount, 1, 4);
        mainbottright.add(paynow, 1, 5);
        mainbottright.add(cancel, 1, 6);

        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(600);
        primaryStage.setTitle("Marathon Skills");
        primaryStage.setScene(aaa);
        primaryStage.show();
        //----------------------button actions---------------------------
        back.setOnAction(value -> {
            start(primaryStage);
        });
        plus10.setOnAction(value -> {
            Integer o;
            try {
                o = Integer.valueOf(payamount.getText()) + 10;
                payamount.setText(o.toString());
                amountxtt.setText(o.toString());
            } catch (NumberFormatException e) {
                payamount.setText("10");
            }
        });
        minus10.setOnAction(value -> {
            Integer o;
            try {
                o = Integer.valueOf(payamount.getText()) - 10;
                if (!(o < 0)) {
                    payamount.setText(o.toString());
                    amountxtt.setText(o.toString());
                }
            } catch (NumberFormatException e) {
                payamount.setText("0");
            }
        });
        paynow.setOnAction(value -> {
            if (!(runnername.getText().isEmpty()) &&
                    !(cardname.getText().isEmpty()) &&
                    cardnum.getText().length() == 16 &&
                    cvc.getText().length() == 3) {
                sponsor_thank(primaryStage, runnerId[0], payamount.getText());
            } else {
                System.out.println("Must fill all fields correctly");
            }
        });
    }


    private void sponsor_thank(Stage primaryStage, String amount, String runnerId) {
        BorderPane rootBorderPane = new BorderPane();
        Label thxLabel = new Label("Thank you for your sponsorship!");
        Label smolThxLabel = new Label("Thank you for sponsoring a runner in Marathon Skills 2019!\nYour donation will help out their chosen charity.");
        Label runnerInfoLabel = new Label("");
        Label charityNameLabel = new Label("");
        Label amountLabel = new Label(amount);
        Button backButton = new Button("Back");
        VBox centerBox = new VBox(thxLabel, smolThxLabel, runnerInfoLabel, charityNameLabel, amountLabel, backButton);
        ResultSet runnerInfo;

        //----------Proprieties----------
        rootBorderPane.setCenter(centerBox);

        try {
            runnerInfo = sqlquery("SELECT user.FirstName, user.LastName, RegistrationEvent.BibNumber, runner.CountryCode, charity.CharityName FROM ((((runner INNER JOIN user ON runner.Email = user.Email) INNER JOIN registration ON runner.RunnerId = registration.RunnerId) INNER JOIN charity ON registration.CharityId = charity.CharityId) INNER JOIN RegistrationEvent ON registration.RegistrationId = RegistrationEvent.RegistrationId) WHERE runner.RunnerId = " + runnerId);
            runnerInfo.next();
            System.out.println();
            charityNameLabel.setText(runnerInfo.getString("CharityName"));
            runnerInfoLabel.setText(runnerInfo.getString("FirstName") + " " + runnerInfo.getString("LastName") + " (" + runnerInfo.getString("BibNumber") + ") from " + runnerInfo.getString("CountryCode"));
        } catch (SQLException se) {
            se.printStackTrace();
        }

        backButton.setOnAction(value -> {
            start(primaryStage);
        });
        primaryStage.setScene(new Scene(rootBorderPane, 500, 500));
        primaryStage.show();
    }


    private void runner_menu() {
        //-------------------panes and scene--------------
        BorderPane root = new BorderPane();
        GridPane header = new GridPane();
        GridPane main = new GridPane();
        GridPane maintop = new GridPane();
        GridPane mainbot = new GridPane();
        GridPane footer = new GridPane();
        Scene scene = new Scene(root, 600, 600);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());


        Stage secondarystage = new Stage();
        GridPane popup = new GridPane();
        Scene scene2 = new Scene(popup, 400, 300);
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
        Label title = new Label("Marathon skills 2019");
        Label runner = new Label("Runner menu");
        Label timer = new Label("");
        Label contactinfolbl = new Label("For more information about marathon skills, please contact the coordinators using these contact details.\n\nphone: +55 11 9988 7766\n\nEmail: coordinators@marathonskills.org");

        contactinfolbl.setWrapText(true);
        contactinfolbl.prefHeightProperty().bind(scene2.heightProperty());
        //styling nodes
        header.setId("header-footer");
        footer.setId("header-footer");
        title.setId("heading-font");
        main.setId("mainpane");
        //------------------------pane properties--------------
        GridPane[] panelist = {header, footer, main, mainbot, maintop, popup};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }

        root.prefHeight(500);
        root.prefWidth(500);
        root.setTop(header);
        root.setCenter(main);
        root.setBottom(footer);

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

        popup.add(contactinfolbl, 0, 0);
        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Marathon Skills");
        primaryStage.setScene(scene);
        primaryStage.show();
        //----------------------------buttons-----------------------------
        back.setOnAction(value -> {
            start(primaryStage);
        });
        logout.setOnAction(value -> {
            loginpage();
        });
        contact_information.setOnAction(value -> {
            secondarystage.setTitle("Contact info");
            secondarystage.setScene(scene2);
            secondarystage.show();
        });
        edit.setOnAction(value -> {
            try {
                edit_runner();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        });
        myrace.setOnAction(value -> {
            try {
                my_race_results();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        });
        regis.setOnAction(value -> {
            try {
                register_event();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        });
    }


    private void coordinator_menu() {
        //-------------------panes and scene--------------
        BorderPane root = new BorderPane();
        GridPane header = new GridPane();
        GridPane main = new GridPane();
        GridPane maintop = new GridPane();
        GridPane mainbot = new GridPane();
        GridPane footer = new GridPane();
        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());

        //------------------node definitions-----------
        //buttons
        Button back = new Button("back");
        Button logout = new Button("logout");
        Button runners = new Button("Runners");
        Button sponsorship = new Button("Sponsorship");
        //labels
        Label titlelbl = new Label("Marathon skills 2019");
        Label headerlbl = new Label("Coordinator Menu");
        Label footerlbl = new Label("");
        //styling nodes
        header.setId("header-footer");
        footer.setId("header-footer");
        titlelbl.setId("heading-font");
        main.setId("mainpane");
        //------------------------pane properties--------------
        GridPane[] panelist = {header, footer, main, mainbot, maintop};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        footer.setAlignment(Pos.BOTTOM_CENTER);

        root.setTop(header);
        root.setCenter(main);
        root.setBottom(footer);

        main.add(maintop, 0, 0);
        main.add(mainbot, 0, 1);

        header.add(back, 0, 0);
        header.add(titlelbl, 5, 0);
        header.add(logout, 10, 0);

        maintop.add(headerlbl, 0, 0);

        mainbot.add(runners, 0, 0);
        mainbot.add(sponsorship, 1, 0);

        footer.add(footerlbl, 0, 0);

        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Marathon Skills");
        primaryStage.setScene(scene);
        primaryStage.show();
        //--------------button actions--------------
        back.setOnAction(value -> {
            start(primaryStage);
        });
        logout.setOnAction(value -> {
            loginpage();
        });
        runners.setOnAction(value -> {
            try {
                edit_runner_2();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        });
    }


    private void admin_menu() {
        //-------------------panes and scene--------------
        BorderPane root = new BorderPane();
        GridPane header = new GridPane();
        GridPane main = new GridPane();
        GridPane maintop = new GridPane();
        GridPane mainbot = new GridPane();
        GridPane footer = new GridPane();
        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());

        //------------------node definitions-----------
        //buttons
        Button back = new Button("back");
        Button logout = new Button("logout");
        Button users = new Button("Users");
        Button volunteers = new Button("Volunteers");
        Button charities = new Button("Charities");
        Button Inventory = new Button("Inventory");
        //labels
        Label titlelbl = new Label("Marathon skills 2019");
        Label headerlbl = new Label("Coordinator Menu");
        Label footerlbl = new Label("");
        //styling nodes
        header.setId("header-footer");
        footer.setId("header-footer");
        titlelbl.setId("heading-font");
        main.setId("mainpane");
        //------------------------pane properties--------------
        GridPane[] panelist = {header, footer, main, mainbot, maintop};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        root.setTop(header);
        root.setCenter(main);
        root.setBottom(footer);

        main.add(maintop, 0, 0);
        main.add(mainbot, 0, 2);

        header.add(back, 0, 0);
        header.add(titlelbl, 1, 0);
        header.add(logout, 2, 0);

        maintop.add(headerlbl, 0, 0);

        mainbot.add(users, 0, 0);
        mainbot.add(volunteers, 1, 0);
        mainbot.add(charities, 0, 1);
        mainbot.add(Inventory, 1, 1);

        footer.add(footerlbl, 0, 0);

        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Marathon Skills");
        primaryStage.setScene(scene);
        primaryStage.show();
        //--------------button actions--------------
        back.setOnAction(value -> {
            start(primaryStage);
        });
        logout.setOnAction(value -> {
            loginpage();
        });
        users.setOnAction(value -> {
            try {
                edit_runner_2();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        });
    }


    private void register_runner() {
        //-------------------panes and scene--------------
        BorderPane root = new BorderPane();
        GridPane header = new GridPane();
        GridPane main = new GridPane();
        GridPane maintop = new GridPane();
        GridPane mainmid = new GridPane();
        GridPane mainmidright = new GridPane();
        GridPane mainmidleft = new GridPane();
        GridPane mainbot = new GridPane();
        GridPane footer = new GridPane();

        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());
        //------------------node definitions-----------
        //buttons
        Button back = new Button("Back");
        Button register = new Button("Register");
        Button cancel = new Button("cancel");
        //textfields
        TextField email = new TextField();
        TextField password = new TextField();
        TextField passwordcheck = new TextField();
        TextField firstname = new TextField();
        TextField lastname = new TextField();
        TextField dateofbirth = new TextField("yyyy-mm-dd");
        //dropdownlist
        ComboBox gender = new ComboBox();
        ComboBox country = new ComboBox();

        //fetching gender and country form database and  inserting into combo box
        ResultSet genderrs = sqlquery("select gender from gender");
        try {
            while (genderrs.next()) {
                gender.getItems().addAll(genderrs.getString("gender"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }

        ResultSet countryrs = sqlquery("select countryname from country");
        try {
            while (countryrs.next()) {
                country.getItems().addAll(countryrs.getString("countryname"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        //labels

        Label titlelbl = new Label("Marathon skills 2019");
        Label maintop1 = new Label("Register as a runner");
        Label maintop2 = new Label("Please fill out all of the following information to be registered as a runner");
        Label footerlbl = new Label("");
        Label emaillbl = new Label("Email");
        Label passwordlbl = new Label("Password");
        Label passwordchecklbl = new Label("Re-type Password");
        Label firstnamelbl = new Label("First Name");
        Label lastnamelbl = new Label("Last Name");
        Label genderlbl = new Label("Gender");
        Label countrylbl = new Label("Country");
        Label dateofbirthlbl = new Label("Date of Birth");

        //Styling nodes
        header.setId("header-footer");
        footer.setId("header-footer");
        titlelbl.setId("heading-font");
        main.setId("mainpane");
        //------------------------pane properties--------------
        GridPane[] panelist = {header, main, mainbot, mainmid, maintop, footer, mainmidright, mainmidleft};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(5);
            pane.setHgap(5);
            pane.setAlignment(Pos.CENTER);
        }
        root.setTop(header);
        root.setCenter(main);
        root.setBottom(footer);

        main.add(maintop, 0, 0);
        main.add(mainmid, 0, 1);
        main.add(mainbot, 0, 2);

        maintop.add(maintop1, 0, 0);
        maintop.add(maintop2, 0, 1);

        mainmid.add(mainmidright, 1, 0);
        mainmid.add(mainmidleft, 0, 0);

        mainmidleft.add(emaillbl, 0, 0);
        mainmidleft.add(email, 1, 0);
        mainmidleft.add(password, 1, 1);
        mainmidleft.add(passwordlbl, 0, 1);
        mainmidleft.add(passwordcheck, 1, 2);
        mainmidleft.add(passwordchecklbl, 0, 2);
        mainmidleft.add(firstname, 1, 3);
        mainmidleft.add(firstnamelbl, 0, 3);
        mainmidleft.add(lastname, 1, 4);
        mainmidleft.add(lastnamelbl, 0, 4);

        mainmidright.add(genderlbl, 0, 0);
        mainmidright.add(gender, 1, 0);
        mainmidright.add(dateofbirthlbl, 0, 1);
        mainmidright.add(dateofbirth, 1, 1);
        mainmidright.add(countrylbl, 0, 2);
        mainmidright.add(country, 1, 2);

        mainbot.add(register, 0, 0);
        mainbot.add(cancel, 1, 0);

        footer.add(footerlbl, 0, 0);

        header.add(titlelbl, 0, 0);

        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Marathon Skills");
        primaryStage.setScene(scene);
        primaryStage.show();
        //--------------button actions--------------
        register.setOnAction(value -> {
            String[] dobValues = dateofbirth.getText().split("-");
            boolean emailbool = false;
            boolean passwordbool = false;
            boolean birthbool = false;
            boolean fieldsbool = false;
            if (email.getText().matches("\\S+@\\S+\\.com")) {
                emailbool = true;
            } else {
                System.out.println("email is incorrect");
                Stage secondarystage = new Stage();
                GridPane popup = new GridPane();
                popup.setAlignment(Pos.CENTER);
                Scene scene2 = new Scene(popup, 400, 300);
                Label errorlabel = new Label("email is incorrect");
                errorlabel.setFont(Font.font("Open Sans", 30));
                popup.add(errorlabel, 0, 0);
                secondarystage.setScene(scene2);
                secondarystage.setTitle("Error");
                secondarystage.show();
            }
            if (
                    password.getText().length() >= 6
                            && password.getText().matches(".*[!@#$%^]+.*")
                            && password.getText().matches(".*[A-Z]+.*")
                            && password.getText().matches(".*\\d+.*")
                            && password.getText().equals(passwordcheck.getText())
            ) {
                passwordbool = true;
            } else {
                System.out.println("password is incorrect");
                Stage secondarystage = new Stage();
                GridPane popup = new GridPane();
                popup.setAlignment(Pos.CENTER);
                Scene scene2 = new Scene(popup, 400, 300);
                Label errorlabel = new Label("password is incorrect");
                errorlabel.setFont(Font.font("Open Sans", 30));
                popup.add(errorlabel, 0, 0);
                secondarystage.setScene(scene2);
                secondarystage.setTitle("Error");
                secondarystage.show();
            }
            if (
                    email.getText().matches(".*\\S+.*")
                            && password.getText().matches(".*\\S+.*")
                            && passwordcheck.getText().matches(".*\\S+.*")
                            && firstname.getText().matches(".*\\S+.*")
                            && lastname.getText().matches(".*\\S+.*")
                            && country.getSelectionModel().getSelectedItem().toString().matches(".*\\S+.*")
                            && gender.getSelectionModel().getSelectedItem().toString().matches(".*\\S+.*")
            ) {
                fieldsbool = true;

            } else {
                System.out.println("All fields must be filled");
                Stage secondarystage = new Stage();
                GridPane popup = new GridPane();
                popup.setAlignment(Pos.CENTER);
                Scene scene2 = new Scene(popup, 400, 300);
                Label errorlabel = new Label("All fields must be filled");
                errorlabel.setFont(Font.font("Open Sans", 30));
                popup.add(errorlabel, 0, 0);
                secondarystage.setScene(scene2);
                secondarystage.setTitle("Error");
                secondarystage.show();
            }
            if (fieldsbool && passwordbool && emailbool) {
                System.out.println("Runner created");
                sqlinsert("INSERT INTO User VALUES ('" + email.getText() + "','" + password.getText() + "','" + firstname.getText() + "','" + lastname.getText() + "','R');");
                sqlinsert("INSERT INTO Runner (Email,Gender,DateOfBirth,CountryCode) VALUES ('" + email.getText() + "','" + gender.getSelectionModel().getSelectedItem().toString() + "','" + dobValues[0] + "-" + dobValues[1] + "-" + dobValues[2] + "', (SELECT CountryCode FROM Country WHERE CountryName = '" + country.getSelectionModel().getSelectedItem().toString() + "'));");
                try {
                    register_event();
                } catch (SQLException se) {
                    se.printStackTrace();
                    Stage secondarystage = new Stage();
                    GridPane popup = new GridPane();
                    popup.setAlignment(Pos.CENTER);
                    Scene scene2 = new Scene(popup, 400, 300);
                    Label errorlabel = new Label(se.toString());
                    errorlabel.setFont(Font.font("Open Sans", 30));
                    popup.add(errorlabel, 0, 0);
                    secondarystage.setScene(scene2);
                    secondarystage.setTitle("Error");
                    secondarystage.show();
                }
            }
        });
        cancel.setOnAction(value -> {
            start(primaryStage);
        });
        //----------testing--------
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar birthd = new GregorianCalendar(2001, 12, 1);
        birthd.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("Date : " + sdf.format(birthd.getTime()));*/

    }


    private void register_event() throws SQLException {
        BorderPane rootBorderPane = new BorderPane();
        Label countdownLabel = new Label("");
        Label titleLabel = new Label("Marathon Skills 2019");
        Button backButton = new Button("Back");
        HBox topBox = new HBox(backButton, titleLabel);
        HBox bottomBox = new HBox(countdownLabel);
        Label headerLabel = new Label("Register for an event");
        Label descLabel = new Label("Please fill out all of the following information to register for events");
        Label eventsLabel = new Label("Competition events");
        ScrollPane eventsScrollPane = new ScrollPane();
        VBox topLeftBox = new VBox(eventsLabel, eventsScrollPane);
        VBox checkBoxesBox = new VBox();
        int numOfEvents = 0;
        final int[] finalAmount = {0};
        final int[] numOfSelectedMarathons = {0};

        //--------top-left-----------
        ResultSet eventsRS = sqlquery("SELECT * FROM Event;");
        while (eventsRS.next()) numOfEvents++;
        eventsRS.beforeFirst();
        CheckBox[] eventsCheckBoxes = new CheckBox[numOfEvents];

        int eventId = 0;
        while (eventsRS.next()) {
            CheckBox event = new CheckBox(eventsRS.getString("EventName") + " ($" + eventsRS.getString("Cost") + ")");
            checkBoxesBox.getChildren().add(event);
            eventsCheckBoxes[eventId] = event;
            eventId++;
        }
        checkBoxesBox.setSpacing(5);
        eventsLabel.setFont(Font.font(18));

        //--------bottom-left--------
        ResultSet charitiesRS = sqlquery("SELECT * FROM Charity;");
        Label sponsorTitleLabel = new Label("Sponsorship details");
        Label charityLabel = new Label("Charity:");
        ComboBox charities = new ComboBox();
        Label amountToRaiseLabel = new Label("Target to raise");
        TextField amountTextField = new TextField("0");
        VBox labelsBox = new VBox(charityLabel, amountToRaiseLabel);
        VBox fieldBox = new VBox(charities, amountTextField);
        Button registerButton = new Button("Register");
        Button cancelButton = new Button("Cancel");
        HBox buttonsBox = new HBox(registerButton, cancelButton);
        HBox labelFieldBox = new HBox(labelsBox, fieldBox);
        VBox bottomLeftBox = new VBox(sponsorTitleLabel, labelFieldBox, buttonsBox);

        while (charitiesRS.next()) {
            charities.getItems().add(charitiesRS.getString("CharityName"));
        }
        sponsorTitleLabel.setFont(Font.font(18));
        fieldBox.setSpacing(10);
        labelsBox.setSpacing(20);
        buttonsBox.setSpacing(20);
        //--------top-left-----------
        ResultSet optionsRS = sqlquery("SELECT * FROM RaceKitOption;");
        Label raceKitTitle = new Label("Race kit options");
        ToggleGroup options = new ToggleGroup();
        VBox topRightBox = new VBox(raceKitTitle);

        while (optionsRS.next()) {
            RadioButton option = new RadioButton("Option " + optionsRS.getString("RaceKitOptionId") + " ($" + optionsRS.getString("Cost") + "): " + optionsRS.getString("RaceKitOption"));
            option.setToggleGroup(options);
            topRightBox.getChildren().add(option);
            if (optionsRS.getRow() == 1) {
                options.selectToggle(option);
            }
        }

        raceKitTitle.setFont(Font.font(18));
        //--------bottom-right-------
        Label registrationTitle = new Label("Registration cost");
        Label amountLabel = new Label("$0");
        VBox bottomRightBox = new VBox(registrationTitle, amountLabel);

        HBox topBoxes = new HBox(topLeftBox, topRightBox);
        HBox bottomBoxes = new HBox(bottomLeftBox, bottomRightBox);
        VBox mainBox = new VBox(headerLabel, descLabel, topBoxes, bottomBoxes);
        registrationTitle.setFont(Font.font(18));
        //--------Proprieties--------
        topBox.setId("header-footer");
        bottomBox.setId("header-footer");
        titleLabel.setId("heading-font");
        bottomBox.setPadding(new Insets(15));
        topBox.setPadding(new Insets(20));
        topLeftBox.setPadding(new Insets(50, 50, 10, 50));
        topRightBox.setPadding(new Insets(50, 50, 10, 50));
        bottomLeftBox.setPadding(new Insets(10, 50, 0, 50));
        bottomRightBox.setPadding(new Insets(10, 50, 0, 50));
        mainBox.setPadding(new Insets(20));

        topLeftBox.setSpacing(15);
        topRightBox.setSpacing(15);
        bottomLeftBox.setSpacing(15);
        bottomRightBox.setSpacing(15);
        topBox.setSpacing(20);
        bottomBox.setAlignment(Pos.TOP_CENTER);
        topLeftBox.setAlignment(Pos.TOP_CENTER);
        bottomLeftBox.setAlignment(Pos.TOP_CENTER);
        bottomRightBox.setAlignment(Pos.TOP_CENTER);
        topBoxes.setAlignment(Pos.TOP_CENTER);
        bottomBoxes.setAlignment(Pos.TOP_CENTER);
        mainBox.setAlignment(Pos.CENTER);
        eventsScrollPane.minWidth(300);
        eventsScrollPane.setContent(checkBoxesBox);
        rootBorderPane.setTop(topBox);
        rootBorderPane.setBottom(bottomBox);
        rootBorderPane.setCenter(mainBox);
        headerLabel.setFont(Font.font(24));
        headerLabel.setFont(Font.font(18));


//        for (int v = 0; v<eventsCheckBoxes.length;v++){
//            RotateTransition rt = new RotateTransition(Duration.millis(100), eventsCheckBoxes[v]);
//            rt.setByAngle(360);
//            rt.setCycleCount(1000);
//            rt.setAutoReverse(true);
//            rt.play();
//        }

        backButton.setOnAction(value -> {
            runner_menu();
        });
        cancelButton.setOnAction(value -> {
            start(primaryStage);
        });
        checkBoxesBox.setOnMouseMoved(value -> {
            if (amountTextField.getText().equals("")) amountTextField.setText("0");
            finalAmount[0] = 0;
            numOfSelectedMarathons[0] = 0;
            for (int v = 0; v < eventsCheckBoxes.length; v++) {
                if (eventsCheckBoxes[v].isSelected()) {
                    float marathonCost = Float.parseFloat(eventsCheckBoxes[v].getText().substring(eventsCheckBoxes[v].getText().indexOf("$") + 1, eventsCheckBoxes[v].getText().indexOf(")")));
                    finalAmount[0] += marathonCost;
                    numOfSelectedMarathons[0]++;
                }
            }
            float optionCost = Float.parseFloat(options.getSelectedToggle().toString().substring(options.getSelectedToggle().toString().indexOf("$") + 1, options.getSelectedToggle().toString().indexOf(")")));
            finalAmount[0] += optionCost * numOfSelectedMarathons[0];
            finalAmount[0] += Integer.parseInt(amountTextField.getText());
            amountLabel.setText("$" + finalAmount[0]);
        });
        amountTextField.setOnKeyReleased(value -> {
            if (!amountTextField.getText().equals("")) {
                finalAmount[0] = 0;
                numOfSelectedMarathons[0] = 0;
                for (int v = 0; v < eventsCheckBoxes.length; v++) {
                    if (eventsCheckBoxes[v].isSelected()) {
                        float marathonCost = Float.parseFloat(eventsCheckBoxes[v].getText().substring(eventsCheckBoxes[v].getText().indexOf("$") + 1, eventsCheckBoxes[v].getText().indexOf(")")));
                        finalAmount[0] += marathonCost;
                        numOfSelectedMarathons[0]++;
                    }
                }
                float optionCost = Float.parseFloat(options.getSelectedToggle().toString().substring(options.getSelectedToggle().toString().indexOf("$") + 1, options.getSelectedToggle().toString().indexOf(")")));
                finalAmount[0] += optionCost * numOfSelectedMarathons[0];
                finalAmount[0] += Integer.parseInt(amountTextField.getText());
                amountLabel.setText("$" + finalAmount[0]);
            }
        });
        registerButton.setOnAction(value -> {
            if (numOfSelectedMarathons[0] != 0) {
                thank_you_runner();
            }
        });
        Scene scene = new Scene(rootBorderPane, 600, 600);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void edit_runner() throws SQLException {
        BorderPane rootBorderPane = new BorderPane();
        Label countdownLabel = new Label("");
        Label titleLabel = new Label("Marathon Skills 2019");
        Button backButton = new Button("Back");
        HBox topBox = new HBox(backButton, titleLabel);
        HBox bottomBox = new HBox(countdownLabel);
        Label headerLabel = new Label("Edit your profile");
        Label emailLabel = new Label("Email : ");
        Label firstNameLabel = new Label("First Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label genderLabel = new Label("Gender:");
        Label dobLabel = new Label("Date of Birth:");
        Label countryLabel = new Label("Country:");
        Label emailBoldLabel = new Label(currentEmail);
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        ComboBox genderCombo = new ComboBox();
        TextField dobField = new TextField("YYYY-MM-DD");
        ComboBox countryCombo = new ComboBox();
        VBox leftLabelsBox = new VBox(emailLabel, firstNameLabel, lastNameLabel, genderLabel, dobLabel, countryLabel);
        VBox leftFieldsBox = new VBox(emailBoldLabel, firstNameField, lastNameField, genderCombo, dobField, countryCombo);
        HBox leftSide = new HBox(leftLabelsBox, leftFieldsBox);
        Label changePwLabel = new Label("Change password");
        Label pwDescLabel = new Label("Leave these fields blank if you do not\n want to change the password.");
        Label pwLabel = new Label("Password: ");
        Label pw2Label = new Label("Password Again: ");
        TextField pwField = new TextField();
        TextField pw2Field = new TextField();
        VBox rightLabelsBox = new VBox(pwLabel, pw2Label);
        VBox rightFieldsBox = new VBox(pwField, pw2Field);
        HBox rightElements = new HBox(rightLabelsBox, rightFieldsBox);
        VBox rightSide = new VBox(changePwLabel, pwDescLabel, rightElements);
        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");
        HBox buttonsBox = new HBox(saveButton, cancelButton);
        HBox midBox = new HBox(leftSide, rightSide);
        VBox mainBox = new VBox(headerLabel, midBox, buttonsBox);


        //--------Proprieties--------
        topBox.setId("header-footer");
        bottomBox.setId("header-footer");
        titleLabel.setId("heading-font");
        headerLabel.setFont(Font.font(18));
        changePwLabel.setFont(Font.font(16));
        pwDescLabel.setFont(Font.font(14));
        emailBoldLabel.setFont(Font.font(null, FontWeight.BOLD, 12));
        bottomBox.setPadding(new Insets(15));
        topBox.setPadding(new Insets(20));
        mainBox.setPadding(new Insets(50));
        midBox.setSpacing(100);
        topBox.setSpacing(20);
        mainBox.setSpacing(40);
        rightSide.setSpacing(20);
        leftSide.setSpacing(20);
        buttonsBox.setSpacing(20);
        rightElements.setSpacing(20);
        leftFieldsBox.setSpacing(8);
        leftLabelsBox.setSpacing(15);
        rightFieldsBox.setSpacing(9);
        rightLabelsBox.setSpacing(15);
        bottomBox.setAlignment(Pos.CENTER);
        mainBox.setAlignment(Pos.TOP_CENTER);
        midBox.setAlignment(Pos.CENTER);
        buttonsBox.setAlignment(Pos.CENTER);
        rightSide.setAlignment(Pos.CENTER);
        rootBorderPane.setTop(topBox);
        rootBorderPane.setBottom(bottomBox);
        rootBorderPane.setCenter(mainBox);

        //---------sql-data-------------
        ResultSet genders = sqlquery("SELECT * FROM Gender;");
        while (genders.next()) genderCombo.getItems().add(genders.getString("Gender"));

        ResultSet countries = sqlquery("SELECT CountryName FROM Country;");
        while (countries.next()) countryCombo.getItems().add(countries.getString("CountryName"));

        saveButton.setOnAction(value -> {
            String pw = pwField.getText();
            Calendar now = Calendar.getInstance();
            Calendar dob = Calendar.getInstance();
            now.setTimeInMillis(System.currentTimeMillis());

            String[] dobValues = dobField.getText().split("-");
            //dob.set(Integer.parseInt(dobValues[0]) + 10, Integer.parseInt(dobValues[1]), Integer.parseInt(dobValues[2]));
            if (dobValues[1].length() == 1) {
                dobValues[1] = "0" + dobValues[1];
            }
            if (dobValues[2].length() == 1) {
                dobValues[2] = "0" + dobValues[2];
            }

            boolean pwRequirements =
                    (pw.contains("!") || pw.contains("@") || pw.contains("#") || pw.contains("$") || pw.contains("%") || pw.contains("^")) &&
                            (!pw.toLowerCase().equals(pw) && !pw.toUpperCase().equals(pw)) &&
                            (pw.contains("1") || pw.contains("2") || pw.contains("3") || pw.contains("4") || pw.contains("5") || pw.contains("6") || pw.contains("7") || pw.contains("8") || pw.contains("9") || pw.contains("0")) &&
                            (pw.length() >= 6);
            System.out.println(pwRequirements);
            if (pwField.getText().equals(pw2Field.getText()) &&
                    pwRequirements &&
                    !firstNameField.getText().equals("") &&
                    !lastNameField.getText().equals("") &&
                    !genderCombo.getSelectionModel().isEmpty() &&
                    !countryCombo.getSelectionModel().isEmpty() &&
                    dob.before(now)) {
                sqlinsert("UPDATE user SET Password = '" + pw + "' , FirstName = '" + firstNameField.getText() + "' , LastName = '" + lastNameField.getText() + "' WHERE Email = '" + currentEmail + "';");
                sqlinsert("UPDATE runner SET Gender = '" + genderCombo.getSelectionModel().getSelectedItem().toString() + "' , DateOfBirth = '" + dobValues[0] + "-" + dobValues[1] + "-" + dobValues[2] + "', CountryCode = (SELECT CountryCode FROM Country WHERE CountryName = '" + countryCombo.getSelectionModel().getSelectedItem().toString() + "') WHERE Email = '" + currentEmail + "'");
            } else if (pwField.getText().equals(pw2Field.getText()) &&
                    pwField.getText().equals("") &&
                    !firstNameField.getText().equals("") &&
                    !lastNameField.getText().equals("") &&
                    !genderCombo.getSelectionModel().isEmpty() &&
                    !countryCombo.getSelectionModel().isEmpty() &&
                    dob.before(now)) {
                sqlinsert("UPDATE user SET FirstName = '" + firstNameField.getText() + "' , LastName = '" + lastNameField.getText() + "' WHERE Email = '" + currentEmail + "';");
                sqlinsert("UPDATE runner SET Gender = '" + genderCombo.getSelectionModel().getSelectedItem().toString() + "' , DateOfBirth = '" + dobValues[0] + "-" + dobValues[1] + "-" + dobValues[2] + "', CountryCode = (SELECT CountryCode FROM Country WHERE CountryName = '" + countryCombo.getSelectionModel().getSelectedItem().toString() + "') WHERE Email = '" + currentEmail + "'");
            }

        });

        cancelButton.setOnAction(value -> {
            runner_menu();
        });
        backButton.setOnAction(value -> {
            start(primaryStage);
        });

        Scene scene = new Scene(rootBorderPane, 600, 600);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void edit_runner_2() throws SQLException {
        BorderPane rootBorderPane = new BorderPane();
        Label countdownLabel = new Label("");
        Label titleLabel = new Label("Marathon Skills 2019");
        Button backButton = new Button("Back");
        HBox topBox = new HBox(backButton, titleLabel);
        HBox bottomBox = new HBox(countdownLabel);
        Label headerLabel = new Label("Edit a profile");
        Label emailLabel = new Label("Email : ");
        Label firstNameLabel = new Label("First Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label genderLabel = new Label("Gender:");
        Label dobLabel = new Label("Date of Birth:");
        Label countryLabel = new Label("Country:");
        TextField emailBoldLabel = new TextField("enter runners email");
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        ComboBox genderCombo = new ComboBox();
        TextField dobField = new TextField("YYYY-MM-DD");
        ComboBox countryCombo = new ComboBox();
        VBox leftLabelsBox = new VBox(emailLabel, firstNameLabel, lastNameLabel, genderLabel, dobLabel, countryLabel);
        VBox leftFieldsBox = new VBox(emailBoldLabel, firstNameField, lastNameField, genderCombo, dobField, countryCombo);
        HBox leftSide = new HBox(leftLabelsBox, leftFieldsBox);
        Label changePwLabel = new Label("Change password");
        Label pwDescLabel = new Label("Leave these fields blank if you do not\n want to change the password.");
        Label pwLabel = new Label("Password: ");
        Label pw2Label = new Label("Password Again: ");
        TextField pwField = new TextField();
        TextField pw2Field = new TextField();
        VBox rightLabelsBox = new VBox(pwLabel, pw2Label);
        VBox rightFieldsBox = new VBox(pwField, pw2Field);
        HBox rightElements = new HBox(rightLabelsBox, rightFieldsBox);
        VBox rightSide = new VBox(changePwLabel, pwDescLabel, rightElements);
        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");
        HBox buttonsBox = new HBox(saveButton, cancelButton);
        HBox midBox = new HBox(leftSide, rightSide);
        VBox mainBox = new VBox(headerLabel, midBox, buttonsBox);


        //--------Proprieties--------
        topBox.setId("header-footer");
        bottomBox.setId("header-footer");
        titleLabel.setId("heading-font");
        headerLabel.setFont(Font.font(18));
        changePwLabel.setFont(Font.font(16));
        pwDescLabel.setFont(Font.font(14));
        emailBoldLabel.setFont(Font.font(null, FontWeight.BOLD, 12));
        bottomBox.setPadding(new Insets(15));
        topBox.setPadding(new Insets(20));
        mainBox.setPadding(new Insets(50));
        midBox.setSpacing(100);
        topBox.setSpacing(20);
        mainBox.setSpacing(40);
        rightSide.setSpacing(20);
        leftSide.setSpacing(20);
        buttonsBox.setSpacing(20);
        rightElements.setSpacing(20);
        leftFieldsBox.setSpacing(8);
        leftLabelsBox.setSpacing(15);
        rightFieldsBox.setSpacing(9);
        rightLabelsBox.setSpacing(15);
        bottomBox.setAlignment(Pos.CENTER);
        mainBox.setAlignment(Pos.TOP_CENTER);
        midBox.setAlignment(Pos.CENTER);
        buttonsBox.setAlignment(Pos.CENTER);
        rightSide.setAlignment(Pos.CENTER);
        rootBorderPane.setTop(topBox);
        rootBorderPane.setBottom(bottomBox);
        rootBorderPane.setCenter(mainBox);

        //---------sql-data-------------
        ResultSet genders = sqlquery("SELECT * FROM Gender;");
        while (genders.next()) genderCombo.getItems().add(genders.getString("Gender"));

        ResultSet countries = sqlquery("SELECT CountryName FROM Country;");
        while (countries.next()) countryCombo.getItems().add(countries.getString("CountryName"));

        saveButton.setOnAction(value -> {
            String pw = pwField.getText();
            Calendar now = Calendar.getInstance();
            Calendar dob = Calendar.getInstance();
            now.setTimeInMillis(System.currentTimeMillis());

            String[] dobValues = dobField.getText().split("-");
            dob.set(Integer.parseInt(dobValues[0]) + 10, Integer.parseInt(dobValues[1]), Integer.parseInt(dobValues[2]));
            if (dobValues[1].length() == 1) {
                dobValues[1] = "0" + dobValues[1];
            }
            if (dobValues[2].length() == 1) {
                dobValues[2] = "0" + dobValues[2];
            }

            boolean pwRequirements =
                    (pw.contains("!") || pw.contains("@") || pw.contains("#") || pw.contains("$") || pw.contains("%") || pw.contains("^")) &&
                            (!pw.toLowerCase().equals(pw) && !pw.toUpperCase().equals(pw)) &&
                            (pw.contains("1") || pw.contains("2") || pw.contains("3") || pw.contains("4") || pw.contains("5") || pw.contains("6") || pw.contains("7") || pw.contains("8") || pw.contains("9") || pw.contains("0")) &&
                            (pw.length() >= 6);
            System.out.println(pwRequirements);
            if (pwField.getText().equals(pw2Field.getText()) &&
                    pwRequirements &&
                    !firstNameField.getText().equals("") &&
                    !lastNameField.getText().equals("") &&
                    !genderCombo.getSelectionModel().isEmpty() &&
                    !countryCombo.getSelectionModel().isEmpty() &&
                    dob.before(now)) {
                sqlinsert("UPDATE user SET Password = '" + pw + "' , FirstName = '" + firstNameField.getText() + "' , LastName = '" + lastNameField.getText() + "' WHERE Email = '" + emailBoldLabel + "';");
                sqlinsert("UPDATE runner SET Gender = '" + genderCombo.getSelectionModel().getSelectedItem().toString() + "' , DateOfBirth = '" + dobValues[0] + "-" + dobValues[1] + "-" + dobValues[2] + "', CountryCode = (SELECT CountryCode FROM Country WHERE CountryName = '" + countryCombo.getSelectionModel().getSelectedItem().toString() + "') WHERE Email = '" + emailBoldLabel + "'");
            } else if (pwField.getText().equals(pw2Field.getText()) &&
                    pwField.getText().equals("") &&
                    !firstNameField.getText().equals("") &&
                    !lastNameField.getText().equals("") &&
                    !genderCombo.getSelectionModel().isEmpty() &&
                    !countryCombo.getSelectionModel().isEmpty() &&
                    dob.before(now)) {
                sqlinsert("UPDATE user SET FirstName = '" + firstNameField.getText() + "' , LastName = '" + lastNameField.getText() + "' WHERE Email = '" + emailBoldLabel + "';");
                sqlinsert("UPDATE runner SET Gender = '" + genderCombo.getSelectionModel().getSelectedItem().toString() + "' , DateOfBirth = '" + dobValues[0] + "-" + dobValues[1] + "-" + dobValues[2] + "', CountryCode = (SELECT CountryCode FROM Country WHERE CountryName = '" + countryCombo.getSelectionModel().getSelectedItem().toString() + "') WHERE Email = '" + emailBoldLabel + "'");
            }

        });

        cancelButton.setOnAction(value -> {
            runner_menu();
        });
        backButton.setOnAction(value -> {
            start(primaryStage);
        });

        Scene scene = new Scene(rootBorderPane, 600, 600);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void my_race_results() throws SQLException {
        BorderPane rootBorderPane = new BorderPane();
        Label countdownLabel = new Label("");
        Label titleLabel = new Label("Marathon Skills 2019");
        Button backButton = new Button("Back");
        Button viewAllButton = new Button("View all race results");
        HBox topBox = new HBox(backButton, titleLabel);
        HBox bottomBox = new HBox(countdownLabel);
        Label headerLabel = new Label("My race results");
        Text descText = new Text("This is a list of all your past race results");
        Label genderLabel = new Label("Gender: ");
        Label runnerGenderLabel = new Label("");
        Label ageLabel = new Label("Age category: ");
        Label runnerAgeLabel = new Label("");
        HBox labelsBox = new HBox(genderLabel, runnerGenderLabel, ageLabel, runnerAgeLabel);
        Label marathonLabel = new Label("Marathon");
        Label eventLabel = new Label("Event");
        Label timeLabel = new Label("Time");
        Label overallRankLabel = new Label("Overall Rank");
        Label categoryRankLabel = new Label("Category Rank");
        VBox marathonBox = new VBox(marathonLabel);
        VBox eventBox = new VBox(eventLabel);
        VBox timeBox = new VBox(timeLabel);
        VBox overallBox = new VBox(overallRankLabel);
        VBox categoryBox = new VBox(categoryRankLabel);
        HBox midBox = new HBox(marathonBox, eventBox, timeBox, overallBox, categoryBox);
        VBox mainBox = new VBox(headerLabel, descText, labelsBox, midBox, viewAllButton);

        //--------sql-data-----------
        ResultSet genderAndAge = sqlquery("SELECT Gender, DateOfBirth FROM runner WHERE Email = '" + currentEmail + "';");
        genderAndAge.next();
        String[] dobValues = genderAndAge.getString("DateOfBirth").substring(0, 10).split("-");
        Calendar currentTime = Calendar.getInstance();
        currentTime.setTimeInMillis(System.currentTimeMillis());
        Calendar dob = Calendar.getInstance();
        dob.set(Integer.parseInt(dobValues[0]), Integer.parseInt(dobValues[1]), Integer.parseInt(dobValues[2]));
        int age = currentTime.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        runnerGenderLabel.setText(genderAndAge.getString("Gender") + "    ");

        if (age < 18) runnerAgeLabel.setText("Under 18");
        else if (age <= 29) runnerAgeLabel.setText("18 to 29");
        else if (age <= 39) runnerAgeLabel.setText("30 to 39");
        else if (age <= 55) runnerAgeLabel.setText("40 to 55");
        else if (age <= 70) runnerAgeLabel.setText("55 to 70");
        else runnerAgeLabel.setText("Over 70");

        ResultSet raceResults = sqlquery("SELECT RegistrationEvent.bibNumber,Event.EventId,RegistrationEvent.RaceTime,Event.EventName,Marathon.MarathonName FROM ((((runner INNER JOIN registration ON runner.RunnerId = registration.RunnerId) INNER JOIN registrationEvent ON registration.RegistrationId = registrationEvent.RegistrationId) INNER JOIN event ON registrationEvent.EventId = event.EventId) INNER JOIN marathon ON event.MarathonId = marathon.MarathonId) WHERE runner.Email ='" + currentEmail + "';");
        ArrayList<String> marathons = new ArrayList<>();
        ArrayList<String> events = new ArrayList<>();
        ArrayList<String> bibNums = new ArrayList<>();
        ArrayList<Integer> runnerTimes = new ArrayList<>();
        ArrayList<Integer> runnerRanks = new ArrayList<>();

        while (raceResults.next()) {
            System.out.println(raceResults.getString(1) + "===" + raceResults.getString(2) + "===" + raceResults.getString(3) + "===" + raceResults.getString(4));
            events.add(raceResults.getString("eventid"));
            bibNums.add(raceResults.getString("bibNumber"));
            marathons.add(raceResults.getString("MarathonName"));
        }
        for (String e : events) {
            ResultSet runners = sqlquery("SELECT bibNumber, RaceTime FROM registrationEvent WHERE eventId = '" + e + "' ORDER BY RaceTime;");
            int exemptRunners = 0;
            int currentRank = 1;
            ArrayList<Integer> allTimes = new ArrayList<>();
            while (runners.next()) {
                if (runners.getInt("RaceTime") == 0) {
                    exemptRunners += 1;
                    continue;
                } else if (runners.getString("bibNumber").equals(bibNums.get(events.indexOf(e)))) {
                    System.out.print((runners.getRow() - exemptRunners) + "===" + runners.getString("bibNumber") + "===" + runners.getString("RaceTime"));
                    runnerTimes.add(runners.getInt("RaceTime"));
                    runnerRanks.add(currentRank - exemptRunners);
                }
                if (!allTimes.contains(Integer.parseInt(runners.getString("RaceTime")))) {
                    currentRank += 1;
                }
                allTimes.add(runners.getInt("RaceTime"));
            }
        }

        if (events.size() > 1) {
            for (int i = 0; i < events.size(); i++) {
                int timeInSecs = runnerTimes.get(i);
                int hours = timeInSecs / 3600;
                int mins = (timeInSecs % 3600) / 60;
                int secs = ((timeInSecs % 3600) % 60);

                marathonBox.getChildren().add(new Label(marathons.get(i)));
                eventBox.getChildren().add(new Label(marathons.get(i)));
                timeBox.getChildren().add(new Label(hours + "h " + mins + "m " + secs + "s"));
                overallBox.getChildren().add(new Label(runnerRanks.get(i).toString()));
                //categoryBox.getChildren().add(new Label(marathons.get(i)));
            }
        } else {
        }
        //--------Proprieties--------
        headerLabel.setFont(Font.font(24));
        bottomBox.setPadding(new Insets(15));
        topBox.setPadding(new Insets(20));
        topBox.setSpacing(20);
        mainBox.setSpacing(50);
        midBox.setSpacing(20);
        marathonBox.setSpacing(10);
        eventBox.setSpacing(10);
        timeBox.setSpacing(10);
        overallBox.setSpacing(10);
        midBox.setAlignment(Pos.CENTER);
        mainBox.setAlignment(Pos.CENTER);
        labelsBox.setAlignment(Pos.CENTER);
        bottomBox.setAlignment(Pos.CENTER);
        rootBorderPane.setTop(topBox);
        rootBorderPane.setBottom(bottomBox);
        rootBorderPane.setCenter(mainBox);

        Scene scene = new Scene(rootBorderPane, 600, 600);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();
        topBox.setId("header-footer");
        bottomBox.setId("header-footer");
        titleLabel.setId("heading-font");

        backButton.setOnAction(value -> {
            runner_menu();
        });
    }


    private void thank_you_runner() {
        BorderPane rootBorderPane = new BorderPane();
        Label countdownLabel = new Label("");
        Label titleLabel = new Label("Marathon Skills 2019");
        Button backButton = new Button("Back");
        HBox topBox = new HBox(backButton, titleLabel);
        HBox bottomBox = new HBox(countdownLabel);
        Label tyLabel = new Label("Thank you for registering as a runner!");
        Label smoltyLabel = new Label("Thank you for registering as a runner in Marathon skills 2019!");
        Label moneyContactLabel = new Label("You will be contacted soon about the payment.");
        Button okButton = new Button("OK");
        VBox mainBox = new VBox(tyLabel, smoltyLabel, moneyContactLabel, okButton);

        //--------Proprieties--------
        topBox.setStyle("-fx-background-color: #336699;");
        bottomBox.setStyle("-fx-background-color: #336699;");
        titleLabel.setFont(Font.font("Courier New", 20));
        tyLabel.setFont(Font.font(25));
        smoltyLabel.setFont(Font.font(18));
        moneyContactLabel.setFont(Font.font(15));
        bottomBox.setPadding(new Insets(15));
        topBox.setPadding(new Insets(20));
        mainBox.setPadding(new Insets(40));
        topBox.setSpacing(20);
        mainBox.setSpacing(30);
        bottomBox.setAlignment(Pos.CENTER);
        mainBox.setAlignment(Pos.TOP_CENTER);
        rootBorderPane.setTop(topBox);
        rootBorderPane.setBottom(bottomBox);
        rootBorderPane.setCenter(mainBox);

        okButton.setOnAction(value -> {
            runner_menu();
        });

    }


    private void find_out_more() {
        //------------------node definitions-----------
        //buttons
        Button ms2015button = new Button("Marathon Skills 2015");
        Button howlongbutton = new Button("How long is a marathon?");
        Button prevracebutton = new Button("Previous race results");
        Button charitiesbutton = new Button("List of charities");
        Button bmibutton = new Button("BMI calculator");
        Button bmrbutton = new Button("BMR calculator");
        //labels
        Label findoutmoreLabel = new Label("Find out more information");
        //-------------------panes and scene--------------
        Object[] oarr = gridpane_preset();

        Scene scene = (Scene) oarr[0];
        GridPane main = (GridPane) oarr[1];
        VBox maintop = new VBox(findoutmoreLabel);
        GridPane mainbott = new GridPane();
        //------------------------pane properties--------------
        GridPane[] panelist = {mainbott, main};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        mainbott.add(ms2015button, 0, 0);
        mainbott.add(howlongbutton, 1, 0);
        mainbott.add(prevracebutton, 0, 1);
        mainbott.add(charitiesbutton, 1, 1);
        mainbott.add(bmibutton, 0, 2);
        mainbott.add(bmrbutton, 1, 2);

        main.add(maintop, 0, 0);
        main.add(mainbott, 0, 1);
        //--------------button actions--------------
        howlongbutton.setOnAction(event -> {
            how_long();
        });
        ms2015button.setOnAction(event -> {
            marathon_info();
        });
        prevracebutton.setOnAction(event -> {
            previous_race_results();
        });
    }


    private void how_long() {
        Object[] oarr = gridpane_preset();


        oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //------------------node definitions-----------
        //buttons
        //radi0s
        ToggleGroup spedis = new ToggleGroup();
        RadioButton speedrad = new RadioButton("Speed");
        speedrad.setToggleGroup(spedis);
        RadioButton distancerad = new RadioButton("Distance");
        distancerad.setToggleGroup(spedis);
        //textfields
        //labels
        Label howlong = new Label("How long is a marathon?");
        Label selected = new Label("selected");
        Label selectedinfo = new Label("selected info");

        ArrayList<Label> imagenames1 = new ArrayList<>();
        imagenames1.add(new Label("F1 Car"));
        imagenames1.add(new Label("Slug"));
        imagenames1.add(new Label("Horse"));
        imagenames1.add(new Label("Sloth"));
        imagenames1.add(new Label("Capybara"));
        imagenames1.add(new Label("Jaguar"));
        imagenames1.add(new Label("Worm"));
        ArrayList<Label> imagenames2 = new ArrayList<>();
        imagenames2.add(new Label("bus"));
        imagenames2.add(new Label("Pair of Havaianas"));
        imagenames2.add(new Label("Airbus A380"));
        imagenames2.add(new Label("Football Field"));
        imagenames2.add(new Label("Ronaldinho"));

        //images
        File f = null;
        FileInputStream fileInputstream = null;
        ArrayList<Image> allimages = new ArrayList<>();
        ArrayList<ImageView> allimageviews = new ArrayList<>();
        try {
            f = new File("src/Images/howlong");
            ArrayList<File> images = new ArrayList<>();
            System.out.println(f.listFiles().length);
            for (int i = 1; i - 1 < f.listFiles().length; i++) {
                images.add(new File("src/Images/howlong/" + i + ".jpg"));
            }
            fileInputstream = new FileInputStream(images.get(0));
            System.out.println(images.get(0));

            for (File image : images) {
                System.out.println(image);
                Image imageit = new Image(new FileInputStream(image));
                allimages.add(imageit);

                ImageView iview = new ImageView(new Image(new FileInputStream(image)));

                iview.setFitWidth(70);
                iview.fitWidthProperty().bind((main.widthProperty().subtract(50)).divide(7));
                iview.setPreserveRatio(true);

                allimageviews.add(iview);

            }
        } catch (Exception fe) {
            fe.printStackTrace();
        }
        selectedinfo.setText("a 42km marathon would \n take an " + imagenames1.get(0).getText() + " travelling at \n " + 345.0 + "km/h " + Double.toString(42 / 345.0 * 60.0).substring(0, Double.toString(42 / 345.0 * 60).indexOf(".") + 2) + " minutes!");
        selected.setText(imagenames1.get(0).getText());

        Image hlimage = new Image(fileInputstream);
        ImageView imageview = new ImageView(hlimage);
        //Styling nodes
        howlong.setId("body-font");
        selected.setStyle("-fx-font:  lighter 15px 'Open Sans'");
        selectedinfo.setStyle("-fx-font:  lighter 15px 'Open Sans'");

        //-------------------panes and scene--------------
        VBox mtop = new VBox(howlong);
        VBox mleft = new VBox(selected, imageview, selectedinfo);
        GridPane mright = new GridPane();
        HBox mrighttop = new HBox(speedrad, distancerad);
        GridPane imagebox1 = new GridPane();
        GridPane imagebox2 = new GridPane();
        ScrollPane imagecroll = new ScrollPane();
        BorderPane mpane = new BorderPane();

        imageview.setFitWidth(275);
        imageview.fitWidthProperty().bind(main.widthProperty().divide(500).multiply(275));
        imageview.setPreserveRatio(true);

        selectedinfo.setWrapText(true);

        //------------------------pane properties--------------
        GridPane[] panelist = {mright, main};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        GridPane[] panelist2 = {imagebox1, imagebox2};
        for (GridPane pane : panelist2) {
            pane.setPadding(new Insets(10));
            pane.setVgap(5);
            pane.setHgap(5);
            pane.setAlignment(Pos.CENTER);
        }
        mright.setAlignment(Pos.TOP_CENTER);
        mrighttop.setSpacing(10);
        mrighttop.setId("mainpane");

        imagebox1.add(imagenames1.get(0), 1, 0);
        imagebox1.add(imagenames1.get(1), 1, 1);
        imagebox1.add(imagenames1.get(2), 1, 2);
        imagebox1.add(imagenames1.get(3), 1, 3);
        imagebox1.add(imagenames1.get(4), 1, 4);
        imagebox1.add(imagenames1.get(5), 1, 5);
        imagebox1.add(imagenames1.get(6), 1, 6);

        imagebox1.add(allimageviews.get(0), 0, 0);
        imagebox1.add(allimageviews.get(1), 0, 1);
        imagebox1.add(allimageviews.get(2), 0, 2);
        imagebox1.add(allimageviews.get(3), 0, 3);
        imagebox1.add(allimageviews.get(4), 0, 4);
        imagebox1.add(allimageviews.get(5), 0, 5);
        imagebox1.add(allimageviews.get(6), 0, 6);

        imagebox2.add(imagenames2.get(0), 1, 0);
        imagebox2.add(imagenames2.get(1), 1, 1);
        imagebox2.add(imagenames2.get(2), 1, 2);
        imagebox2.add(imagenames2.get(3), 1, 3);
        imagebox2.add(imagenames2.get(4), 1, 4);

        imagebox2.add(allimageviews.get(7), 0, 0);
        imagebox2.add(allimageviews.get(8), 0, 1);
        imagebox2.add(allimageviews.get(9), 0, 2);
        imagebox2.add(allimageviews.get(10), 0, 3);
        imagebox2.add(allimageviews.get(11), 0, 4);

        mright.add(mrighttop, 0, 0);
        mright.add(imagecroll, 0, 1);

        imagecroll.setContent(imagebox1);
        imagecroll.setFitToWidth(true);
        mpane.setTop(mtop);
        mpane.setLeft(mleft);
        mpane.setRight(mright);

        main.add(mpane, 0, 0);
        //--------------button actions-------------
        speedrad.setOnAction(event -> {
            imagecroll.setContent(imagebox1);
            imageview.setImage(allimages.get(0));
            double speed = 345;
            double time = 42.0 / speed * 60.0;
            selectedinfo.setText("a 42km marathon would \n take an " + imagenames1.get(0).getText() + " travelling at \n " + speed + "km/h " + Double.toString(time).substring(0, Double.toString(time).indexOf(".") + 2) + " minutes!");
            selected.setText(imagenames1.get(0).getText());
        });
        distancerad.setOnAction(event -> {
            imagecroll.setContent(imagebox2);
            imageview.setImage(allimages.get(7));
            selected.setText(imagenames2.get(0).getText());
            selectedinfo.setText("It would take " + Double.toString(42000 / 10).substring(0, Double.toString(42000 / 10).indexOf(".") + 2) + " " + imagenames2.get(0).getText() + "\n to make up a 42km marathon!");
        });

        double[] speeds = {345, 0.01, 15, 0.12, 35, 80, 0.03};
        for (int i = 0; i < speeds.length; i++) {
            final int fi = i;
            allimageviews.get(fi).setOnMouseClicked(event -> {
                double speed = speeds[fi];
                double time = 42.0 / speed * 60.0;
                selectedinfo.setText("a 42km marathon would \n take an " + imagenames1.get(fi).getText() + " travelling at \n " + speed + "km/h " + Double.toString(time).substring(0, Double.toString(time).indexOf(".") + 2) + " minutes!");
                selected.setText(imagenames1.get(fi).getText());
                imageview.setImage(allimages.get(fi));
            });
        }
        final double[] lengths = {10, 0.245, 73, 105, 1.81};
        for (int i = 0; i < lengths.length; i++) {
            final int fi = i;
            final int fx = i + 7;
            allimageviews.get(fx).setOnMouseClicked(event -> {
                imageview.setImage(allimages.get(fx));
                selected.setText(imagenames2.get(fi).getText());
                selectedinfo.setText("It would take " + Double.toString(42000 / lengths[fi]).substring(0, Double.toString(42000 / lengths[fi]).indexOf(".") + 2) + " " + imagenames2.get(fi).getText() + "\n to make up a 42km marathon!");
            });
        }

    }


    private void marathon_info() {
        Object[] oarr = scrollpane_preset();

        ScrollPane main = (ScrollPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //------------------node definitions-----------
        //buttons
        //textfields
        //labels
        Label aboutlabel = new Label("About Marathon Skills 2015");
        Label infolabel1 = new Label("Marathon Skills is a running festival held every year in a different part of the world. There can be three events: a Full Marathon, Half Marathon and a Fun Run - so the festival caters to all abilities and experience.In past years, marathons have been held in Osaka, Japan (2014); Leipzig, Germany (2013); Hanoi, Vietnam (2012) and York, England (2011).");
        Label infolabel2 = new Label("This year, Marathon Skills is very excited to be partnering with São Paulo, Brazil to put on the biggest running festival yet. Brazil's financial centre and the biggest city in South America, São Paulo will be on display to the thousands of runners who will weave their way past skyscrapers, green parks and magnificent architecture.");
        Label infolabel3 = new Label("This festival has attracted a record number of runners from all over the world. Attention will be on the contingents from Kenya and Jamaica as we hope to see Dawit Admasu's 2014 São Silvestre time broken. (The Ethiopian completed the race in 45 minutes 4 seconds.)The carnival atmosphere promises entertainment for all spectators as well as a party to round off the festivities in Ibirapuera Park.");
        Label infolabel4 = new Label("The events:");
        Label infolabel5 = new Label(
                "- The \"Samba\" Full Marathon will start at Rua dos Americanos at 6am on 5 September 2015." +
                        "\n" +
                        "- The \"Jongo\" Half Marathon will start at 7am on 6 September 2015. Runners will depart from near the intersection of Rua Ciniciata Braga and Avenida Brigadeiro Luís Antõnio." +
                        "\n" +
                        "- The \"Capoeira\" 5km Fun Run will start at 3 pm on 6 September 2015. Our fun runners will start from the UNINOVE Memorial." +
                        "\n" +
                        "Thank you to all the volunteers who will be helping!");


        //images
        ArrayList<ImageView> allImageViews = new ArrayList<>();
        ArrayList<Image> allImages = new ArrayList<>();
        ArrayList<File> allFiles = new ArrayList<>();
        Image marathonImage = null;
        ImageView marathonIV = null;
        try {
            File file = new File("C:\\Users\\admin3\\Desktop\\Mskills resources\\Marathon-images");
            for (File i : file.listFiles()) {
                allImages.add(new Image(new FileInputStream(i)));
                allImageViews.add(new ImageView(new Image(new FileInputStream(i))));
            }
            File file2 = new File("C:\\Users\\admin3\\Desktop\\Mskills resources\\marathon-skills-2015-marathon-map.jpg");
            marathonImage = new Image(new FileInputStream(file2));
            marathonIV = new ImageView(marathonImage);
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
        //Styling nodes
        aboutlabel.setId("body-font");
        //-------------------panes and scene--------------
        ScrollPane scrollPane = new ScrollPane();
        BorderPane mbpane = new BorderPane();
        HBox mtop = new HBox(aboutlabel);
        VBox mright = new VBox(infolabel1, infolabel2, infolabel3, infolabel4, infolabel5);
        GridPane mlefttop = new GridPane();
        GridPane mleftbott = new GridPane();
        GridPane mleft = new GridPane();

        for (Label i : new Label[]{infolabel1, infolabel2, infolabel3, infolabel4, infolabel5}) {
            i.setWrapText(true);
            i.prefWidthProperty().bind(main.widthProperty().subtract(mlefttop.widthProperty()));
            //i.prefHeightProperty().bind(main.heightProperty().subtract(mlefttop.heightProperty()));
            i.setStyle("-fx-font: normal 14px 'open sans';");
        }

        marathonIV.setFitWidth(200);
        marathonIV.fitWidthProperty().bind(main.widthProperty().divide(500).multiply(200));
        marathonIV.fitHeightProperty().bind(main.heightProperty().divide(500).multiply(200));
        marathonIV.setPreserveRatio(true);

        for (ImageView iv : allImageViews) {
            iv.setFitWidth(70);
            iv.fitWidthProperty().bind(main.widthProperty().divide(500).multiply(70));
            iv.fitHeightProperty().bind(main.heightProperty().divide(500).multiply(70));
            iv.setPreserveRatio(true);
        }
        //------------------------pane properties--------------
        GridPane[] panelist = {mlefttop, mleftbott};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        mtop.setAlignment(Pos.CENTER);
        mright.setSpacing(10);

        main.setContent(mbpane);

        mbpane.setRight(mright);
        mbpane.setLeft(mleft);
        mbpane.setTop(mtop);

        mleft.add(mlefttop, 0, 0);
        mleft.add(mleftbott, 0, 1);

        mlefttop.add(marathonIV, 0, 0);
        mleftbott.add(allImageViews.get(0), 0, 0);
        mleftbott.add(allImageViews.get(1), 1, 0);
        mleftbott.add(allImageViews.get(2), 0, 1);
        mleftbott.add(allImageViews.get(3), 1, 1);

        //--------------button actions--------------
        marathonIV.setOnMouseClicked(event -> {
            interactive_map();
        });
    }


    private void interactive_map() {
        Object[] oarr = gridpane_preset();


        oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //------------------node definitions-----------
        //colors
        //buttons
        Circle cp1 = new Circle(228.0, 21.0, 12);
        Circle cp2 = new Circle(322.0, 92.0, 12);
        Circle cp3 = new Circle(262.0, 177.0, 12);
        Circle cp4 = new Circle(217.0, 259.0, 12);
        Circle cp5 = new Circle(143.0, 327.0, 12);
        Circle cp6 = new Circle(77.0, 260.0, 12);
        Circle cp7 = new Circle(74.0, 131.0, 12);
        Circle cp8 = new Circle(116.0, 94.0, 12);

        for (Circle cp : new Circle[]{cp1, cp2, cp3, cp4, cp5, cp6, cp7, cp8}) {
            cp.setFill(Color.RED);
            cp.setStroke(Color.LIGHTGRAY);
            cp.setStrokeWidth(2.5);
        }

        String[] cpnames = {"Avenida Rudge", "Theatro Municipal", "Parque do Ibirapuera", "Jardim Luzitania", "Iguatemi", "Rua Lisboa", "Cemitério da Consolação", "Cemitério da Consolação"};
        Circle event1 = new Circle(202.0, 19.0, 12);
        Circle event2 = new Circle(202.0, 329.0, 12);
        Circle event3 = new Circle(51.0, 89.0, 12);

        for (Circle event : new Circle[]{event1, event2, event3}) {
            event.setFill(Color.GOLD);
            event.setStroke(Color.LIGHTGRAY);
            event.setStrokeWidth(2.5);
        }
        //textfields
        //images
        ImageView map = null;
        try {
            File f = new File("C:\\Users\\admin3\\Desktop\\Mskills resources\\WSC2015_TP09_resources\\WSC2015_TP09_resources_session-3\\marathon-skills-2015-marathon-map.jpg");
            map = new ImageView(new Image(new FileInputStream(f)));
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }

        ImageView drinksicon = new ImageView();
        ImageView energyicon = new ImageView();
        ImageView infoicon = new ImageView();
        ImageView medicicon = new ImageView();
        ImageView toileticon = new ImageView();
        for (ImageView iconview : new ImageView[]{drinksicon, energyicon, toileticon, infoicon, medicicon}) {
            iconview.setFitWidth(30);
            iconview.setPreserveRatio(true);
        }
        Image[] allicons = new Image[5];
        try {
            File f = new File("C:\\Users\\admin3\\Desktop\\Mskills resources\\WSC2015_TP09_resources\\WSC2015_TP09_resources_session-3\\map-icons");
            File[] files = f.listFiles();
            for (int i = 0; i < allicons.length; i++) {
                System.out.println(i + "" + files[i]);
                allicons[i] = new Image(new FileInputStream(files[i]));
                System.out.println(i + "" + allicons[i]);
            }
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
        drinksicon.setImage(allicons[0]);
        energyicon.setImage(allicons[1]);
        infoicon.setImage(allicons[2]);
        medicicon.setImage(allicons[3]);
        toileticon.setImage(allicons[4]);
        //labels
        Label cpnumber = new Label("Marathon start");
        Label cpname = new Label("42km Full marathon");
        Label cpserv = new Label("Services Provided:");

        Label iconlabel1 = new Label("Drinks", drinksicon);
        Label iconlabel2 = new Label("Energy bars", energyicon);
        Label iconlabel3 = new Label("Information", infoicon);
        Label iconlabel4 = new Label("Medical", medicicon);
        Label iconlabel5 = new Label("Toilets", toileticon);

        //Styling nodes
        //-------------------panes and scene--------------
        BorderPane mbpane = new BorderPane();
        GridPane servicebox = new GridPane();
        VBox cpbox = new VBox(cpnumber, cpname, cpserv, servicebox, iconlabel1, iconlabel2, iconlabel3, iconlabel4, iconlabel5);
        HBox mappane = new HBox(map);
        StackPane stackPane = new StackPane();
        Pane buttonpane = new Pane();

        map.setFitWidth(350);
        map.setPreserveRatio(true);

        //------------------------pane properties--------------
        GridPane[] panelist = {};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        cpbox.setSpacing(5);

        main.add(mbpane, 0, 0);

        mbpane.setPadding(new Insets(20));

        stackPane.getChildren().addAll(mappane, buttonpane);

        for (Circle cp : new Circle[]{cp1, cp2, cp3, cp4, cp5, cp6, cp7, cp8, event1, event2, event3}) {
            buttonpane.getChildren().addAll(cp);
        }

        mbpane.setLeft(stackPane);
        mbpane.setRight(cpbox);
        //Styling
        cpbox.setStyle("-fx-border-style: solid; -fx-border-width: 5px; -fx-border-color: rgb(20, 163, 248);");
        cpnumber.setStyle("-fx-font: normal 16px 'open sans';");
        cpname.setStyle("-fx-font: lighter 14px 'open sans';");
        //--------------button actions--------------
        buttonpane.setOnMouseClicked(event -> {
            System.out.println(event.getX() + "," + event.getY() + ",12");
        });
        Circle[] allcpcircles = new Circle[]{cp1, cp2, cp3, cp4, cp5, cp6, cp7, cp8};
        String[][] cpinfo = {
                {"Drinks", "Energy Bars", "", "", ""},
                {"Drinks", "Energy Bars", "Information", "Medical", "Toilets"},
                {"Drinks", "Energy Bars", "", "", "Toilets"},
                {"Drinks", "Energy Bars", "", "Medical", "Toilets"},
                {"Drinks", "Energy Bars", "Information", "", "Toilets"},
                {"Drinks", "Energy Bars", "", "", "Toilets"},
                {"Drinks", "Energy Bars", "Information", "Medical", "Toilets"},
                {"Drinks", "Energy Bars", "Information", "Medical", "Toilets"}
        };
        ImageView[][] cpimages = {
                {drinksicon, energyicon, null, null, null},
                {drinksicon, energyicon, infoicon, medicicon, toileticon},
                {drinksicon, energyicon, null, null, toileticon},
                {drinksicon, energyicon, null, medicicon, toileticon},
                {drinksicon, energyicon, infoicon, null, toileticon},
                {drinksicon, energyicon, null, null, toileticon},
                {drinksicon, energyicon, infoicon, medicicon, toileticon},
                {drinksicon, energyicon, infoicon, medicicon, toileticon}
        };
        for (int i = 0; i < allcpcircles.length; i++) {
            final int x = i;
            allcpcircles[x].setOnMouseClicked(event -> {
                cpnumber.setText("Checkpoint " + (x + 1));
                cpname.setText(cpnames[x]);
                iconlabel1.setText(cpinfo[x][0]);
                iconlabel2.setText(cpinfo[x][1]);
                iconlabel3.setText(cpinfo[x][2]);
                iconlabel4.setText(cpinfo[x][3]);
                iconlabel5.setText(cpinfo[x][4]);

                iconlabel1.setGraphic(cpimages[x][0]);
                iconlabel2.setGraphic(cpimages[x][1]);
                iconlabel3.setGraphic(cpimages[x][2]);
                iconlabel4.setGraphic(cpimages[x][3]);
                iconlabel5.setGraphic(cpimages[x][4]);
            });
        }

        event1.setOnMouseClicked(event -> {
            cpnumber.setText("Marathon start");
            cpname.setText("42km Full marathon");
            iconlabel1.setText(cpinfo[1][0]);
            iconlabel2.setText(cpinfo[1][1]);
            iconlabel3.setText(cpinfo[1][2]);
            iconlabel4.setText(cpinfo[1][3]);
            iconlabel5.setText(cpinfo[1][4]);

            iconlabel1.setGraphic(drinksicon);
            iconlabel2.setGraphic(energyicon);
            iconlabel3.setGraphic(infoicon);
            iconlabel4.setGraphic(medicicon);
            iconlabel5.setGraphic(toileticon);
        });
        event2.setOnMouseClicked(event -> {
            cpnumber.setText("Marathon start");
            cpname.setText("21km Half marathon");
            iconlabel1.setText(cpinfo[1][0]);
            iconlabel2.setText(cpinfo[1][1]);
            iconlabel3.setText(cpinfo[1][2]);
            iconlabel4.setText(cpinfo[1][3]);
            iconlabel5.setText(cpinfo[1][4]);

            iconlabel1.setGraphic(drinksicon);
            iconlabel2.setGraphic(energyicon);
            iconlabel3.setGraphic(infoicon);
            iconlabel4.setGraphic(medicicon);
            iconlabel5.setGraphic(toileticon);
        });
        event3.setOnMouseClicked(event -> {
            cpnumber.setText("Marathon start");
            cpname.setText("5km Fun run");
            iconlabel1.setText(cpinfo[1][0]);
            iconlabel2.setText(cpinfo[1][1]);
            iconlabel3.setText(cpinfo[1][2]);
            iconlabel4.setText(cpinfo[1][3]);
            iconlabel5.setText(cpinfo[1][4]);

            iconlabel1.setGraphic(drinksicon);
            iconlabel2.setGraphic(energyicon);
            iconlabel3.setGraphic(infoicon);
            iconlabel4.setGraphic(medicicon);
            iconlabel5.setGraphic(toileticon);
        });
    }


    private void previous_race_results() {
        Object[] oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //------------------node definitions-----------
        //buttons
        Button searchButton = new Button("Search");
        //dropdown lists
        ComboBox marathonCbox = new ComboBox();
        ComboBox raceeventCbox = new ComboBox();
        ComboBox genderCbox = new ComboBox();
        ComboBox ageCbox = new ComboBox();

        //fetching and inserting data intp comboboxes
        ResultSet marathonRs = sqlquery("select marathonname from marathon");
        try {
            while (marathonRs.next()) {
                marathonCbox.getItems().addAll(marathonRs.getString("marathonname"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        ResultSet raceeventRs = sqlquery("select eventtypename from eventtype");
        try {
            while (raceeventRs.next()) {
                raceeventCbox.getItems().addAll(raceeventRs.getString("eventtypename"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        ResultSet genderRs = sqlquery("select gender from gender");
        try {
            while (genderRs.next()) {
                genderCbox.getItems().addAll(genderRs.getString("gender"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }

        ageCbox.getItems().addAll("Under 18", "30 to 39", "40 to 55", "55 to 70");
        //labels
        //-------------------panes and scene--------------
        ScrollPane resutsScrollPane = new ScrollPane();
        TilePane resultsTilePane = new TilePane();
        HBox statsHbox = new HBox();
        GridPane filterGpane = new GridPane();
        HBox headerHbox = new HBox();
        //------------------------pane properties--------------
        GridPane[] panelist = {filterGpane};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        resutsScrollPane.setMinHeight(200);

        main.add(headerHbox, 0, 0);
        main.add(filterGpane, 0, 1);
        main.add(statsHbox, 0, 2);
        main.add(resutsScrollPane, 0, 3);

        filterGpane.add(marathonCbox, 1, 0);
        filterGpane.add(raceeventCbox, 1, 1);

        filterGpane.add(genderCbox, 3, 0);
        filterGpane.add(ageCbox, 3, 1);
        filterGpane.add(searchButton, 4, 1);
        //results fetching and rank setting
        resultsTilePane.setPrefColumns(7);
        ObservableList<Node> resultlist = resultsTilePane.getChildren();
        resultlist.addAll(new Label("Rank"), new Label("First name"), new Label("last name"), new Label("Country code"), new Label("Event type"), new Label("Marathon"), new Label("racetime"));

        resutsScrollPane.setContent(resultsTilePane);
        //Styling nodes
        resutsScrollPane.setStyle("-fx-background-color: black; -fx-color: white");
        //--------------button actions--------------
        searchButton.setOnAction(event -> {
            //clearing results
            resultlist.remove(0, resultlist.size());
            resultlist.addAll(new Label("Rank"), new Label("First name"), new Label("last name"), new Label("Country code"), new Label("Event type"), new Label("Marathon"), new Label("racetime"));

            //query creation
            String marathonstmnt = "  MarathonName = '" + marathonCbox.getSelectionModel().getSelectedItem().toString() + "' ";
            String eventstmnt = " and EventName = '" + raceeventCbox.getSelectionModel().getSelectedItem().toString() + "' ";
            String genderstmnt = " and Gender = '" + genderCbox.getSelectionModel().getSelectedItem().toString() + "' ";

            //fetching wanted ages from age combobox
            long minage, maxage;
            String[] dobaselectedrray = ageCbox.getSelectionModel().getSelectedItem().toString().split("\\D+");
            if (dobaselectedrray[1].equals("18")) {
                minage = 0;
                maxage = Long.valueOf(dobaselectedrray[1]) * 31556952000L;
            } else {
                minage = Long.valueOf(dobaselectedrray[0]) * 31556952000L;
                maxage = Long.valueOf(dobaselectedrray[1]) * 31556952000L;
            }

            try {
                //ranks
                ArrayList<Integer> rankArray = new ArrayList<>();
                ResultSet rankRs = sqlquery(
                        "SELECT user.FirstName , user.lastname, runner.CountryCode, runner.gender, runner.dateofbirth,event.EventName, eventtype.EventTypeName, marathon.MarathonName,registrationevent.RaceTime\n" +
                                "from \n" +
                                "\tuser inner join runner inner join registration inner join registrationevent inner join event inner join eventtype inner join marathon\n" +
                                "    on user.email= runner.email and runner.runnerid = registration.RunnerId and registration.RegistrationId = registrationevent.RegistrationId and registrationevent.EventId=event.EventId and event.EventTypeId= eventtype.EventTypeId and event.MarathonId=marathon.MarathonId" +
                                " where racetime>0 and" + marathonstmnt + eventstmnt + " ORDER BY racetime ASC;");
                while (rankRs.next()) {
                    if (rankRs.getInt("racetime") <= 0) {
                    } else if (rankArray.size() == 0) {
                        rankArray.add(rankRs.getInt("racetime"));
                    } else if (rankRs.getInt("racetime") == rankArray.get(rankArray.size() - 1)) {
                    } else {
                        rankArray.add(rankRs.getInt("racetime"));
                    }
                }
                //big455 query
                ResultSet searchRs = sqlquery(
                        "SELECT user.FirstName , user.lastname, runner.CountryCode, runner.gender, runner.dateofbirth,event.EventName, eventtype.EventTypeName, marathon.MarathonName,registrationevent.RaceTime\n" +
                                "from \n" +
                                "\tuser inner join runner inner join registration inner join registrationevent inner join event inner join eventtype inner join marathon\n" +
                                "    on user.email= runner.email and runner.runnerid = registration.RunnerId and registration.RegistrationId = registrationevent.RegistrationId and registrationevent.EventId=event.EventId and event.EventTypeId= eventtype.EventTypeId and event.MarathonId=marathon.MarathonId" +
                                " where racetime>0 and" + marathonstmnt + eventstmnt + genderstmnt + " ORDER BY racetime ASC;");
                while (searchRs.next()) {


                    //age magic
                    String[] dobStr = searchRs.getString("dateofbirth").split(" ");
                    String[] dobArray = dobStr[0].split("-");
                    Calendar dobCal = new GregorianCalendar(Integer.valueOf(dobArray[0]), Integer.valueOf(dobArray[1]), Integer.valueOf(dobArray[2]));
                    Calendar now = GregorianCalendar.getInstance();
                    long age = now.getTimeInMillis() - dobCal.getTimeInMillis();
                    //adding results if user matches age requirements
                    if (age > minage && age < maxage) {
                        BigDecimal racetime = searchRs.getBigDecimal("racetime");
                        resultlist.add(new Label(Integer.toString(rankArray.indexOf(searchRs.getInt("racetime"))) + 1));
                        resultlist.add(new Label(searchRs.getString("firstname")));
                        resultlist.add(new Label(searchRs.getString("lastname")));
                        resultlist.add(new Label(searchRs.getString("countrycode")));
                        resultlist.add(new Label(searchRs.getString("eventName")));
                        resultlist.add(new Label(searchRs.getString("marathonname")));
                        resultlist.add(new Label(racetime.divide(new BigDecimal(3600), BigDecimal.ROUND_FLOOR)+"h "+(racetime.remainder(new BigDecimal(3600)).divide(new BigDecimal(60), BigDecimal.ROUND_FLOOR))+"m "+racetime.remainder(new BigDecimal(60))+"s "));
                    }
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        });
        marathonCbox.setOnAction(event -> {
            raceeventCbox.getItems().remove(0, raceeventCbox.getItems().size());
            String selectedmarathon = marathonCbox.getSelectionModel().getSelectedItem().toString();
            ResultSet eventRs = sqlquery(
                    "SELECT event.EventName\n" +
                            "from \n" +
                            "\t event inner join marathon\n" +
                            "   on marathon.marathonid= event.marathonid " +
                            " where marathonname = '" + selectedmarathon + "';");
            try {
                while (eventRs.next()) {
                    raceeventCbox.getItems().add(eventRs.getString("eventname"));
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        });
    }


    private void manage_a_runner(String useremail){
        Object[] oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //------------------node definitions-----------
        //buttons
        Button editButton = new Button("Edit profile");
        Button certifButton = new Button("Preview certificate");

        //labels
        Label topLabel = new Label("Manage a runner");

        Label leftemailLabel = new Label("Email: ");
        Label leftfirstnameLabel = new Label("First Name: ");
        Label leftlastnameLabel = new Label("Last Name: ");
        Label leftgenderLabel = new Label("Gender: ");
        Label leftdobLabel = new Label("Date of Birth: ");
        Label leftcoutryLabel = new Label("Country: ");
        Label leftcharityLabel = new Label("Charity: ");
        Label lefttargetLabel = new Label("Target to raise: ");
        Label leftracekitLabel = new Label("Race Kit Option");
        Label lefteventLabel = new Label("Race Event");

        Label rightemailLabel = new Label("");
        Label rightfirstnameLabel = new Label("");
        Label rightlastnameLabel = new Label("");
        Label rightgenderLabel = new Label("");
        Label rightdobLabel = new Label("");
        Label rightcoutryLabel = new Label("");
        Label rightcharityLabel = new Label("");
        Label righttargetLabel = new Label("");
        Label rightracekitLabel = new Label("");
        Label righteventLabel = new Label("");

        Label registrationLabel = new Label("Registration Status");
        Label registeredstatusLabel = new Label("Registered");
        Label paymentstatusLabel = new Label("Payment Confirmed");
        Label racekitstatusLabel = new Label("Race Kit Sent");
        Label attendedstatusLabel = new Label("Race Attended");
        //Styling nodes
        topLabel.setId("body-font");
        registrationLabel.setId("body-font");
        //imagesssssss
        ArrayList<ImageView> allImageViews = new ArrayList<>(4);
        ArrayList<Image> allImages = new ArrayList<>();
        Image marathonImage = null;
        try {
            File file = new File("C:\\Users\\admin3\\Desktop\\Mskills resources\\status-icons");
            for (File i : file.listFiles()) {
                allImages.add(new Image(new FileInputStream(i)));
            }
            for (int i=0;i<=4;i++){
                allImageViews.add(new ImageView());
            }
            for (int i=0;i<allImageViews.size();i++){
                allImageViews.get(i).setFitWidth(35);
                allImageViews.get(i).setPreserveRatio(true);
            }
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
        //-------------------panes and scene--------------
        HBox topHbox = new HBox(topLabel);
        GridPane leftGridpane = new GridPane();
        GridPane rightGridpane = new GridPane();

        //------------------------pane properties--------------
        GridPane[] panelist = {leftGridpane, rightGridpane};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        Label[] labels1 = {leftemailLabel  ,leftfirstnameLabel ,leftlastnameLabel  ,leftgenderLabel ,leftdobLabel  ,leftcoutryLabel ,leftcharityLabel  ,lefttargetLabel ,leftracekitLabel  ,lefteventLabel};
        for (int i=0;i<labels1.length;i++){
            leftGridpane.add(labels1[i], 0, i);
        }
        Label[] labels2 = {rightemailLabel ,rightfirstnameLabel ,rightlastnameLabel ,rightgenderLabel ,rightdobLabel ,rightcoutryLabel ,rightcharityLabel ,righttargetLabel ,rightracekitLabel ,righteventLabel};
        for (int i=0;i<labels2.length;i++){
            leftGridpane.add(labels2[i], 1, i);
        }

        Label[] labels3 = {registeredstatusLabel ,paymentstatusLabel ,racekitstatusLabel ,attendedstatusLabel};
        for (int i=0;i<labels3.length;i++){
            rightGridpane.add(labels3[i], 0, i+1);
        }
        rightGridpane.add(registrationLabel, 0, 0);
        rightGridpane.add(certifButton, 0, 6);
        rightGridpane.add(editButton, 1, 6);

        main.add(topHbox, 0, 0);
        main.add(leftGridpane, 0, 1);
        main.add(rightGridpane, 5, 1);

        primaryStage.setWidth(600);
        //-----------------sql-------------
        ResultSet infoRs = sqlquery("select user.email, user.FirstName, User.LastName, Runner.Gender, Runner.DateOfBirth, Country.CountryName, charity.CharityName, registration.sponsorshipTarget, racekitoption.RaceKitOptionid, event.EventName , registrationstatus.RegistrationStatus\n" +
                "\tfrom user inner join runner inner join country inner join charity inner join registration inner join racekitoption inner join registrationevent inner join event inner join registrationstatus\n" +
                "    on user.email = runner.email and runner.CountryCode = country.CountryCode and runner.runnerid = registration.runnerid and registration.RegistrationStatusId = registrationstatus.RegistrationStatusId and registration.racekitoptionid = racekitoption.racekitoptionid and  registration.runnerid = registrationevent.RegistrationId and registrationevent.EventId= event.EventId and registration.CharityId = charity.CharityId\n" +
                "    where user.email = \""+useremail+"\" ");
        String[] infocolumns = {"Email","FirstName","LastName","Gender","DateOfBirth","CountryName","CharityName","SponsorshipTarget","RaceKitOptionID","EventName"};
        try {
            while (infoRs.next()){
                rightemailLabel.setText(infoRs.getString(infocolumns[0]));
                rightfirstnameLabel.setText(infoRs.getString(infocolumns[1]));
                rightlastnameLabel.setText(infoRs.getString(infocolumns[2]));
                rightgenderLabel.setText(infoRs.getString(infocolumns[3]));
                rightdobLabel.setText(infoRs.getString(infocolumns[4]));
                rightcoutryLabel.setText(infoRs.getString(infocolumns[5]));
                rightcharityLabel.setText(infoRs.getString(infocolumns[6]));
                righttargetLabel.setText(infoRs.getString(infocolumns[7]));
                rightracekitLabel.setText(infoRs.getString(infocolumns[8]));
                righteventLabel.setText(infoRs.getString(infocolumns[9]));

                String[] statuses = {"registered", "payment confirmed", "race kit sent" ,"race attended"};
                System.out.println(infoRs.getString("RegistrationStatus").toLowerCase());
                boolean statusfound = false;
                if (infoRs.getString("RegistrationStatus").toLowerCase().equals(statuses[0])){
                    allImageViews.get(0).setImage(allImages.get(1));
                    allImageViews.get(1).setImage(allImages.get(0));
                    allImageViews.get(2).setImage(allImages.get(0));
                    allImageViews.get(3).setImage(allImages.get(0));
                    registeredstatusLabel.setGraphic(allImageViews.get(0));
                    paymentstatusLabel.setGraphic(allImageViews.get(1));
                    racekitstatusLabel.setGraphic(allImageViews.get(2));
                    attendedstatusLabel.setGraphic(allImageViews.get(3));
                    statusfound = true;
                }
                if (infoRs.getString("RegistrationStatus").toLowerCase().equals(statuses[1])){
                    allImageViews.get(0).setImage(allImages.get(1));
                    allImageViews.get(1).setImage(allImages.get(1));
                    allImageViews.get(2).setImage(allImages.get(0));
                    allImageViews.get(3).setImage(allImages.get(0));
                    registeredstatusLabel.setGraphic(allImageViews.get(0));
                    paymentstatusLabel.setGraphic(allImageViews.get(1));
                    racekitstatusLabel.setGraphic(allImageViews.get(2));
                    attendedstatusLabel.setGraphic(allImageViews.get(3));
                    statusfound = true;
                }
                if (infoRs.getString("RegistrationStatus").toLowerCase().equals(statuses[2])){
                    allImageViews.get(0).setImage(allImages.get(1));
                    allImageViews.get(1).setImage(allImages.get(1));
                    allImageViews.get(2).setImage(allImages.get(1));
                    allImageViews.get(3).setImage(allImages.get(0));
                    registeredstatusLabel.setGraphic(allImageViews.get(0));
                    paymentstatusLabel.setGraphic(allImageViews.get(1));
                    racekitstatusLabel.setGraphic(allImageViews.get(2));
                    attendedstatusLabel.setGraphic(allImageViews.get(3));
                    statusfound = true;
                }
                if (infoRs.getString("RegistrationStatus").toLowerCase().equals(statuses[3])){
                    allImageViews.get(0).setImage(allImages.get(1));
                    allImageViews.get(1).setImage(allImages.get(1));
                    allImageViews.get(2).setImage(allImages.get(1));
                    allImageViews.get(3).setImage(allImages.get(1));
                    registeredstatusLabel.setGraphic(allImageViews.get(0));
                    paymentstatusLabel.setGraphic(allImageViews.get(1));
                    racekitstatusLabel.setGraphic(allImageViews.get(2));
                    attendedstatusLabel.setGraphic(allImageViews.get(3));
                    statusfound = true;
                }
                if (!statusfound){
                    allImageViews.get(0).setImage(allImages.get(0));
                    allImageViews.get(1).setImage(allImages.get(0));
                    allImageViews.get(2).setImage(allImages.get(0));
                    allImageViews.get(3).setImage(allImages.get(0));
                    registeredstatusLabel.setGraphic(allImageViews.get(0));
                    paymentstatusLabel.setGraphic(allImageViews.get(1));
                    racekitstatusLabel.setGraphic(allImageViews.get(2));
                    attendedstatusLabel.setGraphic(allImageViews.get(3));
                }
            }
        }catch (SQLException se){se.printStackTrace();}
        //--------------button actions--------------
        editButton.setOnAction(event -> {
            edit_a_runner(useremail);
        });
        certifButton.setOnAction(event -> {
            preview_certificate(useremail, rightfirstnameLabel.getText(), rightlastnameLabel.getText(),rightcharityLabel.getText(),righteventLabel.getText(), righttargetLabel.getText());
        });
    }


    private void edit_a_runner(String useremail){
        Object[] oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //------------------node definitions-----------
        //buttons
        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");
        //textfields
        TextField firstnameTextField = new TextField("");
        TextField lastnameTextField = new TextField("");
        TextField dobTextField = new TextField("yyyy-mm-dd");
        TextField passwdTextField = new TextField("");
        TextField passwdcheckTextField = new TextField("");


        //combos
        ComboBox countryComboBox = new ComboBox();
        ComboBox genderComboBox = new ComboBox();
        ComboBox regisstatusComboBox = new ComboBox();
        //labels
        Label headerLabel = new Label("Edit a Runner");
        Label useremailLabel = new Label(useremail);
        Label changepassLabel = new Label("Change password");
        Label changepassinfoLabel = new Label("Leave these fields blank if you \n do not want to change the password");

        Label emailLabel = new Label("Email: ");
        Label firstnameLabel = new Label("First Name: ");
        Label lastnameLabel = new Label("Last Name: ");
        Label genderLabel = new Label("Gender: ");
        Label dobLabel = new Label("Date of Birth: ");
        Label countryLabel = new Label("Country: ");
        Label passwdLabel = new Label("Password: ");
        Label passwdcheckLabel = new Label("Password Again: ");
        Label regisstatusLabel = new Label("Registraion Status");
        //Styling nodes
        headerLabel.setId("body-font");
        changepassLabel.setId("body-font");
        //-------------------panes and scene--------------
        HBox topHbox = new HBox(headerLabel);
        HBox botHbox = new HBox(saveButton, cancelButton);
        GridPane leftGridPane = new GridPane();
        GridPane rightGridPane = new GridPane();
        VBox rightVbox = new VBox(changepassLabel, changepassinfoLabel, rightGridPane, regisstatusLabel, regisstatusComboBox);
        HBox mainHbox = new HBox(leftGridPane, rightVbox);
        //------------------------pane properties--------------
        GridPane[] panelist = {leftGridPane, rightGridPane};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        topHbox.setAlignment(Pos.CENTER);
        botHbox.setAlignment(Pos.CENTER);
        rightVbox.setPadding(new Insets(5));
        rightVbox.setSpacing(5);
        rightVbox.setAlignment(Pos.CENTER);

        Label[] labels1 = {emailLabel,firstnameLabel ,lastnameLabel ,genderLabel ,dobLabel ,countryLabel};
        for (int i=0;i<labels1.length;i++){
            leftGridPane.add(labels1[i], 0, i);
        }
        TextField[] textFields = {firstnameTextField ,lastnameTextField ,dobTextField };
        for (int i=0;i<textFields.length;i++){
            if (i<2) {
                leftGridPane.add(textFields[i], 1, i + 1);
            }
            else {
                leftGridPane.add(textFields[i], 1, i + 2);
            }
        }
        leftGridPane.add(useremailLabel, 1, 0);
        leftGridPane.add(genderComboBox, 1, 3);
        leftGridPane.add(countryComboBox, 1, 5);

        rightGridPane.add(passwdLabel, 0, 0);
        rightGridPane.add(passwdTextField, 1, 0);
        rightGridPane.add(passwdcheckLabel, 0, 1);
        rightGridPane.add(passwdcheckTextField, 1, 1);

        main.add(topHbox, 0, 0);
        main.add(mainHbox, 0, 1);
        main.add(botHbox, 0, 2);
        //--------------button actions--------------
        saveButton.setOnAction(event -> {
            String[] dobValues = dobTextField.getText().split("-");
            if (dobValues[1].length() == 1) {
                dobValues[1] = "0" + dobValues[1];
            }
            if (dobValues[2].length() == 1) {
                dobValues[2] = "0" + dobValues[2];
            }
            boolean passwordbool =  passwdTextField.getText().length() >= 6
                    && passwdTextField.getText().matches(".*[!@#$%^]+.*")
                    && passwdTextField.getText().matches(".*[A-Z]+.*")
                    && passwdTextField.getText().matches(".*\\d+.*")
                    && passwdTextField.getText().equals(passwdcheckLabel.getText());

            if (passwordbool){
                sqlinsert(
                        "UPDATE user, runner, REGISTRATION STATUS \n" +
                                "SET FirstName = "+firstnameTextField.getText()+", LastName = '"+lastnameTextField.getText()+"', Gender = '"+genderComboBox.getSelectionModel().getSelectedItem().toString()+"', DateOfBirth = '"+dobValues[0]+"-"+dobValues[1]+"-"+dobValues[2]+"', CountryCode = (SELECT CountryCode FROM Country WHERE CountryName = '" + countryComboBox.getSelectionModel().getSelectedItem().toString() + "'),REGISTRATIONSTATUSid = (SELECT registrationstatusid from registrationstatus WHERE registrationstatus =  '"+regisstatusComboBox.getSelectionModel().getSelectedItem().toString()+"'), pass = '"+passwdTextField.getText()+"'"+"\n" +
                                "WHERE email = '"+useremail+"';"
                );
            }
            else {
                sqlinsert(
                        "UPDATE user, runner, registration \n" +
                                "SET FirstName = '"+firstnameTextField.getText()+"', LastName = '"+lastnameTextField.getText()+"', Gender = '"+genderComboBox.getSelectionModel().getSelectedItem().toString()+"', DateOfBirth = '"+dobValues[0]+"-"+dobValues[1]+"-"+dobValues[2]+"',CountryCode = (SELECT CountryCode FROM Country WHERE CountryName = '" + countryComboBox.getSelectionModel().getSelectedItem().toString() + "'),REGISTRATIONSTATUSid = (SELECT registrationstatusid from registrationstatus WHERE registrationstatus =  '"+regisstatusComboBox.getSelectionModel().getSelectedItem().toString()+"') \n" +
                                "WHERE user.email = '"+useremail+"' and runner.email = '"+useremail+"' and (SELECT runnerid from runner where email ='"+useremail+"') = registration.runnerid;"
                );
            }
        });
        //-------sql---------------------------
        ResultSet genderrs = sqlquery("select gender from gender");
        try {
            while (genderrs.next()) {
                genderComboBox.getItems().add(genderrs.getString("gender"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }

        ResultSet countryrs = sqlquery("select countryname from country");
        try {
            while (countryrs.next()) {
                countryComboBox.getItems().addAll(countryrs.getString("countryname"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }

        ResultSet statusrs = sqlquery("select registrationstatus from registrationstatus");
        try {
            while (statusrs.next()) {
                regisstatusComboBox.getItems().addAll(statusrs.getString("registrationstatus"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }


    private void preview_certificate(String useremail, String userfirstname, String userlastname, String usercharity, String userevent, String usertarget){
        String usertime = " ", userrank = " ", usermarathon = " ";
        Object[] oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //---------------node definitions-----------
        //buttons
        //labels
        Label congratsLabel = new Label("Congratulations "+userfirstname+userlastname+" for running in the "+userevent+" you ran a time of "+usertime+" and got a rank of "+userrank);
        Label certifLabel = new Label("Certificate of participation\n in\n "+usermarathon);
        Label targetLabel = new Label("You also raised $"+usertarget+" for "+usercharity);

        congratsLabel.setWrapText(true);
        congratsLabel.prefHeightProperty().bind(scene.heightProperty().subtract(450));
        congratsLabel.textAlignmentProperty().setValue(TextAlignment.CENTER);
        certifLabel.textAlignmentProperty().setValue(TextAlignment.CENTER);
        targetLabel.textAlignmentProperty().setValue(TextAlignment.CENTER);
        //Styling nodes
        //image
        ImageView certifview = null;
        Image certifimage = null;
        try{
            File file = new File("C:\\Users\\admin3\\Desktop\\Mskills resources\\WSC2015_TP09_resources\\WSC2015_TP09_resources_session-5\\marathon-skills-2014-certificate-seal.png");
            certifimage = new Image(new FileInputStream(file));
            certifview = new ImageView(certifimage);
        }catch (FileNotFoundException fe){
            fe.printStackTrace();
        }
        //sql
        ResultSet infoRs = sqlquery(
                "select user.FirstName, marathon.MarathonName, marathon.MarathonId\n" +
                        "from user inner join runner inner join registration inner join registrationevent inner join event inner join marathon\n" +
                        "on user.Email = runner.email and runner.RunnerId = registration.RunnerId and Registration.RegistrationId = registrationevent.RegistrationId and registrationevent.EventId = event.EventID and event.MarathonId = marathon.MarathonId\n" +
                        "where user.Email = '"+useremail+"'");
        try {
            while (infoRs.next()){
                usermarathon = infoRs.getString("marathonname");
                 certifLabel.setText("Certificate of participation\n in\n "+usermarathon);
            }
        }catch (SQLException se){se.printStackTrace();}
        certifview.setFitWidth(150);
        certifview.setPreserveRatio(true);
        //-------------------panes and scene--------------
        Pane logoPane = new Pane();
        VBox mainlabelVBox = new VBox(congratsLabel, certifLabel, targetLabel, certifview);
        StackPane mainStackPane = new StackPane(logoPane, mainlabelVBox);
        //------------------------pane properties--------------
        GridPane[] panelist = {main};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        mainlabelVBox.setAlignment(Pos.CENTER);
        main.add(mainStackPane, 0, 0);
        //------------ --button actions--------------
    }


    private void sponsorship_overview(){
        Object[] oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //---------------node definitions-----------
        //buttons
        Button sortButton = new Button("Sort");
        //combobox
        ComboBox comboBox = new ComboBox();
        comboBox.getItems().addAll("Amount","Name");
        //labels
        //Styling nodes
        //rectanged
        //-------------------panes and scene--------------
        TilePane resultsTilePane = new TilePane();
        ScrollPane resultsScrollPane = new ScrollPane(resultsTilePane);
        VBox mainVBox = new VBox(comboBox,sortButton,resultsScrollPane);
        //------------------------pane properties--------------
        GridPane[] panelist = {main};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        mainVBox.setAlignment(Pos.CENTER);
        resultsTilePane.setPrefColumns(3);
        ObservableList resultslist = resultsTilePane.getChildren();
        resultslist.addAll(new Label("Logo"),new Label("info"),new Label("Amount"));
        main.add(mainVBox, 0, 1);
        //----------------button actions--------------------
        sortButton.setOnAction(event -> {
            resultslist.remove(0, resultslist.size());
            resultslist.addAll(new Label("Logo"),new Label("info"),new Label("Amount"));
            if (comboBox.getSelectionModel().getSelectedItem().toString().toLowerCase().equals("name")){
                ResultSet sortnameRs = sqlquery("select * from charity " +
                        "ORDER by charityName ASC");
                try {
                    while (sortnameRs.next()){
                        try {
                            ImageView chaityimage = new ImageView(new Image(new FileInputStream("C:\\Users\\admin3\\Desktop\\Mskills resources\\charity images\\"+sortnameRs.getString("charitylogo"))));
                            chaityimage.fitHeightProperty().bind(resultsScrollPane.heightProperty().divide(500).multiply(100));
                            chaityimage.setPreserveRatio(true);
                            resultslist.addAll(chaityimage);
                        }catch (FileNotFoundException fe){fe.printStackTrace();}

                        Label infoLabel = new Label(sortnameRs.getString("charityname")+"\n"+sortnameRs.getString("charitydescription"));
                        infoLabel.setTextAlignment(TextAlignment.LEFT);
                        infoLabel.prefWidthProperty().bind(resultsScrollPane.widthProperty().divide(500).multiply(100));
                        infoLabel.setWrapText(true);
                        infoLabel.prefHeightProperty().bind(resultsScrollPane.heightProperty().divide(500).multiply(350));
                        resultslist.addAll(infoLabel);

                        ResultSet amountRs = sqlquery("select charityname, amount from registration inner join sponsorship inner join charity\n" +
                                "on charity.CharityId = registration.CharityId and sponsorship.RegistrationId = registration.RegistrationId " +
                                "where charityname = '"+sortnameRs.getString("charityname")+"'");
                        int charityamount=0;
                        while (amountRs.next()){
                            charityamount=charityamount+amountRs.getInt("amount");
                        }
                        resultslist.addAll(new Label(Integer.toString(charityamount)));
                    }
                }catch (SQLException se){se.printStackTrace();}
            }
            else {
                //query amount -> sort -> print
                ArrayList<String> charitynames = new ArrayList<>();
                ArrayList<Integer> charityamounts = new ArrayList<>();
                //query
                ResultSet charitynameRs = sqlquery("select * from charity");
                try {

                    while (charitynameRs.next()) {
                        ResultSet amountsortRS = sqlquery("select charityname, amount from registration inner join sponsorship inner join charity\n" +
                                "on charity.CharityId = registration.CharityId and sponsorship.RegistrationId = registration.RegistrationId " +
                                "where charityname = '" + charitynameRs.getString("charityname") + "'");
                        int charityamount=0;
                        while (amountsortRS.next()){
                            charityamount=charityamount+amountsortRS.getInt("amount");
                        }
                        charitynames.add(charitynameRs.getString("charityname"));
                        charityamounts.add(charityamount);
                    }

                }catch (SQLException se){se.printStackTrace();}
                //sort
                ArrayList<Integer> charityamountssorted = charityamounts;
                Collections.sort(charityamountssorted);
                ArrayList<String> charitynamessorted = new ArrayList<>();
                for (int amount1 : charityamountssorted){
                    for (int amount2 : charityamounts){
                        if (amount2==amount1){
                            charitynamessorted.add(charitynames.get(charityamounts.indexOf(amount2)));
                            System.out.println(charitynames.get(charityamounts.indexOf(amount2)));
                        }
                    }
                }
                //print
                for (int i = charitynamessorted.size()-1; i >= 0; i--) {
                    ResultSet charitysortedRs = sqlquery("select * from charity where charityname = '" +charitynamessorted.get(i)+ "'");
                    try {
                        while (charitysortedRs.next()) {
                            try {
                                ImageView chaityimage = new ImageView(new Image(new FileInputStream("C:\\Users\\admin3\\Desktop\\Mskills resources\\charity images\\" + charitysortedRs.getString("charitylogo"))));
                                chaityimage.fitHeightProperty().bind(resultsScrollPane.heightProperty().divide(500).multiply(100));
                                chaityimage.setPreserveRatio(true);
                                resultslist.addAll(chaityimage);
                            } catch (FileNotFoundException fe) {
                                fe.printStackTrace();
                            }
                            Label infoLabel = new Label(charitysortedRs.getString("charityname") + "\n" + charitysortedRs.getString("charitydescription"));
                            infoLabel.setTextAlignment(TextAlignment.LEFT);
                            infoLabel.prefWidthProperty().bind(resultsScrollPane.widthProperty().divide(500).multiply(100));
                            infoLabel.setWrapText(true);
                            infoLabel.prefHeightProperty().bind(resultsScrollPane.heightProperty().divide(500).multiply(350));
                            resultslist.addAll(infoLabel);
                            Label amountLabel = new Label(Integer.toString(charityamountssorted.get(charitynamessorted.indexOf(charitynamessorted.get(i)))));
                            resultslist.addAll(amountLabel);
                        }
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        });
        //sequel
        ResultSet charityinfoRs = sqlquery("select * from charity");
        try {
            while (charityinfoRs.next()){
                try {
                    ImageView chaityimage = new ImageView(new Image(new FileInputStream("C:\\Users\\admin3\\Desktop\\Mskills resources\\charity images\\"+charityinfoRs.getString("charitylogo"))));
                    chaityimage.fitHeightProperty().bind(resultsScrollPane.heightProperty().divide(500).multiply(100));
                    chaityimage.setPreserveRatio(true);
                    resultslist.addAll(chaityimage);
                }catch (FileNotFoundException fe){fe.printStackTrace();}

                Label infoLabel = new Label(charityinfoRs.getString("charityname")+"\n"+charityinfoRs.getString("charitydescription"));
                infoLabel.setTextAlignment(TextAlignment.LEFT);
                infoLabel.prefWidthProperty().bind(resultsScrollPane.widthProperty().divide(500).multiply(100));
                infoLabel.setWrapText(true);
                infoLabel.prefHeightProperty().bind(resultsScrollPane.heightProperty().divide(500).multiply(350));
                resultslist.addAll(infoLabel);

                ResultSet amountRs = sqlquery("select charityname, amount from registration inner join sponsorship inner join charity\n" +
                        "on charity.CharityId = registration.CharityId and sponsorship.RegistrationId = registration.RegistrationId " +
                        "where charityname = '"+charityinfoRs.getString("charityname")+"'");
                int charityamount=0;
                while (amountRs.next()){
                    charityamount=charityamount+amountRs.getInt("amount");
                }
                resultslist.addAll(new Label(Integer.toString(charityamount)));
            }
        }catch (SQLException se){se.printStackTrace();}
    }


    private void edit_user(String useremail){
        Object[] oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //---------------node definitions-----------
        //buttons
        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");
        //textfields
        TextField firstnameTextField = new TextField();
        TextField lastnameTextField = new TextField();
        TextField passwdTextField = new TextField();
        TextField passwdcheckTextField = new TextField();
        //labels
        Label topLabel = new Label("Edit a user");
        Label passtextLabel = new Label("Change password\nLeave these fields blank if you \ndon't want to change the password");

        Label useremailLabel = new Label(useremail);
        Label emailLabel = new Label("Email: ");
        Label firstnameLabel = new Label("First Name: ");
        Label lastnameLabel = new Label("Last Name: ");
        Label roleLabel = new Label("Role: ");
        Label passwdLabel = new Label("Password");
        Label passwdcheckLabel = new Label("Password Again");
        //combobreaker
        ComboBox roleComboBox = new ComboBox();
        //Styling nodes
        //-------------------panes and scene--------------
        GridPane leftGridPane = new GridPane();
        GridPane rightGridPane = new GridPane();
        VBox rightVBox = new VBox(passtextLabel, rightGridPane);
        HBox midHBox = new HBox(leftGridPane,rightVBox);
        HBox botHBox = new HBox(saveButton,cancelButton);
        VBox mainVBox = new VBox(topLabel,midHBox,botHBox);
        //------------------------pane properties--------------
        GridPane[] panelist = {rightGridPane,leftGridPane};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }

        main.add(mainVBox,0,0);
        botHBox.setAlignment(Pos.CENTER);

        leftGridPane.add(emailLabel,0,0);
        leftGridPane.add(firstnameLabel,0,1);
        leftGridPane.add(lastnameLabel,0,2);
        leftGridPane.add(roleLabel,0,3);
        leftGridPane.add(useremailLabel,1,0);
        leftGridPane.add(firstnameTextField,1,1);
        leftGridPane.add(lastnameTextField,1,2);
        leftGridPane.add(roleComboBox,1,3);

        rightGridPane.add(passwdLabel,0,0);
        rightGridPane.add(passwdcheckLabel,0,1);
        rightGridPane.add(passwdTextField,1,0);
        rightGridPane.add(passwdcheckTextField,1,1);

        primaryStage.setWidth(550);
        primaryStage.setHeight(550);
        //------------ --button actions--------------
        String passwdquery = "";
        if (passwdTextField.getText().length() >= 6
                && passwdTextField.getText().matches(".*[!@#$%^]+.*")
                && passwdTextField.getText().matches(".*[A-Z]+.*")
                && passwdTextField.getText().matches(".*\\d+.*")
                && passwdTextField.getText().equals(passwdcheckTextField.getText())){
            passwdquery = ", password = '"+passwdcheckTextField.getText()+"'";
        }
        final String passquer = passwdquery;
        saveButton.setOnAction(event -> {
            sqlinsert("update user" +
                    " set firstname = '"+firstnameTextField.getText()+"' , lastname = '"+lastnameTextField.getText()+"' , roleid = (select roleid from role where rolename = '"+roleComboBox.getSelectionModel().getSelectedItem().toString()+"' )"+passquer+
                    "where email = '"+useremail+"'");
        });
        //sql
        ResultSet roleResultSet = sqlquery("select * from role");
        try {
            while (roleResultSet.next()){
                roleComboBox.getItems().addAll(roleResultSet.getString("rolename"));
            }
        }catch (SQLException se){se.printStackTrace();}
    }


    private void add_user(){
        Object[] oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //---------------node definitions-----------
        //buttons
        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");
        //textfields
        TextField emailTextField  = new TextField();
        TextField firstnameTextField = new TextField();
        TextField lastnameTextField = new TextField();
        TextField passwdTextField = new TextField();
        TextField passwdcheckTextField = new TextField();
        //labels
        Label topLabel = new Label("Edit a user");
        Label passtextLabel = new Label("Change password\nLeave these fields blank if you \ndon't want to change the password");

        Label emailLabel = new Label("Email: ");
        Label firstnameLabel = new Label("First Name: ");
        Label lastnameLabel = new Label("Last Name: ");
        Label roleLabel = new Label("Role: ");
        Label passwdLabel = new Label("Password");
        Label passwdcheckLabel = new Label("Password Again");
        //combobreaker
        ComboBox roleComboBox = new ComboBox();
        //Styling nodes
        //-------------------panes and scene--------------
        GridPane leftGridPane = new GridPane();
        GridPane rightGridPane = new GridPane();
        VBox rightVBox = new VBox(passtextLabel, rightGridPane);
        HBox midHBox = new HBox(leftGridPane,rightVBox);
        HBox botHBox = new HBox(saveButton,cancelButton);
        VBox mainVBox = new VBox(topLabel,midHBox,botHBox);
        //------------------------pane properties--------------
        GridPane[] panelist = {rightGridPane,leftGridPane};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }

        main.add(mainVBox,0,0);
        botHBox.setAlignment(Pos.CENTER);

        leftGridPane.add(emailLabel,0,0);
        leftGridPane.add(firstnameLabel,0,1);
        leftGridPane.add(lastnameLabel,0,2);
        leftGridPane.add(roleLabel,0,3);
        leftGridPane.add(emailTextField,1,0);
        leftGridPane.add(firstnameTextField,1,1);
        leftGridPane.add(lastnameTextField,1,2);
        leftGridPane.add(roleComboBox,1,3);

        rightGridPane.add(passwdLabel,0,0);
        rightGridPane.add(passwdcheckLabel,0,1);
        rightGridPane.add(passwdTextField,1,0);
        rightGridPane.add(passwdcheckTextField,1,1);

        primaryStage.setWidth(550);
        primaryStage.setHeight(550);
        //------------ --button actions--------------
        saveButton.setOnAction(event -> {
            if (passwdTextField.getText().length() >= 6
                    && passwdTextField.getText().matches(".*[!@#$%^]+.*")
                    && passwdTextField.getText().matches(".*[A-Z]+.*")
                    && passwdTextField.getText().matches(".*\\d+.*")
                    && passwdTextField.getText().equals(passwdcheckTextField.getText())) {
                sqlinsert("insert user" +
                        " set email = '"+emailTextField.getText()+"',firstname = '" + firstnameTextField.getText() + "' , lastname = '" + lastnameTextField.getText() + "' , roleid = (select roleid from role where rolename = '" + roleComboBox.getSelectionModel().getSelectedItem().toString() + "' ), password = '" + passwdcheckTextField.getText() + "'");
            }
        });

        //sql
        ResultSet roleResultSet = sqlquery("select * from role");
        try {
            while (roleResultSet.next()){
                roleComboBox.getItems().addAll(roleResultSet.getString("rolename"));
            }
        }catch (SQLException se){se.printStackTrace();}
    }


    private Object[] gridpane_preset() {
        //-------------------panes and scene--------------
        BorderPane root = new BorderPane();
        GridPane header = new GridPane();
        GridPane footer = new GridPane();
        GridPane main = new GridPane();
        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());
        //------------------node definitions-----------
        //buttons
        Button back = new Button("Back");
        //labels
        Label titlelabel = new Label("Marathon Skills 2019");
        //Styling nodes
        header.setId("header-footer");
        footer.setId("header-footer");
        main.setId("mainpane");
        titlelabel.setId("heading-font");
        //------------------------pane properties--------------
        GridPane[] panelist = {header, main, footer};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        footer.setPrefHeight(30);
        header.setPrefHeight(60);
        root.setTop(header);
        root.setCenter(main);
        root.setBottom(footer);

        header.add(back, 0, 0);
        header.add(titlelabel, 1, 0);
        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Marathon skills 2015");
        primaryStage.setScene(scene);
        primaryStage.show();
        //-----------------------button actions-----------------
        back.setOnAction(value -> {
            start(primaryStage);
        });
        Object[] outs = new Object[2];
        outs[0] = scene;
        outs[1] = main;
        return outs;
    }


    private Object[] scrollpane_preset() {
        //-------------------panes and scene--------------
        BorderPane root = new BorderPane();
        GridPane header = new GridPane();
        GridPane footer = new GridPane();
        ScrollPane main = new ScrollPane();
        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().add(getClass().getResource("styling.css").toString());
        //------------------node definitions-----------
        //buttons
        Button back = new Button("Back");
        //labels
        Label titlelabel = new Label("Marathon Skills 2019");
        //Styling nodes
        header.setId("header-footer");
        footer.setId("header-footer");
        main.setId("mainpane");
        titlelabel.setId("heading-font");
        //------------------------pane properties--------------
        GridPane[] panelist = {header, footer};
        for (GridPane pane : panelist) {
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        footer.setPrefHeight(30);
        header.setPrefHeight(60);
        root.setTop(header);
        root.setCenter(main);
        root.setBottom(footer);

        header.add(back, 0, 0);
        header.add(titlelabel, 1, 0);
        //-----------------------primary stage properties-----------------
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setTitle("Marathon skills 2015");
        primaryStage.setScene(scene);
        primaryStage.show();
        //-----------------------button actions-----------------
        back.setOnAction(value -> {
            start(primaryStage);
        });
        Object[] outs = new Object[2];
        outs[0] = scene;
        outs[1] = main;
        return outs;
    }


    private String signin(String uemail, String upassword) {
        String roleid = new String();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

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
            while (rs.next()) {
                String email = rs.getString("email");
                String password = rs.getString("password");
                String role = rs.getString("roleid");
                if (uemail.equals(email) && upassword.equals(password)) {
                    currentEmail = email;
                    signedin = true;
                    System.out.println("signed in");
                    System.out.println(email + "\n" + password);
                    if (role.equals("R")) {
                        System.out.println("runner");
                    }
                    if (role.equals("C")) {
                        System.out.println("Coordinator");
                    }
                    if (role.equals("A")) {
                        System.out.println("Admin");
                    }
                    roleid = role;
                    break;
                }
            }
            if (!signedin) {
                System.out.println("email or password is incorrect");
                Stage secondarystage = new Stage();
                GridPane popup = new GridPane();
                popup.setAlignment(Pos.CENTER);
                Scene scene2 = new Scene(popup, 400, 300);
                Label errorlabel = new Label("email or password is incorrect");
                errorlabel.setFont(Font.font("Open Sans", 30));
                popup.add(errorlabel, 0, 0);
                secondarystage.setScene(scene2);
                secondarystage.setTitle("Error");
                secondarystage.show();
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handles jdbc errors
            se.printStackTrace();
            Stage secondarystage = new Stage();
            GridPane popup = new GridPane();
            popup.setAlignment(Pos.CENTER);
            Scene scene2 = new Scene(popup, 400, 300);
            Label errorlabel = new Label(se.toString());
            errorlabel.setFont(Font.font("Open Sans", 30));
            popup.add(errorlabel, 0, 0);
            secondarystage.setScene(scene2);
            secondarystage.setTitle("Error");
            secondarystage.show();
        } catch (Exception e) {
            //Handles errors for Class.forname
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                // nothing we can do
            }
        }
        return (roleid);
    }


    private ResultSet sqlquery(String query) {
        Connection conn = null;
        Statement stmnt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmnt = conn.createStatement();
            return stmnt.executeQuery(query);
        } catch (Exception se) {
            se.printStackTrace();
            Stage secondarystage = new Stage();
            GridPane popup = new GridPane();
            popup.setAlignment(Pos.CENTER);
            Scene scene2 = new Scene(popup, 400, 300);
            Label errorlabel = new Label(se.toString());
            errorlabel.setFont(Font.font("Open Sans", 30));
            popup.add(errorlabel, 0, 0);
            secondarystage.setScene(scene2);
            secondarystage.setTitle("Error");
            secondarystage.show();
            return null;
        } finally {
            //finally block used to close resources
        }
    }


    private void sqlinsert(String query) {
        Connection conn = null;
        Statement stmnt = null;
        try {

            String URL = "jdbc:mysql://127.0.0.1:3306/cpt01?allowprivateKeyRetrieval=true&useSSL=False";
            String USER = "root";
            String PASS = "mypass";
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("connected");
            Statement stmt = conn.createStatement();
            stmt.execute(query);


        } catch (SQLException e) {
            e.printStackTrace();
            e.printStackTrace();
            Stage secondarystage = new Stage();
            GridPane popup = new GridPane();
            popup.setAlignment(Pos.CENTER);
            Scene scene2 = new Scene(popup, 400, 300);
            Label errorlabel = new Label(e.toString());
            errorlabel.setFont(Font.font("Open Sans", 30));
            popup.add(errorlabel, 0, 0);
            secondarystage.setScene(scene2);
            secondarystage.setTitle("Error");
            secondarystage.show();
        }
    }


    private static void main(String[] args) {
        try {
            launch(args);
        } catch (Exception e) {
            e.printStackTrace();
            Stage secondarystage = new Stage();
            GridPane popup = new GridPane();
            popup.setAlignment(Pos.CENTER);
            Scene scene2 = new Scene(popup, 400, 300);
            Label errorlabel = new Label(e.toString());
            errorlabel.setFont(Font.font("Open Sans", 30));
            popup.add(errorlabel, 0, 0);
            secondarystage.setScene(scene2);
            secondarystage.setTitle("Error");
            secondarystage.show();
        }
    }
}


/*      Object[] oarr = gridpane_preset();
        GridPane main = (GridPane) oarr[1];
        Scene scene = (Scene) oarr[0];
        //---------------node definitions-----------
        //buttons
        //textfields
        //labels
        //Styling nodes
        //-------------------panes and scene--------------
        //------------------------pane properties--------------
        GridPane[] panelist = {};
        for (GridPane pane : panelist){
            pane.setPadding(new Insets(10));
            pane.setVgap(10);
            pane.setHgap(10);
            pane.setAlignment(Pos.CENTER);
        }
        //--------------button actions--------------*/

