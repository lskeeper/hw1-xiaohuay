

/* First created by JCasGen Wed Sep 11 21:15:50 EDT 2013 */
package org.apache.uima.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Sep 11 21:15:50 EDT 2013
 * XML source: /Users/xiaohua/git/hw1-xiaohuay/hw1-xiaohuay/src/main/resources/hw1-xiaohuay-typesystem.xml
 * @generated */
public class Document extends BaseAnnot {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Document.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Document() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Document(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Document(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Document(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: docName

  /** getter for docName - gets 
   * @generated */
  public String getDocName() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_docName == null)
      jcasType.jcas.throwFeatMissing("docName", "org.apache.uima.model.Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Document_Type)jcasType).casFeatCode_docName);}
    
  /** setter for docName - sets  
   * @generated */
  public void setDocName(String v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_docName == null)
      jcasType.jcas.throwFeatMissing("docName", "org.apache.uima.model.Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Document_Type)jcasType).casFeatCode_docName, v);}    
  }

    