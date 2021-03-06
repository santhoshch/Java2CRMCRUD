/*
 * XML Type:  ArrayOfQuickFindConfiguration
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk
 * Java type: org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_xrm_sdk;


/**
 * An XML ArrayOfQuickFindConfiguration(@http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk).
 *
 * This is a complex type.
 */
public interface ArrayOfQuickFindConfiguration extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfQuickFindConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s89F572913020FF22DE00DBDBAAFD31DF").resolveHandle("arrayofquickfindconfigurationedcctype");
    
    /**
     * Gets array of all "QuickFindConfiguration" elements
     */
    org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration[] getQuickFindConfigurationArray();
    
    /**
     * Gets ith "QuickFindConfiguration" element
     */
    org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration getQuickFindConfigurationArray(int i);
    
    /**
     * Tests for nil ith "QuickFindConfiguration" element
     */
    boolean isNilQuickFindConfigurationArray(int i);
    
    /**
     * Returns number of "QuickFindConfiguration" element
     */
    int sizeOfQuickFindConfigurationArray();
    
    /**
     * Sets array of all "QuickFindConfiguration" element
     */
    void setQuickFindConfigurationArray(org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration[] quickFindConfigurationArray);
    
    /**
     * Sets ith "QuickFindConfiguration" element
     */
    void setQuickFindConfigurationArray(int i, org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration quickFindConfiguration);
    
    /**
     * Nils the ith "QuickFindConfiguration" element
     */
    void setNilQuickFindConfigurationArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuickFindConfiguration" element
     */
    org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration insertNewQuickFindConfiguration(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuickFindConfiguration" element
     */
    org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration addNewQuickFindConfiguration();
    
    /**
     * Removes the ith "QuickFindConfiguration" element
     */
    void removeQuickFindConfiguration(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration newInstance() {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
