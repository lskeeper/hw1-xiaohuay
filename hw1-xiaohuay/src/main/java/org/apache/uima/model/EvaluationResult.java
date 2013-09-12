

/* First created by JCasGen Wed Sep 11 19:21:29 EDT 2013 */
package org.apache.uima.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** Evaluation CAS for the answers
 * Updated by JCasGen Wed Sep 11 21:15:50 EDT 2013
 * XML source: /Users/xiaohua/git/hw1-xiaohuay/hw1-xiaohuay/src/main/resources/hw1-xiaohuay-typesystem.xml
 * @generated */
public class EvaluationResult extends BaseTOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EvaluationResult.class);
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
  protected EvaluationResult() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EvaluationResult(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EvaluationResult(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets precision of the answers
   * @generated */
  public double getPrecision() {
    if (EvaluationResult_Type.featOkTst && ((EvaluationResult_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "org.apache.uima.model.EvaluationResult");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets precision of the answers 
   * @generated */
  public void setPrecision(double v) {
    if (EvaluationResult_Type.featOkTst && ((EvaluationResult_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "org.apache.uima.model.EvaluationResult");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_precision, v);}    
   
    
  //*--------------*
  //* Feature: sortedAnswers

  /** getter for sortedAnswers - gets stores the answers sorted by their scores
   * @generated */
  public FSArray getSortedAnswers() {
    if (EvaluationResult_Type.featOkTst && ((EvaluationResult_Type)jcasType).casFeat_sortedAnswers == null)
      jcasType.jcas.throwFeatMissing("sortedAnswers", "org.apache.uima.model.EvaluationResult");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_sortedAnswers)));}
    
  /** setter for sortedAnswers - sets stores the answers sorted by their scores 
   * @generated */
  public void setSortedAnswers(FSArray v) {
    if (EvaluationResult_Type.featOkTst && ((EvaluationResult_Type)jcasType).casFeat_sortedAnswers == null)
      jcasType.jcas.throwFeatMissing("sortedAnswers", "org.apache.uima.model.EvaluationResult");
    jcasType.ll_cas.ll_setRefValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_sortedAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sortedAnswers - gets an indexed value - stores the answers sorted by their scores
   * @generated */
  public Answer getSortedAnswers(int i) {
    if (EvaluationResult_Type.featOkTst && ((EvaluationResult_Type)jcasType).casFeat_sortedAnswers == null)
      jcasType.jcas.throwFeatMissing("sortedAnswers", "org.apache.uima.model.EvaluationResult");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_sortedAnswers), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_sortedAnswers), i)));}

  /** indexed setter for sortedAnswers - sets an indexed value - stores the answers sorted by their scores
   * @generated */
  public void setSortedAnswers(int i, Answer v) { 
    if (EvaluationResult_Type.featOkTst && ((EvaluationResult_Type)jcasType).casFeat_sortedAnswers == null)
      jcasType.jcas.throwFeatMissing("sortedAnswers", "org.apache.uima.model.EvaluationResult");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_sortedAnswers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_sortedAnswers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: numberOfCorrectAnswers

  /** getter for numberOfCorrectAnswers - gets 
   * @generated */
  public int getNumberOfCorrectAnswers() {
    if (EvaluationResult_Type.featOkTst && ((EvaluationResult_Type)jcasType).casFeat_numberOfCorrectAnswers == null)
      jcasType.jcas.throwFeatMissing("numberOfCorrectAnswers", "org.apache.uima.model.EvaluationResult");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_numberOfCorrectAnswers);}
    
  /** setter for numberOfCorrectAnswers - sets  
   * @generated */
  public void setNumberOfCorrectAnswers(int v) {
    if (EvaluationResult_Type.featOkTst && ((EvaluationResult_Type)jcasType).casFeat_numberOfCorrectAnswers == null)
      jcasType.jcas.throwFeatMissing("numberOfCorrectAnswers", "org.apache.uima.model.EvaluationResult");
    jcasType.ll_cas.ll_setIntValue(addr, ((EvaluationResult_Type)jcasType).casFeatCode_numberOfCorrectAnswers, v);}    
  }

    