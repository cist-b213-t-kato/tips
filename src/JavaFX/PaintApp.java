/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.print.PrinterJob;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

/**
 *
 * @author taiki
 */
public class PaintApp extends Application {

    ResizeCan data;//txXとtxYをgetsetするためのクラス
    StackPane root;
    Text txX;//テキストフィールドtfXに入力されたデータを拾う
    Text txY;//テキストフィールドtfXに入力されたデータを拾う
    Text tx;//label設定用 いろんな場所で使いまわす
    VBox vb;
    private HBox hbLabel;

    //func用
    private HBox hbMenu;
    private Button[] btn;
    String[] btnTxMenu = {"新規", "読込", "保存", "スクショ", "印刷", "終了"};
    
    private PrinterJob print;
    private String[] formatNames;
    //private Image img;
    private FileChooser fileChooser;
    private WritableImage wimg2;
    private String extension;
    private FileChooser fc;
    private Stage stage2;
    private File file;
    private Image img2;
    
    private Scene sn;
    //メソットcapture2()
    private Stage stage3;
    private SnapshotParameters params;
    private File fileName;
    //メソットreturnExtension()
    private String lowerCaseName;
    //メソットgetFileChooser()
    private List<String> list;
    private FileChooser.ExtensionFilter fe;

    //pen用
    private VBox vtxt0;
    private HBox Shb;
    private HBox hbPen;
    int pen_size = 1;
    private Text txt0;
    private Label label0; //現在選択されている太さ
    private Button[] btn0;
    String[] btnTxPen = {"✐", "細", "中", "太"};
    int[] btnPensize = {1, 15, 30, 45};

    private TextField size;
    private Button btnok;

    //canvas用
    private Canvas canvas;
    private GraphicsContext gc;

    //レイアウト用
    private Canvas can;
    private GraphicsContext gcc;
    VBox vcan = new VBox();

    //Color用
    private VBox vtxt00;
    private HBox hbC;
    private HBox hbColor;
    int color_number = 0;
    private Text txt00;
    private Label label00; //現在選択されている色
    private Button[] btn00;
    String[] btnTxColor = {"黒", "白", "赤", "青", "黄", "緑"};
    Color[] btnColor = {Color.BLACK, Color.WHITE, Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN};
    private ColorPicker colorpicker;

    //Figure
    private VBox vtxt000;
    private HBox hbF;
    private HBox hbFigure;
    int figure_number = 0;//図形を指定する変数
    private Text txt000;
    String[] btnTxFigure = {"－", "〇", "☐", "塗"};
    private Button[] btn000;
    private Label label000;

    //タブ用
    private Tab tb;
    private Tab tb0;
    private Tab tb00;
    private Tab tb000;
    private Tab tb0000;
    private TabPane tp;
    private VBox vbtb;

    private double x1, y1;
    private double x2, y2;

    @Override
    public void start(Stage stage) throws Exception {
        
        System.out.println("javafx.version = " + System.getProperty("javafx.version"));

        formatNames = ImageIO.getReaderFormatNames();
        System.out.println("ReaderFormatNames:");
        for (int i = 0; i < formatNames.length; i++) {
            System.out.println(formatNames[i]);
        }

        formatNames = ImageIO.getWriterFormatNames();
        System.out.println("WriterFormatNames:");
        for (int i = 0; i < formatNames.length; i++) {
            System.out.println(formatNames[i]);
        }
        

        stage.setTitle("TableView");
        stage.setFullScreenExitHint(STYLESHEET_MODENA);

        canvas();
        func(stage);
        pen();
        color();
        figure();
        tab();
        
        

        //テキストを下段に表示させるため
        hbLabel = new HBox();
        hbLabel.getChildren().addAll(label0, label00, label000); //箱(テキスト1,テキスト2)
        hbLabel.setPadding(new Insets(0, 0, 0, 5));
        hbLabel.setAlignment(Pos.BOTTOM_LEFT);//左下指定

        txX = new Text("x,y (1000,");
        txY = new Text("700)");
        HBox hbSize = new HBox();
        hbSize.getChildren().addAll(txX, txY);
        hbSize.setPadding(new Insets(0, 5, 0, 0));
        hbSize.setAlignment(Pos.BOTTOM_RIGHT);//左下指定

        root = new StackPane();
        root.getChildren().addAll(canvas, vcan, hbLabel, hbSize, vbtb);
        root.setOnMousePressed(event -> mouse(event));
        root.setOnMouseDragged(event -> mouse(event));
        
        sn = new Scene(root);
        // ウインドウを設定
        stage.setScene(sn);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void canvas() {

        canvas = new Canvas(500, 900); //絵を書く
        gc = canvas.getGraphicsContext2D();
        gc.save();
        gc.setFill(Color.WHITE);//canvasを白い□で塗りつぶし
        gc.fillRect(0, 0, 500, 900);
        gc.restore();
        //img = new Image(Paint2.class.getResourceAsStream("a.png"));
        //gc.drawImage(img, 0, 0, 1370, 800, 0, 0, 1370, 800);

        //レイアウトを整えるために書いた
        can = new Canvas(1370, 60);
        gcc = can.getGraphicsContext2D();
        gcc.save();
        gcc.setFill(Color.GAINSBORO);
        gcc.fillRect(0, 0, 1370, 60);
        gcc.restore();

        //レイアウトのために必要だった
        vcan = new VBox();
        vcan.getChildren().addAll(can);
        vcan.setAlignment(Pos.TOP_CENTER);
    }

    private void func(Stage stage) {
        hbMenu = new HBox();
        btn = new Button[6];
        for (int i = 0; i < 6; i++) {
            btn[i] = new Button(btnTxMenu[i]);
            btn[i].setPrefWidth(60);
            btn[i].setPrefHeight(20);

            hbMenu.getChildren().add(btn[i]);
            hbMenu.setPadding(new Insets(3, 0, 0, 2));
            hbMenu.setSpacing(5);
        }
        btn[0].setOnAction(e -> new ResizeBox(this, stage));
        btn[1].setOnAction(e -> {
            fc = getFileChooser();
            stage2 = new Stage();
            file = fc.showOpenDialog(stage2);
            if (file != null) {
                img2 = new Image(file.toURI().toString());
                gc.drawImage(img2, 0, 0, 1370, 800, 0, 0, 1370, 800);
            }
        });
        btn[2].setOnAction((ActionEvent e) -> {
            capture2("canvas");
        });
        btn[3].setOnAction((ActionEvent e) -> {
            capture2("scene");
        });
        btn[4].setOnAction((ActionEvent e) -> {
            if (print == null) {
                print = PrinterJob.createPrinterJob();
            }
            print.printPage(root);
            print.endJob();

        });
    }

    public void capture2(String target) {

        stage3 = new Stage();
        fc = getFileChooser();
        fileName = fc.showSaveDialog(stage3);
        extension = returnExtension();
        System.out.println("Extension = " + extension);

        switch (target) {

            case "scene":

                wimg2 = sn.snapshot(null);

                break;

            case "canvas":
                params = new SnapshotParameters();

                wimg2 = canvas.snapshot(params, null);

                break;

            default:

                break;

        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Code to change Swing data.
                try {
                    ImageIO.write(SwingFXUtils.fromFXImage(wimg2, null), extension, fileName);
                } catch (java.io.IOException ioe) {
                    System.out.println(ioe);
                }

            }
        });

    }

    public String returnExtension() {

        lowerCaseName = (fileName.toString()).toLowerCase();

        if (lowerCaseName.endsWith(".jpg")) {
            return "jpg";
        } else if (lowerCaseName.endsWith(".jpeg")) {
            return "jpg";
        } else if (lowerCaseName.endsWith(".gif")) {
            return "gif";
        } else if (lowerCaseName.endsWith(".png")) {
            return "png";
        } else {
            return "png";
        }
    }

    protected FileChooser getFileChooser() {

        if (fileChooser == null) {

            list = new ArrayList<>();
            list.add("*.jpeg");
            list.add("*.png");
            list.add("*.jpg");
            list.add("*.gif");
            list.add("*.PNG");

            fe = new FileChooser.ExtensionFilter("JPEG  GIF  PNG Image ", list);

            fileChooser = new FileChooser();

            fileChooser.getExtensionFilters().add(fe);

        }

        return fileChooser;
    }
    
    class ResizeBox {

        ResizeBox(PaintApp main, Stage stage) {
            Stage subStage = new Stage();
            subStage.setTitle("ResizeBox");
            subStage.setWidth(350);
            subStage.setHeight(300);
            subStage.initModality(Modality.APPLICATION_MODAL);

            Label la = new Label("サイズを入力してください");
            la.setStyle("-fx-font-size: 30; -fx-text-fill: black");

            TextField tfX = new TextField();
            TextField tfY = new TextField();

            Button btn = new Button("決定");
            btn.setPrefSize(50, 55);
            btn.setOnAction(e -> {
                main.txX.setText("x,y (" + tfX.getText() + ",");
                main.txY.setText(tfY.getText() + ")");
//                stage.setWidth(Integer.valueOf(tfX.getText()));
//                stage.setHeight(Integer.valueOf(tfY.getText()));
                main.canvas.setWidth(Integer.valueOf(tfX.getText()));
                main.canvas.setHeight(Integer.valueOf(tfY.getText()));
                main.gc.save();
                main.gc.setFill(Color.WHITE);//canvasを白い□で塗りつぶし
                main.gc.fillRect(0, 0, Integer.valueOf(tfX.getText()), Integer.valueOf(tfY.getText()));
                main.gc.restore();

                subStage.close();
            });

            AnchorPane pane = new AnchorPane();

            VBox vb = new VBox();
            vb.setAlignment(Pos.BASELINE_CENTER);
            vb.getChildren().add(la);

            AnchorPane.setTopAnchor(tfX, 70.0);
            AnchorPane.setLeftAnchor(tfX, 100.0);

            AnchorPane.setTopAnchor(tfY, 100.0);
            AnchorPane.setLeftAnchor(tfY, 100.0);

            AnchorPane.setTopAnchor(btn, 70.0);
            AnchorPane.setLeftAnchor(btn, 260.0);

            Background bg;
            bg = new Background(new BackgroundFill(
                    Color.WHITE, null, null));

            pane.setBackground(bg);
            pane.getChildren().addAll(vb, tfX, tfY, btn);
            pane.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.ENTER) {
                    try {
                        main.txX.setText("x,y (" + tfX.getText() + ",");
                        main.txY.setText(tfY.getText() + ")");
//                        stage.setWidth(Integer.valueOf(tfX.getText()));
//                        stage.setHeight(Integer.valueOf(tfY.getText()));
                        main.canvas.setWidth(Integer.valueOf(tfX.getText()));
                        main.canvas.setHeight(Integer.valueOf(tfY.getText()));
                        
                        main.gc.save();
                        main.gc.setFill(Color.WHITE);//canvasを白い□で塗りつぶし
                        main.gc.fillRect(0, 0, Integer.valueOf(tfX.getText()), Integer.valueOf(tfY.getText()));
                        main.gc.restore();
                        subStage.close();
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            });

            Scene scene = new Scene(pane);

            subStage.setScene(scene);
            subStage.show();
        }
    }

    private void pen() {

        txt0 = new Text("サイズ");
        label0 = new Label("現在(✐,");
        btn0 = new Button[6];
        Shb = new HBox();
        tx = new Text();

        //独立したテキストのみのボックス（サイズ）
        vtxt0 = new VBox();
        vtxt0.setPadding(new Insets(8, 0, 0, 5));
        vtxt0.setSpacing(15);
        vtxt0.getChildren().add(txt0);

        for (int i = 0; i < 4; i++) {
            btn0[i] = new Button(btnTxPen[i]);
            btn0[i].setPrefWidth(40);
            btn0[i].setPrefHeight(20);
            btn0[i].setOnAction(new PaintApp.EventHandlerP(i, tx));

            Shb.setSpacing(5);
            Shb.setPadding(new Insets(3, 0, 0, 2));
            Shb.getChildren().add(btn0[i]);
        }

        size = new TextField();
        btnok = new Button("変更");

        Shb.getChildren().addAll(size, btnok);

        btnok.setOnAction(ActionEvent -> {
            try {
                pen_size = Integer.parseInt(size.getText());
                label0.setText("現在(" + size.getText() + ",");
            } catch (NumberFormatException e) {
                //error.show();
                e.printStackTrace();
            }

            System.out.println(label0.getText() + "に変更しました");
        });

        
        hbPen = new HBox();
        hbPen.setSpacing(5);
        hbPen.getChildren().addAll(vtxt0, Shb);
    }

    private void color() {

        hbColor = new HBox();
        btn00 = new Button[6];
        hbC = new HBox();
        txt00 = new Text("カラー");
        label00 = new Label("黒,"); //太さ

        vtxt00 = new VBox();
        vtxt00.setPadding(new Insets(8, 0, 0, 5));
        vtxt00.setSpacing(15);
        vtxt00.getChildren().add(txt00);

        for (int i = 0; i < 6; i++) {
            btn00[i] = new Button(btnTxColor[i]);
            btn00[i].setPrefWidth(60);
            btn00[i].setPrefHeight(20);
            btn00[i].setTextFill(btnColor[i]);

            btn00[i].setOnAction(new PaintApp.EventHandlerC(i, tx));

            hbC.setSpacing(5);
            hbC.setPadding(new Insets(3, 0, 0, 2));
            hbC.getChildren().add(btn00[i]);
        }
        btn00[1].setTextFill(Color.LIGHTYELLOW);

        colorpicker = new ColorPicker();
        colorpicker.setOnAction(event -> {

            color_number = 1;
            if (color_number == 1) {
                gc.setStroke(Color.valueOf(String.valueOf(colorpicker.getValue())));
                gc.setFill(Color.valueOf(String.valueOf(colorpicker.getValue())));

                gcc.save();
                gcc.setFill(Color.valueOf(String.valueOf(colorpicker.getValue())));
                gcc.fillRect(600, 0, 770, 45);
                gcc.restore();
            }
            Text tx = new Text(String.valueOf(colorpicker.getValue()) + ",");
            Background bg = new Background(new BackgroundFill(
                    Color.valueOf(String.valueOf(colorpicker.getValue())), null, null));

            label00.setText("パレット,");
            System.out.println("パレット");
        });
        hbC.getChildren().add(colorpicker);

        hbColor.setSpacing(5);
        hbColor.getChildren().addAll(vtxt00, hbC);
    }

    private void figure() {
        txt000 = new Text("図形");
        btn000 = new Button[4];
        label000 = new Label("－)です");

        //独立したテキストのみのボックス（カラー）
        vtxt000 = new VBox();
        vtxt000.setPadding(new Insets(8, 0, 0, 5));
        vtxt000.setSpacing(15);
        vtxt000.getChildren().add(txt000);

        hbF = new HBox();
        for (int i = 0; i < 4; i++) {
            btn000[i] = new Button(btnTxFigure[i]);
            btn000[i].setPrefWidth(60);
            btn000[i].setPrefHeight(20);

            btn000[i].setOnAction(new PaintApp.EventHandlerF(i, tx));

            hbF.setPadding(new Insets(3, 0, 0, 2));
            hbF.setSpacing(5);//ボタンの間隔
            hbF.getChildren().addAll(btn000[i]);//箱(ボタン)
        }
        
        hbFigure = new HBox();
        hbFigure.setSpacing(5);
        hbFigure.getChildren().addAll(vtxt000, hbF);

    }

    private class EventHandlerP implements EventHandler<ActionEvent> {

        private final int i;
        private final Text tx;

        public EventHandlerP(int i, Text tx) {

            this.i = i;
            this.tx = tx;
        }

        public void handle(ActionEvent e) {

            pen_size = btnPensize[i];

            tx.setText("現在(" + btnTxPen[i] + ",");
            label0.setText(tx.getText());
            System.out.println(btnTxPen[i]  + "に変更しました");
        }
    }

    private class EventHandlerC implements EventHandler<ActionEvent> {

        private final int i;
        private final Text tx;

        public EventHandlerC(int i, Text tx) {

            this.i = i;
            this.tx = tx;
        }

        public void handle(ActionEvent e) {

            color_number = 0;

            if (color_number == 0) {
                gc.setFill(btnColor[i]);
                gc.setStroke(btnColor[i]);

                gcc.save();
                gcc.setFill(btnColor[i]);
                gcc.fillRect(600, 0, 770, 45);
                gcc.restore();
            }
            tx.setText(btnTxColor[i] + ",");
            label00.setText(tx.getText());
            System.out.println(btnTxColor[i] + "に変更しました");
        }
    }

    private class EventHandlerF implements EventHandler<ActionEvent> {

        private final int i;
        private final Text tx;

        public EventHandlerF(int i, Text tx) {

            this.i = i;
            this.tx = tx;
        }

        public void handle(ActionEvent e) {

            figure_number = i;

            gc.restore();
            tx.setText(btnTxFigure[i] + ")に変更しました");
            label000.setText(tx.getText());
            System.out.println(btnTxFigure[i] + "に変更しました");
        }
    }

    private void tab() {

        //タブを作っている
        tb = new Tab("ファイル");
        tb.setContent(hbMenu);
        tb.setClosable(false);

        //ペンのサイズ変更用のタブを作っている
        tb0 = new Tab("ペン");
        tb0.setContent(hbPen);
        tb0.setClosable(false);

        //ペンのカラー変更用のタブを作っている
        tb00 = new Tab("カラー");
        tb00.setContent(hbColor);
        tb00.setClosable(false);

        //線・図形切り替え用のタブを作っている
        tb000 = new Tab("図形");
        tb000.setContent(hbFigure);
        tb000.setClosable(false);

        //からのタブを作る、なくてもいい
        tb0000 = new Tab("非表示");
        tb0000.setClosable(false);

        //タブペインを作って３つのタブ
        tp = new TabPane(tb, tb0, tb00, tb000, tb0000);

        //タブを使えるようにするためにどうしても必要
        vbtb = new VBox();
        vbtb.getChildren().addAll(tp);
    }

    private void mouse(MouseEvent event) {
        
        

        //勝利の分岐　pressed or dragued
        if (event.getEventType() == MouseEvent.MOUSE_PRESSED) {
            // マウスイベントの処理１
            x1 = x2 = event.getSceneX() - canvas.getLayoutX();
            y1 = y2 = event.getSceneY() - canvas.getLayoutY();
            gc.setLineWidth(pen_size);
            if (figure_number == 0) {
                gc.setLineCap(StrokeLineCap.ROUND);
                gc.setLineJoin(StrokeLineJoin.ROUND);
                gc.strokeLine(x1, y1, x2, y2);
            } else if (figure_number == 1) {
                gc.strokeOval(x1, y1, pen_size, pen_size);
            } else if (figure_number == 2) {
                gc.strokeRect(x1, y1, pen_size, pen_size);
                gc.restore();
            } else if (figure_number == 3) {
                gc.fillRect(0, 0, 1370, 800);
                gc.restore();
            }
            gc.restore();

        } else if (event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
            // マウスイベントの処理２
            x2 = event.getSceneX() - canvas.getLayoutX();
            y2 = event.getSceneY() - canvas.getLayoutY();

            gc.setLineWidth(pen_size);

            if (figure_number == 0) {
                gc.strokeLine(x1, y1, x2, y2);
                gc.setLineCap(StrokeLineCap.ROUND);
                gc.setLineJoin(StrokeLineJoin.ROUND);
            }

            x1 = event.getSceneX() - canvas.getLayoutX();
            y1 = event.getSceneY() - canvas.getLayoutY();
        }
    }

}
