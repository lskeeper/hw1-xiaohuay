
/* First created by JCasGen Wed Sep 11 14:37:57 EDT 2013 */
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Base annotation type for all other annotation types of the system
 * Updated by JCasGen Wed Sep 11 14:37:57 EDT 2013
 * @generated */
public class BaseAnnot_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BaseAnnot_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BaseAnnot_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BaseAnnot(addr, BaseAnnot_Type.this);
  			   BaseAnnot_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BaseAnnot(addr, BaseAnnot_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BaseAnnot.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.model.BaseAnnot");
 
  /** @generated */
  final Feature casFeat_srcComponentId;
  /** @generated */
  final int     casFeatCode_srcComponentId;
  /** @generated */ 
  public String getSrcComponentId(int addr) {
        if (featOkTst && casFeat_srcComponentId == null)
      jcas.throwFeatMissing("srcComponentId", "org.apache.uima.model.BaseAnnot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_srcComponentId);
  }
  /** @generated */    
  public void setSrcComponentId(int addr, String v) {
        if (featOkTst && casFeat_srcComponentId == null)
      jcas.throwFeatMissing("srcComponentId", "org.apache.uima.model.BaseAnnot");
    ll_cas.ll_setStringValue(addr, casFeatCode_srcComponentId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.uima.model.BaseAnnot");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.uima.model.BaseAnnot");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BaseAnnot_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_srcComponentId = jcas.getRequiredFeatureDE(casType, "srcComponentId", "uima.cas.String", featOkTst);
    casFeatCode_srcComponentId  = (null == casFeat_srcComponentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_srcComponentId).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    