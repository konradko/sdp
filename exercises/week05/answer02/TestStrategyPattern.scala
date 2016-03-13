// Create a text formatter for a text editor. A text editor can have different text formatters to format text.
// We can create different text formatters and then pass the required one to the text editor, so that the editor
// will able to format the text as required.
// The text editor will hold a reference to a common interface for the text formatter and the editor’s job will be
// to pass the text to the formatter to format the text. You are required to implement this outline using the
// Strategy Design Pattern which will make the code flexible and maintainable.
// [CapTextFormatter]: TESTING TEXT IN CAPS FORMATTER
// [LowerTextFormatter]: testing text in lower formatter

object TestStrategyPattern {

  trait TextFormatter {
    def format(text: String)
  }

  class CapTextFormatter extends TextFormatter {
    def format(text: String) {
      println(text.toUpperCase())
    }
  }

  class LowerTextFormatter extends TextFormatter {
    def format(text: String) {
      println(text.toLowerCase())
    }
  }

  class TextEditor(textFormatter: TextFormatter) {
    var formatter = textFormatter

    def publishText(text: String) {
      formatter.format(text)
    }
  }

  def main(args: Array[String]): Unit = {
    val editor = new TextEditor(new CapTextFormatter)
    editor.publishText("Testing text in caps formatter")
    editor.formatter = new LowerTextFormatter
    editor.publishText("Testing text in lower formatter")
  }
}
