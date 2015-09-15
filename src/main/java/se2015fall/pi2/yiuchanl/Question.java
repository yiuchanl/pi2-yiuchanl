

/* First created by JCasGen Mon Sep 14 11:44:42 EDT 2015 */
package se2015fall.pi2.yiuchanl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** this is a type for question annotation
 * Updated by JCasGen Mon Sep 14 17:54:44 EDT 2015
 * XML source: /Users/imlyc/Desktop/SoftwareEngineer/maven.1442157268571/pi2-yiuchanl/src/main/resources/pi2-yiuchanl-typesystem.xml
 * @generated */
public class Question extends QAAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: tokens

  /** getter for tokens - gets tokens of the question
   * @generated
   * @return value of the feature 
   */
  public FSList getTokens() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "se2015fall.pi2.yiuchanl.Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets tokens of the question 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokens(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "se2015fall.pi2.yiuchanl.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: nGrams

  /** getter for nGrams - gets ngrams of the question
   * @generated
   * @return value of the feature 
   */
  public FSList getNGrams() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nGrams == null)
      jcasType.jcas.throwFeatMissing("nGrams", "se2015fall.pi2.yiuchanl.Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nGrams)));}
    
  /** setter for nGrams - sets ngrams of the question 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNGrams(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nGrams == null)
      jcasType.jcas.throwFeatMissing("nGrams", "se2015fall.pi2.yiuchanl.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_nGrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets answers of the question
   * @generated
   * @return value of the feature 
   */
  public FSList getAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "se2015fall.pi2.yiuchanl.Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets answers of the question 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswers(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "se2015fall.pi2.yiuchanl.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    