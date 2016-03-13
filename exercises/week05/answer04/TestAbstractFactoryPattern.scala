// The clients want to use their own XML rules to communicate with Bigfish. This means that for every client,
// the company should have client specific XML parsers. For example, for the NYC client there should be four
// specific types of XML parsers, i.e., NYCErrorXMLParser, NYCFeedbackXML, NYCOrderXMLParser, NYCResponseXMLParser,
// and four different parsers for the London client. The company has asked you to change the application according
// to the new requirements. To develop the parser for the original application they used a Factory Method design
// pattern in which the exact object to use is decided by the subclasses according to the type of parser. Now, to
// implement the new requirements, you are required to use a factory of factories, i.e., an Abstract Factory.
// Note: You will need parsers according to client specific XMLs, so you will create different factories for different
// clients which will provide the client specific XML to parse. You will achieve this by creating an Abstract Factory
// and then implement the factory to provide a client specific XML factory. Then you will use that factory to get the
// desired client specific XML parser object. To implement the pattern you first need to create an interface that will
// be implemented by all the concrete factories. The above interface is implemented by the client specific concrete
// factories which will provide the XML parser object to the client object. The getParserInstance method takes the
// parserType as an argument which is used to get the message specific (error parser, order parser etc) parser object.

object TestAbstractFactoryPattern {

  trait AbstractParserFactory {
    def getParserInstance(parserType: String): XMLParser
  }

  trait XMLParser {
    def parse(): String
  }

  object ParserFactoryProducer {
    def getFactory(factoryType: String): AbstractParserFactory = {
      factoryType match {
        case "NYCFactory" => new NYCFactory
        case "LondonFactory" => new LondonFactory
      }
    }
  }

  class NYCFactory extends AbstractParserFactory{
    def getParserInstance(parserType: String): XMLParser = {
      parserType match {
        case "NYCERROR" => new NYCErrorXMLParser
        case "NYCFEEDBACK" => new NYCFeedbackXML
        case "NYCORDER" => new NYCOrderXMLParser
        case "NYCRESPONSE" => new NYCResponseXMLParser
      }
    }
  }

  class NYCErrorXMLParser extends XMLParser {
    def parse(): String = {
      "NYC Parsing error XML...\nNYC Error XML Message"
    }
  }

  class NYCFeedbackXML extends XMLParser {
    def parse(): String = {
      "NYC Parsing feedback XML...\nNYC Feedback XML Message"
    }
  }

  class NYCOrderXMLParser extends XMLParser {
    def parse(): String = {
      "NYC Parsing order XML...\nNYC Order XML Message"
    }
  }

  class NYCResponseXMLParser extends XMLParser {
    def parse(): String = {
      "NYC Parsing response XML...\nNYC Response XML Message"
    }
  }

  class LondonFactory extends AbstractParserFactory{
    def getParserInstance(parserType: String): XMLParser = {
      parserType match {
        case "LondonERROR" => new LondonErrorXMLParser
        case "LondonFEEDBACK" => new LondonFeedbackXML
        case "LondonORDER" => new LondonOrderXMLParser
        case "LondonRESPONSE" => new LondonResponseXMLParser
      }
    }
  }

  class LondonErrorXMLParser extends XMLParser {
    def parse(): String = {
      "London Parsing error XML...\nLondon Error XML Message"
    }
  }

  class LondonFeedbackXML extends XMLParser {
    def parse(): String = {
      "London Parsing feedback XML...\nLondon Feedback XML Message"
    }
  }

  class LondonOrderXMLParser extends XMLParser {
    def parse(): String = {
      "London Parsing order XML...\nLondon Order XML Message"
    }
  }

  class LondonResponseXMLParser extends XMLParser {
    def parse(): String = {
      "London Parsing response XML...\nLondon Response XML Message"
    }
  }

  def main(args: Array[String]): Unit = {
    var parserFactory = ParserFactoryProducer.getFactory("NYCFactory")
    var parser = parserFactory.getParserInstance("NYCORDER")
    println(parser.parse())
    println("************************************")

    parserFactory = ParserFactoryProducer.getFactory("LondonFactory")
    parser = parserFactory.getParserInstance("LondonFEEDBACK")
    println(parser.parse())
  }
}
