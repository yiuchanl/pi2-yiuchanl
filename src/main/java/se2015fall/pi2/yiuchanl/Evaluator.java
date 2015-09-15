

/* First created by JCasGen Mon Sep 14 16:41:53 EDT 2015 */
package se2015fall.pi2.yiuchanl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** this is a type for evaluator
 * Updated by JCasGen Mon Sep 14 17:54:44 EDT 2015
 * XML source: /Users/imlyc/Desktop/SoftwareEngineer/maven.1442157268571/pi2-yiuchanl/src/main/resources/pi2-yiuchanl-typesystem.xml
 * @generated */
public class Evaluator extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluator.class);
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
  protected Evaluator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Evaluator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Evaluator(JCas jcas) {
    super(jcas);
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
  //* Feature: rankedAnswers

  /** getter for rankedAnswers - gets list of ranked answers
   * @generated
   * @return value of the feature 
   */
  public FSList getRankedAnswers() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_rankedAnswers == null)
      jcasType.jcas.throwFeatMissing("rankedAnswers", "se2015fall.pi2.yiuchanl.Evaluator");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_rankedAnswers)));}
    
  /** setter for rankedAnswers - sets list of ranked answers 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRankedAnswers(FSList v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_rankedAnswers == null)
      jcasType.jcas.throwFeatMissing("rankedAnswers", "se2015fall.pi2.yiuchanl.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_rankedAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    