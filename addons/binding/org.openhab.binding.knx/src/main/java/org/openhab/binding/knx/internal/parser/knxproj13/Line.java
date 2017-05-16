//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.09 at 08:34:29 PM CET 
//


package org.openhab.binding.knx.internal.parser.knxproj13;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Line">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="DeviceInstance" type="{http://knx.org/xml/project/13}DeviceInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalGroupAddresses" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GroupAddress" type="{http://knx.org/xml/project/13}GroupAddress" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusAccess" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Edi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Parameter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MediumTypeRefId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DomainAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DomainAddressIsChecked" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CompletionStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IPRoutingMulticastAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MulticastTTL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Puid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", propOrder = {
    "deviceInstance",
    "additionalGroupAddresses",
    "busAccess"
})
public class Line {

    @XmlElement(name = "DeviceInstance")
    protected List<DeviceInstance> deviceInstance;
    @XmlElement(name = "AdditionalGroupAddresses")
    protected List<Line.AdditionalGroupAddresses> additionalGroupAddresses;
    @XmlElement(name = "BusAccess")
    protected List<Line.BusAccess> busAccess;
    @XmlAttribute(name = "Id")
    protected java.lang.String id;
    @XmlAttribute(name = "Name")
    protected java.lang.String name;
    @XmlAttribute(name = "Address")
    protected java.lang.String address;
    @XmlAttribute(name = "MediumTypeRefId")
    protected java.lang.String mediumTypeRefId;
    @XmlAttribute(name = "DomainAddress")
    protected java.lang.String domainAddress;
    @XmlAttribute(name = "DomainAddressIsChecked")
    protected java.lang.String domainAddressIsChecked;
    @XmlAttribute(name = "CompletionStatus")
    protected java.lang.String completionStatus;
    @XmlAttribute(name = "IPRoutingMulticastAddress")
    protected java.lang.String ipRoutingMulticastAddress;
    @XmlAttribute(name = "MulticastTTL")
    protected java.lang.String multicastTTL;
    @XmlAttribute(name = "Puid")
    protected java.lang.String puid;
    @XmlAttribute(name = "Comment")
    protected java.lang.String comment;
    @XmlAttribute(name = "Description")
    protected java.lang.String description;

    /**
     * Gets the value of the deviceInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceInstance }
     * 
     * 
     */
    public List<DeviceInstance> getDeviceInstance() {
        if (deviceInstance == null) {
            deviceInstance = new ArrayList<DeviceInstance>();
        }
        return this.deviceInstance;
    }

    /**
     * Gets the value of the additionalGroupAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalGroupAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalGroupAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line.AdditionalGroupAddresses }
     * 
     * 
     */
    public List<Line.AdditionalGroupAddresses> getAdditionalGroupAddresses() {
        if (additionalGroupAddresses == null) {
            additionalGroupAddresses = new ArrayList<Line.AdditionalGroupAddresses>();
        }
        return this.additionalGroupAddresses;
    }

    /**
     * Gets the value of the busAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line.BusAccess }
     * 
     * 
     */
    public List<Line.BusAccess> getBusAccess() {
        if (busAccess == null) {
            busAccess = new ArrayList<Line.BusAccess>();
        }
        return this.busAccess;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAddress(java.lang.String value) {
        this.address = value;
    }

    /**
     * Gets the value of the mediumTypeRefId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMediumTypeRefId() {
        return mediumTypeRefId;
    }

    /**
     * Sets the value of the mediumTypeRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMediumTypeRefId(java.lang.String value) {
        this.mediumTypeRefId = value;
    }

    /**
     * Gets the value of the domainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDomainAddress() {
        return domainAddress;
    }

    /**
     * Sets the value of the domainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDomainAddress(java.lang.String value) {
        this.domainAddress = value;
    }

    /**
     * Gets the value of the domainAddressIsChecked property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDomainAddressIsChecked() {
        return domainAddressIsChecked;
    }

    /**
     * Sets the value of the domainAddressIsChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDomainAddressIsChecked(java.lang.String value) {
        this.domainAddressIsChecked = value;
    }

    /**
     * Gets the value of the completionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCompletionStatus() {
        return completionStatus;
    }

    /**
     * Sets the value of the completionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCompletionStatus(java.lang.String value) {
        this.completionStatus = value;
    }

    /**
     * Gets the value of the ipRoutingMulticastAddress property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIPRoutingMulticastAddress() {
        return ipRoutingMulticastAddress;
    }

    /**
     * Sets the value of the ipRoutingMulticastAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIPRoutingMulticastAddress(java.lang.String value) {
        this.ipRoutingMulticastAddress = value;
    }

    /**
     * Gets the value of the multicastTTL property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMulticastTTL() {
        return multicastTTL;
    }

    /**
     * Sets the value of the multicastTTL property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMulticastTTL(java.lang.String value) {
        this.multicastTTL = value;
    }

    /**
     * Gets the value of the puid property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPuid() {
        return puid;
    }

    /**
     * Sets the value of the puid property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPuid(java.lang.String value) {
        this.puid = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setComment(java.lang.String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDescription(java.lang.String value) {
        this.description = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GroupAddress" type="{http://knx.org/xml/project/13}GroupAddress" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "groupAddress"
    })
    public static class AdditionalGroupAddresses {

        @XmlElement(name = "GroupAddress")
        protected List<GroupAddress> groupAddress;

        /**
         * Gets the value of the groupAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupAddress }
         * 
         * 
         */
        public List<GroupAddress> getGroupAddress() {
            if (groupAddress == null) {
                groupAddress = new ArrayList<GroupAddress>();
            }
            return this.groupAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Edi" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Parameter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BusAccess {

        @XmlAttribute(name = "Name")
        protected java.lang.String name;
        @XmlAttribute(name = "Edi")
        protected java.lang.String edi;
        @XmlAttribute(name = "Parameter")
        protected java.lang.String parameter;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setName(java.lang.String value) {
            this.name = value;
        }

        /**
         * Gets the value of the edi property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getEdi() {
            return edi;
        }

        /**
         * Sets the value of the edi property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setEdi(java.lang.String value) {
            this.edi = value;
        }

        /**
         * Gets the value of the parameter property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getParameter() {
            return parameter;
        }

        /**
         * Sets the value of the parameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setParameter(java.lang.String value) {
            this.parameter = value;
        }

    }

}