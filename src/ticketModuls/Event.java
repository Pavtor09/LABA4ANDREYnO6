package ticketModuls;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Event implements Serializable {
    private  int idEvent; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private  String nameEvent; //Поле не может быть null, Строка не может быть пустой
    private  LocalDateTime date; //Поле не может быть null
    private  EventType eventType; //Поле может быть null

    public Event(int id, String name, LocalDateTime date, EventType eventType ){
        this.idEvent = id;
        this.nameEvent = name;
        this.date = date;
        this.eventType = eventType;
    }

    public  String getNameEvent() {
        return nameEvent;
    }
    public  EventType getEventType() {
        return eventType;
    }
    public  int getIdEvent(){
        return idEvent;
    }
    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "id:"+getIdEvent()+", имя:"+getNameEvent()+
                ", дата:"+getDate()+
                (getEventType() != null ? ", тип:"+getEventType().toString(): "");
    }
}
