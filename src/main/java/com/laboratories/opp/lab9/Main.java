package com.laboratories.opp.lab9;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Main extends Application {
    private Parent createContent(){
        VBox root = new VBox();
        root.setPrefSize(600, 600);
        Button button = new Button("Result");
        Button division = new Button("/");
        TextField input = new TextField();
        TextField input1 = new TextField();
        Text output = new Text();
        root.getChildren().addAll(input,division,input1,button,output);

        button.setOnAction(e-> {
            double num1 = 0;
            double num2 = 0;
            try {
                num1 = Double.parseDouble(String.valueOf(input.getText()));
                num2 = Double.parseDouble(String.valueOf(input1.getText()));
                double result = num1 / num2;
                output.setText(String.valueOf(result));
            }catch (Exception exception){
                output.setText(String.valueOf(exception));
            }

            try{
                if(num2 == 13){
                    throw new UnluckyException();
                }
            }catch (UnluckyException unluckyException){
                output.setText(String.valueOf(unluckyException));
            }
        });
        return root;
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent()));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

