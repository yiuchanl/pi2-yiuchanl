
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

/** this is a type for question annotation
 * Updated by JCasGen Mon Sep 14 17:54:44 EDT 2015
 * @generated */
public class Question_Type extends QAAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("se2015fall.pi2.yiuchanl.Question");
 
  /** @generated */
  final Feature casFeat_tokens;
  /** @generated */
  final int     casFeatCode_tokens;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "se2015fall.pi2.yiuchanl.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokens);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "se2015fall.pi2.yiuchanl.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokens, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nGrams;
  /** @generated */
  final int     casFeatCode_nGrams;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNGrams(int addr) {
        if (featOkTst && casFeat_nGrams == null)
      jcas.throwFeatMissing("nGrams", "se2015fall.pi2.yiuchanl.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nGrams);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNGrams(int addr, int v) {
        if (featOkTst && casFeat_nGrams == null)
      jcas.throwFeatMissing("nGrams", "se2015fall.pi2.yiuchanl.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_nGrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answers;
  /** @generated */
  final int     casFeatCode_answers;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnswers(int addr) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "se2015fall.pi2.yiuchanl.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answers);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswers(int addr, int v) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "se2015fall.pi2.yiuchanl.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_answers, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.FSList", featOkTst);
    casFeatCode_tokens  = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokens).getCode();

 
    casFeat_nGrams = jcas.getRequiredFeatureDE(casType, "nGrams", "uima.cas.FSList", featOkTst);
    casFeatCode_nGrams  = (null == casFeat_nGrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nGrams).getCode();

 
    casFeat_answers = jcas.getRequiredFeatureDE(casType, "answers", "uima.cas.FSList", featOkTst);
    casFeatCode_answers  = (null == casFeat_answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answers).getCode();

  }
}



    