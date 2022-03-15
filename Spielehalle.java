import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.*;
import je.NumberField;
import javafx.scene.text.*;
import java.awt.Color;
import javafx.scene.layout.Background;
import javafx.geometry.*;
import javafx.scene.text.Font;


public class Spielehalle extends Application {
  // Anfang Attribute
  private NumberField numberField1 = new NumberField();
  private Button button1 = new Button();
  private Label label1 = new Label();
  private Button button2 = new Button();
  private Button button3 = new Button();
  private Button button4 = new Button();
  private Button button5 = new Button();
  private Button button6 = new Button();
  private Button button7 = new Button();
  private Button button8 = new Button();
  private Button button9 = new Button();
  private Button button10 = new Button();
  private Button button11 = new Button();
  private Button button12 = new Button();
  private Label label2 = new Label();
  private Label label3 = new Label();
  private CheckBox checkBox1 = new CheckBox();
  private CheckBox checkBox2 = new CheckBox();
  private CheckBox checkBox3 = new CheckBox();
  private Label label4 = new Label();
  private Label label5 = new Label();
  private Label label6 = new Label();
  private Button button13 = new Button();
  private Button button14 = new Button();
  private Button button20 = new Button();
  private Button button21 = new Button();
  private Button button24 = new Button();
  private Button button25 = new Button();
  private Button button26 = new Button();
  private Label label71 = new Label();
  private Label label81 = new Label();
  private Label label91 = new Label();
  private Label label101 = new Label();
  private Label label111 = new Label();
  private Button button22 = new Button();
  private Button button23 = new Button();
  
  private Label label12 = new Label();
  private Button button15 = new Button();
  private Button button16 = new Button();
  private Button button17 = new Button();
  private Button button18 = new Button();
  private Button button19 = new Button();
  // Ende Attribute
  
  int eZahl = (int)(Math.random() * 100);
  int counter = 10;
  private Pane root;
  int lol = 0;
  private int spieler = 1;
  int L7 = 0;
  int L8 = 1;
  int L9 = 2;
  int L10 = 3;
  int L11 = 4;
  int s = 0;
  
  
  public void start(Stage primaryStage) { 
    root = new Pane();
    Scene scene = new Scene(root, 815, 428);
    // Anfang Komponenten
    
    button1.setLayoutX(32);
    button1.setLayoutY(304);
    button1.setPrefHeight(33);
    button1.setPrefWidth(249);
    button1.setOnAction(
    (event) -> {button1_Action(event);} 
    );
    button1.setText("(Neu) Starten!");
    root.getChildren().add(button1);
    button2.setLayoutX(32);
    button2.setLayoutY(256);
    button2.setPrefHeight(41);
    button2.setPrefWidth(249);
    button2.setOnAction(
    (event) -> {button2_Action(event);} 
    );
    button2.setText("Hier überprüfen!");
    root.getChildren().add(button2);
    label1.setLayoutX(32);
    label1.setLayoutY(176);
    label1.setPrefHeight(25);
    label1.setPrefWidth(249);
    label1.setText("Zahlen raten!");
    label1.setContentDisplay(ContentDisplay.CENTER);
    label1.setAlignment(Pos.CENTER);
    root.getChildren().add(label1);
    numberField1.setLayoutX(32);
    numberField1.setLayoutY(216);
    numberField1.setPrefHeight(33);
    numberField1.setPrefWidth(249);
    numberField1.setPromptText("Hier Deine geschätzte Zahl eingeben!");
    root.getChildren().add(numberField1);
    button3.setLayoutX(320);
    button3.setLayoutY(208);
    button3.setPrefHeight(49);
    button3.setPrefWidth(49);
    button3.setOnAction(
    (event) -> {button3_Action(event);} 
    );
    root.getChildren().add(button3);
    button4.setLayoutX(376);
    button4.setLayoutY(208);
    button4.setPrefHeight(49);
    button4.setPrefWidth(49);
    button4.setOnAction(
    (event) -> {button4_Action(event);} 
    );
    root.getChildren().add(button4);
    button5.setLayoutX(432);
    button5.setLayoutY(208);
    button5.setPrefHeight(49);
    button5.setPrefWidth(49);
    button5.setOnAction(
    (event) -> {button5_Action(event);} 
    );
    root.getChildren().add(button5);
    button6.setLayoutX(320);
    button6.setLayoutY(264);
    button6.setPrefHeight(49);
    button6.setPrefWidth(49);
    button6.setOnAction(
    (event) -> {button6_Action(event);} 
    );
    root.getChildren().add(button6);
    button7.setLayoutX(376);
    button7.setLayoutY(264);
    button7.setPrefHeight(49);
    button7.setPrefWidth(49);
    button7.setOnAction(
    (event) -> {button7_Action(event);} 
    );
    root.getChildren().add(button7);
    button8.setLayoutX(432);
    button8.setLayoutY(264);
    button8.setPrefHeight(49);
    button8.setPrefWidth(49);
    button8.setOnAction(
    (event) -> {button8_Action(event);} 
    );
    root.getChildren().add(button8);
    button9.setLayoutX(320);
    button9.setLayoutY(320);
    button9.setPrefHeight(49);
    button9.setPrefWidth(49);
    button9.setOnAction(
    (event) -> {button9_Action(event);} 
    );
    root.getChildren().add(button9);
    button10.setLayoutX(376);
    button10.setLayoutY(320);
    button10.setPrefHeight(49);
    button10.setPrefWidth(49);
    button10.setOnAction(
    (event) -> {button10_Action(event);} 
    );
    root.getChildren().add(button10);
    button11.setLayoutX(432);
    button11.setLayoutY(320);
    button11.setPrefHeight(49);
    button11.setPrefWidth(49);
    button11.setOnAction(
    (event) -> {button11_Action(event);} 
    );
    root.getChildren().add(button11);
    button12.setLayoutX(320);
    button12.setLayoutY(384);
    button12.setPrefHeight(25);
    button12.setPrefWidth(161);
    button12.setOnAction(
    (event) -> {button12_Action(event);} 
    );
    button12.setText("Neu starten!");
    root.getChildren().add(button12);
    label2.setLayoutX(320);
    label2.setLayoutY(176);
    label2.setPrefHeight(25);
    label2.setPrefWidth(161);
    label2.setText("TicTacToe für Informatiker!");
    label2.setContentDisplay(ContentDisplay.CENTER);
    label2.setAlignment(Pos.CENTER);
    root.getChildren().add(label2);
    
    
    
    label3.setLayoutX(32);
    label3.setLayoutY(392);
    label3.setPrefHeight(17);
    label3.setPrefWidth(169);
    label3.setText("Standard: 0 bis 100!");
    label3.setAlignment(Pos.CENTER);
    label3.setUnderline(false);
    root.getChildren().add(label3);
    root.setStyle("-fx-background-color: #b5b5b5");
    
    checkBox1.setLayoutX(208);
    checkBox1.setLayoutY(344);
    checkBox1.setPrefHeight(17);
    checkBox1.setPrefWidth(73);
    checkBox1.setText("0 bis 50");
    root.getChildren().add(checkBox1);
    checkBox2.setLayoutX(208);
    checkBox2.setLayoutY(368);
    checkBox2.setPrefHeight(17);
    checkBox2.setPrefWidth(80);
    checkBox2.setText("0 bis 150");
    root.getChildren().add(checkBox2);
    checkBox3.setLayoutX(208);
    checkBox3.setLayoutY(392);
    checkBox3.setPrefHeight(17);
    checkBox3.setPrefWidth(80);
    checkBox3.setText("0 bis 200");
    root.getChildren().add(checkBox3);
    label4.setPrefHeight(17);
    label4.setPrefWidth(169);
    label4.setLayoutX(24);
    label4.setLayoutY(344);
    label4.setText("Zahlenbereich wählen:");
    label4.setAlignment(Pos.CENTER);
    root.getChildren().add(label4);
    label5.setLayoutX(24);
    label5.setLayoutY(368);
    label5.setPrefHeight(17);
    label5.setPrefWidth(169);
    label5.setText("... und dann Starten! klicken.");
    label5.setAlignment(Pos.CENTER);
    root.getChildren().add(label5);
    label6.setLayoutX(32);
    label6.setLayoutY(16);
    label6.setPrefHeight(81);
    label6.setPrefWidth(753);
    label6.setText("Spielehalle für Informatiker");
    label6.setAlignment(Pos.CENTER);
    label6.setFont(Font.font("Impact", 36));
    root.getChildren().add(label6);
    button13.setLayoutX(32);
    button13.setLayoutY(112);
    button13.setPrefHeight(49);
    button13.setPrefWidth(249);
    button13.setOnAction(
    (event) -> {button13_Action(event);} 
    );
    button13.setText("ZAHLEN RATEN");
    button13.setFont(Font.font("Small Fonts", 20));
    button13.setAlignment(Pos.CENTER);
    root.getChildren().add(button13);
    button14.setLayoutX(320);
    button14.setLayoutY(112);
    button14.setPrefHeight(49);
    button14.setPrefWidth(161);
    button14.setOnAction(
    (event) -> {button14_Action(event);} 
    );
    button14.setText("TIC TAC TOE");
    button14.setAlignment(Pos.CENTER);
    button14.setFont(Font.font("Small Fonts", 20));
    root.getChildren().add(button14);
    
    // Generelles Ausblenden
    
    label1.setVisible(false);
    label3.setVisible(false);
    label4.setVisible(false);
    label5.setVisible(false);
    numberField1.setVisible(false);
    button1.setVisible(false);
    button2.setVisible(false);
    checkBox1.setVisible(false);
    checkBox2.setVisible(false);
    checkBox3.setVisible(false);
    label2.setVisible(false);
    button3.setVisible(false);
    button4.setVisible(false);
    button5.setVisible(false);
    button6.setVisible(false);
    button7.setVisible(false);
    button8.setVisible(false);
    button9.setVisible(false);
    button10.setVisible(false);
    button11.setVisible(false);
    button12.setVisible(false);
    button15.setVisible(false);
    button16.setVisible(false);
    button17.setVisible(false);
    button18.setVisible(false);
    button19.setVisible(false);
    button20.setVisible(false);
    button21.setVisible(false);
    button24.setVisible(false);
    button25.setVisible(false);
    button26.setVisible(false);
    button23.setVisible(false);
    label12.setVisible(false);
    
    label71.setStyle("-fx-background-color: ");
    label81.setStyle("-fx-background-color: ");
    label91.setStyle("-fx-background-color: ");
    label101.setStyle("-fx-background-color: ");
    label111.setStyle("-fx-background-color: ");
    
    // Galaxy Shooter
    
    button20.setLayoutX(520);
    button20.setLayoutY(352);
    button20.setPrefHeight(25);
    button20.setPrefWidth(41);
    button20.setOnAction(
    (event) -> {button20_Action(event);} 
    );
    root.getChildren().add(button20);
    button21.setLayoutX(576);
    button21.setLayoutY(352);
    button21.setPrefHeight(25);
    button21.setPrefWidth(41);
    button21.setOnAction(
    (event) -> {button21_Action(event);} 
    );
    root.getChildren().add(button21);
    button24.setLayoutX(632);
    button24.setLayoutY(352);
    button24.setPrefHeight(25);
    button24.setPrefWidth(41);
    button24.setOnAction(
    (event) -> {button24_Action(event);} 
    );
    root.getChildren().add(button24);
    button25.setLayoutX(688);
    button25.setLayoutY(352);
    button25.setPrefHeight(25);
    button25.setPrefWidth(41);
    button25.setOnAction(
    (event) -> {button25_Action(event);} 
    );
    root.getChildren().add(button25);
    button26.setLayoutX(744);
    button26.setLayoutY(352);
    button26.setPrefHeight(25);
    button26.setPrefWidth(41);
    button26.setOnAction(
    (event) -> {button26_Action(event);} 
    );
    root.getChildren().add(button26);
    label71.setLayoutX(536);
    label71.setLayoutY(232);
    label71.setPrefHeight(113);
    label71.setPrefWidth(9);
    label71.setText("");
    root.getChildren().add(label71);
    label81.setLayoutX(592);
    label81.setLayoutY(232);
    label81.setPrefHeight(113);
    label81.setPrefWidth(9);
    label81.setText("");
    root.getChildren().add(label81);
    label91.setLayoutX(648);
    label91.setLayoutY(232);
    label91.setPrefHeight(113);
    label91.setPrefWidth(9);
    label91.setText("");
    root.getChildren().add(label91);
    label101.setLayoutX(704);
    label101.setLayoutY(232);
    label101.setPrefHeight(113);
    label101.setPrefWidth(9);
    label101.setText("");
    root.getChildren().add(label101);
    label111.setLayoutX(760);
    label111.setLayoutY(232);
    label111.setPrefHeight(113);
    label111.setPrefWidth(9);
    label111.setText("");
    root.getChildren().add(label111);
    button22.setLayoutX(520);
    button22.setLayoutY(112);
    button22.setPrefHeight(49);
    button22.setPrefWidth(265);
    button22.setOnAction(
    (event) -> {button22_Action(event);} 
    );
    button22.setText("GALAXY SHOOTER");
    button22.setAlignment(Pos.CENTER);
    button22.setFont(Font.font("Small Fonts", 20));
    root.getChildren().add(button22);
    
    button23.setLayoutX(520);
    button23.setLayoutY(384);
    button23.setPrefHeight(25);
    button23.setPrefWidth(265);
    button23.setOnAction(
    (event) -> {button23_Action(event);} 
    );
    button23.setText("Spiel (neu)starten!");
    root.getChildren().add(button23);
    label12.setLayoutX(520);
    label12.setLayoutY(176);
    label12.setPrefHeight(25);
    label12.setPrefWidth(265);
    label12.setText("Ein modernes Geschicklichkeitsspiel!");
    label12.setAlignment(Pos.CENTER);
    root.getChildren().add(label12);
    button15.setLayoutX(520);
    button15.setLayoutY(208);
    button15.setPrefHeight(25);
    button15.setPrefWidth(41);
    button15.setOnAction(
    (event) -> {button15_Action(event);} 
    );
    root.getChildren().add(button15);
    button16.setLayoutX(576);
    button16.setLayoutY(208);
    button16.setPrefHeight(25);
    button16.setPrefWidth(41);
    button16.setOnAction(
    (event) -> {button16_Action(event);} 
    );
    root.getChildren().add(button16);
    button17.setLayoutX(632);
    button17.setLayoutY(208);
    button17.setPrefHeight(25);
    button17.setPrefWidth(41);
    button17.setOnAction(
    (event) -> {button17_Action(event);} 
    );
    root.getChildren().add(button17);
    button18.setLayoutX(688);
    button18.setLayoutY(208);
    button18.setPrefHeight(25);
    button18.setPrefWidth(41);
    button18.setOnAction(
    (event) -> {button18_Action(event);} 
    );
    root.getChildren().add(button18);
    button19.setLayoutX(744);
    button19.setLayoutY(208);
    button19.setPrefHeight(25);
    button19.setPrefWidth(41);
    button19.setOnAction(
    (event) -> {button19_Action(event);} 
    );
    root.getChildren().add(button19);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("Spielehalle!");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public Spielehalle
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  
  // Zahlen raten!
  
  
  public void button1_Action(Event evt) {
    // Auswählen
    if (checkBox1.isSelected()) {
      eZahl = (int)(Math.random() * 50);
      checkBox1.setSelected(false);
    } else if (checkBox2.isSelected()) {
      eZahl = (int)(Math.random() * 150);
      checkBox2.setSelected(false);  
    } else if (checkBox3.isSelected()) {
      eZahl = (int)(Math.random() * 200);
      checkBox3.setSelected(false);
    } else {
      eZahl = (int)(Math.random() * 100);
    }
    
    // Reset des Buttons und Labels
    button2.setDisable(false);
    button2.setText("Hier überprüfen!");
    label1.setText("Zahlen raten!");
    counter = 10;
    label1.setStyle("-fx-background-color: ");
  } 

  public void button2_Action(Event evt) {
    // Zähler
    counter = counter - 1;
    button2.setText("Noch "+ counter +" Versuche.");
    
    // Prüfung, ob Zahl richtig ist.  
    int gZahl = numberField1.getInt();
    if (gZahl < eZahl) {
      label1.setText("Zahl ist zu klein!");
      label1.setStyle("-fx-background-color: #f01b1b");
    } else {
      if (gZahl > eZahl) {
        label1.setText("Zahl ist zu groß!");
        label1.setStyle("-fx-background-color: #f01b1b");
      } else {
        label1.setText("Getroffen und versenkt!");
        label1.setStyle("-fx-background-color: #09c920");
      }
    }
    
    // Deaktivierung des Buttons
    if (counter == 0) {
      button2.setDisable(true);
      button2.setText("Keine Versuche mehr!");
      label1.setText("Tja, verloren!");
      label1.setStyle("-fx-background-color: #f01b1b");
    }
  }
  
  // Tic Tac Toe für Informatiker
  
  
  public int gewonnen() {
    // Abfrage ob gewonnen
    if (
    (button3.getText() == "X" && button4.getText() == "X" && button5.getText() == "X") ||
    (button6.getText() == "X" && button7.getText() == "X" && button8.getText() == "X") ||
    (button9.getText() == "X" && button10.getText() == "X" && button11.getText() == "X") ||
    (button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X") ||
    (button4.getText() == "X" && button7.getText() == "X" && button10.getText() == "X") ||
    (button5.getText() == "X" && button8.getText() == "X" && button11.getText() == "X") ||
    (button5.getText() == "X" && button7.getText() == "X" && button9.getText() == "X") ||
    (button3.getText() == "X" && button7.getText() == "X" && button11.getText() == "X")
    ) {
      int x = 1;
      return x;     
    }
    
    if (
    (button3.getText() == "O" && button4.getText() == "O" && button5.getText() == "O") ||
    (button6.getText() == "O" && button7.getText() == "O" && button8.getText() == "O") ||
    (button9.getText() == "O" && button10.getText() == "O" && button11.getText() == "O") ||
    (button3.getText() == "O" && button6.getText() == "O" && button9.getText() == "O") ||
    (button4.getText() == "O" && button7.getText() == "O" && button10.getText() == "O") ||
    (button5.getText() == "O" && button8.getText() == "O" && button11.getText() == "O") ||
    (button5.getText() == "O" && button7.getText() == "O" && button9.getText() == "O") ||
    (button3.getText() == "O" && button7.getText() == "O" && button11.getText() == "O")
    ) {
      int o = 2;
      return o;               
    }
    return lol;
  }

  public void button3_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {
      button3.setText("X");
      spieler = 2;
      button3.setDisable(true);
    } else {
      button3.setText("O");
      spieler  = 1;
      button3.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
  }

  public void button4_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {
      button4.setText("X");
      spieler = 2;
      button4.setDisable(true);
    } else {
      button4.setText("O");
      spieler  = 1;
      button4.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
    
  }

  public void button5_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {
      button5.setText("X");
      spieler = 2;
      button5.setDisable(true);
    } else {
      button5.setText("O");
      spieler  = 1;
      button5.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
    
  }

  public void button6_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {
      button6.setText("X");
      spieler = 2;
      button6.setDisable(true);
    } else {
      button6.setText("O");
      spieler  = 1;
      button6.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
    
  }

  public void button7_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {
      button7.setText("X");
      spieler = 2;
      button7.setDisable(true);
    } else {
      button7.setText("O");
      spieler  = 1;
      button7.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
  }

  public void button8_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {
      button8.setText("X");
      spieler = 2;
      button8.setDisable(true);
    } else {
      button8.setText("O");
      spieler  = 1;
      button8.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
    
  }

  public void button9_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {
      button9.setText("X");
      spieler = 2;
      button9.setDisable(true);
    } else {
      button9.setText("O");
      spieler  = 1;
      button9.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
    
  }

  public void button10_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {
      button10.setText("X");
      spieler = 2;
      button10.setDisable(true);
    } else {
      button10.setText("O");
      spieler  = 1;
      button10.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
    
  }

  public void button11_Action(Event evt) {
    // Button wird geklickt
    if (spieler == 1) {  
      button11.setText("X");
      spieler = 2;
      button11.setDisable(true);
    } else {
      button11.setText("O");
      spieler  = 1;
      button11.setDisable(true);  
    }
    if (gewonnen() == 1) {
      label2.setText("Spieler 1 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);       
    }
    if (gewonnen() == 2) {
      label2.setText("Spieler 2 hat gewonnen!");
      button3.setDisable(true);
      button4.setDisable(true);
      button5.setDisable(true);
      button6.setDisable(true);
      button7.setDisable(true);
      button8.setDisable(true);
      button9.setDisable(true);
      button10.setDisable(true);
      button11.setDisable(true);        
    }
  }  
  
  public void button12_Action(Event evt) {
    // Wiederherstellen
    button3.setDisable(false);
    button4.setDisable(false);
    button5.setDisable(false);
    button6.setDisable(false);
    button7.setDisable(false);
    button8.setDisable(false);
    button9.setDisable(false);
    button10.setDisable(false);
    button11.setDisable(false);
    button3.setText("");
    button4.setText("");
    button5.setText("");
    button6.setText("");
    button7.setText("");
    button8.setText("");
    button9.setText("");
    button10.setText("");
    button11.setText("");
    label2.setText("TicTacToe für Informatiker!");
  }
  
  
  // Ein- und Ausblenden
    
    
  public void button13_Action(Event evt) {
    // Einblenden "Zahlen raten!"
    label1.setVisible(true);
    label3.setVisible(true);
    label4.setVisible(true);
    label5.setVisible(true);
    numberField1.setVisible(true);
    button1.setVisible(true);
    button2.setVisible(true);
    checkBox1.setVisible(true);
    checkBox2.setVisible(true);
    checkBox3.setVisible(true);
    
    // Ausblenden "Tic Tac Toe"
    label2.setVisible(false);
    button3.setVisible(false);
    button4.setVisible(false);
    button5.setVisible(false);
    button6.setVisible(false);
    button7.setVisible(false);
    button8.setVisible(false);
    button9.setVisible(false);
    button10.setVisible(false);
    button11.setVisible(false);
    button12.setVisible(false);
    button3.setDisable(false);
    button4.setDisable(false);
    button5.setDisable(false);
    button6.setDisable(false);
    button7.setDisable(false);
    button8.setDisable(false);
    button9.setDisable(false);
    button10.setDisable(false);
    button11.setDisable(false);
    button3.setText("");
    button4.setText("");
    button5.setText("");
    button6.setText("");
    button7.setText("");
    button8.setText("");
    button9.setText("");
    button10.setText("");
    button11.setText("");
    label2.setText("TicTacToe für Informatiker!");
    
    // Ausblenden "Galaxy Shooter"
    label12.setVisible(false);
    button15.setVisible(false);
    button16.setVisible(false);
    button17.setVisible(false);
    button18.setVisible(false);
    button19.setVisible(false);
    button20.setVisible(false);
    button21.setVisible(false);
    button24.setVisible(false);
    button25.setVisible(false);
    button26.setVisible(false);
    button23.setVisible(false);
    button20.setDisable(false);
    button21.setDisable(false);
    button24.setDisable(false);
    button25.setDisable(false);
    button26.setDisable(false);
    label71.setStyle("-fx-background-color: ");
    label81.setStyle("-fx-background-color: ");
    label91.setStyle("-fx-background-color: ");
    label101.setStyle("-fx-background-color: ");
    label111.setStyle("-fx-background-color: ");
    button15.setText("");
    button16.setText("");
    button17.setText("");
    button18.setText("");
    button19.setText("");
    label12.setText("Ein modernes Geschicklichkeitsspiel!");
    label12.setStyle("-fx-background-color: ");
    button15.setStyle("-fx-text-fill: ");
    button15.setStyle("-fx-background-color: ");
    button16.setStyle("-fx-text-fill: ");
    button16.setStyle("-fx-background-color: ");
    button17.setStyle("-fx-text-fill: ");
    button17.setStyle("-fx-background-color: ");
    button18.setStyle("-fx-text-fill: ");
    button18.setStyle("-fx-background-color: ");
    button19.setStyle("-fx-text-fill: ");
    button19.setStyle("-fx-background-color: ");    
  }

  public void button14_Action(Event evt) {
    // Einblenden "Tic Tac Toe"
    label2.setVisible(true);
    button3.setVisible(true);
    button4.setVisible(true);
    button5.setVisible(true);
    button6.setVisible(true);
    button7.setVisible(true);
    button8.setVisible(true);
    button9.setVisible(true);
    button10.setVisible(true);
    button11.setVisible(true);
    button12.setVisible(true);
    
    // Ausblenden "Zahlen raten!"
    label1.setVisible(false);
    label3.setVisible(false);
    label4.setVisible(false);
    label5.setVisible(false);
    numberField1.setVisible(false);
    button1.setVisible(false);
    button2.setVisible(false);
    checkBox1.setVisible(false);
    checkBox2.setVisible(false);
    checkBox3.setVisible(false);
    button2.setDisable(false);
    button2.setText("Hier überprüfen!");
    label1.setText("Zahlen raten!");
    counter = 10;
    label1.setStyle("-fx-background-color: ");
    
    // Ausblenden "Galaxy Shooter"
    label12.setVisible(false);
    button15.setVisible(false);
    button16.setVisible(false);
    button17.setVisible(false);
    button18.setVisible(false);
    button19.setVisible(false);
    button20.setVisible(false);
    button21.setVisible(false);
    button24.setVisible(false);
    button25.setVisible(false);
    button26.setVisible(false);
    button23.setVisible(false);
    button15.setVisible(false);
    button16.setVisible(false);
    button17.setVisible(false);
    button18.setVisible(false);
    button19.setVisible(false);
    button20.setDisable(false);
    button21.setDisable(false);
    button24.setDisable(false);
    button25.setDisable(false);
    button26.setDisable(false);
    label71.setStyle("-fx-background-color: ");
    label81.setStyle("-fx-background-color: ");
    label91.setStyle("-fx-background-color: ");
    label101.setStyle("-fx-background-color: ");
    label111.setStyle("-fx-background-color: ");
    button15.setText("");
    button16.setText("");
    button17.setText("");
    button18.setText("");
    button19.setText("");
    label12.setText("Ein modernes Geschicklichkeitsspiel!");
    label12.setStyle("-fx-background-color: ");
    button15.setStyle("-fx-text-fill: ");
    button15.setStyle("-fx-background-color: ");
    button16.setStyle("-fx-text-fill: ");
    button16.setStyle("-fx-background-color: ");
    button17.setStyle("-fx-text-fill: ");
    button17.setStyle("-fx-background-color: ");
    button18.setStyle("-fx-text-fill: ");
    button18.setStyle("-fx-background-color: ");
    button19.setStyle("-fx-text-fill: ");
    button19.setStyle("-fx-background-color: ");
  }
  
  public void button22_Action(Event evt) {
    // Einblenden "Galaxy Shooter"
    label12.setVisible(true);
    button15.setVisible(true);
    button16.setVisible(true);
    button17.setVisible(true);
    button18.setVisible(true);
    button19.setVisible(true);
    button20.setVisible(true);
    button21.setVisible(true);
    button24.setVisible(true);
    button25.setVisible(true);
    button26.setVisible(true);
    button23.setVisible(true);
    
    // Ausblenden "Zahlen raten!"
    label1.setVisible(false);
    label3.setVisible(false);
    label4.setVisible(false);
    label5.setVisible(false);
    numberField1.setVisible(false);
    button1.setVisible(false);
    button2.setVisible(false);
    checkBox1.setVisible(false);
    checkBox2.setVisible(false);
    checkBox3.setVisible(false);
    button3.setDisable(false);
    button4.setDisable(false);
    button5.setDisable(false);
    button6.setDisable(false);
    button7.setDisable(false);
    button8.setDisable(false);
    button9.setDisable(false);
    button10.setDisable(false);
    button11.setDisable(false);
    button2.setDisable(false);
    button2.setText("Hier überprüfen!");
    label1.setText("Zahlen raten!");
    counter = 10;
    label1.setStyle("-fx-background-color: ");
    
    // Ausblenden "Tic Tac Toe"
    label2.setVisible(false);
    button3.setVisible(false);
    button4.setVisible(false);
    button5.setVisible(false);
    button6.setVisible(false);
    button7.setVisible(false);
    button8.setVisible(false);
    button9.setVisible(false);
    button10.setVisible(false);
    button11.setVisible(false);
    button12.setVisible(false);
    button3.setText("");
    button4.setText("");
    button5.setText("");
    button6.setText("");
    button7.setText("");
    button8.setText("");
    button9.setText("");
    button10.setText("");
    button11.setText("");
    label2.setText("TicTacToe für Informatiker!");     
  }
  

  // Galaxy Shooter
    
  
  public int GSwin() {
    if (button20.isDisable() == true &&
    button21.isDisable() == true &&
    button24.isDisable() == true &&
    button25.isDisable() == true &&
    button26.isDisable() == true) {
      int g = 1;
      return g;
    }
    return s;
  }
   
  public void button20_Action(Event evt) {
    // Nr. 1
    label71.setStyle("-fx-background-color: #000000");
    button15.setStyle("-fx-text-fill: #FFFFFF");
    button15.setStyle("-fx-background-color: #000000");
    button18.setText("X");
    button20.setDisable(true);
    if (GSwin() == 1) {
      label12.setText("Gewonnen!");
      label12.setStyle("-fx-background-color: #1BB500");
    }
  }

  public void button21_Action(Event evt) {
    // Nr. 2
    label81.setStyle("-fx-background-color: #000000");
    button16.setStyle("-fx-text-fill: #FFFFFF");
    button16.setStyle("-fx-background-color: #000000");
    button15.setText("X");
    button21.setDisable(true);
    if (GSwin() == 1) {
      label12.setText("Gewonnen!");
      label12.setStyle("-fx-background-color: #1BB500");
    }
  }

  public void button24_Action(Event evt) {
    // Nr. 3
    label91.setStyle("-fx-background-color: #000000");
    button17.setStyle("-fx-text-fill: #FFFFFF");
    button17.setStyle("-fx-background-color: #000000");
    button19.setText("X");
    button24.setDisable(true);
    if (GSwin() == 1) {
      label12.setText("Gewonnen!");
      label12.setStyle("-fx-background-color: #1BB500");
    }
  }

  public void button25_Action(Event evt) {
    // Nr. 4
    label101.setStyle("-fx-background-color: #000000");
    button18.setStyle("-fx-text-fill: #FFFFFF");
    button18.setStyle("-fx-background-color: #000000");
    button17.setText("X");
    button25.setDisable(true);
    if (GSwin() == 1) {
      label12.setText("Gewonnen!");
      label12.setStyle("-fx-background-color: #1BB500");
    }
  }

  public void button26_Action(Event evt) {
    // Nr. 5
    label111.setStyle("-fx-background-color: #000000");
    button19.setStyle("-fx-text-fill: #FFFFFF");
    button19.setStyle("-fx-background-color: #000000");
    button16.setText("X");
    button26.setDisable(true);
    if (GSwin() == 1) {
      label12.setText("Gewonnen!");
      label12.setStyle("-fx-background-color: #1BB500");
    }
  }

  public void button23_Action(Event evt) {
    // Galaxy Shooter zurücksetzen
    if (button15.getText() == "X" &&
    button16.getText() == "X" &&
    button17.getText() == "X" &&
    button18.getText() == "X" &&
    button19.getText() == "X") {
      button20.setDisable(false);
      button21.setDisable(false);
      button24.setDisable(false);
      button25.setDisable(false);
      button26.setDisable(false);
      label71.setStyle("-fx-background-color: ");
      label81.setStyle("-fx-background-color: ");
      label91.setStyle("-fx-background-color: ");
      label101.setStyle("-fx-background-color: ");
      label111.setStyle("-fx-background-color: ");
      button15.setText("");
      button16.setText("");
      button17.setText("");
      button18.setText("");
      button19.setText("");
      label12.setText("Ein modernes Geschicklichkeitsspiel!");
      label12.setStyle("-fx-background-color: ");
      button15.setStyle("-fx-text-fill: ");
      button15.setStyle("-fx-background-color: ");
      button16.setStyle("-fx-text-fill: ");
      button16.setStyle("-fx-background-color: ");
      button17.setStyle("-fx-text-fill: ");
      button17.setStyle("-fx-background-color: ");
      button18.setStyle("-fx-text-fill: ");
      button18.setStyle("-fx-background-color: ");
      button19.setStyle("-fx-text-fill: ");
      button19.setStyle("-fx-background-color: ");
    }
    // Galaxy Shooter starten
    int gs = (int)(Math.random() * 5);
    if (gs == L7) {
      button15.setText("X");
    }
    if (gs == L8) {
      button16.setText("X");
    }
    if (gs == L9) {
      button17.setText("X");
    }
    if (gs == L10) {
      button18.setText("X");
    }
    if (gs == L11) {
      button19.setText("X");
    }    
  }
  
  public void button15_Action(Event evt) {
    
  }

  public void button16_Action(Event evt) {
    
  }

  public void button17_Action(Event evt) {
    
  }

  public void button18_Action(Event evt) {
    
  }

  public void button19_Action(Event evt) {
    // Hier könnte Ihre Werbung stehen!  
  }

  // Ende Methoden
} // end of class Spielehalle

