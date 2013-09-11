

/* First created by JCasGen Wed Sep 11 14:37:57 EDT 2013 */
package org.apache.uima.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** score annotation for each answer
 * Updated by JCasGen Wed Sep 11 14:37:57 EDT 2013
 * XML source: /Users/xiaohua/git/hw1-xiaohuay/hw1-xiaohuay/src/main/resources/hw1-xiaohuay-typesystem.xml
 * @generated */
public class AnswerScore extends BaseAnnot {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
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
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScore(JCas jcas, int begin, int end) {
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
  //* Feature: answer

  /** getter for answer - gets record the answer string to which the score is assigned
   * @generated */
  public Answer getAnswer() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "org.apache.uima.model.AnswerScore");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets record the answer string to which the score is assigned 
   * @generated */
  public void setAnswer(Answer v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "org.apache.uima.model.AnswerScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    