# Weather Dashboard  

A simple Java application and REST API that fetches weather data from OpenWeatherMap. Includes both a console app and a REST API.  


## Project Structure  

weatherdashboard/  
--- src/main/java/com/example/weatherdashboard/  
------ console/  
--------- ConsoleWeatherApp.java ---- *// Console interface*  
------ controller/  
--------- WeatherController.java ---- *// REST API controller*  
------ model/  
--------- Main.java  
--------- Weather.java  
--------- WeatherResponse.java  
------ service/  
--------- WeatherService.java  
--- pom.xml  
--- README.md  

### Key components  

#### 1. WeatherService  
- Contains the static `fetchWeather(city)` method.
- Makes HTTP request to OpenWeatherMap using `RestTemplate`.
- Holds the API key in an environmental variable `OWM_API_KEY`.
- API key is for **https://openweathermap.org/**

#### 2. WeatherController
- A Spring REST `/api/weather/{city}` endpoint.  
- Calls `WeatherService.fetchWeather(city)` to return weather data in JSON format.  

#### 3. ConsoleWeatherApp
- A console interface for fetching weather data interactively.  
- Lists a menu of cities and displays temperature, humidity, and description.  
- Uses the sane `WeatherService.fetchWeather(city)` method.  

#### 4. Model Classes    
- `Main`, `Weather`, `WeatherResponse` to map OpenWeatherMap JSON response.  

## Quick start  

### Run REST API  

1. Open the project in IDE (IntelliJ).
2. Find the **main class** `WeatherDashboardApplication` and open it.  
3. Run the application.
4. Spring Boot starts on "http://localhost:8080".  
5. Open Postman.  
6. Select `New` HTTP request and `GET` method.
7. Enter `http://localhost:8080/api/weather/Chicago` as the URL.
8. Result will be displayed in response area.
9. Replace `Chicago` with another city.  

### Run the Console App  

1. Open the `ConsoleWeatherApp.java` in IDE.
2. Run it as a Java application.
3. If *"❌ Missing API key. Set OWM_API_KEY environment variable and rerun."* message is displayed, set the environment variable with YOUR API key for https://openweathermap.org/ and rerun. 
4. A menu will be displayed.

```
Weather Dashboard
>1. Chicago
>2. London
>3. Paris
>4. Melbourne
>5. Exit  
Choose an option:
```  
5. Enter the number of the city to display the details.

## Notes

- The API key is in an environmental variable.
- The console and API use the same `WeatherService.fetchWeather(city)` method to fetch weather.
- `RestTemplate` handles the HTTP request.

