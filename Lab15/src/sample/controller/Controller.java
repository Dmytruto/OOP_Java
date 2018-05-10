package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.pojo.TradePoint;

import javafx.scene.control.TableColumn;

public class Controller {

    private ObservableList<TradePoint> usersData = FXCollections.observableArrayList();

    @FXML
    private TableView<TradePoint> tableUsers;

    @FXML
    private TableColumn<TradePoint, String> nameColumn;

    @FXML
    private TableColumn<TradePoint, String> adressColumn;

    @FXML
    private TableColumn<TradePoint, Integer> numberColumn;

    @FXML
    private TableColumn<TradePoint, String> specializationColumn;

    @FXML
    private TableColumn<TradePoint, String> dayColumn;

    @FXML
    private TableColumn<TradePoint, String> timeColumn;

    @FXML
    private TableColumn<TradePoint, String> strColumn;


    @FXML
    private void initialize() {
        initData();

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        adressColumn.setCellValueFactory(new PropertyValueFactory<>("adress"));
        numberColumn.setCellValueFactory(new PropertyValueFactory<TradePoint, Integer>("number"));
        specializationColumn.setCellValueFactory(new PropertyValueFactory<TradePoint, String>("specialization"));
        dayColumn.setCellValueFactory(new PropertyValueFactory<TradePoint, String>("day"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<TradePoint, String>("time"));
        strColumn.setCellValueFactory(new PropertyValueFactory<TradePoint, String>("str"));


        tableUsers.setItems(usersData);
    }

    private void initData() {
        usersData.add(new TradePoint( "Name", "Adress",123, "Programmer", "Monday", "20:00", "tex1t"));
        usersData.add(new TradePoint( "Andrew", "MainStreet",880553535, "Trader", "Sunday", "18:00", "tex6t"));
        usersData.add(new TradePoint( "Joe", "SalmanelaStreet",742625725, "Cook", "Tuesday", "17:00", "te8xt"));
        usersData.add(new TradePoint( "Anton", "RynokStreet",450236234, "Manger", "Wednesday", "9:00", "t0ext"));
        usersData.add(new TradePoint( "Bob", "Adress",123, "Programmer", "Monday", "20:00", "tex2t"));
    }

}