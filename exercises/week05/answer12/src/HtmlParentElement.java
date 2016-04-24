import java.util.List;
import java.util.ArrayList;

/** Composite */
public class HtmlParentElement extends HtmlTag {
    private List<HtmlTag> children = new ArrayList<HtmlTag>();
    private String name;
    private String startTag;
    private String endTag;

    public HtmlParentElement(String name) {
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
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    public void addChildTag(HtmlTag htmlTag) {
        children.add(htmlTag);
    }

    public void removeChildTag(HtmlTag htmlTag) {
        children.remove(htmlTag);
    }

    public List<HtmlTag> getChildren() {
        return children;
    }

    @Override
    public void generateHtml() {
        System.out.println(this.startTag);
        children.forEach(HtmlTag::generateHtml);
        System.out.println(this.endTag);
    }
}
