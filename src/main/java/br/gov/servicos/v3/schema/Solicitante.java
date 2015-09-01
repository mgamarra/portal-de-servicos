
package br.gov.servicos.v3.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Solicitante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Solicitante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://servicos.gov.br/v3/schema}TipoDeSolicitante"/>
 *         &lt;element name="requisitos" type="{http://servicos.gov.br/v3/schema}Requisitos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Solicitante", propOrder = {
    "tipo",
    "requisitos"
})
public class Solicitante {

    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String requisitos;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the requisitos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitos() {
        return requisitos;
    }

    /**
     * Sets the value of the requisitos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitos(String value) {
        this.requisitos = value;
    }

}
