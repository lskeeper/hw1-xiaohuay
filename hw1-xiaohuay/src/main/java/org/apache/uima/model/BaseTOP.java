

/* First created by JCasGen Wed Sep 11 19:21:29 EDT 2013 */
package org.apache.uima.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Wed Sep 11 21:15:50 EDT 2013
 * XML source: /Users/xiaohua/git/hw1-xiaohuay/hw1-xiaohuay/src/main/resources/hw1-xiaohuay-typesystem.xml
 * @generated */
public class BaseTOP extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseTOP.class);
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
  protected BaseTOP() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseTOP(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseTOP(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: srcComponentId

  /** getter for srcComponentId - gets 
   * @generated */
  public String getSrcComponentId() {
    if (BaseTOP_Type.featOkTst && ((BaseTOP_Type)jcasType).casFeat_srcComponentId == null)
      jcasType.jcas.throwFeatMissing("srcComponentId", "org.apache.uima.model.BaseTOP");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseTOP_Type)jcasType).casFeatCode_srcComponentId);}
    
  /** setter for srcComponentId - sets  
   * @generated */
  public void setSrcComponentId(String v) {
    if (BaseTOP_Type.featOkTst && ((BaseTOP_Type)jcasType).casFeat_srcComponentId == null)
      jcasType.jcas.throwFeatMissing("srcComponentId", "org.apache.uima.model.BaseTOP");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseTOP_Type)jcasType).casFeatCode_srcComponentId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (BaseTOP_Type.featOkTst && ((BaseTOP_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.uima.model.BaseTOP");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseTOP_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (BaseTOP_Type.featOkTst && ((BaseTOP_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.uima.model.BaseTOP");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseTOP_Type)jcasType).casFeatCode_confidence, v);}    
  }

    