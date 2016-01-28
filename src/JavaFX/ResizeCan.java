/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author taiki
 */
public class ResizeCan {

    Text txX;
    Text txY;
    

    public ResizeCan(Text txX, Text txY) {
        
        this.txX = txX;
        this.txY = txY;
        
//        Button okbtn = new Button();
//        okbtn = new Button("OK");
//        okbtn.setPrefWidth(80);
//        okbtn.getOnKeyPressed();
//        okbtn.setOnAction((EventHandler<ActionEvent>) new ReSizebtn(canX , canY));
        
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setPadding(new Insets(10, 10, 10, 10));
//        root.setSpacing(20);
//        root.getChildren().addAll(content, x, y, okbtn, xy);
//
//        root.setOnKeyPressed((EventHandler<KeyEvent>) new ReSizekey(canX, canY));

    }
    
    public Text getTxX() {
        return txX;
    }

    public void setTxX(Text txX) {
        this.txX = txX;
    }

    public Text getTxY() {
        return txY;
    }

    public void setTxY(Text txY) {
        this.txY = txY;
    }
    
    
    
    
    
    private Node createIcon() {
        double width = 48;
        double height = Math.sqrt(Math.pow(width, 2) - Math.pow(width / 2, 2));

        Polygon shape = new Polygon(new double[]{0, height, width / 2, 0, width, height});
        shape.setFill(Color.BLACK);

        Text text = new Text("!");
        text.setStroke(Color.WHITE);
        text.setFont(Font.font(20));
        text.relocate((width - text.getLayoutBounds().getWidth()) / 2,
                height - text.getLayoutBounds().getHeight());

        return new Group(shape, text);
    }
    

    private class ReSizebtn implements EventHandler<ActionEvent> {

        private int canX;
        private int canY;

        @Override
        public void handle(ActionEvent event) {
            try {
//                xy.setText(x.getText() + "," + y.getText());
//                this.canX = Integer.parseInt(x.getText());
//                this.canY = Integer.parseInt(y.getText());
               
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        
        public ReSizebtn(int canX, int canY) {
            this.canX = canX;
            this.canY = canY;
        }

    }

    public class ReSizekey implements EventHandler<KeyEvent> {

        private int canX;
        private int canY;

        public ReSizekey(int canX, int canY) {
            this.canX = canX;
            this.canY = canY;
        }
        public int getCanX(){
            return canX;
        }
        
        public void setCanX(int canX){
            this.canX = canX;
        }
        
        public int getCanY(){
            return canY;
        }
        
        public void setCanY(int canY){
            this.canY = canY;
        }

        @Override
        public void handle(KeyEvent event) {
            if (event.getCode() == KeyCode.ENTER) {
                try {
//                    xy.setText(x.getText() + "," + y.getText());
//                    setCanX(Integer.parseInt(x.getText()));
//                    setCanY(Integer.parseInt(y.getText()));
                    System.out.println(canX + " " + canY);
                    
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    
    
}
