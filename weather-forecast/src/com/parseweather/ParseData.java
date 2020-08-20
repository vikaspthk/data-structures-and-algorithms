
package com.parseweather;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class ParseData {
        String name, data;
        Element time,symbol,windDirection,windSpeed,temperature,pressure,humidity;
    public  String getXML(String city) throws ParserConfigurationException, MalformedURLException, IOException, SAXException, InterruptedException{
        String data=null;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        int i=0;
        Document doc =db.parse(new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q="+city+"&mode=xml&units=metric&cnt=1&appid=7dd638cbf01c36d36f964d97299662a7").openStream());
        name = doc.getDocumentElement().getElementsByTagName("name").item(0).getTextContent();
        time = (Element)doc.getElementsByTagName("time").item(0);
        symbol = (Element)doc.getElementsByTagName("symbol").item(0);
        windDirection = (Element)doc.getElementsByTagName("windDirection").item(0);
        windSpeed = (Element)doc.getElementsByTagName("windSpeed").item(0);
        temperature = (Element)doc.getElementsByTagName("temperature").item(0);
        pressure = (Element)doc.getElementsByTagName("pressure").item(0);
        humidity = (Element)doc.getElementsByTagName("humidity").item(0);
        data=(getMessage());
        this.data=data;
        return data;          
        }
     
    public String getLocationName()
    {
        return name;
    }
    public String getDate()
    {
        return time.getAttribute("day");
    }
    public String getOverView()
    {
        return symbol.getAttribute("name");
    }
    public String getWindDirection()
    {
        return windDirection.getAttribute("name");
    }
    public String getWindSpeed()
    {
        return windSpeed.getAttribute("mps");
    }
    public String getWindDescription()
    {
        return windSpeed.getAttribute("name");
    }
    public String getDayTemprature()
    {
        return temperature.getAttribute("day");
    }
    public String getEveTemprature()
    {
        return temperature.getAttribute("eve");
    }
    public String getMaxTemprature()
    {
        return temperature.getAttribute("max");
    }
    public String getMinTemprature()
    {
        return temperature.getAttribute("min");
    }
    public String getPressure()
    {
        return pressure.getAttribute("value")+pressure.getAttribute("unit");
    }
    public String getHumidity()
    {
        return humidity.getAttribute("value")+pressure.getAttribute("unit");
    }
    public String getMessage()
    {
        return "City: "+getLocationName()+"\nDate: "+getDate()+"\nWind Direction:"+getWindDirection()+"\nWind Speed:"+getWindSpeed()+"\nWind Description:"+getWindDescription()+"\nDay Time Temprature:"+getDayTemprature()+"\nEvening Time Temprature:"+getEveTemprature()+"\nMaximum Temprature:"+getMaxTemprature()+"\nMinimum Temprature:"+getMinTemprature()+"\nAverage Pressure: "+getPressure()+"\nAverage Humidity: "+getHumidity();
   }
}
