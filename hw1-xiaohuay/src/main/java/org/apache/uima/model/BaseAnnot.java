

/* First created by JCasGen Wed Sep 11 14:37:57 EDT 2013 */
package org.apache.uima.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base annotation type for all other annotation types of the system
 * Updated by JCasGen Wed Sep 11 14:37:57 EDT 2013
 * XML source: /Users/xiaohua/git/hw1-xiaohuay/hw1-xiaohuay/src/main/resources/hw1-xiaohuay-typesystem.xml
 * @generated */
public class BaseAnnot extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnot.class);
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
  protected BaseAnnot() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnot(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnot(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnot(JCas jcas, int begin, int end) {
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
  //* Feature: srcComponentId

  /** getter for srcComponentId - gets ID of the source of the annotation
   * @generated */
  public String getSrcComponentId() {
    if (BaseAnnot_Type.featOkTst && ((BaseAnnot_Type)jcasType).casFeat_srcComponentId == null)
      jcasType.jcas.throwFeatMissing("srcComponentId", "org.apache.uima.model.BaseAnnot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnot_Type)jcasType).casFeatCode_srcComponentId);}
    
  /** setter for srcComponentId - sets ID of the source of the annotation 
   * @generated */
  public void setSrcComponentId(String v) {
    if (BaseAnnot_Type.featOkTst && ((BaseAnnot_Type)jcasType).casFeat_srcComponentId == null)
      jcasType.jcas.throwFeatMissing("srcComponentId", "org.apache.uima.model.BaseAnnot");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnot_Type)jcasType).casFeatCode_srcComponentId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets measure of how confidence the annotation is
   * @generated */
  public double getConfidence() {
    if (BaseAnnot_Type.featOkTst && ((BaseAnnot_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.uima.model.BaseAnnot");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseAnnot_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets measure of how confidence the annotation is 
   * @generated */
  public void setConfidence(double v) {
    if (BaseAnnot_Type.featOkTst && ((BaseAnnot_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.uima.model.BaseAnnot");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseAnnot_Type)jcasType).casFeatCode_confidence, v);}    
  }

    