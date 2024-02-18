
package com.cruddf.crudalmacen;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;


public class HelloController implements Initializable {

    Almacen almacen = new Almacen();

    private int selectedIndex = -1;

    @FXML
    private TableView<DisplayableItem> tableView;

    @FXML
    private TableView<DisplayableClient> tableViewC;

    @FXML
    private Button btnDel;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelC;

    @FXML
    private Button btnInsertC;

    @FXML
    private Button btnUpdateC;


    @FXML
    private TableColumn<DisplayableItem, String> colDescripcion;

    @FXML
    private TableColumn<DisplayableItem, String> colCode;

    @FXML
    private TableColumn<DisplayableItem, String> colExpiration;

    @FXML
    private TableColumn<DisplayableItem, String> colId;

    @FXML
    private TableColumn<DisplayableItem, String> colName;

    @FXML
    private TableColumn<DisplayableClient, String> colDireccion;

    @FXML
    private TableColumn<DisplayableClient, String> colEmail;

    @FXML
    private TableColumn<DisplayableClient, String> colCName;

    @FXML
    private TableColumn<DisplayableClient, String> colCType;

    @FXML
    private TableColumn<DisplayableClient, String> colNit;

    @FXML
    private TableColumn<DisplayableClient, String> colApellido;

    @FXML
    private TableColumn<DisplayableClient, String> colCId;

    @FXML
    private TableColumn<DisplayableClient, String> colBirth;

    @FXML
    private TableColumn<DisplayableClient, String> colTelefono;


    @FXML
    private TableColumn<DisplayableItem, String> colOrigin;

    @FXML
    private TableColumn<DisplayableItem, String> colQuantity;

    @FXML
    private TableColumn<DisplayableItem, String> colTemperature;

    @FXML
    private TableColumn<DisplayableItem, String> colType;

    @FXML
    private TableColumn<DisplayableItem, String> colValorU;

    @FXML
    private TableColumn<DisplayableItem, String> colWeight;

    @FXML
    private TextField tfDescription;

    @FXML
    private TextField tfCType;

    @FXML
    private TextField tfNit;

    @FXML
    private TextField tfBirth;

    @FXML
    private TextField tfCapellido;

    @FXML
    private TextField tfCname;

    @FXML
    private TextField tfDireccion;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfTelefono;

    @FXML
    private TextField tfCId;


    @FXML
    private TextField tfId;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfQuantity;

    @FXML
    private TextField tfValue;

    @FXML
    private TextField tfType;

    @FXML
    private TextField tfTemperature;

    @FXML
    private TextField tfWeight;

    @FXML
    private TextField tfCode;

    @FXML
    private TextField tfOrigen;

    @FXML
    private TextField tfCaducidad;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        tableView.setOnMouseClicked(event -> {
            if (event.getClickCount() == 1) { // Check for single click
                selectedIndex = tableView.getSelectionModel().getSelectedIndex();
            }
        });


        btnInsert.setOnAction(this::handleInsertButtonClick);
        btnUpdate.setOnAction(this::handleUpdateButtonClick);
        btnDel.setOnAction(this::handleDeleteButtonClick);

        tableViewC.setOnMouseClicked(event -> {
            if (event.getClickCount() == 1) { // Check for single click
                selectedIndex = tableViewC.getSelectionModel().getSelectedIndex();
            }
        });

        btnInsertC.setOnAction(this::handleInsertCButtonClick);
        btnUpdateC.setOnAction(this::handleUpdateCButtonClick);
        btnDelC.setOnAction(this::handleDeleteCButtonClick);


    }

    @FXML
    private void handleInsertButtonClick(ActionEvent event) {
        String name = tfName.getText();
        String descripcion = tfDescription.getText();
        String valor = tfValue.getText();
        String cantidad = tfQuantity.getText();
        String id = tfId.getText();

        if (tfType.getText().equals("Refrigerado")) {
            String temperatura = tfTemperature.getText();
            String code = tfCode.getText();

            almacen.registrarProductoRefrigerado(name, descripcion, valor, cantidad, id, temperatura, code);
            insertarProducto();
            colCode.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getCode()));
            colType.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getType()));
            colTemperature.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getTemperatura()));
            colOrigin.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getOrigen()));
            colWeight.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getPeso()));
            colExpiration.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getVencimiento()));

        }

        else if(tfType.getText().equals("Envasado")){

            String peso = tfWeight.getText();
            String origen = tfOrigen.getText();

            almacen.registrarProductoEnvasado(name, descripcion, valor, cantidad, id, peso, origen);
            insertarProducto();
            colCode.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getCode()));
            colType.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getType()));
            colTemperature.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getTemperatura()));
            colOrigin.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getOrigen()));
            colWeight.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getPeso()));
            colExpiration.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getVencimiento()));


        }

        else if(tfType.getText().equals("Perecedero")){

            String vencimiento = tfCaducidad.getText();
            almacen.registrarProductoPerecedero(name, descripcion, valor, cantidad, id, vencimiento);
            colCode.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getCode()));
            colType.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getType()));
            colTemperature.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getTemperatura()));
            colOrigin.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getOrigen()));
            colWeight.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getPeso()));
            colExpiration.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getVencimiento()));
            insertarProducto();

        }

        tfName.clear();
        tfDescription.clear();
        tfValue.clear();
        tfQuantity.clear();
        tfId.clear();
        tfType.clear();
        tfTemperature.clear();
        tfCode.clear();
        tfOrigen.clear();
        tfWeight.clear();
        tfCaducidad.clear();
    }



    @FXML
    private void handleInsertCButtonClick(ActionEvent event) {
        String name = tfCname.getText();
        String apellidos = tfCapellido.getText();
        String identificacion = tfCId.getText();
        String telefono = tfTelefono.getText();
        String direccion = tfDireccion.getText();

        if (tfCType.getText().equals("Natural")) {
            String fecha = tfBirth.getText();
            String email = tfEmail.getText();

            almacen.registrarPersonaNatural(name, apellidos, direccion, telefono, identificacion, email, fecha);
            insertarCliente();
            colEmail.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getEmail()));
            colBirth.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getFecha()));
            colNit.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getNit()));

        }

        else if(tfCType.getText().equals("Juridica")){

            String nit = tfNit.getText();


            almacen.registrarPersonaJuridica(name, apellidos, direccion, telefono, identificacion, nit);
            insertarCliente();
            colEmail.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getEmail()));
            colBirth.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getFecha()));
            colNit.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getNit()));

        }

        tfCname.clear();
        tfCapellido.clear();
        tfDireccion.clear();
        tfTelefono.clear();
        tfEmail.clear();
        tfNit.clear();
        tfCId.clear();
        tfBirth.clear();
        tfCType.clear();
    }


    @FXML
    private void handleUpdateButtonClick(ActionEvent event) {
        if (selectedIndex != -1) {

            DisplayableItem selectedItem = tableView.getItems().get(selectedIndex);


            if (selectedItem instanceof productoRefrigerado) {
                productoRefrigerado refrigeradoItem = (productoRefrigerado) selectedItem;

                refrigeradoItem.setNombre(tfName.getText());
                refrigeradoItem.setDescripcion(tfDescription.getText());
                refrigeradoItem.setValorUnitario(tfValue.getText());
                refrigeradoItem.setCantidadExistencias(tfQuantity.getText());
                refrigeradoItem.setId(tfId.getText());
                refrigeradoItem.setTemperatura(tfTemperature.getText());
                refrigeradoItem.setCodigo(tfCode.getText());

            } else if (selectedItem instanceof productoEnvasado) {
                productoEnvasado envasadoItem = (productoEnvasado) selectedItem;

                envasadoItem.setNombre(tfName.getText());
                envasadoItem.setDescripcion(tfDescription.getText());
                envasadoItem.setValorUnitario((tfValue.getText()));
                envasadoItem.setCantidadExistencias(tfQuantity.getText());
                envasadoItem.setId(tfId.getText());
                envasadoItem.setOrigen(tfOrigen.getText());
                envasadoItem.setPeso(tfWeight.getText());
                // Handle other properties specific to ProductoEnvasado
            } else if (selectedItem instanceof productoPerecedero) {
                productoPerecedero perecederoItem = (productoPerecedero) selectedItem;
                // Update properties for perecederoItem
                perecederoItem.setNombre(tfName.getText());
                perecederoItem.setDescripcion(tfDescription.getText());
                perecederoItem.setValorUnitario(tfValue.getText());
                perecederoItem.setCantidadExistencias(tfQuantity.getText());
                perecederoItem.setId(tfId.getText());
                perecederoItem.setVencimiento(tfCaducidad.getText());
                // Handle other properties specific to ProductoPerecedero
            }


            tableView.refresh();


        }

    }


    @FXML
    private void handleUpdateCButtonClick(ActionEvent event) {
        if (selectedIndex != -1) {

            DisplayableClient selectedItemC = tableViewC.getItems().get(selectedIndex);


            if (selectedItemC instanceof personaNatural) {
                personaNatural naturalItem = (personaNatural) selectedItemC;

                naturalItem.setNombre(tfCname.getText());
                naturalItem.setApellidos(tfCapellido.getText());
                naturalItem.setDireccion(tfDireccion.getText());
                naturalItem.setTelefono(tfTelefono.getText());
                naturalItem.setIdentificacion(tfCId.getText());
                naturalItem.setNacimiento(tfBirth.getText());
                naturalItem.setEmail(tfEmail.getText());

            } else if (selectedItemC instanceof personaJuridica) {
                personaJuridica juridicaItem = (personaJuridica) selectedItemC;

                juridicaItem.setNombre(tfCname.getText());
                juridicaItem.setApellidos(tfCapellido.getText());
                juridicaItem.setDireccion(tfDireccion.getText());
                juridicaItem.setTelefono(tfTelefono.getText());
                juridicaItem.setIdentificacion(tfCId.getText());
                juridicaItem.setNit(tfNit.getText());

            }

            tableViewC.refresh();

            tfCname.clear();
            tfCapellido.clear();
            tfDireccion.clear();
            tfTelefono.clear();
            tfEmail.clear();
            tfNit.clear();
            tfCId.clear();
            tfBirth.clear();
            tfCType.clear();
        }

    }


    @FXML
    private void handleDeleteButtonClick(ActionEvent event) {

        DisplayableItem selectedItem = tableView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {

            if (selectedItem instanceof productoRefrigerado) {
                almacen.getRefrigeradoList().remove(selectedItem);
            } else if (selectedItem instanceof productoEnvasado) {
                almacen.getEnvasadosList().remove(selectedItem);
            } else if (selectedItem instanceof productoPerecedero) {
                almacen.getPerecederoList().remove(selectedItem);
            }

            tableView.getItems().remove(selectedItem);
        }
    }


    @FXML
    private void handleDeleteCButtonClick(ActionEvent event) {
        // Get the selected item
        DisplayableClient selectedItem = tableViewC.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            // Remove the selected item from the data source
            if (selectedItem instanceof personaJuridica) {
                almacen.getClientJuridicoList().remove(selectedItem);
            } else if (selectedItem instanceof personaNatural) {
                almacen.getClientNaturalList().remove(selectedItem);
            }
            // Refresh the TableView
            tableViewC.getItems().remove(selectedItem);
        }
    }

    public void insertarProducto(){

        ObservableList<DisplayableItem> allProducts = FXCollections.observableArrayList();
        for (productoRefrigerado product : almacen.getRefrigeradoList()) {
            allProducts.add(product); // Implicitly cast to DisplayableItem
        }
        for (productoEnvasado product : almacen.getEnvasadosList()) {
            allProducts.add(product); // Implicitly cast to DisplayableItem
        }
        for (productoPerecedero product : almacen.getPerecederoList()) {
            allProducts.add(product); // Implicitly cast to DisplayableItem
        }

        tableView.setItems(allProducts);

        colName.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getNombre()));

        colDescripcion.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getDescripcion()));

        colId.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getId()));

        colQuantity.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getCantidadExistencias()));

        colValorU.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getValor()));

        colType.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getType()));

    }

    public void insertarCliente(){

        ObservableList<DisplayableClient> allClients = FXCollections.observableArrayList();
        for (personaJuridica personaJ : almacen.getClientJuridicoList()) {
            allClients.add(personaJ);
        }
        for (personaNatural personaN: almacen.getClientNaturalList()) {
            allClients.add(personaN);
        }


        tableViewC.setItems(allClients);

        colCName.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getNombre()));

        colApellido.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getApellido()));

        colDireccion.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getDireccion()));

        colTelefono.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getTelefono()));

        colCType.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getTipo()));

        colCId.setCellValueFactory(cellData -> Bindings.createStringBinding(() -> cellData.getValue().getId()));



    }









}
