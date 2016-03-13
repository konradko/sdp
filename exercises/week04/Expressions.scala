// 1. Write an expression that evaluates to true if the sky is sunny and the temperature is more than 80 degrees.
var sky = "sunny"
var temperature = 90
if (sky == "sunny" && temperature > 80) true
// 2. Write an expression that evaluates to true if the sky is either sunny or partly cloudy and the temperature is more than 80 degrees.
if ((sky == "sunny" || "partly cloudy") && temperature > 80 ) true
// 3. Write an expression that evaluates to true if the sky is either sunny or partly cloudy and the temperature is either more than 80 degrees or less than 20 degrees.
if ((sky == "sunny" || "partly cloudy") && (temperature > 80 || temperature < 20)) true
// 4. Convert Fahrenheit to Celsius.
// Hint: first subtract 32, then multiply by 5/9. If you get 0, check to make sure you didnt do integer maths.
var temperatureCelcius = (temperature - 32) * 5/9.0
// 5. Convert Celsius to Fahrenheit.
// Hint: first multiply by 9/5, then add 32. Use this to check your solution for the previous exercise.
(temperatureCelcius * 9/5.0) + 32
