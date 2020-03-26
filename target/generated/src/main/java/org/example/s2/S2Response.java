
package org.example.s2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="return2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "return1",
    "return2"
})
@XmlRootElement(name = "s2response")
public class S2Response {

    @XmlElement(required = true)
    protected String return1;
    @XmlElement(required = true)
    protected String return2;

    /**
     * Gets the value of the return1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturn1() {
        return return1;
    }

    /**
     * Sets the value of the return1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturn1(String value) {
        this.return1 = value;
    }

    /**
     * Gets the value of the return2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturn2() {
        return return2;
    }

    /**
     * Sets the value of the return2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturn2(String value) {
        this.return2 = value;
    }

}
