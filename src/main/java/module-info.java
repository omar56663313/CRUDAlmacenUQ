module com.cruddf.crudalmacen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.cruddf.crudalmacen to javafx.fxml;
    exports com.cruddf.crudalmacen;
}