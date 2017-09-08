package ku.sci.cs.calendar;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

public class CalendarController {
	@FXML
	private DatePicker datePicker;
	@FXML
	private TextArea eventArea;
	@FXML
	private TextArea placeArea;
	@FXML
	private Spinner<Integer> startHourSpinner;
	@FXML
	private Spinner<Integer> endHourSpinner;
	@FXML
	private Spinner<Integer> startMinSpinner;
	@FXML
	private Spinner<Integer> endMinSpinner;
	@FXML
	private ListView<String> eventListView;
	
	private ObservableList<String> listEventInfo;
	private ArrayList<Event> listEvent;
	
	private Event event;
	private LocalDate date;
	private String eventTitle, place, startTime, endTime;
	private int startHour, startMin, endHour, endMin;
	
	public CalendarController() {
		listEventInfo = FXCollections.observableArrayList();
		listEvent = new ArrayList<Event>();
	}
	
	public void addEvent(ActionEvent actionEV) {
		date = datePicker.getValue();
		
		startHour = startHourSpinner.getValue();
		startMin = startMinSpinner.getValue();
		endHour = endHourSpinner.getValue();
		endMin = endMinSpinner.getValue();
		
		startTime = parseTimeFormat(startHour, startMin);
		endTime = parseTimeFormat(endHour, endMin);
		
		eventTitle = eventArea.getText();
		place = placeArea.getText();
		
		event = new Event(eventTitle, place, date, startTime, endTime);
		listEvent.add(event);
		listEventInfo.add(event.toString());
		eventListView.setItems(listEventInfo);
		clearInput(actionEV);
	}
	
	public String parseTimeFormat(int hour, int minute) {
		String hourString, minuteString;
		if (hour < 10) {
			hourString = "0" + hour;
		} else {
			hourString = Integer.toString(hour);
		}
		
		if (minute < 10) {
			minuteString = "0" + minute;
		}  else {
			minuteString = Integer.toString(minute);
		}
		
		String time = hourString + ":" + minuteString;
		return time;
	}
	
	public void clearInput(ActionEvent actionEV) {
		datePicker.setValue(null);
		eventArea.setText("");
		placeArea.setText("");
	}
	
	public void exit(ActionEvent actionEV) {
		System.exit(0);
	}
}
