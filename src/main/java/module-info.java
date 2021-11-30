module com.example.hallofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hallofx to javafx.fxml;
    exports com.example.hallofx;
}