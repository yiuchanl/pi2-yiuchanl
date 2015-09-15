
/* First created by JCasGen Mon Sep 14 11:44:42 EDT 2015 */
package se2015fall.pi2.yiuchanl;

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

/** this is  the super class for question and answer types annotation
 * Updated by JCasGen Mon Sep 14 17:54:44 EDT 2015
 * @generated */
public class QAAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QAAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QAAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QAAnnotation(addr, QAAnnotation_Type.this);
  			   QAAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QAAnnotation(addr, QAAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QAAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("se2015fall.pi2.yiuchanl.QAAnnotation");
 
  /** @generated */
  final Feature casFeat_confidenceScore;
  /** @generated */
  final int     casFeatCode_confidenceScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidenceScore(int addr) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "se2015fall.pi2.yiuchanl.QAAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidenceScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidenceScore(int addr, double v) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "se2015fall.pi2.yiuchanl.QAAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidenceScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sourceName;
  /** @generated */
  final int     casFeatCode_sourceName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSourceName(int addr) {
        if (featOkTst && casFeat_sourceName == null)
      jcas.throwFeatMissing("sourceName", "se2015fall.pi2.yiuchanl.QAAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sourceName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceName(int addr, String v) {
        if (featOkTst && casFeat_sourceName == null)
      jcas.throwFeatMissing("sourceName", "se2015fall.pi2.yiuchanl.QAAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_sourceName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QAAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidenceScore = jcas.getRequiredFeatureDE(casType, "confidenceScore", "uima.cas.Double", featOkTst);
    casFeatCode_confidenceScore  = (null == casFeat_confidenceScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidenceScore).getCode();

 
    casFeat_sourceName = jcas.getRequiredFeatureDE(casType, "sourceName", "uima.cas.String", featOkTst);
    casFeatCode_sourceName  = (null == casFeat_sourceName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceName).getCode();

  }
}



    