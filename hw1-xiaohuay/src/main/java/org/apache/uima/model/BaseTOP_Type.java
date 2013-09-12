
/* First created by JCasGen Wed Sep 11 19:21:29 EDT 2013 */
package org.apache.uima.model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Wed Sep 11 21:15:50 EDT 2013
 * @generated */
public class BaseTOP_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BaseTOP_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BaseTOP_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BaseTOP(addr, BaseTOP_Type.this);
  			   BaseTOP_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BaseTOP(addr, BaseTOP_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BaseTOP.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.model.BaseTOP");
 
  /** @generated */
  final Feature casFeat_srcComponentId;
  /** @generated */
  final int     casFeatCode_srcComponentId;
  /** @generated */ 
  public String getSrcComponentId(int addr) {
        if (featOkTst && casFeat_srcComponentId == null)
      jcas.throwFeatMissing("srcComponentId", "org.apache.uima.model.BaseTOP");
    return ll_cas.ll_getStringValue(addr, casFeatCode_srcComponentId);
  }
  /** @generated */    
  public void setSrcComponentId(int addr, String v) {
        if (featOkTst && casFeat_srcComponentId == null)
      jcas.throwFeatMissing("srcComponentId", "org.apache.uima.model.BaseTOP");
    ll_cas.ll_setStringValue(addr, casFeatCode_srcComponentId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.uima.model.BaseTOP");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.uima.model.BaseTOP");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BaseTOP_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_srcComponentId = jcas.getRequiredFeatureDE(casType, "srcComponentId", "uima.cas.String", featOkTst);
    casFeatCode_srcComponentId  = (null == casFeat_srcComponentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_srcComponentId).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    