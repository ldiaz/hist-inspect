/*
 * XML Type:  anomaliesCatalogType
 * Namespace: AnomaliesCatalogFile
 * Java type: br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType
 *
 * Automatically generated - do not modify.
 */
package br.pucrio.dslmetrics.core.heuristics.parsers.anomalies;


/**
 * An XML anomaliesCatalogType(@AnomaliesCatalogFile).
 *
 * This is a complex type.
 */
public interface AnomaliesCatalogType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnomaliesCatalogType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s030C4636EDC6D9163E90E28F4FE3C275").resolveHandle("anomaliescatalogtypee199type");
    
    /**
     * Gets array of all "anomaly" elements
     */
    br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomalyType[] getAnomalyArray();
    
    /**
     * Gets ith "anomaly" element
     */
    br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomalyType getAnomalyArray(int i);
    
    /**
     * Returns number of "anomaly" element
     */
    int sizeOfAnomalyArray();
    
    /**
     * Sets array of all "anomaly" element
     */
    void setAnomalyArray(br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomalyType[] anomalyArray);
    
    /**
     * Sets ith "anomaly" element
     */
    void setAnomalyArray(int i, br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomalyType anomaly);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anomaly" element
     */
    br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomalyType insertNewAnomaly(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anomaly" element
     */
    br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomalyType addNewAnomaly();
    
    /**
     * Removes the ith "anomaly" element
     */
    void removeAnomaly(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType newInstance() {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.pucrio.dslmetrics.core.heuristics.parsers.anomalies.AnomaliesCatalogType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
