class Car {
  private var bodyStyle: String
  private var power: String
  private var engine: String
  private var breaks: String
  private var seats: String
  private var windows: String
  private var fuelType: String
  private var carType: String

  def getBodyStyle: String = {
    this.bodyStyle
  }
  def setBodyStyle(bodyStyle: String) {
    this.bodyStyle = bodyStyle
  }
  def getPower: String = {
    this.power
  }
  def setPower(power: String) {
    this.power = power
  }
  def getEngine: String = {
    this.engine
  }
  def setEngine(engine: String) {
    this.engine = engine
  }
  def getBreaks: String = {
    this.breaks
  }
  def setBreaks(breaks: String) {
    this.breaks = breaks
  }
  def getSeats: String = {
    this.seats
  }
  def setSeats(seats: String) {
    this.seats = seats
  }
  def getWindows: String = {
    this.windows
  }
  def setWindows(windows: String) {
    this.windows = windows
  }
  def getFuelType: String = {
    this.fuelType
  }
  def setFuelType(fuelType: String) {
    this.fuelType = fuelType
  }

  override def toString: String = {
    val sb = StringBuilder.newBuilder
    sb.append("--------------" + carType + "--------------------- \n")
    sb.append(" Body: ")
    sb.append(bodyStyle)
    sb.append("\n Power: ")
    sb.append(power)
    sb.append("\n Engine: ")
    sb.append(engine)
    sb.append("\n Breaks: ")
    sb.append(breaks)
    sb.append("\n Seats: ")
    sb.append(seats)
    sb.append("\n Windows: ")
    sb.append(windows)
    sb.append("\n Fuel Type: ")
    sb.append(fuelType)
    sb.toString()
  }
}

abstract class CarBuilder {
  var bodyStyle: String
  var power: String
  var engine: String
  var breaks: String
  var seats: String
  var windows: String
  var fuelType: String
  var carType: String
}

class CarDirector(builder: CarBuilder) {
  def build: Car = {
    val car = new Car
    car.setBodyStyle(builder.bodyStyle)
    car.setPower(builder.power)
    car.setEngine(builder.engine)
    car.setBreaks(builder.breaks)
    car.setSeats(builder.seats)
    car.setWindows(builder.windows)
    car.setFuelType(builder.fuelType)
    car.setCarType(builder.carType)
    car
  }
}

class SedanCarBuilder extends CarBuilder {
  bodyStyle = "External dimensions: overall length (inches): 202.9, overall width (inches): 76.2, overall height (inches): 60.7, wheelbase (inches): 112.9, front track (inches): 65.3, rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5"
  power = "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm"
  engine = "3.5L Duramax V 6 DOHC"
  breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution"
  seats = "Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats"
  windows = "Laminated side windows.Fixed rear window with defroster"
  fuelType = "Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range"
  carType = "SEDAN"
}

class SportsCarBuilder extends CarBuilder {
  bodyStyle = "External dimensions: overall length (inches): 192.3, overall width (inches): 75.5, overall height (inches): 54.2, wheelbase (inches): 112.3, front track (inches): 63.7, rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7"
  power = "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm"
  engine = "3.6L V 6 DOHC and variable valve timing"
  breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution. Stability control"
  seats = "Driver sports front seat with one power adjustments manual height, front passenger seat sports front seat with one power adjustments"
  windows = "Front windows with one-touch on two windows"
  fuelType = "Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range"
  carType = "SPORTS"
}

object TestBuilderPattern {

  def main(args: Array[String]) = {
    var carBuilder = SedanCarBuilder
    var director = new CarDirector(carBuilder)
    director.build
    var car = carBuilder.getCar
    println(car)
    carBuilder = SportsCarBuilder
    director = new CarDirector(carBuilder)
    director.build
    car = carBuilder.getCar
    println(car)
  }
}
