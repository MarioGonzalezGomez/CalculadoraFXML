module mggcode.culculadorafxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens mggcode.culculadorafxml to javafx.fxml;
    exports mggcode.culculadorafxml;
}