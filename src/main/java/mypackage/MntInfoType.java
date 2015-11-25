
package mypackage;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>mntInfoType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="mntInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mntiListNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1101160100"/>
 *               &lt;enumeration value="1103030100"/>
 *               &lt;enumeration value="1104140100"/>
 *               &lt;enumeration value="1104990400"/>
 *               &lt;enumeration value="1105040200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiTop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="����"/>
 *               &lt;enumeration value="���ѻ�"/>
 *               &lt;enumeration value="��ȭ��"/>
 *               &lt;enumeration value="������"/>
 *               &lt;enumeration value="���ǻ�"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiSname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="���̶� �ϱ⿡�� ��ġ ������"/>
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="http://www.gangseo.seoul.kr/portal/munhwa/index.jsp?main_link=group2_3"/>
 *               &lt;enumeration value="������ ȭ���� ���� ���� ���� ��"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiAdd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="����Ư���� ������"/>
 *               &lt;enumeration value="����Ư���� ������, ���ϱ�, ���α�, ����, ��⵵ ����"/>
 *               &lt;enumeration value="����Ư���� ������"/>
 *               &lt;enumeration value="����Ư���� ���Ǳ�, ��õ��, ��⵵ �Ⱦ��, ��õ��"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiHigh">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="293"/>
 *               &lt;enumeration value="837"/>
 *               &lt;enumeration value="128.4"/>
 *               &lt;enumeration value="105"/>
 *               &lt;enumeration value="629"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiAdmin">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="����Ư���� ������"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiAdminNum">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="02-2600-6076"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiSummary">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="  "/>
 *               &lt;enumeration value=" &lt;����� 3������ ������ ������ ��ä>���ѻ��� ��ä��. �ְ�� ���븦 ����Ͽ� �μ���, ������, �ǻ��, ������ �� ������ �Ϻ����� ������ �꼼�� �̷�� ���� �����Ͽ� ������� ��¥ ���� �׾Ҵ�. �� ���� ���� �ƴ����� �ֺ��� ����� �ܷ� ����� ���� �� ��� ���̸� ��𼭳� ���δ�. ������ ����, ������ �ȼ��� �̸������. ����~��ǻ�~�빮��~ġ�ǻ� ���� �̼�(��)���� ���� �ڰ� ���� ���̴�. �� ��ó�� ���� ������� �����̰� Ÿ�� ������ �����ϰ� �λ����̴�. ���̵����, ���ѻ꼺���, ��â����� ��� ������ �Ϲݰ���� ���̵� ���߾���. ���� ���� ���Ǵ��(�������) �Ѱ��� �޺��� ��¦�̰��ִ�. �̾߸��� ����� 3�� ������ �Ϻ��ϰ� ���߰��ִ� ���̴�. ���뿡�� �������� �̸��� ����� �ָ����� ��ȿ���ɼ�, ������ɼ�, ���޷��ɼ�, Į�����ɼ�, �������ɼ�, ��κ��ɼ�, �ǻ���ɼ��� �������� ��ó�� ������� �׸��� ���� ����� ���� ��߿� õ�� ���������� �õ� ���� ���� ã�Ƶ� �� ǰ�� �ȴ´�. �μ���, ������, �������� ����ó�� ������� �����ϰ� �ظ�, ����, ī���ʷ� ������ �¿������� ��ġ�� Ŭ���̸ӵ� ������ ���� ���񵵷� �Ʒý�Ű�⵵ �Ѵ�. ���ѻ���, �¾ ������ ������ ������ �� �ڰ��� �־���. "/>
 *               &lt;enumeration value=" �������� ���� ��ġ�� ��ȭ���� ���� 131.2m,������ �� 386.500���̴�.���󿡴� �����ô뿡 ����ߴٴ� ��ȭ�Ͱ� ���� �ִ�. ���� ����ô뿡 ������ ���� �� ���� �ִ�.���� �Ǵ� ������ ������ ������ �ִ�. �Ŷ�ô뿡 �ַ漱���̶�� ������ ��Ƽ� �ַ���̶�� �Ҹ��ٰ�, �װ� ���ư� �Ŀ� �� �ڸ����� �̻��� ���� �Ǿ��ٰ� �Ͽ� ��ȭ���̶� ���þ��ٴ� �̾߱Ⱑ �ִ�.�� �������� ��ȭ�뿡�� �� �ǹ̸� ���Ͽ� ��ȭ(��)�ڸ� �Ἥ ��ȭ��(����ߣ)�̶� �Ͽ��ٰ��� �Ŀ� ��ȭ��(����ߣ)�̶�� �ߴٴ� ���ص� �ִ�. "/>
 *               &lt;enumeration value=" �꼼�� �������� ��� ��ó�� ������ �ɼ��� ��ü�� �Թ��ϰ� ��絵 �ϸ��� �ε巯�� �꼼�������� �ִ�. �������� ���̵��� ������, �������δ� ȭ��� �ڸ���� �ִ�. �׸��� �̻꿡�°�¥�Ⱑ �о� ����ū ������ �̷���ִ�.���� ������ ������ ���� ��Ȳ�� ���� ǰ���ִ� �����̶� �Ͽ� �ٿ��� �̸��̴�.�������� �ɵ���, �ź���, �ִ��, ȭ����̶�� �ҷ����µ� 1760��� �ص����� ä���ʻ纻���´ɵ������� ǥ��Ǿ�����, ���� ���� ���츮�� Ư���� ���츮�� �ź��̶� �θ��µ��� �����Ͽ��ź����̶�� �Ҹ��� ���� �������� �־� �̰����� ������ �ȳ�� ��������� ����ߴٰ��Ͽ�������̶�� �ҷ�����,1967�� ���Ŀ��� ȭ����̶�� �ҷ�����. "/>
 *               &lt;enumeration value=" &lt;��ȭ�� ���� ������� ȭ���� ��ġ> �� ��õ���� ���������� ������ �������̴�. �ű�� �꼼�� ȭ��(����)�� ��ġ�� �̷� �Ҳ� �ʿ��� ������� ����, �ϴ��� �¿�� ���ϴ�. �����ῡ �Ҽ��ʿ��� ���� ���� �� ���� ���� �� ��ȭ�� �տ� ���»��� �� ������ �� �ұ���� �溹������ �Űܺ����� ����ؼ���. ��õ���� �׷��� �������� �⼼�� �ʹ� �� �߱������� �꼼��. �÷��ٺ��� �ü��� ���� ������ ���� ���Ӹ� ����. �׷����� ������ ���� ������ �ٶ� ���� ����. �����̰� �ʹ� ��� ���̴� ���δ�. ���Ͽ� �Ϲݰ���� ������ ������ ���� ������ ���(���)�� �̷��� ���Ѵ�. ���� ����� �Ա����� �Ÿ���Ÿ������� ���̱��� �� ������ �Ϲ��� �巯������ �ֺ��� ����� �����ǰ� �ð�ȭ�Ǹ鼭 ���븦 ������ȴ�. �ݸ� �Ѱ� �ʸӷ� ����� ������, �Ƶ��� �ﰢ�� �� ���� �׸� ������ ���� ����̶� �� ���ϴ�. ���� ������ ���عٴٵ� ���̴� "ū ���� �ٴٸ� �����ִ� ��" �̴�. "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiDetails">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" ���̶�� �ϱ⿡�� ��ġ�� ���� ������ ����� ������ ������ ����� �������� ��ġ�� �ִ�. �������� �������̶�� �Ҹ����µ� �������� �������� �θ��� �Ǿ����� Ȯ��ġ �ʴ�. ���� ���θ��� ��ġ�� �־� �������ٽ����� ���̾����� �αٿ� ����Ʈ�� �� �ķδ� �ùε��� �޽�ó�μ��� ������ ������ �ϰ� �ִ�. �̸� ��ħ ������ ��å�� �Ϸ��� �ùε��� �߱��� ������ �ʰ� �ָ��̸� ���� ������� �̰��� ���� ������ ��� ���� �Ĵ´�. �� ���� ���� �⽾���� ���θ��� �־� �ѷ��� ���ѵ� ���θ��̶� ���� 3�� ������ �� �պ��� ��ħ�� �帪�� ��23�� ������ �� �պ��� ��ħ�� �θ��� ���ļ� �θ��� �̸��̴�. "/>
 *               &lt;enumeration value="  "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="image" type="{}imageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mntInfoType", propOrder = {
    "mntiListNo",
    "mntiTop",
    "mntiName",
    "mntiSname",
    "mntiAdd",
    "mntiHigh",
    "mntiAdmin",
    "mntiAdminNum",
    "mntiSummary",
    "mntiDetails",
    "image"
})
public class MntInfoType {

    @XmlElement(required = true)
    protected String mntiListNo;
    @XmlElement(required = true)
    protected String mntiTop;
    @XmlElement(required = true)
    protected String mntiName;
    @XmlElement(required = true)
    protected String mntiSname;
    @XmlElement(required = true)
    protected String mntiAdd;
    @XmlElement(required = true)
    protected String mntiHigh;
    @XmlElement(required = true)
    protected String mntiAdmin;
    @XmlElement(required = true)
    protected String mntiAdminNum;
    @XmlElement(required = true)
    protected String mntiSummary;
    @XmlElement(required = true)
    protected String mntiDetails;

    @JacksonXmlElementWrapper(useWrapping=false)
    protected List<ImageType> image;

    /**
     * mntiListNo �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiListNo() {
        return mntiListNo;
    }

    /**
     * mntiListNo �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiListNo(String value) {
        this.mntiListNo = value;
    }

    /**
     * mntiTop �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiTop() {
        return mntiTop;
    }

    /**
     * mntiTop �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiTop(String value) {
        this.mntiTop = value;
    }

    /**
     * mntiName �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiName() {
        return mntiName;
    }

    /**
     * mntiName �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiName(String value) {
        this.mntiName = value;
    }

    /**
     * mntiSname �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiSname() {
        return mntiSname;
    }

    /**
     * mntiSname �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiSname(String value) {
        this.mntiSname = value;
    }

    /**
     * mntiAdd �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiAdd() {
        return mntiAdd;
    }

    /**
     * mntiAdd �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiAdd(String value) {
        this.mntiAdd = value;
    }

    /**
     * mntiHigh �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiHigh() {
        return mntiHigh;
    }

    /**
     * mntiHigh �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiHigh(String value) {
        this.mntiHigh = value;
    }

    /**
     * mntiAdmin �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiAdmin() {
        return mntiAdmin;
    }

    /**
     * mntiAdmin �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiAdmin(String value) {
        this.mntiAdmin = value;
    }

    /**
     * mntiAdminNum �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiAdminNum() {
        return mntiAdminNum;
    }

    /**
     * mntiAdminNum �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiAdminNum(String value) {
        this.mntiAdminNum = value;
    }

    /**
     * mntiSummary �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiSummary() {
        return mntiSummary;
    }

    /**
     * mntiSummary �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiSummary(String value) {
        this.mntiSummary = value;
    }

    /**
     * mntiDetails �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiDetails() {
        return mntiDetails;
    }

    /**
     * mntiDetails �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiDetails(String value) {
        this.mntiDetails = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageType }
     * 
     * 
     */
    public List<ImageType> getImage() {
        if (image == null) {
            image = new ArrayList<ImageType>();
        }
        return this.image;
    }

}
