PROBLEMA:
class BlogPost
{
    // ...
    private $previewTextRst;
    private $previewTextHtml;
    private $textRst;
    private $textHtml;

    // ...

    public function setPreviewText($rst, $html)
    {
        $this->previewTextRst = $rst;
        $this->previewTextHtml = $html;
    }

    public function setText($rst, $html)
    {
        $this->textRst = $rst;
        $this->textHtml = $html;
    }
    
    public function getRst()
    {
        return $this->textRst;
    }
    
    public function getHtml()
    {
        return $this->textHtml;
    }

    // ...
}

REFACTOR:
class Text
{
    private $rst;
    private $html;

    public function __construct($rst, $html)
    {
        $this->rst = $rst;
        $this->html = $html;
    }

    public function getRst()
    {
        return $this->rst;
    }

    public function getHtml()
    {
        return $this->html;
    }
}

class BlogPost
{
    private $previewText;
    private $text;public function getHtml()
    {
        return $this->html;
    }

    public function setPreviewText($rst, $html)
    {
        $this->previewText = new Text($rst, $html);
    }

    public function setText($rst, $html)
    {
        $this->text = new Text($rst, $html);
    }
}