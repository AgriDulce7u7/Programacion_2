module co.edu.uniquindio.blusa.blusaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.blusa.blusaapp to javafx.fxml;
    exports co.edu.uniquindio.blusa.blusaapp;
}