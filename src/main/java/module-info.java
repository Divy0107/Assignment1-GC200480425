module com.example.assignment1gc200480425 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.internal.le;


    opens com.example.assignment1gc200480425 to javafx.fxml;
    exports com.example.assignment1gc200480425;
}