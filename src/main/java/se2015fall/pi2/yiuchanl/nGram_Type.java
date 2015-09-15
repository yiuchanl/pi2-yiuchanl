
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

/** this is a type for ngram annotation
 * Updated by JCasGen Mon Sep 14 17:54:44 EDT 2015
 * @generated */
public class nGram_Type extends QAAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (nGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = nGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new nGram(addr, nGram_Type.this);
  			   nGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new nGram(addr, nGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = nGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("se2015fall.pi2.yiuchanl.nGram");
 
  /** @generated */
  final Feature casFeat_n;
  /** @generated */
  final int     casFeatCode_n;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getN(int addr) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "se2015fall.pi2.yiuchanl.nGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_n);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setN(int addr, int v) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "se2015fall.pi2.yiuchanl.nGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_n, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gram;
  /** @generated */
  final int     casFeatCode_gram;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGram(int addr) {
        if (featOkTst && casFeat_gram == null)
      jcas.throwFeatMissing("gram", "se2015fall.pi2.yiuchanl.nGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_gram);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGram(int addr, int v) {
        if (featOkTst && casFeat_gram == null)
      jcas.throwFeatMissing("gram", "se2015fall.pi2.yiuchanl.nGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_gram, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public nGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_n = jcas.getRequiredFeatureDE(casType, "n", "uima.cas.Integer", featOkTst);
    casFeatCode_n  = (null == casFeat_n) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_n).getCode();

 
    casFeat_gram = jcas.getRequiredFeatureDE(casType, "gram", "uima.cas.FSList", featOkTst);
    casFeatCode_gram  = (null == casFeat_gram) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gram).getCode();

  }
}



    