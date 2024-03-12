module com.example.ejemploarraylist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemploarraylist to javafx.fxml;
    exports com.example.ejemploarraylist;
}