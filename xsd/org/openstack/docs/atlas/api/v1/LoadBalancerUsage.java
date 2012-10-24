//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.28 at 09:10:17 AM PDT 
//


package org.openstack.docs.atlas.api.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for loadBalancerUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadBalancerUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadBalancerUsageRecord" type="{http://docs.openstack.org/atlas/api/v1.1}loadBalancerUsageRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="loadBalancerId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="loadBalancerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadBalancerUsage", propOrder = {
    "loadBalancerUsageRecords",
    "anies"
})
@XmlRootElement(name = "loadBalancerUsage")
public class LoadBalancerUsage
    implements Serializable
{

    private final static long serialVersionUID = 532512316L;
    @XmlElement(name = "loadBalancerUsageRecord")
    protected List<LoadBalancerUsageRecord> loadBalancerUsageRecords;
    @XmlAnyElement(lax = true)
    protected List<Object> anies;
    @XmlAttribute
    protected Integer loadBalancerId;
    @XmlAttribute
    protected String loadBalancerName;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the loadBalancerUsageRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadBalancerUsageRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadBalancerUsageRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadBalancerUsageRecord }
     * 
     * 
     */
    public List<LoadBalancerUsageRecord> getLoadBalancerUsageRecords() {
        if (loadBalancerUsageRecords == null) {
            loadBalancerUsageRecords = new ArrayList<LoadBalancerUsageRecord>();
        }
        return this.loadBalancerUsageRecords;
    }

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Object>();
        }
        return this.anies;
    }

    /**
     * Gets the value of the loadBalancerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * Sets the value of the loadBalancerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoadBalancerId(Integer value) {
        this.loadBalancerId = value;
    }

    /**
     * Gets the value of the loadBalancerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * Sets the value of the loadBalancerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadBalancerName(String value) {
        this.loadBalancerName = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
