
/* First created by JCasGen Mon Sep 14 16:41:53 EDT 2015 */
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
import org.apache.uima.jcas.cas.TOP_Type;

/** this is a type for evaluator
 * Updated by JCasGen Mon Sep 14 17:54:45 EDT 2015
 * @generated */
public class Evaluator_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluator(addr, Evaluator_Type.this);
  			   Evaluator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluator(addr, Evaluator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("se2015fall.pi2.yiuchanl.Evaluator");
 
  /** @generated */
  final Feature casFeat_rankedAnswers;
  /** @generated */
  final int     casFeatCode_rankedAnswers;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRankedAnswers(int addr) {
        if (featOkTst && casFeat_rankedAnswers == null)
      jcas.throwFeatMissing("rankedAnswers", "se2015fall.pi2.yiuchanl.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_rankedAnswers);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRankedAnswers(int addr, int v) {
        if (featOkTst && casFeat_rankedAnswers == null)
      jcas.throwFeatMissing("rankedAnswers", "se2015fall.pi2.yiuchanl.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_rankedAnswers, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Evaluator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_rankedAnswers = jcas.getRequiredFeatureDE(casType, "rankedAnswers", "uima.cas.FSList", featOkTst);
    casFeatCode_rankedAnswers  = (null == casFeat_rankedAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rankedAnswers).getCode();

  }
}



    