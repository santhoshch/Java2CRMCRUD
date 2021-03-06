/*
 * XML Type:  AuditDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML AuditDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface AuditDetailCollection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuditDetailCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s89F572913020FF22DE00DBDBAAFD31DF").resolveHandle("auditdetailcollectionb85etype");
    
    /**
     * Gets the "AuditDetails" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail getAuditDetails();
    
    /**
     * Tests for nil "AuditDetails" element
     */
    boolean isNilAuditDetails();
    
    /**
     * True if has "AuditDetails" element
     */
    boolean isSetAuditDetails();
    
    /**
     * Sets the "AuditDetails" element
     */
    void setAuditDetails(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail auditDetails);
    
    /**
     * Appends and returns a new empty "AuditDetails" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail addNewAuditDetails();
    
    /**
     * Nils the "AuditDetails" element
     */
    void setNilAuditDetails();
    
    /**
     * Unsets the "AuditDetails" element
     */
    void unsetAuditDetails();
    
    /**
     * Gets the "MoreRecords" element
     */
    boolean getMoreRecords();
    
    /**
     * Gets (as xml) the "MoreRecords" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMoreRecords();
    
    /**
     * True if has "MoreRecords" element
     */
    boolean isSetMoreRecords();
    
    /**
     * Sets the "MoreRecords" element
     */
    void setMoreRecords(boolean moreRecords);
    
    /**
     * Sets (as xml) the "MoreRecords" element
     */
    void xsetMoreRecords(org.apache.xmlbeans.XmlBoolean moreRecords);
    
    /**
     * Unsets the "MoreRecords" element
     */
    void unsetMoreRecords();
    
    /**
     * Gets the "PagingCookie" element
     */
    java.lang.String getPagingCookie();
    
    /**
     * Gets (as xml) the "PagingCookie" element
     */
    org.apache.xmlbeans.XmlString xgetPagingCookie();
    
    /**
     * Tests for nil "PagingCookie" element
     */
    boolean isNilPagingCookie();
    
    /**
     * True if has "PagingCookie" element
     */
    boolean isSetPagingCookie();
    
    /**
     * Sets the "PagingCookie" element
     */
    void setPagingCookie(java.lang.String pagingCookie);
    
    /**
     * Sets (as xml) the "PagingCookie" element
     */
    void xsetPagingCookie(org.apache.xmlbeans.XmlString pagingCookie);
    
    /**
     * Nils the "PagingCookie" element
     */
    void setNilPagingCookie();
    
    /**
     * Unsets the "PagingCookie" element
     */
    void unsetPagingCookie();
    
    /**
     * Gets the "TotalRecordCount" element
     */
    int getTotalRecordCount();
    
    /**
     * Gets (as xml) the "TotalRecordCount" element
     */
    org.apache.xmlbeans.XmlInt xgetTotalRecordCount();
    
    /**
     * True if has "TotalRecordCount" element
     */
    boolean isSetTotalRecordCount();
    
    /**
     * Sets the "TotalRecordCount" element
     */
    void setTotalRecordCount(int totalRecordCount);
    
    /**
     * Sets (as xml) the "TotalRecordCount" element
     */
    void xsetTotalRecordCount(org.apache.xmlbeans.XmlInt totalRecordCount);
    
    /**
     * Unsets the "TotalRecordCount" element
     */
    void unsetTotalRecordCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
