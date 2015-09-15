

/* First created by JCasGen Mon Sep 14 11:44:42 EDT 2015 */
package se2015fall.pi2.yiuchanl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** this is a type for ngram annotation
 * Updated by JCasGen Mon Sep 14 17:54:44 EDT 2015
 * XML source: /Users/imlyc/Desktop/SoftwareEngineer/maven.1442157268571/pi2-yiuchanl/src/main/resources/pi2-yiuchanl-typesystem.xml
 * @generated */
public class nGram extends QAAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(nGram.class);
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
  protected nGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public nGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public nGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public nGram(JCas jcas, int begin, int end) {
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
  //* Feature: n

  /** getter for n - gets n=1 -> unigram, n=2 -> bigram, n=3 -> trigram
   * @generated
   * @return value of the feature 
   */
  public int getN() {
    if (nGram_Type.featOkTst && ((nGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "se2015fall.pi2.yiuchanl.nGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((nGram_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets n=1 -> unigram, n=2 -> bigram, n=3 -> trigram 
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(int v) {
    if (nGram_Type.featOkTst && ((nGram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "se2015fall.pi2.yiuchanl.nGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((nGram_Type)jcasType).casFeatCode_n, v);}    
   
    
  //*--------------*
  //* Feature: gram

  /** getter for gram - gets list of ngram elements
   * @generated
   * @return value of the feature 
   */
  public FSList getGram() {
    if (nGram_Type.featOkTst && ((nGram_Type)jcasType).casFeat_gram == null)
      jcasType.jcas.throwFeatMissing("gram", "se2015fall.pi2.yiuchanl.nGram");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((nGram_Type)jcasType).casFeatCode_gram)));}
    
  /** setter for gram - sets list of ngram elements 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGram(FSList v) {
    if (nGram_Type.featOkTst && ((nGram_Type)jcasType).casFeat_gram == null)
      jcasType.jcas.throwFeatMissing("gram", "se2015fall.pi2.yiuchanl.nGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((nGram_Type)jcasType).casFeatCode_gram, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    