/** Leaf */
public class HtmlElement extends HtmlTag {
    private String name;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getTagName() {
        return this.name;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;

    }

    @Override
    public void setTagBody(String tag) {
        this.tagBody = tag;

    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void generateHtml() {
        System.out.println(this.startTag + this.tagBody + this.endTag);
    }
}
