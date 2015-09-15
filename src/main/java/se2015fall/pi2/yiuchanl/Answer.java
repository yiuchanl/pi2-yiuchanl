

/* First created by JCasGen Mon Sep 14 11:44:42 EDT 2015 */
package se2015fall.pi2.yiuchanl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** this is a type for answer annotation
 * Updated by JCasGen Mon Sep 14 17:54:44 EDT 2015
 * XML source: /Users/imlyc/Desktop/SoftwareEngineer/maven.1442157268571/pi2-yiuchanl/src/main/resources/pi2-yiuchanl-typesystem.xml
 * @generated */
public class Answer extends QAAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets score of the answer
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "se2015fall.pi2.yiuchanl.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets score of the answer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "se2015fall.pi2.yiuchanl.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: isCorrect

  /** getter for isCorrect - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "se2015fall.pi2.yiuchanl.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "se2015fall.pi2.yiuchanl.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets tokens of the answer
   * @generated
   * @return value of the feature 
   */
  public FSList getTokens() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "se2015fall.pi2.yiuchanl.Answer");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets tokens of the answer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokens(FSList v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "se2015fall.pi2.yiuchanl.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: nGrams

  /** getter for nGrams - gets ngrams of the answer
   * @generated
   * @return value of the feature 
   */
  public FSList getNGrams() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nGrams == null)
      jcasType.jcas.throwFeatMissing("nGrams", "se2015fall.pi2.yiuchanl.Answer");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nGrams)));}
    
  /** setter for nGrams - sets ngrams of the answer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNGrams(FSList v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nGrams == null)
      jcasType.jcas.throwFeatMissing("nGrams", "se2015fall.pi2.yiuchanl.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nGrams, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    