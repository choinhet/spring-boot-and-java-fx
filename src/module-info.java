module com.choinhet.kotlinfxtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;

    opens com.choinhet.springfx to javafx.fxml;
    exports com.choinhet.springfx;
}